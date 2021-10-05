package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //matrix1 3x3
        int[][] matrix1 = {{1,2,3},
                           {4,5,6},
                           {7,8,9}};
        TransposeMatrix(matrix1);

        System.out.println();

        // matrix2 2x3
        int[][] matrix2 = {{1,2,3},
                           {4,5,6}};
        TransposeMatrix(matrix2);
    }

    public static int[][] TransposeMatrix (int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transpose_matrix = new int[n][m];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                transpose_matrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < transpose_matrix.length; i++){
            for (int j = 0; j < transpose_matrix[i].length; j++){
                System.out.print(transpose_matrix[i][j] + " ");
            }
            System.out.println();
        }
        return transpose_matrix;


    }
}
