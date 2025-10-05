package com.company;

public class check_triplet {
    public static void main(String[] args) {

        int x=5;
        int y=4;
        int z=1;
        System.out.println(trplet(x,y,z));
    }
    private static boolean trplet(int x,int y,int z){
        int x1,y1,z1;
        x1=x*x;
        y1=y*y;
        z1=z*z;
        return (x1 == y1+z1) || (y1 == x1 + z1) || (z1 == x1 + y1);
    }
}
