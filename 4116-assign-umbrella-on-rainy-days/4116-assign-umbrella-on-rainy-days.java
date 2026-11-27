class Solution {
    public String[] assignUmbrella(int[] rain) {
        String[] str = new String[rain.length];
        int n = rain.length;
        int alice = 0;
        int bob = 0;
        for(int i=0; i<n; i++){
            if(rain[i] == 0){
                str[i] = "None";
                continue;
            }
            boolean aliceNeed = i+1<n && rain[i+1] == 1;
            if(aliceNeed && alice<=bob){
                str[i] = "Alice";
                alice++;
            } else {
                str[i] = "Bob";
                bob++;
            }
         }
        
        return str;
    }
}