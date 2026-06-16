class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i - left  > k) {
                s.remove(nums[left]);
                left++;
            }
                

            if (s.contains(nums[i]))
                return true;
            
            s.add(nums[i]);
        }

        return false;
    }
}