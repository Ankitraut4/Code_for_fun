class Solution {
    public String decodeString(String s) {
        Stack<Integer> digit=new Stack<>();
        Stack<StringBuilder> letter=new Stack<>();
        StringBuilder current =new StringBuilder();
        int num=0;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }else if(ch == '['){
                digit.push(num);
                letter.push(current);

                num =0;
                current =new StringBuilder();
            }else if(ch == ']'){
                int repeat = digit.pop();
                StringBuilder previous = letter.pop();
                for(int i=0; i<repeat; i++){
                    previous.append(current);
                }
                current = previous;
            }else{
                current.append(ch);
            }
            
        }
        return current.toString();


    }
}