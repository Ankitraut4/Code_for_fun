class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i=0, j = arr.length-1;
        while(j>i){
            while(j>i && !isVowel(arr[i])){
                i++;
            }
            while(j>i && !isVowel(arr[j])){
                j--;
            }
            if(j>i){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    private boolean isVowel(char v){
        switch(Character.toLowerCase(v)){
            case 'a' : case 'i' : case 'e' : case 'o' : case 'u':
                return true;
            default : 
                return false;
}
}
}