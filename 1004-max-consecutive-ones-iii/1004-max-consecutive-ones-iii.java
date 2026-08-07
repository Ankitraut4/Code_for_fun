class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroFinder = 0;
        int zeroDelete = 0;
        int numZero = 0;
        int maxLength = 0;

        while(zeroFinder < nums.length){
            if(nums[zeroFinder] == 0){
                numZero ++;
            }
            zeroFinder ++;
            while(numZero>k){
                if(nums[zeroDelete]==0){
                    numZero --;
                }
                zeroDelete ++;
            }



            maxLength = Math.max(maxLength, zeroFinder - zeroDelete);
        }
        return maxLength;
    }
}