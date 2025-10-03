package com.company;

public class check_wheather_given_number_is_fibonacci_number {
    //A number is Fibonacci if and only if one or both of (5*n*n + 4) or (5*n*n – 4) is a perfect square

    //Take the square root of the number.
    //Multiply the square root twice
    //Use boolean equal operator to verify if the product of square root is equal to the number given.

    public static void main(String[] args) {

        int n=5;
        System.out.println(isFibo(n));
    }
    public static boolean isPerfectSquare(int num){
        int tenp=num;
        if (num>=0){
            int sr=(int)Math.sqrt(num);

            return (sr*sr==tenp);
        }
        return false;
    }
    public static boolean isFibo(int num){
        if (num>=0){
            if (isPerfectSquare(5*num*num+4) || isPerfectSquare(5*num*num-4)){
                return true;
            }
        }
        return false;
    }
}
