package org.example.prefixSum;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] answer = new int[nums.length];

        // Initialize the first and last elements of leftSum and rightSum
        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        // Fill the leftSum array
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = nums[i - 1] + leftSum[i - 1];
        }

        // Fill the rightSum array
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = nums[i + 1] + rightSum[i + 1];
        }

        // Calculate the absolute difference for each index and store in answer
        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}
