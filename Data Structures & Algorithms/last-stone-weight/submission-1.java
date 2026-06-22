class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b - a);
        if (stones.length == 0)
            return -1;

        if (stones.length == 1)
            return 1;

        for (int i = 0 ; i< stones.length; i++) {
            p.offer(stones[i]);
        }

        while (p.size() > 1) {


            int first = p.poll();
            int second = p.poll();

            int newV = first - second;

            p.offer(newV);
        }

        return p.peek();
    }
}
