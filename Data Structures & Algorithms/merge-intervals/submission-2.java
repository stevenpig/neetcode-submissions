class Solution {
    public int[][] merge(int[][] intervals) {
        
        if (intervals.length == 0) 
            return new int[][] {{}};
        
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) 
                return a[1] - b[1];
            return a[0] - b[0];
        });
        
        List<List<Integer>> l = new ArrayList<>();
        
        List<Integer> ll = new ArrayList<>();
        ll.add(intervals[0][0]);
        ll.add(intervals[0][1]);
        l.add(ll);
        
        for (int i = 1; i < intervals.length; i++) {
            if (l.getLast().get(1) < intervals[i][0]) {
                ll = new ArrayList<>();
                ll.add(intervals[i][0]);
                ll.add(intervals[i][1]);
                l.add(ll);
            } else {
      //          if (intervals[i-1][1] < intervals[i][1]) {
                    ll = l.getLast();
                    int min = ll.get(1);
                    ll.removeLast();                    
                    ll.addLast(Math.max(min, intervals[i][1]));
       //         }
                    
            }
        }
        
        int[][] res = new int[l.size()][2];
        
        for (int i = 0; i < l.size(); i++) {
            res[i][0] = l.get(i).get(0);
            res[i][1] = l.get(i).get(1);
        }
        
        return res;
    }
}
