class Solution {
    public int maxSubArray(int[] nums) {
        int [] prefix_sum = new int[nums.length];
        prefix_sum[0] = nums[0];
        int max = prefix_sum[0];
        for(int i = 1; i<nums.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + nums[i];
            max = Math.max(prefix_sum[i],max);
        }
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}
