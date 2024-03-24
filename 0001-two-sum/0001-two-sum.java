class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int component = target-nums[i];
            if(numsMap.containsKey(component)){
                result[0]=numsMap.get(component);//return index
                result[1]=i;
                break;
            }
            numsMap.put(nums[i],i);
        }
    return result;
    }
}