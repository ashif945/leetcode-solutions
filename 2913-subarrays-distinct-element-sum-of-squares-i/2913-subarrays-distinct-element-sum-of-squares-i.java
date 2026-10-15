class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int disSq = 0;
        for(int i=0; i<n; i++){
            int[] arr = new int[101];
            int count = 0;
            for(int j=i; j<n; j++){
                if(arr[nums.get(j)] == 0){
                    count++;
                    arr[nums.get(j)]++;
                }
                disSq += count * count;
            }  
        }
        return disSq;
        
    }
}