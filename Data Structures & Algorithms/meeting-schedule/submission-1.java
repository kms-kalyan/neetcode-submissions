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
    public boolean canAttendMeetings(List<Interval> in) {

        List<int[]> list = new ArrayList<>();

        Collections.sort(in, (a,b)->Integer.compare(a.start,b.start));
        int n=in.size();
        int min=0,max=0,cnt=0;
        for(int i=0;i<n;i++){
            min = in.get(i).start;
            max = in.get(i).end;
            if(i+1<n && in.get(i+1).start<max){
                //max = Math.max(max,in[i+1][1]);
                return false;
            }
        }


        return true;
    }
}
