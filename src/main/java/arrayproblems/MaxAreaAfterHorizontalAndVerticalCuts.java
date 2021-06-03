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
