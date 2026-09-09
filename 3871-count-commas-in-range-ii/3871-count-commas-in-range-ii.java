class Solution {
    public long countCommas(long n) {
        long nums = 1000;
        long comma = 0;
       
        while(nums<=n){
            comma = comma + (n-nums+1);
            nums = nums*1000;
        }
        return comma;
    }
}

