class Solution {
    public int maxArea(int[] height) {
        int i = 0,n = height.length;
        int j = n-1;
        int maxArea = 0,newArea;
        while(i<j){
            if(height[i]<height[j]){
                newArea = height[i]*(j-i);
                i++;
            }
            else{
                newArea = height[j]*(j-i);
                j--;
            }
            maxArea = Math.max(maxArea,newArea);
        }
        return maxArea;
    }
}
