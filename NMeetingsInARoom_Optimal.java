import java.util.Arrays;
import java.util.Comparator;

public class NMeetingsInARoom_Optimal {
    class Solution {
        class Timing{
            int start;
            int end;
            int ind;

            public Timing(int start, int end, int ind){
                this.start = start;
                this.end = end;
                this.ind = ind;
            }
        }

        class myComparator implements Comparator<Timing> {
            public int compare(Timing a, Timing b){
                int end1 = a.end;
                int end2 = b.end;

                if(end1 > end2) return 1;
                else if(end1 < end2) return -1;
                return 0;
            }
        }
        public int maxMeetings(int[] start, int[] end) {
            //your code goes here
            Timing[] timings = new Timing[start.length];
            for(int i = 0; i<start.length; i++){
                timings[i] = new Timing(start[i],end[i],i+1);
            }

            Arrays.sort(timings, new myComparator());

            int count = 1;
            int freeTime = timings[0].end;
            for(int i = 1; i<start.length; i++){
                if(freeTime<timings[i].start){
                    count++;
                    freeTime = timings[i].end;
                }
            }
            return count;
        }
    }
}
