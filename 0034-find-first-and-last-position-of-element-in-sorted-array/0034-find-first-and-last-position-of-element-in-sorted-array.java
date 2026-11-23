class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = findOccurence(nums, target, true);
        ans[1] = findOccurence(nums, target, false);
        return ans;
    }

        public int findOccurence(int[] nums, int target, boolean isFirst){
            int l = 0;
            int r = nums.length-1;
            int ans = -1;
            while(l<=r){
                int mid = l + (r-l)/2;
                if(nums[mid] == target){
                    ans = mid;
                    if(isFirst){
                        r = mid-1;
                    } else {
                        l = mid+1;
                    }   
                } else if(nums[mid] < target){
                    l = mid+1;
                } else {
                    r = mid-1;
                }
            }
            return ans;
        }
}