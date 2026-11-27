class Solution {
    public String reverseWords(String s) {
        int l=0;
        int r = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ' ' || i == s.length()-1){
                if(i == s.length()-1) sb.append(s.charAt(r));
                while(r != l){
                    sb.append(s.charAt(r-1));
                    r--;
                }
                sb.append(" ");
                l=i+1;
                r=i+1;
            } else {
                r++;
            }
        }
        return sb.toString().trim();
    }
}