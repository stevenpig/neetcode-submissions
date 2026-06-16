class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length-1, target);
    }

    private int search(int []nums, int start, int end, int target) {

        if (end < start)
            return -1;

        if (end == start) {
            if (nums[end] != target)
                return -1;
        }    
        int mid = (end - start) / 2;


        if (nums[start + mid] == target)
            return start + mid;
        
        else if (nums[start + mid] < target)
            return search(nums, start + mid + 1, end, target);            
        
        else 
            return search(nums, start, start+ mid - 1, target);
    }
}
