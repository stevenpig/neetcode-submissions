class Solution {
    public int[] twoSum(int[] numbers, int target) {
        

        if (numbers.length <= 1)
            return null;

        int l =0, r = numbers.length - 1;

        while (l < r) {
            if (numbers[l] + numbers[r] < target) {
                l++;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else
                return new int[] {l + 1, r +1};
        }

        return null;
    }
}
