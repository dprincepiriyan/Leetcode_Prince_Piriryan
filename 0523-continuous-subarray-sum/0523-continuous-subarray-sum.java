class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int run=0;
        for(int i=0;i<nums.length;i++){
            run+=nums[i];
            int rem=run%k;
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                if(len>=2){
                    return true;
                }
            }
            else{
                map.put(rem,i);
            }
        }
        return false;
    }
}