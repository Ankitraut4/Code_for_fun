package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
        List<Character> charList = new ArrayList<>();

        for(char c: s.toCharArray()){
            charList.add(c);
        }
        System.out.println(charList);

        for(int i=0; i< charList.size(); i++){
            if(charList.get(i) == '*'){
                charList.remove(i);
                charList.remove(i-1);
                i=i-2;
            }
        }
    return charList.toString();
    }

}

