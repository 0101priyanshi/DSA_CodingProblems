package org.example.twoPointer;

public class RemoveDuplicateFromSortedArray {

        public int removeDuplicates(int[] nums) {
            int i =0;
            int j =1;
            while(j<nums.length)
            {
                /*if value of i and j does not matches then move i ahead
                and now store value of j in i as i has moved to new
                    index so previous value of i is already saved*/
                if(nums[i]!=nums[j])
                {
                    i++;
                    nums[i]=nums[j];

                }
                //iterate j to next position if it matches or not
                j++;
            }
//            since array is zero index so last i value +1 will give you size of unique elements
            return i+1;

        }
}
