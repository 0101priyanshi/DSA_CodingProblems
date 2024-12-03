package org.example.twoPointer;

public class TwoSum_II_ArrayIsSorted {
        public int[] twoSum(int[] numbers, int target) {
            int i =0;
            int j =numbers.length-1;
            int[] output= new int[2];
            while(i<j)
            {
                int sum = numbers[i]+numbers[j];
                if(sum==target)
                {
                    output[0]=i+1;
                    output[1]=j+1;
                    break;
                }
                else if(sum<target)
                {
                    i++;
                }
                else
                {
                    j--;
                }
            }
            return output;
        }
}
