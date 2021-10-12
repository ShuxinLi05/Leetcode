package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] matrix1= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(matrix1);
        spiralOrder(matrix2);

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        if(matrix.length == 0){
            return list;
        }

        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart; i <= colEnd; i++ ){
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            for(int i = rowStart; i <= rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowStart <= rowEnd){
                for(int i = colEnd; i >= colStart; i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if(colStart <= colEnd){
                for(int i = rowEnd; i >= rowStart; i--){
                    list.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        System.out.println(list);
        return list;
    }

}
