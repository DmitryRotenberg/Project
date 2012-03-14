package com.pilot;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 12.03.12
 * Time: 14:07
 * To change this template use File | Settings | File Templates.
 */
public class HourGlass {
    public static void main(String[] args) {

        int[][] array = new int[20][20];

        int c = array.length / 2;
        int r = array[c].length / 2;

        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {

                if(j + i < r) {
                    array[i][j + i] = 1;
                    array[i][array[c].length - j - i - 1] = 1;
                    array[array.length - i - 1][j + i] = 1;
                    array[array[c].length - i - 1][array[c].length - j - i - 1] = 1;
                }
                array[i + j][r] = 1;
                array[array.length - i - j - 1][r] = 1;
            }
        }
        printHourGlass(array);
    }

    public static void printHourGlass(int[][] array) {
      for(int i[] : array) {
        for(int j : i) {
               System.out.print(j + " ");
        }
        System.out.println();
      }

    }
}