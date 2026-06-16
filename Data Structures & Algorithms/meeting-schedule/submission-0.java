/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        List<Interval> sorted = intervals.stream().sorted((o1, o2) -> {
            if (o1.start == o2.start)
                return o1.end - o2.end;

            return o1.start - o2.start;
        }).toList();

        
        for (int i = 1; i< sorted.size(); i++) {
            if (sorted.get(i - 1).end > sorted.get(i).start)
                return false;
        }

        return true;
    }
}
