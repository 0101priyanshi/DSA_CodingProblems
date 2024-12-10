package org.example.twoPointer;

public class RotateArray {
        // Method to reverse elements in a specified range of an array
        public void reverse(int[] arr, int i, int j) {
            while (i < j) {
                // Swap elements at indices i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; // Move i towards the center
                j--; // Move j towards the center
            }
        }

        // Method to rotate the array to the right by k steps
        public void rotate(int[] nums, int k) {
            int length = nums.length; // Length of the array
            k = k % length; // Handle cases where k is greater than the length of the array

            if (k != length) {
                // Reverse the entire array to bring the last k elements to the front
                reverse(nums, 0, length - 1);

                // Reverse the first k elements to restore their original order
                reverse(nums, 0, k - 1);

                // Reverse the remaining elements to restore their original order
                reverse(nums, k, length - 1);
            }
        }
}
