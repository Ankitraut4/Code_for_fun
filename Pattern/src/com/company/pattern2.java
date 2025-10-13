package com.company;

public class pattern2 {

    public static void main(String[] args) {
        pattern30(5);
        pattern5(3);
    }
    private static void pattern30(int n) {
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= n - row; i++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int j = 2; j <= row; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int v) {

        for (int row = 1; row < v * 2; row++) {
            int totalColumninRow = row > v ? ((2 * v) - row) : row;
            int space = v - totalColumninRow;
            for (int col = 1; col <= totalColumninRow; col++) {

                System.out.print("* ");
            }
            for (int i = 1; i <= (2*v) - space ; i++) {
                System.out.print("  ");
            }

            for (int col = totalColumninRow; col >=1; col--) {

                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
