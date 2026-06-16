class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);
        
        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }
        
        int count = 0;
        int val = -1;
        while (count < k) {
            val = pq.poll();
            count++;
        }
        
        return val;
    }
}
