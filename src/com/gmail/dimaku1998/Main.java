/*2)Написать код для зеркального переворота массива (7,2,9,4) -> (4,9,2,7). -
массив может быть произвольной длинны. (При выполнении задания
использовать дополнительный массив нельзя)(1 час)*/
package com.gmail.dimaku1998;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length array : ");
        int leng = sc.nextInt();
        Random rd = new Random();
        int[] array = new int[leng];
        for (int  i = 0; i < array.length; i++){
            array[i] = rd.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int temp = 0;
        for (int j = 0 ; j < array.length/2; j++){
            temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
