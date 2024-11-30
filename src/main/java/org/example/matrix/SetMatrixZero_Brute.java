package org.example.matrix;

public class SetMatrixZero_Brute {
    static int[][] A = {{1,0,1},{1,1,1},{1,1,1}};
    static int length = A.length;

//    Modify particular row's non zero elements to -1 for future tracking
    public static void makeRowModified(int row)
    {
        for(int j =0;j<length;j++)
        {
            //    row will be fixed, column value will change
            if(A[row][j]!=0) {
                A[row][j] = -1;
            }
        }
    }
    //    Modify particular column's non zero elements to -1 for future tracking
    public static void makeColumnModified(int column)
    {
        for(int i =0;i<length;i++)
        {
            //    column will be fixed, row value will change
            if(A[i][column]!=0) {
                A[i][column] = -1;
            }
        }
    }
    public static void main(String[] args) {

        for(int i =0;i<length;i++)
        {
            for(int j =0;j<length;j++)
            {
//                whenever  a zero is encoutered make its respective row and column non zero elements to -1
                if(A[i][j]==0)
                {
                    makeRowModified(i);
                    makeColumnModified(j);
                }
            }

        }
//        Now iterate to array again and change all -1 to zero
        for(int i =0;i<length;i++)
        {
            for(int j =0;j<length;j++)
            {
                if(A[i][j]==-1)
                {
                    A[i][j]=0;
                }
            }

        }
        //        Print resultant array
        for(int i =0;i<length;i++)
        {
            for(int j =0;j<length;j++)
            {
               System.out.print(A[i][j]+ " ");
            }
            System.out.println();
            }

        }
    }
