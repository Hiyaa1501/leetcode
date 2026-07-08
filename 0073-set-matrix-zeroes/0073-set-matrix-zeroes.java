class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;
        
        //check in row
        for(int j = 0; j < column; j++) {
            if(matrix[0][j] == 0) {
                firstRow = true;
            }
        }
        //check in column
        for(int i = 0; i < row; i++) {
            if(matrix[i][0] == 0) {
                firstCol = true;
            }
        }
        //mark in row and column
        for(int i = 1; i < row; i++) {
            for(int j = 1; j < column; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //set to zero
        for(int i = 1; i < row; i++) {
            for(int j = 1; j < column; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        //mark in row
        if(firstRow) {
            for(int j = 0; j < column; j++) {
                matrix[0][j] = 0;
            }
        }
        //mark in column
        if(firstCol) {
            for(int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}