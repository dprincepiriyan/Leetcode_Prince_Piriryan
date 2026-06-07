class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] covered = new boolean[51];
        int n=ranges.length;
        for(int i=0;i<n;i++){
            int start=ranges[i][0];
            int end=ranges[i][1];
            for(int j=start;j<=end;j++){
                covered[j]=true;
            }
        }
        for(int i=left;i<=right;i++){
            if(covered[i]==false){
                return false;
            }
        }
        return true;
    }
}