package com.company;

import java.util.ArrayList;
import java.util.List;

public class Counting_Item_Matching_Rule {
    //1773. Count Items Matching a Rule

    //You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
    //The ith item is said to match the rule if one of the following is true:
    //ruleKey == "type" and ruleValue == typei.
    //ruleKey == "color" and ruleValue == colori.
    //ruleKey == "name" and ruleValue == namei.
    //Return the number of items that match the given rule.
    //Example 1:
    //
    //Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
    //Output: 1
    //Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
    public static void main(String[] args) {
        List<List<String>> str=new ArrayList<>();
       // List<List<String>> str={{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        List<String> item1=new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        str.add(item1);

        List<String> item2=new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");
        str.add(item2);

        List<String> item3=new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        str.add(item3);

        String ruleKey="tYpe";
        String ruleValue="phone";
        System.out.println(countMatches(str,ruleKey,ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for (List<String> it : items){
            String type=it.get(0), color=it.get(1),name=it.get(2);
            if ("type".equalsIgnoreCase(ruleKey) && type.equalsIgnoreCase(ruleValue)){
                count++;
            }else if ("color".equalsIgnoreCase(ruleKey) && color.equalsIgnoreCase(ruleValue)){
                count++;
            }else if("name".equalsIgnoreCase(ruleKey) && name.equalsIgnoreCase(ruleValue)){
             count++;
            }
        }
        return count;
    }
}
