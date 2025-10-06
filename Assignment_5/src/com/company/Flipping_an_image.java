package com.company;

import java.util.Arrays;

public class Flipping_an_image {
    //832. Flipping an Image
    //Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
    //To flip an image horizontally means that each row of the image is reversed.
    //For example, flipping [1,1,0] horizontally results in [0,1,1].
    //To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

    //Example 1:
    //
    //Input: image = [[1,1,0],[1,0,1],[0,0,0]]
    //Output: [[1,0,0],[0,1,0],[1,1,1]]
    //Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    //Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

    public static void main(String[] args) {

        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] newArr = flipAndInvertImage(arr);
        for (int[] ar : newArr) {
            System.out.print(Arrays.toString(ar) + " ");
        }

        // System.out.println(Arrays.toString(flipAndInvertImage(arr)));

    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int row = 0; row < image.length; row++) {
            swap(image[row]);

        }
        inverse(image);

        return image;
    }

    public static void swap(int[] arr) {
        int star = 0;
        int end = arr.length - 1;
        while (star <= arr.length / 2) {
            int temp = arr[star];
            arr[star] = arr[end];
            arr[end] = temp;
            star++;
            end--;
        }
    }

    public static void inverse(int[][] element) {
        for (int i = 0; i < element.length; i++) {
            for (int j = 0; j < element[i].length; j++) {
                if (element[i][j] == 0) {
                    element[i][j]= 1;
                } else if (element[i][j] == 1) {
                    element[i][j]= 0;
                }
            }
        }

    }
}
