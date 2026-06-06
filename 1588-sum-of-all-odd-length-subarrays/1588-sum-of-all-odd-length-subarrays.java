class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int total=0;
        int[] prefix=new int[n+1];
        prefix[0]=0;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j+=2){
                total+=prefix[j+1]-prefix[i];
            }
        }
        return total;
    }
}