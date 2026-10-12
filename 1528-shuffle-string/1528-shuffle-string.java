class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder("");
        char[] result = new char[indices.length];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            result[indices[i]] = ch;
        }
        String str = "";
        for(char idx:result){
            str += idx;
        }
        return str;
    }
}