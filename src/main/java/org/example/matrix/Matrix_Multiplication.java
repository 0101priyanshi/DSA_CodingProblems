package org.example.matrix;

public class Matrix_Multiplication {
    public static void main(String[] args) {

        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B ={{9,8,7},{6,5,4},{3,2,1}};
        int length = A.length;
        int[][] C = new int[length][length];
       /* Iterates through the rows of Matrix A.
                Index i: Represents the current row of A being processed.
		For every row i of A, we compute all columns j of B to fill C[i][j]*/
        for(int i =0;i<length;i++)
        {
            /* Iterates through the columns of Matrix B.
		Index j: Represents the current column of B being processed.
		For a fixed row i of A, this loop determines the value of C[i][j], the entry at row i, column j in the result.
             */
            for(int j =0;j<length;j++)
            {
                /*Inner Loop (for k = 0 to n-1)
		        Purpose: Performs the dot product computation.
		        Index k: Represents the column of A and the row of B involved in the calculation.*/
                for(int k =0;k<length;k++)
                {
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        for(int i =0;i<length;i++)
        {
            for(int j =0;j<length;j++)
            {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
