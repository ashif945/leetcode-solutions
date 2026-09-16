class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] helper = new int[image.length][image[0].length];
        for(int i=0; i<image.length; i++){
            int pos=0;
           for(int j=image[0].length-1; j>=0 ; j--){
            helper[i][pos] = image[i][j];
            pos++;
           } 
        }
        for(int i=0; i<helper.length; i++){
            for(int j=0; j<helper[i].length; j++){
                if(helper[i][j] == 0){
                    helper[i][j] = 1;
                } else {
                    helper[i][j] = 0;
                }
            }
        }
        return helper;   
    }
}