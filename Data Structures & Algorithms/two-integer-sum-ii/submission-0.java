class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> m = new LinkedHashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (m.containsKey(diff)) {
                return new int[] {m.get(diff) + 1, i + 1};
            }
            m.put(numbers[i], i);
        }

        return new int[] {-1, -1};
    }
}
