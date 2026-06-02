class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int current_sum = 0;
        for(int i = 0; i<k; i++){
            current_sum += nums[i];
        }
        int n = nums.length;
        int max_sum = current_sum;
        for(int i = 1; i<=n-k; i++){
            current_sum = current_sum + nums[i+k-1] - nums[i-1];
            max_sum = Math.max(max_sum,current_sum);
        }
        return (double)max_sum/k;
    }
}
