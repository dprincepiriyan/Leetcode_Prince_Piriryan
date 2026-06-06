class Solution {
    public int minStartValue(int[] nums) {
        int runningSum = 0;
        int minPrefix = 0; // Starts at 0 because before we take any steps, the sum is 0
        
        for (int num : nums) {
            runningSum += num;
            minPrefix = Math.min(minPrefix, runningSum);
        }
        
        // If minPrefix dipped below 0, we return 1 - minPrefix.
        // If it stayed >= 0, 1 - 0 = 1, which perfectly covers both branches!
        return 1 - minPrefix;
    }
}