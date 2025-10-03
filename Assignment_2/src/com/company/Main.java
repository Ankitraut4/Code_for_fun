package com.company;

public class Main {

    //Amount = Principle(1+rate/100)^time;
    //compount Interest=Amount-Principle
    public static void main(String[] args) {

        System.out.printf("%.2f",compoundInterst(6600000,11,3));
    }
    private static double compoundInterst(double principle,double rate,double time){
        double amount=principle*(Math.pow((1+rate/100),time));

        return  amount-principle;
    }
}
