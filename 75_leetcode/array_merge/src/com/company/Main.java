package com.company;

public class Main {


        public static String mergeAlternately(String word1, String word2) {
            String new_Str = "";
            String w1 = word1;
            String w2 = word2;
            if (w1.length() > w2.length()){
                int value = w1.length() - w2.length();
                for(int i=0;i<value;i++){
                    w2 += " ";
                }
            }
            else{
                int value = w2.length() - w1.length();
                for (int i=0; i<value;i++){
                    w1 += " ";
                }

            }
            for(int i=0;i<w1.length();i++){
                new_Str += w1.charAt(i);
                new_Str += w2.charAt(i);

            }
        return new_Str;
        }
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }
}

