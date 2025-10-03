package com.company;

public class check_if_given_number_is_perfect_number {

    //A number is a perfect number if is equal to sum of its proper divisors,
    // that is, sum of its positive divisors excluding the number itself.

    //Input: n = 6
    //Output: true
    //Divisors of 6 are 1, 2 and 3. Sum of
    //divisors is 6.

    public static void main(String[] args) {
        int n=3;
        System.out.println( perfectNumber(n)? "is perfect number" : "not perfect number");
    }
    public static boolean perfectNumber(int n){
        int sum=0;
        if (n==0){
            return true;
        }
        if (n==1){
            return true;
        }
        for (int i=1;i<n;i++){
                if (n%i==0){
                    sum+=i;
                }
            }


        if (sum==n){
            return true;
        }
        return false;
    }
}
