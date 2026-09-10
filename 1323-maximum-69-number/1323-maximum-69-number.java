class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }

        for(int i=0; i<digits.length; i++){
            if(digits[i] == 6){
                digits[i] = 9;
                break;
            }
        }
        
        int nums = 0;
        for (int digit : digits) {
            nums = nums * 10 + digit;
        }
        return nums;
        
    }
}