import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceOptimal {
        public static int longestSuccessiveElements(int []a) {
            Set<Integer> s = new HashSet<>();
            int count = 0;
            int max = Integer.MIN_VALUE;
            for (int e : a) {
                s.add(e);
            }
            for (int e : s) {
                if (!s.contains(e - 1)) {
                    count = 1;
                    int x = e;
                    while (s.contains(x + 1)) {
                        count++;
                        x++;
                    }
                    max = Math.max(max, count);
                }


            }
            return max;

        }
}
