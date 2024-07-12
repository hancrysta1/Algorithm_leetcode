import java.util.*;
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        //1~n까지 숫자 중에 k개를 짝지은 조합을 찾아내기
        List<List<Integer>> result = new ArrayList<>();
        int start = 1; //시작점을 값으로 전달해주기. 
        // 함수에 유동적으로 인자를 주고 싶을 때 사용, 함수에 인자가 증가하며 삽입될 것이다.
        // 재귀 함수마다 다르게 하고 싶은 부분 = 시작점
        backtrack(start,n,k,result,new ArrayList<>());
        return result;
    }
    public void backtrack(int start,int n,int k,List<List<Integer>> result, List<Integer> comb){
        //base case
        if(comb.size()==k){
            result.add(new ArrayList<>(comb));
            return;
        }
        //recursive call
        for(int i=start;i<=n;i++){
            if(comb.contains(i)) continue;
            comb.add(i);
            backtrack(i+1,n,k,result,comb);//시작값 인자를 받아 증가된 값으로 재귀
            comb.remove(comb.size()-1);
        }
    }
}