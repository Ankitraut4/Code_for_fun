package com.company;

public class Patterns {
    public static void main(String[] args) {
       pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern28(4);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern31(5);
        System.out.println();
        pattern29(4);
        System.out.println();
        pattern27(5);
    }
    /*
     * * * *
     * * *
     * *
     *
     */
    private static void pattern3(int v){
        for (int row = 1; row <=v; row++) {
            for (int col = 1; col <=v-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     */
    private static void pattern4(int v){
        for (int row = 1; row <=v; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }


    /*
 no
 of
 starts
  in         index
  each       of
  row       row             pattern
 1          1                 *
 2          2                 *  *
 3          3                 *  *  *
 4          4                 *  *  *  *
 5          5                 *  *  *  *  *
 4          6                 *  *  *  *
 3          7                 *  *  *
 2          8                 *  *
 1          9                 *
    */
    private static void pattern5(int v) {

        for (int row = 1; row < v * 2; row++) {
            int totalColumninRow = row > v ? ((2 * v) - row) : row;
            for (int col = 1; col <= totalColumninRow; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
                       *
                     *   *
                    *  *  *
                   *  *  *  *
                    *  *  *
                     *   *
                       *
      */

    private static void pattern28(int v) {

        for (int row = 1; row < v * 2; row++) {
            int totalColumninRow = row > v ? ((2 * v) - row) : row;

            int spaceBeforeEachElement = v - totalColumninRow;
            for (int s = 1; s <= spaceBeforeEachElement; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColumninRow; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

        /*
                       1
                     2 1 2
                   3 2 1 2 3
                 4 3 2 1 2 3 4
               5 4 3 2 1 2 3 4 5
        */


        private static void pattern30(int n){
            for (int row=1;row<=n;row++){
                for (int i=1;i<=n-row;i++){
                    System.out.print("  ");
                }

                for (int col=row;col>=1;col--){
                    System.out.print(col+" ");
                }
                for (int j=2;j<=row;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }

        /*
                       1
                     2 1 2
                   3 2 1 2 3
                 4 3 2 1 2 3 4
               5 4 3 2 1 2 3 4 5
                 4 3 2 1 2 3 4
                   3 2 1 2 3
                     2 1 2
                       1
        */
        private static void pattern31(int n){
            for (int row=1;row<2*n;row++){


                int index= row>n ? (2*n-row): row;
                int space= row>n ? (row-n) : n-row;

                for (int i=1;i<=space;i++){
                    System.out.print("  ");
                }
                for (int col=index;col>=1;col--){
                    System.out.print(col+" ");
                }
                for (int j=2;j<=index;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }

        /*
           4 4 4 4 4 4 4
           4 3 3 3 3 3 4
           4 3 2 2 2 3 4
           4 3 2 1 2 3 4
           4 3 2 2 2 3 4
           4 3 3 3 3 3 4
           4 4 4 4 4 4 4
            */

    private static void pattern29(int n){
        for (int row=1;row<n*2;row++){
           for (int col=1;col<n*2;col++){
               int print=Math.min(Math.max(2*n-col-5,n-row-1),Math.min(2*n-col,2*n-row));
               System.out.print(print+" ");
           }
            System.out.println();
        }
    }

    /*
    0 0 0 0 0 0 0 0 0
    0 1 1 1 1 1 1 1 0
    0 1 2 2 2 2 2 1 0
    0 1 2 3 3 3 2 1 0
    0 1 2 3 4 3 2 1 0
    0 1 2 3 3 3 2 1 0
    0 1 2 2 2 2 2 1 0
    0 1 1 1 1 1 1 1 0
    0 0 0 0 0 0 0 0 0

     */

    // above patter the logic is use as minimum 0f there position from left,up,right,down i.e min(left,up,right,down)

    private static void pattern27(int n){
        int N=2*n;
        for (int row=1;row<N;row++){
            for (int col=1;col<N;col++){
                int print= Math.min(Math.min(row-1,col-1),Math.min(N-1-col,N-row-1));
                System.out.print(print+" ");
            }
            System.out.println();
        }
    }


    }
