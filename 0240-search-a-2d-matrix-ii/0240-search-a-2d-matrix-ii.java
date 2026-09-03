class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while(row < matrix.length && col >= 0) {  //we are going downward and left in row
            if (matrix[row][col] == target) {
                return true;
            } 
            else if (matrix[row][col] < target) {     //move downward to search target
                row++;
            } else {     //left in col
                col--;
            }
        }
        return false;
    }
}