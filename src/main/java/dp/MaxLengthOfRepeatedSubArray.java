/**
 * Given two integer arrays nums1 and nums2, return the maximum length of a subarray that appears in
 * both arrays.
 *
 * <p>Example 1:
 *
 * <p>Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7] Output: 3 Explanation: The repeated subarray
 * with maximum length is [3,2,1]. Example 2:
 *
 * <p>Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0] Output: 5
 */
package dp;

public class MaxLengthOfRepeatedSubArray {

    public int findLength(int[] nums1, int[] nums2) {
        int res = 0;
        int[][] dp = new int[nums1.length+1][nums2.length+1];

        for(int i=0; i < dp.length; i++){
            for(int j=0; j < dp[0].length; j++){

                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
                else if(nums1[i-1] == nums2[j-1]){

                    dp[i][j] = dp[i-1][j-1] + 1;
                    res = Math.max(res, dp[i][j]);
                }
            }
        }

        return res;
    }

}
