package com.company;

public class Main {

    public static void main(String[] args) {
      //print a to z with O(n) complexity

        StringBuilder builder=new StringBuilder();
        for (int i=0;i<26;i++){
         char ch=(char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
     }
}
