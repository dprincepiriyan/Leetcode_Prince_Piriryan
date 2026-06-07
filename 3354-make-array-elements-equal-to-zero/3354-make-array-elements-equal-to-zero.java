class Solution {
    public int countValidSelections(int[] nums) {
        int total=0;
        int n=nums.length;
        for(int num:nums){
            total+=num;
        }
        int count=0;
        int leftsum=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
            int rightsum=total-leftsum-nums[i];
            if(rightsum==leftsum){
                count+=2;
            }else if(Math.abs(rightsum-leftsum)==1){
                count+=1;
            }
            
        }
        leftsum+=nums[i];
        }
        return count;
    }
}