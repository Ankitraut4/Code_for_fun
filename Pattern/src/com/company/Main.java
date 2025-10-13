package com.company;

public class Main {

    public static void main(String[] args) {
	pattern2(4);
        System.out.println();
	pattern1(4);

    }

    /*
    *
    * *
    * * *
    * * * *
     */
    private  static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

        /*
         * * * *
         * * * *
         * * * *
         * * * *
         */
        private static void pattern1(int v){
            for (int row = 1; row <=v; row++) {
                for (int col = 1; col <= v; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }




}
