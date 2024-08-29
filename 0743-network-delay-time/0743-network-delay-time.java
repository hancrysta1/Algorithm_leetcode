import java.util.*;
class Solution {
    static class Edge{
        int to;
        int distance;
        public Edge(int to,int distance){
            this.to = to;
            this.distance=distance;
        }
    }
    static class Entry implements Comparable<Entry>{
        int node;
        int distance;
        public Entry(int node,int distance){
            this.node = node;
            this.distance=distance;
        }
        @Override
        public int compareTo(Entry o){
            return this.distance - o.distance;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        //가중치=시간
        Map<Integer,List<Edge>> graph = new HashMap<>();
        for(int i=0;i<times.length;i++){
            graph.putIfAbsent(times[i][0],new ArrayList<>());
            graph.get(times[i][0]).add(new Edge(times[i][1],times[i][2]));
        }
        int min = dikjstra(graph,k,n);
        
        return min == Integer.MAX_VALUE || min ==0? -1 : min;
    }

    public int dikjstra(Map<Integer,List<Edge>> graph,int k,int n){
        int MAX=Integer.MAX_VALUE;
        int[] distances = new int[n+1];
        Arrays.fill(distances,MAX);//최솟값 구하기 위한 최댓값 초기화 셋팅

        Queue<Entry> pq = new PriorityQueue<>();
        pq.add(new Entry(k,0));
        distances[k]=0;

        while(!pq.isEmpty()){
            Entry curr = pq.remove();
            if(distances[curr.node] < curr.distance) continue;

            if (!graph.containsKey(curr.node)) continue;
            for(Edge e:graph.get(curr.node)){
                int sumDistance = curr.distance + e.distance;
                
                if(sumDistance<distances[e.to]){
                    distances[e.to]=sumDistance;
                    pq.add(new Entry(e.to,sumDistance));
                }
            }
        }
        return distances[n];
    }
}