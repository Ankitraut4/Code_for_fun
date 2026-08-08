class Solution {
    public int pivotIndex(int[] nums) {
        int pre = 0;
        int post =0;
        for(int i=0; i<nums.length; i++){
            post+=nums[i];
        }
        
        for(int i=0; i<nums.length; i++){
            if(pre==post-nums[i]){
                return i;
            }
            pre+=nums[i];
            post-=nums[i];    
        }
        return -1;
    }
}