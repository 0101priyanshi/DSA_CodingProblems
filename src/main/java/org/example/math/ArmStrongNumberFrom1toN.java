package org.example.math;

public class ArmStrongNumberFrom1toN {
    public static boolean checkArmstrong(int number)
    {
        /*keeping a copy of original number so that we have something to compare because number is processed later*/
        int originalNumber = number;
        /* keeping initial sum as zero*/
        int sum=0;
        /*while our number is greater than zero we keep the process going*/
        while(number>0)
        {
         /*  digit will store the last digit from right because number %10
           will give us the remainder of the number which will be the last digit */
            int digit = number%10;
          /* using Math.pow function for calculations where first parameter is
           the number and second parameter is the power to which we want it to be raised
           also Math.pow takes double type only so therefore type casting it into integer*/

            sum = (int) (sum+Math.pow(digit,3));

            /*very important to reduce the number to get digits properly*/
            number =number/10;
        }
        return sum==originalNumber;
    }

    public static void main(String[] args) {
        for(int i =1;i<=1000;i++)
        {
            if(checkArmstrong(i)==true)
            {
                System.out.println(i);
            }
        }
    }
}