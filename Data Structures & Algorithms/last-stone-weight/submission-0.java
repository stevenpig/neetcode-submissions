class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        
        for (int i = 0; i < stones.length; i++) {
            pq.add(stones[i]);
        }
        
        int last = -1;
        if (pq.size() == 1)
            return pq.poll();
        
        while (pq.size() >= 2) {
            int h1 = pq.poll();
            int h2 = pq.poll();

            if (Math.abs(h1 - h2) > 0)
                pq.add(Math.abs(h1 - h2));
    
        }
        
        if (pq.size() == 1)
            return pq.poll();
        else 
            return 0;
    }
}
