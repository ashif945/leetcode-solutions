class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for(int i=0; i<=n; i++){
            totalSum+= i;
        }
        int arrSum = 0;
        for(int i=0; i<n; i++){
            arrSum+= nums[i];
        }
        return totalSum - arrSum;
    }
}