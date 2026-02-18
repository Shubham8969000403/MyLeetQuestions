import java.util.*;

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[1] != b[1]) return a[1] - b[1];
            return b[0] - a[0];
        });

        int a = -1_000_000_000;
        int b = -1_000_000_000;
        int ans = 0;

        for (int[] interval : intervals) {
            int L = interval[0];
            int R = interval[1];

            int cnt = 0;
            if (a >= L && a <= R) cnt++;
            if (b >= L && b <= R) cnt++;

            if (cnt == 2) continue;
            else if (cnt == 1) {
                a = b;
                b = R;
                ans += 1;
            } else {
                a = R - 1;
                b = R;
                ans += 2;
            }
        }
        return ans;
    }
}
