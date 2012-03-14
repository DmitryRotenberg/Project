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

        int[][] array = new int[10][10];

        int c = array.length / 2;
        int r = array[c].length / 2;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < r; j++) {

                if(j >= i) {
                    array[i][j] = 1;
                    array[i][array[i].length - j - 1] = 1;

                    array[array.length - i - 1][j] = 1;
                    array[array.length - i - 1][array[c].length - j - 1] = 1;
                }
                if((array.length % 2 != 0) || (array[c].length % 2 != 0))
                    array[i][r] = 1;
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