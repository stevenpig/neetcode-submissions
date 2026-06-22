class Solution {
 public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Pair> p = new PriorityQueue<>(Comparator.comparingDouble(Pair::getDist));

        for (int i = 0; i < points.length; i++) {
            //sqrt((x1 - x2)^2 + (y1 - y2)^2)

            int x = points[i][0];
            int y = points[i][1];

            double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            
            p.offer(new Pair(points[i], d));

        }
        
        int i = 0;
        int [][] res = new int[k][2];
        
        while (i < k) {
            int[] point = p.poll().point;
            res[i] = point;
            i++;
        }
        return res;
    }

    class Pair {
        int[] point;
        double dist;

        public Pair(int[] point, double dist) {
            this.point = point;
            this.dist = dist;
        }

        public double getDist() {
            return dist;
        }
    }
}
