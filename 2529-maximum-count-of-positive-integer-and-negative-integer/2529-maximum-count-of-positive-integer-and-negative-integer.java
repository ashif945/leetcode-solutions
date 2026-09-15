class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0; 
        int pos = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0){
                neg++;
            } else if(nums[i] > 0) {
                pos++;
            }
            max = Math.max(neg, pos);
        } 
        return max;
    }
}