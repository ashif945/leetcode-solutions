class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int i = 0; 
        int leftSum = 0;
        int totalSum = 0;
        while(i<n){
            totalSum+= nums[i];
            i++;
        } 
        i=0;
        while(i<n){
            int rightSum = totalSum - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum+=nums[i];
            i++;
        }
        return -1;
        
    }
}