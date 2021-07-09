/**
 * There are several cards arranged in a row, and each card has an associated number of points. The
 * points are given in the integer array cardPoints.
 *
 * <p>In one step, you can take one card from the beginning or from the end of the row. You have to
 * take exactly k cards.
 *
 * <p>Your score is the sum of the points of the cards you have taken.
 *
 * <p>Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
 *
 * <p>Example 1:
 *
 * <p>Input: cardPoints = [1,2,3,4,5,6,1], k = 3 Output: 12 Explanation: After the first step, your
 * score will always be 1. However, choosing the rightmost card first will maximize your total
 * score. The optimal strategy is to take the three cards on the right, giving a final score of 1 +
 * 6 + 5 = 12.
 */
package arrayproblems;

public class MaxScoreFromCards {

    public int maxScore(int[] cardPoints, int k) {

        int totalSum = 0;
        int maxScore = 0;

        for (int i = 0; i < cardPoints.length; i++) {
            totalSum += cardPoints[i];
        }

        int tempSum = 0;
        for (int i = 0; i < cardPoints.length - k; i++) {
            tempSum += cardPoints[i];
        }

        maxScore = Math.max(maxScore, totalSum - tempSum);

        for (int i = 1; i <= k; i++) {
            tempSum = tempSum - cardPoints[i - 1] + cardPoints[i + cardPoints.length - k - 1];
            maxScore = Math.max(maxScore, totalSum - tempSum);
        }

        return maxScore;

    }
}
