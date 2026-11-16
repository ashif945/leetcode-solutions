class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                Set<Long> st = new HashSet<>();
                for(int k=j+1; k<n; k++){
                    long sum = (long) nums[i] + nums[j] + nums[k];
                    long needed = (long)target - sum;
                    if(st.contains(needed)){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add((int)needed);

                        Collections.sort(list);
                        set.add(list);
                    }
                    st.add((long)nums[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}