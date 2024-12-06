package org.example.prefixSum;

class NumArray {

    /* Declaring the prefix array as a global variable so it is accessible
     to both the constructor and the sumRange function. */
    int[] prefixArray;

    /* This is a parameterized constructor. */
    public NumArray(int[] nums) {
        /* Initializing the prefix array here, as initialization is
        typically done inside the constructor. */
        prefixArray = new int[nums.length];

        /* Logic to calculate the prefix array. */
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i]; // Add the current element to the cumulative sum.
            prefixArray[i] = sum; // Store the cumulative sum at the current index.
        }
    }

    /* Method to calculate the sum of elements in the range [left, right]. */
    public int sumRange(int left, int right) {
        if (left == 0) {
            /* If the range starts at index 0, directly return the prefix sum at 'right'. */
            return prefixArray[right];
        } else {
            /* Otherwise, subtract the prefix sum just before the 'left' index
            from the prefix sum at 'right'. */
            return prefixArray[right] - prefixArray[left - 1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left, right);
 */
