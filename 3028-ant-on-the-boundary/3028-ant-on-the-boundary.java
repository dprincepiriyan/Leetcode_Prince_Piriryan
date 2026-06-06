class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int position=0;
        int boundary=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            position+=nums[i];
            if(position==0){
                boundary++;
            }
        }
        return boundary;
    }
}