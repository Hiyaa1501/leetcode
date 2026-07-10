class Solution {
    public int[][] generateMatrix(int n) {
        //Matrix is empty
        //You fill elements using the same boundaries
        int[][] matrix = new int[n][n];

        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        int num = 1;

        while(left <= right && top <= bottom) {
            //left to right
            for(int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;
            //top to bottom
            for(int j = top; j <= bottom; j++) {
                matrix[j][right]  = num++;
            }
            right--;
            //right to left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            }
            //bottom to top
            if(left <= right) {
                for(int j = bottom; j >= top; j--) {
                    matrix[j][left] = num++;
                }
                left++;
            }
        }
        return matrix;
    }
}