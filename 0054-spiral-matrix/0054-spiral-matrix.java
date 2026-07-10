class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int row = matrix.length;
        int column = matrix[0].length;

        int left = 0;
        int right = column - 1;
        int top = 0;
        int bottom = row - 1;

        while(left <= right && top <= bottom) {
            //left to right
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;
            //top to bottom
            for(int j = top; j <= bottom; j++) {
                ans.add(matrix[j][right]);
            }
            right--;
            //right to left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom to top
            if(left <= right) {
                for(int j = bottom; j >= top; j--) {
                    ans.add(matrix[j][left]);
                }
                left++;
            }
        }
        return ans;
    }
}