import java.util.*;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Map<Integer,List<Integer>> result = new HashMap<>();
        for(int i=0;i<rooms.size();i++){
            result.put(i,rooms.get(i));
        }
        Set<Integer> visited = bfs(result,0);
        System.out.println(visited.toString());
        for(int i=0;i<rooms.size();i++){
            if(!visited.contains(i)) return false;
        }

        return true;
    }
    public Set<Integer> bfs(Map<Integer,List<Integer>> result,int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int key=queue.poll();
            if(key==0) visited.add(0);
            for(int v : result.get(key)){
                if(!visited.contains(v)){
                    visited.add(v);
                    queue.add(v);
                }
            }
        }
        return visited;
    }
}