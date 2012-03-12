package com.pilot;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 12.03.12
 * Time: 14:10
 * To change this template use File | Settings | File Templates.
 */
public class SearchElementHalfDivide {

    private static int count = 1;

    public static int find(int array[], int value) {

        int lengthHalf = array.length / 2;

        while(lengthHalf > 0) {

            if(value == array[lengthHalf]) {
                return lengthHalf;
            }
            else if(value > array[lengthHalf]) {

                lengthHalf += lengthHalf / 2;
            }
            else if(value < array[lengthHalf]) {

                if(lengthHalf == 1) return lengthHalf - 1;

                lengthHalf -= lengthHalf / 2;

            }

            count++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        System.out.println("Индекс элемента в массиве: " + find(array, 10));
        System.out.println("Количество делений: " + count);
    }
}
