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


        while(count < 10) {

            if(array[lengthHalf] == value ) {
                return lengthHalf;

            } else if((array[lengthHalf - 1] == value) && (lengthHalf >= 0)) {
                return lengthHalf - 1;

            } else if((array[lengthHalf + 1] == value) && (lengthHalf <= array.length)) {
                return lengthHalf + 1;
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
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};


            System.out.println("индекс элемента в массиве: " + find(array, 17));
            System.out.println("количество делений: " + count);

    }
}














/*
public class SearchElementHalfDivide {

    private static int count = 1;

    public static int find(int array[], int value) {

        int delete = array.length % 2;

        if(delete == 0) {
            System.out.println("полученный массив чётный");
            delete = 0;
            int i = array.length;

            do {
                i = i / 2;
                delete++;
            } while(i != 1);
            System.out.println("деление чётного массива возможно " + delete);

        }
        else {
            System.out.println("не чётный");
        }

        int lengthHalf = array.length / 2;


        while(count <= delete) {

            if(array[lengthHalf - 1] == value)  {
                return lengthHalf - 1;
            } else if (array[lengthHalf + 1] == value) {
                return lengthHalf + 1;
            }

            if(value == array[lengthHalf]) {

                return lengthHalf;

            } else if(value > array[lengthHalf]) {

                lengthHalf += lengthHalf / 2;

                if(lengthHalf > array.length / 2 && count >= 2)
                    lengthHalf -= count * 2;

            } else if(value < array[lengthHalf]) {

                lengthHalf -= lengthHalf / 2;

            }

            if(array[lengthHalf - 1] == value)  {
                return lengthHalf - 1;
            } else if (array[lengthHalf + 1] == value) {
                return lengthHalf + 1;
            }

            count++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};


            System.out.println("индекс элемента в массиве: " + find(array, 12));
            System.out.println("количество делений: " + count);

    }
}
*/
