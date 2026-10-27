class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length / 2];
        int[] neg = new int[nums.length / 2];
        int i = 0;
        int j = 0;
        for(int num : nums){
            if(num > 0){
                pos[i++] = num;
            } else{
                neg[j++] = num;
            }
        }
        int[] result = new int[nums.length];
        int k = 0;
        i = 0;
        j = 0;
        while(k < result.length){
            if(k%2 == 0){
                result[k] = pos[i++];
            } else{
                result[k] = neg[j++];
            }
            k++;
        }
        return result;
    }
}