class KthLargest {

    private int k;
    private int[] nums;

    private PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);



    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;

        for (int i = 0 ; i < nums.length; i++) {
            pq.add(nums[i]);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        List<Integer> l = new ArrayList<>();
        int i = 0;
        while (i < k) {
            int value = pq.poll();
            System.out.println("value pop: " + value);
            l.add(value);
            i++;
        }

        for (int v: l)
            pq.add(v);

        int v = l.getLast();
        return v;
    }
}
