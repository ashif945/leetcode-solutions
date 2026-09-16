class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i == j){
                    transpose[i][j] = matrix[i][j];
                } else {
                    transpose[j][i] = matrix[i][j];
                }
            }
        }
        return transpose;
    }
}