import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> remain = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int r = target - nums[i];
            if(remain.containsKey(r)){
                return new int[] {remain.get(r),i};
            }
            remain.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}