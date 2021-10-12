package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] matrix3 = {{1}};
        int[][] matrix4 = {{1,2},{3,4}};
        rotate(matrix1);
        rotate(matrix2);
        rotate(matrix3);
        rotate(matrix4);


    }
    public static void rotate(int[][] matrix) {
        if(matrix.length == 0){
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int transpose = 0;

        // transpose matrix first
        for(int i = 0; i < m; i++){
            for(int j = i; j < n; j++){
                transpose = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = transpose;
            }
        }

        // flip the matrix
        for(int i = 0; i < m; i++){
            for(int j = 0; j < m/2; j++){
                transpose = matrix[i][j];
                matrix[i][j] = matrix[i][m-1-j];
                matrix[i][m-1-j] = transpose;
            }
        }



        System.out.println(Arrays.deepToString(matrix));

    }

}
