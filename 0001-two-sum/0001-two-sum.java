class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            copy[i]=nums[i];
        }
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int leftnum=0;
        int rightnum=0;
        while(left<right){
            if(nums[left]+nums[right]==target){
                leftnum=nums[left];
                rightnum=nums[right];
                break;
            }else if(nums[left]+nums[right]>target){
                right--;
            }else{
                left++;
            }
        }
        int a=-1;
        int b=-1;
        for(int i=0;i<nums.length;i++){
            if(copy[i]==leftnum &&a==-1){
                a=i;
            }else if(copy[i]==rightnum && b==-1){
                b=i;
            }
        }
        return new int[]{a,b};
    }
}