class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int [] r = new int[k];
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (cnt.containsKey(nums[i])) {                
                cnt.put(nums[i], cnt.get(nums[i]) + 1);
            } else {
                cnt.put(nums[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(cnt.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (int i = 1; i <= k; i++) {
            r[i - 1] = list.get(list.size() - i).getKey();
        }
        return r;
    }
}
