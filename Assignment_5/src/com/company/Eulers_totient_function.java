package com.company;

public class Eulers_totient_function {
    //Euler totient function for an input n is the count of numbers in {1, 2, 3, …, n} that are relatively prime to n, i.e.,
    // the numbers whose GCD (Greatest Common Divisor) with n is 1.
    //For example, Φ(4) = 2, Φ(3) = 2 and Φ(5) = 4.
    //Φ(1) = 1
    //gcd(1, 1) is 1
    //Φ(2) = 1
    //gcd(1, 2) is 1, but gcd(2, 2) is 2.
    //Φ(3) = 2
    //gcd(1, 3) is 1 and gcd(2, 3) is 1

    public static void main(String[] args) {
        int in=5;
        System.out.println(count_co_prime_0r_relatively_prime_with_n(in));
    }
    private  static int count_co_prime_0r_relatively_prime_with_n(int n){
        int count=0;
        for (int i=1;i<n;i++){
            if (gcd(i,n)==1){
                count++;
            }
        }
        return count;
    }
    private static int gcd(int a,int b){
        if (a==0 || b==0){
            return 0;
        }
        if (a==b){
            return a;
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }
            b=b-a;
        }
        return a;
    }
}
