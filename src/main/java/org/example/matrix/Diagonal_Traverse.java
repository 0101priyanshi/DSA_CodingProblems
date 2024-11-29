
/*

Given a 2D array :
        1 2 3 4 5
        6 7 8 9 3
        7 3 2 4 8
you need to print elements diagonally upwards like :
        1
        6 2
        7 7 3
        3 8 4
        2 9 5
        4 3
        8

*/

package org.example.matrix;
import java.util.Scanner;

public class Diagonal_Traverse {
    static int rows ;
    static int columns;

    public static int[][] takeMatrixFromUser()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pls enter the number of rows you wish to keep");
        rows = scan.nextInt();

        System.out.println("Pls enter the number of columns you wish to keep");
        columns = scan.nextInt();

        int[][] twoDArray = new int[rows][columns];
        System.out.println("okay so now you can tell me the elements you want to add");

        /*to take array input from user*/
        for(int i =0;i<rows;i++)
        {
            for(int j =0;j<columns;j++)
            {
                twoDArray[i][j]=scan.nextInt();
            }
        }

        scan.close();
        return twoDArray;
    }

    /*logic you need to just print one line of diagonal elements*/
    public static void printSingleDiagonal(int row, int column, int[][] arr)
    {
        while(row>=0&&column<columns)
        {
            System.out.print(arr[row][column]+ " ");
            row--;
            column++;
        }
        System.out.println();
    }

    public static void printDiagonals(int[][] arr)
    {
        /*to print elements starting from first column*/
        for(int row =0;row<rows;row++)
        {
            /*column will be 0*/
            printSingleDiagonal(row,0,arr);
        }

        /*to print elements from last row but skipping
        last row column first element as it was already
         take in previous loop*/
        for(int column =1;column<columns;column++)
        {
            /*row will be last*/
            printSingleDiagonal(rows-1, column,arr);
        }
    }

    public static void main(String args[])
    {
        int[][] twoDArray =takeMatrixFromUser();
        printDiagonals(twoDArray);

    }
}
