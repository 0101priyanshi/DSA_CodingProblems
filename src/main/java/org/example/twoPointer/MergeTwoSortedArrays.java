package org.example.twoPointer;

public class MergeTwoSortedArrays {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            //creating a new output array of size m+n
            int[] output = new int[n+m];

            int i =0; //i for nums1
            int j =0; //j for nums2
            int k = 0; //k for output array

            /*both condition needs to be satisfied if only one satisfies
            then it will throw out of bound exception for other one*/
            while(i<m&&j<n)
            {
                /*if value of first array is smaller than second then put
                first array element in output array and increase pointe*/
                if(nums1[i]<nums2[j])
                {
                    output[k]=nums1[i];
                    i++;
                }
                /*if value of second array is smaller than first then put
                second array element in output array and increase pointer*/
                else
                {
                    output[k]=nums2[j];
                    j++;
                }
                /*increase pointer of output array for putting elements*/
                k++;
            }
            /*Note : only one out of below two while loop will execute*/

           /*if there are still elements remaining in first array when second
            array got finished then put it inside output array and increase
            pointer of both output and first array*/
            while(i<m)
            {
                output[k]=nums1[i];
                i++;
                k++;
            }
            /*if there are still elements remaining in second array when first
            array got finished then put it inside output array and increase
            pointer of both output and second array*/
            while(j<n)
            {
                output[k]=nums2[j];
                j++;
                k++;
            }
            /*Since output is expected to be in first array only
            so putting elements from output array to first array*/
            for(int l=0;l<n+m;l++)
            {
                nums1[l]=output[l];
            }
        }
}
