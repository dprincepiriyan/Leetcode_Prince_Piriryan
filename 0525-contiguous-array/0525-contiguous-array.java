class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int run=0;
        int Maxl=0;
        for(int i=0;i<nums.length;i++){
            run+=nums[i];
            if(map.containsKey(run)){
                Maxl=Math.max(i-map.get(run),Maxl);
            }else{
                map.put(run,i);
            }
        }
        return Maxl;
    }
}