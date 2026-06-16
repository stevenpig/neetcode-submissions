class Solution {
    public int[] twoSum(int[] nums, int target) {
        int remain = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] r =  new int[2];
        for (int i = 0; i < nums.length; i++) {
            remain = target - nums[i];

            if (m.containsKey(nums[i]))
                return new int[]  {m.get(nums[i]), i};
            else 
                m.put(remain, i);
        }
        return r;
    }
}
