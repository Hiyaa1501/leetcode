class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        for(int j = 0; j < column; j++) {
            if(matrix[0][j] == 0) {
                firstRow = true;
            }
        }

        for(int i = 0; i < row; i++) {
            if(matrix[i][0] == 0) {
                firstCol = true;
            }
        }

        for(int i = 1; i < row; i++) {
            for(int j = 1; j < column; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < row; i++) {
            for(int j = 1; j < column; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if(firstRow) {
            for(int j = 0; j < column; j++) {
                matrix[0][j] = 0;
            }
        }

        if(firstCol) {
            for(int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}