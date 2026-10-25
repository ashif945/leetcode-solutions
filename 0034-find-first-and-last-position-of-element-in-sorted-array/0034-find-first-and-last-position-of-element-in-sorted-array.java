class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int[] ans = new int[2];
        int firstOcc = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                firstOcc= mid;
                r = mid-1; 
            } else if(nums[mid] < target){
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        l = 0;
        r = nums.length-1;
        int lastOcc = -1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                lastOcc  = mid;
                l = mid+1; 
            } else if(nums[mid] < target){
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        ans[0] = firstOcc;
        ans[1] = lastOcc;
        return ans;
    }
}