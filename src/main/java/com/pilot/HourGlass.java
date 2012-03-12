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

        int[][] array = new int[5][5];

        for(int i = 0; i < array.length; i++) {

            for(int j = 0; j < array[i].length; j++) {

                if(i == j) {
                    array[i][j] = 1;
                    array[i][array[i].length - i - 1] = 1;
                }

                array[i][array[i].length / 2] = 1;
            }
        }

        printHourGlass(array);
    }

    public static void printHourGlass(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

