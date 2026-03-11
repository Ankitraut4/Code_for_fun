class Solution {
    public int maxVowels(String s, int k) {
      int count =0;
      char[] charArr = s.toCharArray();
      for(int i=0;i<k;i++){
        if(isVowel(charArr[i])){
            count ++;
        }
      }
      int maxCount = count;
      for(int i=k; i<charArr.length;i++){
        if(isVowel(charArr[i-k])){
            count--;
        }
        if(isVowel(charArr[i])){
            count++;
        }

        if(count>maxCount){
            maxCount = count;
        }
      }
      return maxCount;  
    }
    private boolean isVowel(char c){
        String vow = "aeiou";
        if(vow.indexOf(c) != -1){
            return true;
        }else{
            return false;
        }
    }
}