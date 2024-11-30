/*https://leetcode.com/problems/transpose-matrix/description/*/

package org.example.matrix;

public class Transpose_Matrix {
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
          /*  Since it is not a square matrix so it will throw index out of bound exception for some location
            in order to prevent that we need to create a copy matrix whose dimension are swapped with original
            that is row is column count and column count is row count   */
            int[][] result = new int[n][m];
            for(int i =0;i<m;i++)
            {
                for(int j = 0;j<n;j++)
                {
                    result[j][i]=matrix[i][j];
                }
            }
            return result;
        }
    }
}
