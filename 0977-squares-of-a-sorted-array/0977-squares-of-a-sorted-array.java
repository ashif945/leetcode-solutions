class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            double sq = Math.pow(nums[i],2);
            nums[i] = (int)sq;
        }
        Arrays.sort(nums);
        return nums;
        
    }
}