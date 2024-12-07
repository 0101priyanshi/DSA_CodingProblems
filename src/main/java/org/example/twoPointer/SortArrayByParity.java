package org.example.twoPointer;
/*
 Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.

*/
public class SortArrayByParity {
        public int[] sortArrayByParity(int[] nums) {
            int i =0;
            int j =nums.length-1;
            while(i<j)
            {
                if(nums[i]%2==0)
                {
                    i++;
                }

                else if(nums[j]%2==1)
                {
                    j--;
                }
                else
                {
                     /*Swap*/
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j--;
                }

            }
            return nums;
        }
}
