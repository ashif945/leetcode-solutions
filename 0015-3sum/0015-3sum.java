class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int k = -(nums[i] + nums[j]);
                List<Integer> list = new ArrayList<>();
                if(set.contains(k)){
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);

                    Collections.sort(list);
                    ans.add(list);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(ans);
    }
}