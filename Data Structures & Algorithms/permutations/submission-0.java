class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
         permute(Arrays.stream(nums).boxed().toList(), Collections.emptyList(), res );
        return res;
    }

    private void permute(List<Integer> remains, List<Integer> ans, List<List<Integer>> res) {

        if (remains.isEmpty())
            res.add(ans);

        for (int i = 0; i < remains.size(); i++) {
            List<Integer> newAns = new ArrayList<>(ans);
            newAns.add(remains.get(i));
            List<Integer> newRemains = new ArrayList<>(i >= 1 ? remains.subList(0, i) : Collections.emptyList());
            newRemains.addAll(remains.subList(i + 1, remains.size()));


            permute(newRemains, newAns, res);
        }


    }
}
