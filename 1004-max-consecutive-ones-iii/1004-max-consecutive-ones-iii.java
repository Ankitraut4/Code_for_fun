class Solution {
    public int longestOnes(int[] nums, int k) {
        int left =0;
        int right =0;
        int max_word=0;
        int numZero=0;

        while(right<nums.length){
            if(nums[right]==0){
                numZero++;
            }
            right++;

            while(numZero>k){
                if(nums[left]==0){
                    numZero--;
                }
                left++;

            }

            max_word=Math.max(max_word, right-left);
        }
        return max_word;
    }
}