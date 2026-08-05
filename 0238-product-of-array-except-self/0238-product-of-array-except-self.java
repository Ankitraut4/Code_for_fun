class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int pre = 1;
        int post= 1;
        int i=0, j=nums.length-1, n=nums.length;
        while(i<n){
            output[i] = pre;
            pre *= nums[i];
            i++;
        }
        while(j>=0){
            output[j] *= post;
            post *= nums[j];
            j--;
        }
        return output;
    }
}