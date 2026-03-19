class Solution {
    public String removeStars(String s) {
            
           char[] ch_arr=new char[s.length()];
           int top=-1;
           for(char ch : s.toCharArray()){
            if(ch == '*'){
                top--;
            }else{
                ch_arr[++top]=ch;
            }
           } 
            return new String(ch_arr, 0, top+1);






            // StringBuilder sb=new StringBuilder();
            // for(int i=0; i<s.length(); i++){
            //     char ch= s.charAt(i);

            //     if(ch == '*'){
            //         sb.deleteCharAt(sb.length()-1);
            //     }else{
            //         sb.append(ch);
            //     }
            // }
            // return sb.toString();
            
    }
}