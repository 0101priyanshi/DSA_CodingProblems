package org.example.matrix;

public class RotateImageBy90 {
//    find transpose
    public static int[][] transpose(int row,int col,int[][] array)
    {
        for(int i =0;i<row;i++)
        {
            for (int j =i+1;j<col;j++)
            {
                int temp = array[i][j];
                array[i][j]= array[j][i];
                array[j][i]=temp;
            }
        }
        return array;
    }
//    find reverse
    public static int[][] reverse(int row,int col,int[][] array)
    {
        for(int i =0;i<row;i++)
        {
            int left = 0;
            int right = col-1;
            while(left<right)
            {
                int temp =array[i][left];
                array[i][left]=array[i][right];
                array[i][right]=temp;
                left++;
                right--;
            }
        }
        return array;
    }
//      print output
    public static void printArray(int row,int col,int[][] array)
    {
        for (int i =0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int rowLength = array.length;
        int colLength = array[0].length;
//        transpose
        transpose(rowLength,colLength,array);
//        reverse
        reverse(rowLength,colLength,array);
//        print
        printArray(rowLength,colLength,array);
    }
}