package com.pilot;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 12.03.12
 * Time: 14:10
 * To change this template use File | Settings | File Templates.
 */

public class SearchElementHalfDivide {

    public static int find(int array[], int value) {
        int count = 0;
        int lengthFull = array.length;
        int lengthHalf = array.length / 2;

        while(lengthFull > 1) {
            lengthFull /= lengthFull;
            count++;
        }
            


        while(count >= 1) {

            if(array[lengthHalf] == value ) {
                return lengthHalf;

            } else if((array[lengthHalf - 1] == value) && (lengthHalf >= 0)) {
                return lengthHalf - 1;

            } else if((array[lengthHalf + 1] == value) && (lengthHalf <= array.length)) {
                return lengthHalf + 1;
            } else if(value > array[array.length - 1] || value < array[0]) {
                return -1;
            }


            if(value < array[lengthHalf])
                lengthHalf -= lengthHalf / 2;

            if(value > array[lengthHalf] && value < array.length / 2)  {
                lengthHalf += lengthHalf / 2;

            } else if(value > array[lengthHalf] && value > array.length / 2) {
                int current = array.length - lengthHalf;
                lengthHalf += current / 2;
            }

            count++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] search = { 0, 3, 10, 13, 16, 45, 100, 6, 8 };

        for (int i : search) {
            int index = find(array, i);
            System.out.println(String.format(
                    "Индекс элемента %d в массиве: %d", i, index));
        }


            //System.out.println("индекс элемента в массиве: " + find(array, 17));








    }
}