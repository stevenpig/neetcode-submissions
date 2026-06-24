class Solution {
    public int subarraySum(int[] nums, int k) {
         int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }

       int count= 0;
        for (int i = 0; i < prefixSum.length; i++) {
            if (prefixSum[i] == k)
                count++;

            for (int j =  i +1 ;  j < prefixSum.length; j++) {

                if (prefixSum[j] - prefixSum[i] == k)
                    count++;
            }
        }

        return count;
    }
}