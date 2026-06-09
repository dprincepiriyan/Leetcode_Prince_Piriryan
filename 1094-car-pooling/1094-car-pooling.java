class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1002];
        for(int i=0;i<trips.length;i++){
            int num=trips[i][0];
            int start=trips[i][1];
            int end=trips[i][2];
            arr[start]+=num;
            arr[end]-=num;
        }
        int run=0;
        for(int i=0;i<arr.length;i++){
            run+=arr[i];
            if(run>capacity){
                return false;
            }
        }
        return true;
    }
}