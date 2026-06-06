class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int total_sum=0;
        for(int i=0;i<n;i++){
            int left_choices=i+1;
            int right_choices=n-i;
            int total_subarray=left_choices*right_choices;
            int odd_sub=(total_subarray+1)/2;
            total_sum+=odd_sub*arr[i];
        }
        return total_sum;
    }
}