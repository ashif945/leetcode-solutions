class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex+=1;
        long element = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1; i<rowIndex; i++){
            element = element * (rowIndex-i);
            element = element/i;
            list.add((int)element);
        }
        return list;
    }
}