class Solution {
    public int minOperations(int[] nums, int x) {
       int n = nums.length;
       int totalSum = 0;
       for(int i=0; i<n; i++){
        totalSum += nums[i];
       } 
       int l=0;
       int r=0;
       int currSum = 0;
       int minLen = n+1;

       while(r<n){
        currSum += nums[r];
        if(totalSum - currSum > x){
            r++;
            continue;
        } else if(totalSum - currSum == x){
             minLen = Math.min(minLen,n-(r-l+1));
        } else{
            while(totalSum - currSum < x && l<=r){
            currSum = currSum-nums[l++];
            }
            if(totalSum - currSum == x){
            minLen = Math.min(minLen,n-(r-l+1));
            }  
        }
        r++;
       }
       if(minLen == n+1){
        return -1;
       }
       return minLen;
    }
}