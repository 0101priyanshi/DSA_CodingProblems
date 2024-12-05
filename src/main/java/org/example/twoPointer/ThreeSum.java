package org.example.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
//    you have two return answer in the format of list of list is [[],[],[],[]]
        public List<List<Integer>> threeSum(int[] nums) {
            /*first we will sort the array this will ensure that we
             are able to use two pointer effectively*/
            Arrays.sort(nums);
            List<List<Integer>> answer = new ArrayList<>();
          /*  we will take three pointers i j and k where i will go
           from zero to end -2 ,j will go from i+1 and
           k will start from end of array. here j and k
           will be taken as are two pointers and i will be
            fixed for each iteration in order to get all
            combination on valid set*/
            for(int i =0;i<nums.length-2;i++)
            {
               /* we are here making sure that we don't repeat values of i
               because if is repeated then we will not get unique triplets*/
                if(i>0 && nums[i]==nums[i-1])
                {
                 /*continue will make sure that i directly jumps to next iteration*/
                    continue;
                }
                int a = nums[i];
                int j = i+1;
                int k = nums.length-1;
                /*two pointer logic*/
                while(j<k)
                {
                   /* Since expected target sum is zero therefore -a ==nums[j]+nums[k]*/
                    if(-a==nums[j]+nums[k])
                    {
                       /* Arrays.asList() creates a fixed-size list with the specified elements,
                        in this case, the integers nums[i], nums[j], and nums[k]*/
                        /*then adding it to answer*/
                        answer.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                        /*to avoid taking duplicate j value in the triplet*/
                        while(j<k&&nums[j]==nums[j-1])
                        {
                            j++;
                        }
                        /*to avoid taking duplicate k value in the triplet*/
                        while(j<k&&nums[k]==nums[k+1])
                        {
                            k--;
                        }
                    }
                    else if(-a>nums[j]+nums[k])
                    {
                        j++;
                    }
                    else
                    {
                        k--;
                    }
                }
            }
            return answer;
        }

}
