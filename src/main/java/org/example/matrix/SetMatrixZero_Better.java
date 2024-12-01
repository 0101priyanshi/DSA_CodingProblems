package org.example.matrix;

public class SetMatrixZero_Better {
    static int[][] array = {{0,1,1,1},{1,0,1,1},{1,1,1,1},{0,1,1,0}};
    static int length = array.length;
    static  int[] rowArray = new int[length];
    static   int[] colArray = new int[length];

    //        Modify array
    public static void modifyArray()
    {
        for(int i =0;i<length;i++)
        {
            for(int j =0;j<length;j++)
            {
                /*if any of the row or column of particular element is 1 then i have mark it as zero*/
                if( (rowArray[i]==1 || colArray[j]==1)&& array[i][j]!=0)
                {
                    array[i][j]=0;
                }
            }
        }
    }
    //        Print resultant array
    public static void printArray()
    {
        for(int i =0;i<length;i++)
        {
            for(int j =0;j<length;j++)
            {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*iterate through the array and whenver 0 is encountered mark it respective
        row and column position as 1 in rowArray and colArray respectively*/
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (array[i][j] == 0) {
                    rowArray[i] = 1;
                    colArray[j] = 1;
                }
            }
        }

        modifyArray();
        printArray();
    }


}
