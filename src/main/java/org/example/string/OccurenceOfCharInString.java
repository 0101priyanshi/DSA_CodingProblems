package org.example.string;

import java.util.Scanner;

public class OccurenceOfCharInString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter the sentence");
        String input =scan.nextLine();
        System.out.println("Pls enter the character");

        char target =scan.next().charAt(0);
        for(int i =0;i<input.length()-1;i++)
        {
            if(target==input.charAt(i))
            {
                System.out.print(i+", ");
            }
        }
    }

}
