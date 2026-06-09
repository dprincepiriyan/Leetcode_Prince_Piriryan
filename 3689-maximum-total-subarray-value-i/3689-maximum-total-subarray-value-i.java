class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int[]a=nums;
        int maxv=a[0];
        int minv=a[0];
        for(int i=1;i<nums.length;i++){
            maxv=Math.max(maxv,a[i]);
            minv=Math.min(minv,a[i]);
        }
        long result=(long)maxv-minv;
        return result*k;
    }
}