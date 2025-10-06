package com.company;

public class pangram {
    //1832. Check if the Sentence Is Pangram

    //A pangram is a sentence where every letter of the English alphabet appears at least once.
    //Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
    //Example 1:
    //Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    //Output: true
    //Explanation: sentence contains at least one of every letter of the English alphabet.
    public static void main(String[] args) {
        String str="aBcdefghijklmnopqrstuvwxYz";
        System.out.println(checkIfPangram(str));
    }
    public static boolean checkIfPangram(String sentence) {
        String st=sentence.toLowerCase();
       for(char ch='a';ch<='z';ch++){
           if (st.length()<26){
               return false;
           }
           if(st.indexOf(ch)<0){
               return false;
           }

       }
       return true;
    }
}
