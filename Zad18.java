/*
Zadanie 18. Napisać program, który utworzy tablicę 20 liczb
całkowitych z przedziału 1 . . . 10, a następnie wypisze na ekranie ile
razy każda z liczb z tego przedziału powtarza się w tablicy.
 */
package pl.sdacademy.zadania;

import java.util.Random;

public class Zad18 {

    public static final int ARRAY_SIZE = 20;
    public static final int MAX_RANGE = 10;

    public static void main(String[] args) {

        int[] arr = new int[ARRAY_SIZE];
        Random rand = new Random();

        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rand.nextInt(MAX_RANGE)+1;
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Wystapienia: ");
        for (int i = 1; i <= MAX_RANGE; i++) {
            int count = 0;
            for (int item : arr) {
                if (item == i) count++;
            }
            System.out.print(i + "-" + count + " ");
        }
    }
}
