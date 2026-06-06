class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightsum=0;
        int leftsum=0;
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            rightsum+=nums[i];
        }
        for(int i=0;i<n;i++){
            rightsum-=nums[i];
            ans[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return ans;
    }
}