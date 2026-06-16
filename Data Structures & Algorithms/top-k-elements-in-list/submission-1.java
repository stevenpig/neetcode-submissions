class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      PriorityQueue<Num> pq = new PriorityQueue<>((a, b) -> b.count - a.count);

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++) {

            if (m.containsKey(nums[i])) {
                int c = m.get(nums[i]);
                m.put(nums[i], c +1);
            } else {
                m.put(nums[i], 1);
            }

        }

        m.entrySet().forEach(e -> {
            Num n = new Num(e.getKey(), e.getValue());
            pq.add(n);
        });

        int[] res =  new int[k];
        int count = 0;
        
        while (count < k) {
            res[count] = pq.poll().val;
            count++;
        }

        return res;

    }
}

class Num {
    int val;
    int count;

    public Num(int val, int count) {
        this.val = val;
        this.count = count;
    }
}
