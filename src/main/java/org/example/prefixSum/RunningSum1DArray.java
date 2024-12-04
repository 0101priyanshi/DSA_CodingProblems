package org.example.prefixSum;

public class RunningSum1DArray {
    public int[] runningSum(int[] nums) {

        /*Approach 1 : using another array to store sum elements*/
//         int[] output = new int[nums.length];
//         int sum =0;
//         for(int i=0;i<nums.length;i++)
//         {
//             sum = sum+nums[i];
//             output[i] =sum;
//         }
//         return output;
//
         /*Approach 2: Making changes in place*/

      /*  storing first element in a variale because first element will always be first element only
                now iterating through the array from index 1 till end and adding the nums value
        in sum and storing sum in nums[i] each time*/
        int sum = nums[0];
        for(int i=1;i<nums.length;i++)
        {   sum = sum +nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
