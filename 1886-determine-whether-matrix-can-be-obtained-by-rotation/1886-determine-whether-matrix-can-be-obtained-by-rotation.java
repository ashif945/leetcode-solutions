class Solution {
    public void rotate(int[][] mat){
        int n = mat.length;
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n-1-i; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[n-1-j][i];
                mat[n-1-j][i] = mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j] = mat[j][n-1-i];
                mat[j][n-1-i] = temp;
            }
        }
    }
    public boolean check(int[][] mat, int[][] target){
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k=0; k<4; k++){
            if(check(mat, target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}