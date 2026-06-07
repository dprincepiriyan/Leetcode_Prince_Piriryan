class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int totalOne=0;
        int left=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                totalOne++;
            }
        }
        int right=totalOne;
        int sum=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0'){
                left++;

            }else if(s.charAt(i)=='1'){
                right--;
            }
            sum=Math.max(sum,left+right);
        }
        return sum;
    }
}