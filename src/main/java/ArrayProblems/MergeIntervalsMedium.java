/**
 * Given an array of intervals where intervals[i] = [starti, endi],
 * merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
package ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsMedium {

    public int[][] merge(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> res = new ArrayList<>();
        int[] init = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            if (init[1] >= intervals[i][0]) {
                init[1] = Math.max(init[1], intervals[i][1]);
            } else {
                res.add(init);
                init = intervals[i];
            }

        }

        if (!res.contains(init)) {
            res.add(init);
        }

        return res.toArray(new int[res.size()][]);
    }

}
