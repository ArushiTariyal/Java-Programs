import java.util.ArrayList;
import java.util.List;

public class NMeetingsInOneRoom_Greedy {
    class Timings{
        int start;
        int end;
        int pos;

        Timings(int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    class Solution {
        public int maxMeetings(int[] start, int[] end) {
            //your code goes here

            List<Timings> al = new ArrayList<>();

            for(int i = 0; i<start.length; i++){
                al.add(new Timings(start[i], end[i], i));
            }

            al.sort((a,b)-> Integer.compare(a.end, b.end));

            int meetingCount = 1;
            int lastEndingTime = al.get(0).end;
            for(int i = 1; i<al.size(); i++){
                if(al.get(i).start> lastEndingTime){
                    meetingCount++;
                    lastEndingTime = al.get(i).end;
                }

            }

            return meetingCount;

        }
    }
}
