class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>num_map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int com=target-nums[i];
            if(num_map.containsKey(com)){
                return new int[]{num_map.get(com),i};
            }
            num_map.put(nums[i],i);
        }
        return new int[0];
    }
}