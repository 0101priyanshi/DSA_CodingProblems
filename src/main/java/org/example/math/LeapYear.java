package org.example.math;

public class LeapYear {
    public static boolean checkLeapYear(int year)
    {
        /*if year is divisible by 4 then it is a leap year*/
        if(year%4==0)
        {
           /* if that number is divisble by 100 as well then it must be divisble by 400 to be a leap year*/
            if(year%100==0) {
                /*return if divible by 400 or not*/
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       System.out.println(checkLeapYear(1765));
    }
}
