package dp;

public class MaximumSubArray {

    public int maxSubArray(int[] nums) {

        int sumUntilNow = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] <= sumUntilNow + nums[i]) {
                sumUntilNow = sumUntilNow + nums[i];
            } else {
                sumUntilNow = nums[i];
            }

            result = Math.max(sumUntilNow, result);
        }

        return result;
    }
}
