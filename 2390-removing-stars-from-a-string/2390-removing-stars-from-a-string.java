class Solution {
    public String removeStars(String s) {
        int top = -1;
        char[] charArray = new char[s.length()];
        for(char ch : s.toCharArray()){
            if(ch=='*'){
                top--;
            }else{
                charArray[++top]=ch;
            }
            

        }
        return new String(charArray, 0, top+1);
    }
}