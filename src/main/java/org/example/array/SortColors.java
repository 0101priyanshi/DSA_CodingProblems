package org.example.array;

public class SortColors {
    public void sortColors(int[] nums) {
        // Step 1: Initialize counters for each color (0, 1, and 2)
        int zero = 0; // Counts occurrences of 0
        int one = 0;  // Counts occurrences of 1
        int two = 0;  // Counts occurrences of 2

        // Step 2: Count the number of 0s, 1s, and 2s in the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++; // Increment counter for 0
            } else if (nums[i] == 1) {
                one++;  // Increment counter for 1
            } else {
                two++;  // Increment counter for 2
            }
        }

        // Step 3: Rewrite the array based on the counts
        for (int i = 0; i < nums.length; i++) {
            // Fill the first 'zero' positions with 0
            if (i < zero) {
                nums[i] = 0;
            }
            // Fill the next 'one' positions with 1
            else if (i < one + zero) {
                nums[i] = 1;
            }
            // Fill the remaining positions with 2
            else {
                nums[i] = 2;
            }
        }
    }
}
