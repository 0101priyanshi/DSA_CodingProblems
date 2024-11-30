package org.example.matrix;

public class Reverse_MatrixByColumn {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3,4,5},{6,7,8,9,0},{1,3,5,7,9}};
        int rowLength = array.length;
        int colLength = array[0].length;

        /*iterate throw array column wise*/
        for(int j =0;j<colLength;j++)
        {
           int begin = 0;
           int end = rowLength-1;
           /*Reverse each column*/
           while(begin<end)
           {
               int temp = array[begin][j];
               array[begin][j] = array[end][j];
               array[end][j]=temp;
               begin++;
               end--;
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
