class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zeroes = 0;
        int maxLen = 0;
        int n = nums.length;
        while(r<n){
            if(nums[r] == 0){
                zeroes++;
            }
            if(zeroes <= k){
                maxLen = Math.max(maxLen, r-l+1);
                
            }
            if(zeroes > k){
                if(nums[l] == 0){
                    zeroes--;    
                }
                l++;
            }
            r++;
        }
        return maxLen;
    }
}