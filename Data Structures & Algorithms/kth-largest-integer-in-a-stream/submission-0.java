class KthLargest {

    private List<Integer> t = null;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        t = new ArrayList<>(Arrays.stream(nums).boxed().toList());
    }
    
    public int add(int val) {
        t.add(val);
        return t.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(k-1);
    }
}
