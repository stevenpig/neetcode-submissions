class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
            ArrayList<Integer> r = new ArrayList<>();
            HashSet<Integer> ts = new HashSet<>();

            HashSet<Integer> ts2 = new HashSet<>();

            int max = nums.length;

            for (int i = 1; i <= max; i++)
                ts.add(i);


            for (int i = 0; i < nums.length; i++)
                ts2.add(nums[i]);

            for(int i: ts) {
                if (!ts2.contains(i))
                    r.add(i);
            }

            return r;
    }
}