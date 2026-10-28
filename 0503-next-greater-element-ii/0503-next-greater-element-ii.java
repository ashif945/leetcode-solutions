class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
       int[] ans = new int[n];
       for(int i=0; i<n; i++){
            for(int j=i+1; j<2*n; j++){
                if(nums[j%n] > nums[i]){
                    ans[i] = nums[j%n];
                    break;
                } else if(j == 2*n-1){
                    ans[i] = -1;
                }   
            }
        }
        return ans; 
    }
}