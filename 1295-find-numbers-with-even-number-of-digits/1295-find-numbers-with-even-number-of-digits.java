class Solution {
    public int findNumbers(int[] nums) {
        int size=0;
        int evenNum = 0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            while(num != 0 ){
               num = num / 10;
               size++;
            }
            nums[i] = size;
            size=0;
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j]%2 == 0){
                evenNum++;
            }
        }
        return evenNum;
    }
}