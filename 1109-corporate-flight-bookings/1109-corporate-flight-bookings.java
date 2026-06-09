class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n+2];
        for(int i=0;i<bookings.length;i++){
            int start=bookings[i][0];
            int end=bookings[i][1];
            int seats=bookings[i][2];
            arr[start]+=seats;
            arr[end+1]-=seats;
        }
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        int[] sliced = Arrays.copyOfRange(arr, 1, n+1);
        return sliced;
    }
}