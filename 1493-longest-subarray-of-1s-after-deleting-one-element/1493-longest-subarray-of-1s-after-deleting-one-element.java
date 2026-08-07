class Solution {
    public int longestSubarray(int[] nums) {
        int right = 0;
        int left = 0;
        int zero = 0;
        int max_length =0;

        while(right<nums.length){
            if(nums[right]==0){
                zero++;
            }
            right++;
            while(zero>1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            max_length= Math.max(max_length, right-left-1);
        }
    return max_length;
    }
}