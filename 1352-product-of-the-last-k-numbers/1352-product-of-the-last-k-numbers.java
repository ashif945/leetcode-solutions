class ProductOfNumbers {
    List<Integer> list;
    public ProductOfNumbers() {
       list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int p=1;
        int n=list.size();
        for(int i=n-1; i>n-1-k; i--){
            p*= list.get(i);
        }
        return p;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */