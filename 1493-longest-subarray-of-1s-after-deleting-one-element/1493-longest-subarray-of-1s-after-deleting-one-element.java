class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int del_ele = 0;
        int max_length=0;

        for(int r=0; r<nums.length; r++){
            if(nums[r]==0){
                del_ele++;
            }

            while(del_ele>1){
                if(nums[l]==0){
                    del_ele--;
                }
                l++;
    
            }
            max_length = Math.max(max_length, r-l);
        }
        return max_length;
    }
}