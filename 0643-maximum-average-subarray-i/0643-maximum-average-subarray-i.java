class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = 0;
        double sum = 0;
        int n = nums.length;
        double maxAvg = Integer.MIN_VALUE;
        while(r<n){
            sum+= nums[r];
            if(r-l+1 == k){
                double avg = sum/k;
                maxAvg = Math.max(maxAvg, avg);
                sum-= nums[r-k+1];
                l++;
            }
            r++;
        }
        return maxAvg;
    }
}