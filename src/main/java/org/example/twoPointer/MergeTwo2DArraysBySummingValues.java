package org.example.twoPointer;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int row1 = nums1.length;
        int row2 = nums2.length;
        int row3 = row1 + row2; // The total number of rows for the result array
        int[][] result = new int[row3][2]; // Result array to store merged pairs

        int i = 0, j = 0, k = 0; // Pointers for nums1, nums2, and result
        while (i < row1 && j < row2) {
            if (nums1[i][0] == nums2[j][0]) {
                // If IDs match, sum the values
                result[k][0] = nums1[i][0];
                result[k][1] = nums1[i][1] + nums2[j][1];
                i++; // Move both pointers
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                // If nums1's ID is smaller, add it to the result
                result[k][0] = nums1[i][0];
                result[k][1] = nums1[i][1];
                i++; // Move pointer for nums1
            } else {
                // If nums2's ID is smaller, add it to the result
                result[k][0] = nums2[j][0];
                result[k][1] = nums2[j][1];
                j++; // Move pointer for nums2
            }
            k++; // Move the result pointer
        }

        // Add remaining elements from nums1
        while (i < row1) {
            result[k][0] = nums1[i][0];
            result[k][1] = nums1[i][1];
            i++;
            k++;
        }

        // Add remaining elements from nums2
        while (j < row2) {
            result[k][0] = nums2[j][0];
            result[k][1] = nums2[j][1];
            j++;
            k++;
        }

        // Trim the result array to the correct size
        int[][] trimmedResult = new int[k][2];
        for (int l = 0; l < k; l++) {
            trimmedResult[l][0] = result[l][0];
            trimmedResult[l][1] = result[l][1];
        }

        return trimmedResult;
    }
}