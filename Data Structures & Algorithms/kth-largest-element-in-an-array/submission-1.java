class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b -a);

        for (int i = 0; i < nums.length; i++) {
            p.offer(nums[i]);
        }

        int i = 1;

        while (i <= k) {
            if (i == k) {
                return p.poll();
            }
            p.poll();
            i++;
        }

        return -1;
    }
}
