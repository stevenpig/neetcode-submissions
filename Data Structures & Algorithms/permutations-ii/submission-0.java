class Solution {
 public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<String> s = new HashSet<>();
        permute(Arrays.stream(nums).boxed().toList(), new ArrayList<>(), res, s);
        return res;
    }

    private void permute(List<Integer> nums, List<Integer> ans, List<List<Integer>> res, HashSet<String> s) {

        if (nums.isEmpty()) {
            String result = ans.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(""));
            if (!s.contains(result)) {
                res.add(ans);
                s.add(result);
            }
        }


        for (int i = 0; i < nums.size(); i++) {
            Integer p = nums.get(i);

            List<Integer> nextP = new ArrayList<>(i - 1 >= 0 ? nums.subList(0, i).stream().toList() : new ArrayList<>());
            List<Integer> endList = i + 1 < nums.size() ? nums.subList(i + 1, nums.size()) : Collections.emptyList();
            if (!endList.isEmpty()) {
                try {
                    nextP.addAll(endList);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            List<Integer> newAns = new ArrayList<>(ans);
            newAns.addFirst(p);

            permute(nextP, newAns, res, s);
        }
    }
}