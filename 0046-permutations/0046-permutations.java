import java.util.*;
class Solution {
    //순열 문제 : 중복 허용, 순서 존재
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();

        backtrack(visited,nums,result,new ArrayList<>());
        return result;
    }
    public void backtrack(boolean[] visited,int[] nums,List<List<Integer>> result,List<Integer> curr){
        if(nums.length == curr.size()){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            curr.add(nums[i]);
            visited[i] = true;
            backtrack(visited,nums,result,curr);
            curr.remove(curr.size()-1);
            visited[i] = false;
            //함수 종료 후 [1,2,3,4] 였다면 3을 선택한 때로 돌아간다.- backtracking 다음구문 remove
        }

    }
}