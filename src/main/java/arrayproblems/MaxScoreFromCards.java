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
