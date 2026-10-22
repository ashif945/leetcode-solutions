class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int mid = 0;
        int temp = 0;
        while(l<=r && mid<=r ){
            if(mid<l){
                mid=l;
            }
            if(nums[mid] == 0){
                temp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = temp;
                l++; 
            } else if(nums[mid] == 2){
                temp = nums[r];
                nums[r] = nums[mid];
                nums[mid] = temp;
                r--;
            } else {
                mid++;
            }
        }    
    }
}