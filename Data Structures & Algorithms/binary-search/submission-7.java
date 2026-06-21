class Solution {
    public int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int start, int end, int target) {

        if (end < start)
            return -1;


        int mid = (end - start) / 2;

        if (nums[mid+start] == target)
            return mid+start;

        if (nums[mid+start] > target)
            return search(nums, start, mid + start - 1, target);
        else if (nums[mid+start] < target)
            return search(nums, mid + start +1 ,  end, target);
        else return -1;
    }
}
