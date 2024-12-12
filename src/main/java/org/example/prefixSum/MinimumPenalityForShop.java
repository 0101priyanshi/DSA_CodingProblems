package org.example.prefixSum;

public class MinimumPenalityForShop {
        public int bestClosingTime(String customers) {
            // Convert the input string into a character array for easier processing
            char[] ch = customers.toCharArray();
            int length = ch.length; // Store the length of the array
            int min = Integer.MAX_VALUE; // Initialize the minimum penalty as the largest possible value
            int minj = 0; // Initialize the variable to store the best closing time

            // Initialize the prefix and suffix arrays to store penalties
            // Prefix array holds penalties for keeping the store open during 'N' (no customers)
            int[] prefix = new int[length + 1];
            // Suffix array holds penalties for closing the store while 'Y' (customers present)
            int[] suffix = new int[length + 1];

            // Base case for prefix array: no penalties before the store opens
            prefix[0] = 0;
            // Base case for suffix array: no penalties after the store closes
            suffix[length] = 0;

            // Build the prefix array
            for (int i = 0; i < length; i++) {
                // If the current customer is 'N', add a penalty
                if (ch[i] == 'N') {
                    prefix[i + 1] = prefix[i] + 1;
                } else {
                    // Otherwise, carry forward the penalty without incrementing
                    prefix[i + 1] = prefix[i];
                }
            }

            // Build the suffix array
            for (int i = length - 1; i >= 0; i--) {
                // If the current customer is 'Y', add a penalty
                if (ch[i] == 'Y') {
                    suffix[i] = suffix[i + 1] + 1;
                } else {
                    // Otherwise, carry forward the penalty without incrementing
                    suffix[i] = suffix[i + 1];
                }
            }

            // Iterate through all possible closing times
            for (int i = 0; i <= length; i++) {
                // Calculate the total penalty for closing at this time
                int penalty = prefix[i] + suffix[i];

                // Update the minimum penalty and best closing time if a smaller penalty is found
                if (penalty < min) {
                    min = penalty; // Update the minimum penalty
                    minj = i; // Update the best closing time
                }
            }

            // Return the closing time with the minimum penalty
            return minj;
        }
    }
