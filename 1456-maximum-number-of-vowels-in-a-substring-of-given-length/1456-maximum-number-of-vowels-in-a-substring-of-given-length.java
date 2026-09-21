class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int count = 0;
        int maxVowel = 0;
        while (r < k) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
            r++;
        }
        maxVowel = count;
        while (r < n) {
            if (isVowel(s.charAt(r))) {
                count++;
            }
            if (isVowel(s.charAt(l))) {
                count--;
            }
            l++;
            r++;
            maxVowel = Math.max(maxVowel, count);
        }
        return maxVowel;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}