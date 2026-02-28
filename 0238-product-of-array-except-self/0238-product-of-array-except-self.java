class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result= new int[nums.length];
        int prefix =1;
        int postfix= 1;
        int start=0, end= nums.length-1;
        while(start<nums.length){
            result[start]=prefix;
            prefix*=nums[start];
            start++;
        }
        while(end>=0){
            result[end]*=postfix;
            postfix*=nums[end];
            end--;

        }
    return result;
    }
}