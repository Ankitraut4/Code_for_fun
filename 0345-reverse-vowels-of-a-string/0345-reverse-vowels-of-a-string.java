class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0, j = arr.length-1;
        while(j>i){
            if(!isVowel(arr[i])){
                i++;
            }
            if(!isVowel(arr[j])){
                j--;
            }else if(isVowel(arr[i]) && isVowel(arr[j])){
                char temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            }
            return new String(arr);
        }
    
    private Boolean isVowel(char v){
        String vowel = "AEIOUaeiou";
        for(int i=0; i <vowel.length(); i++){
            if(vowel.charAt(i)==v){
                return true;
            }
            
        }
        return false;
}
}