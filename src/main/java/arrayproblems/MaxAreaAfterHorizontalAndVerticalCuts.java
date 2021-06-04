/**
 * Given a rectangular cake with height h and width w, and two arrays of integers horizontalCuts and
 * verticalCuts where horizontalCuts[i] is the distance from the top of the rectangular cake to the
 * ith horizontal cut and similarly, verticalCuts[j] is the distance from the left of the
 * rectangular cake to the jth vertical cut.
 *
 * <p>Return the maximum area of a piece of cake after you cut at each horizontal and vertical
 * position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a huge
 * number, return this modulo 10^9 + 7.
 */
package arrayproblems;

import java.util.Arrays;

public class MaxAreaAfterHorizontalAndVerticalCuts {

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        long[] hslices = new long[horizontalCuts.length + 1];
        long[] vslices = new long[verticalCuts.length + 1];

        hslices[0] = horizontalCuts[0];
        vslices[0] = verticalCuts[0];

        long hMax = hslices[0];
        long vMax = vslices[0];

        for (int i = 1; i < hslices.length; i++) {

            if (i == horizontalCuts.length) {
                hslices[i] = h - horizontalCuts[i - 1];
            } else {
                hslices[i] = horizontalCuts[i] - horizontalCuts[i - 1];
            }

            hMax = Math.max(hMax, hslices[i]);
        }

        for (int i = 1; i < vslices.length; i++) {

            if (i == verticalCuts.length) {
                vslices[i] = w - verticalCuts[i - 1];
            } else {
                vslices[i] = verticalCuts[i] - verticalCuts[i - 1];
            }

            vMax = Math.max(vMax, vslices[i]);
        }

        return (int) ((hMax * vMax) % (long) 1000000007);
    }
}
