class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int j = 1;
        int [] arr = new int[nums.length];
        arr[0] = nums[0];
        for  (int i =0; i<nums.length-1; i++){
            if(nums[i+1]!=nums[i]){
                arr[j++] = nums[i+1];
                k++;
            }
        }
        for  (int i =0; i<nums.length-1; i++){
           nums[i] = arr[i];
        }
        return k;
    }
}
