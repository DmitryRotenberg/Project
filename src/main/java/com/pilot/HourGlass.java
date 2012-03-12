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

        int step = 0;

        for(int i = array.length / 2; i < array.length; i++) {

            if (r + step < array[c].length)  {

                array[i][r + step] = 1;
                array[i][r - step] = 1;
                array[c - step][r + step] = 1;
                array[c - step][r - step] = 1;
                array[i][r] = 1;

                if(array[0].length % 2 != 0)   {
                    array[i - c][r] = 1;
                    array[0][step] = 1;
                    array[0][array[0].length - step - 1] = 1;

                } else {
                    array[i - c + 1][r] = 1;
                    array[1][step] = 1;
                    array[1][array[0].length - step - 1] = 1;
                }


                array[array.length - 1][step] = 1;
                array[array.length - 1][array[0].length - step - 1] = 1;

                step++;
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

