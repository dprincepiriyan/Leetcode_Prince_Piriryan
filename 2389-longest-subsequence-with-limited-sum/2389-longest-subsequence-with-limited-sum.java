class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = queries.length;
        int[] prefix = new int[n];
        prefix = nums;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int[] answer = new int[m];
        for (int i = 0; i < m; i++) {
            int count = 0;
            while (count < n && prefix[count] <= queries[i]) {
                count++;
            }
            answer[i] = count;
        }
        
        return answer;
    }
}