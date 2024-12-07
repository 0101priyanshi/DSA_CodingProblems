package org.example.math;

//1010--> 0*2^0+1*2^1+0*2^2+1*2^3
public class BinaryToDecimal {
    public static void main(String[] args) {
        int binary =1010;
        int output =0;
        int power = 1;
        while(binary>0)
        {
           output= output +(binary%10) * power;
            power= 2*power;
           binary= binary/10;
        }
        System.out.println(output);
    }
}
