class MedianFinder {

    PriorityQueue<Integer> large = new PriorityQueue<>((a,b) -> a-b);

    PriorityQueue<Integer> small = new PriorityQueue<>((a, b) -> b - a); 

    public MedianFinder() {

    }

    public void addNum(int num) {
        
        small.add(num);
        if (small.size()  > large.size() + 1 ) {
            large.add(small.poll());
        }

        if (!large.isEmpty() && small.peek() > large.peek()) {
            int smallV = large.poll();
            int largeV = small.poll();

            large.add(largeV);
            small.add(smallV);
        }
    }

    public double findMedian() {
        if (small.size() > large.size())
            return (double) small.peek();
        else {
            return (double) (small.peek() + large.peek()) / 2.0;
        }
    }
}
