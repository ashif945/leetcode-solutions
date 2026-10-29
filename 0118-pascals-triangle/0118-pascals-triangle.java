class Solution {
    public List<Integer> generateRow(int row){
        long element = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1; i<row; i++){
            element = element * (row-i);
            element = element/i;
            list.add((int)element);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            list.add(generateRow(i));
        }
        return list;
    }
}