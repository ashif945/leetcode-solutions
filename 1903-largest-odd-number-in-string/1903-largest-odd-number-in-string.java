class Solution {
    public String largestOddNumber(String num) {
        StringBuilder sb = new StringBuilder();
        int last = num.charAt(num.length()-1);
        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);
            if(ch%2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}