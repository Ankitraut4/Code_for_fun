class Solution {
    public int maxArea(int[] height) {
       int start = 0;
       int end = height.length -1;
       int max_area =0;

       while(start < end){
        int minHeight = Math.min(height[start], height[end]);
        int area = (end-start) * minHeight;
        max_area = Math.max(max_area, area);

        if(height[start]>height[end]){
            end--;
        }else{
            start++;
        }
        
       } 
       return max_area;
    }
}