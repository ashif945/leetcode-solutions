class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startRow = 0;
        int endRow = matrix.length - 1 ;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        int num=1;
        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol && num<=n*n; j++) {
                matrix[startRow][j] = num;
                num++;
            }
            // Right
            for (int i=startRow+1; i<=endRow && num<=n*n; i++) {
                matrix[i][endCol] = num;
                num++;
            }
            // Bottom
            if (startRow < endRow) {
                for (int j=endCol-1; j>=startCol && num<=n*n; j--) {
                    matrix[endRow][j] = num;
                    num++;
                }
            }
            // Left
            if (startCol < endCol) {
                for (int i=endRow-1; i>startRow && num<=n*n; i--) {
                    matrix[i][startCol] = num;
                    num++;
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return matrix;
    }
}