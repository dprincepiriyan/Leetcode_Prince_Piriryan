class ProductOfNumbers {
    private List<Integer> prefixProduct;
    public ProductOfNumbers() {
        prefixProduct=new ArrayList<>();
        prefixProduct.add(1);
    }
    
    public void add(int num) {
        if(num==0){
            prefixProduct.clear();
            prefixProduct.add(1);
        }else{
        int curr=num*prefixProduct.get(prefixProduct.size()-1);
        prefixProduct.add(curr);
        }
    }
    
    public int getProduct(int k) {
        int n=prefixProduct.size();
        if(k>=n){
            return 0;
        }else{
            int i=prefixProduct.get(n-1);
            int j=prefixProduct.get(n-1-k);
            return i/j;
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */