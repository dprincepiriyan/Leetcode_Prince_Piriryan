class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total=0;
        for(int num:arr){
            total+=num;
        }
        if(total%3!=0){
            return false;
        }
        int target=total/3;
        int run=0;
        int parts=0;
        for(int i=0;i<arr.length;i++){
            run+=arr[i];
            if(run==target){
                parts++;
                run=0;
            }
        }
        return parts>=3;
    }
}