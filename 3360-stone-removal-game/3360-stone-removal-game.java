class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        boolean aliceWin = true;
        for(int i=10; i<=n; i--){
            n=n-i;
            if(i%2!=0){
                aliceWin = false;
            } else {
                aliceWin = true;
            }
        }
        return aliceWin;
    }
}