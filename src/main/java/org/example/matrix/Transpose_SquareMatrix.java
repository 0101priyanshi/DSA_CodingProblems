package org.example.matrix;

//means row will become column
public class Transpose_SquareMatrix {
    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int length = array.length;

        /*
        we need to swap only upper triangular matrix so j
        is always starting from value of i because if we
        take j initialized to i then we observe that the
        matrix is getting back to original
        */
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (i !=j)
                {
                    int temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }
        /*print the matrix after swapping*/
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
