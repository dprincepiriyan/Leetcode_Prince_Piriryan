class Solution {
    public int findKthPositive(int[] arr, int k) {
        int w = 0;
        int currentNumber = 1;
        int idx = 0;
        while (w < k) {
            if (idx < arr.length && arr[idx] ==currentNumber) {
                idx++; 
            } else {
                w++; 
                if (w == k) {
                    return currentNumber;
                }
            }
            currentNumber++;
        }
        
        return currentNumber;
    }
}