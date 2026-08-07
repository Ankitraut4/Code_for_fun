class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int arraySum = 0;
       for(int i=0; i<k; i++){
        arraySum+=nums[i];
       }

       int maxSum =arraySum;
       int j=k;
       while(j<nums.length){
        arraySum = arraySum - nums[j-k] + nums[j];
        maxSum = Math.max(maxSum, arraySum);
        j++; 
    }
    return (double)maxSum/k;
    }
}