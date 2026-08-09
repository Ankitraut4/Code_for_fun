//Practical  efficiency = Very Efficient, time complexity = O(n) , Space = O(n)
//because this approach is essentially a manually implemented stack.
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
//Practical efficiency = Better, but time complexity = O(n) , Space = O(n)
//     class Solution {
//     public String removeStars(String s) {
//         StringBuilder sb = new StringBuilder();

//         for(char ch : s.toCharArray()) {
//             if(ch == '*') {
//                 sb.deleteCharAt(sb.length() - 1);
//             } else {
//                 sb.append(ch);
//             }
//         }

//         return sb.toString();
//     }
// }

//Practical efficiency = Good but time complexity = O(n) , Space = O(n)
// class Solution {
//     public String removeStars(String s) {

//         Stack<Character> stack = new Stack<>();

//         for(char ch : s.toCharArray()) {

//             if(ch == '*') {
//                 stack.pop();
//             } else {
//                 stack.push(ch);
//             }
//         }

//         StringBuilder result = new StringBuilder();

//         for(char ch : stack) {
//             result.append(ch);
//         }

//         return result.toString();
//     }
// }

}