package org.example.matrix;

public class Reverse_MatrixByRow {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3,4,5},{6,7,8,9,0},{1,3,5,7,9}};
        int rowLength = array.length;
        int colLength = array[0].length;

        /*iterate throw array row wise*/
        for(int i =0;i<rowLength;i++)
        {
           int left = 0;
           int right = colLength-1;
           /*Reverse each row*/
           while(left<right)
           {
               int temp = array[i][left];
               array[i][left] = array[i][right];
               array[i][right]=temp;
               left++;
               right--;
           }
        }

       /* Print the output array */
        for(int i =0;i<rowLength;i++)
        {
            for(int j =0;j<colLength;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
