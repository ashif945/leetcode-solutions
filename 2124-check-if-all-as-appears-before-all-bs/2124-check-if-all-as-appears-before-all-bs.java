class Solution {
    public boolean checkString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'b'){
                stack.push(ch);
            }
            if(ch == 'a' && !stack.isEmpty()){
                return false;
            }
        }
        return true;
    }
}