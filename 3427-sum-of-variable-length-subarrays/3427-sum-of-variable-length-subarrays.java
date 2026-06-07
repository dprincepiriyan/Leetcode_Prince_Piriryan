class Solution {
    public int subarraySum(int[] nums) {
        int n=nums.length;
        int[] total=new int[n+1];
        total[0]=0;
        for(int i=1;i<=n;i++){
            total[i]=total[i-1]+nums[i-1];
        }
        int Gtotal=0;
        for(int i=0;i<n;i++){
            int start=Math.max(0,i-nums[i]);
            int window=total[i+1]-total[start];
            Gtotal+=window;
        }
        return Gtotal;

    }
}