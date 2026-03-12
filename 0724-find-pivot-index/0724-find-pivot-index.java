class Solution {
    public int pivotIndex(int[] nums) {
      int prefix = 0;
      int postfix =0;
      for(int i=0; i<nums.length; i++){
            postfix+=nums[i];
      }
      int i=0;
      while(i<nums.length){
        if(prefix==postfix-nums[i]){
            return i;
        }
        prefix+=nums[i];
        postfix-=nums[i];
        i++;
      }  
      return -1;
    }
}