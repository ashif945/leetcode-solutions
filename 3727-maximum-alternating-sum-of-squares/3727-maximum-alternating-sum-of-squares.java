class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i] = (long) nums[i]*nums[i];
        }
        Arrays.sort(arr);
        int l=0;
        int r=nums.length-1;
        long score = 0;
        while(l<=r){
            if (l == r) {
                score += arr[r];
                break;
            }
            score += arr[r];
            r--;
            score -= arr[l];
            l++;
            
        }
        return score;
    }
}