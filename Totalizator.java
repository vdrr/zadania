package pl.sdacademy.zadania;

import java.util.Random;
import java.util.Scanner;

public class Totalizator {

    public static final int NUM_COUNT = 6;
    public static final int NUM_RANGE = 49;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int results[] = new int[NUM_COUNT];
        int userNumbers[] = new int[NUM_COUNT];

        // fill results[] with unique random numbers 1-49
        for (int i = 0; i < results.length; i++) {
            while (true) {
                results[i] = rand.nextInt(NUM_RANGE)+1;
                boolean isUniq = true;
                if (i>0) {
                    for (int j = 0; j < i; j++) {
                        if (results[i] == results[j]) isUniq = false;
                    }
                }
                if (isUniq) break;
            }
        }

        // get user numbers
        System.out.println("Enter 6 numbers (1-49)");
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = sc.nextInt();
        }

        int counter = 0;

        for (int i = 0; i < results.length; i++) {
            for (int j = 0; j < userNumbers.length; j++) {
                if (results[i] == userNumbers[j]) {
                    System.out.println("Trafienie: " +userNumbers[j]);
                    counter++;
                    break;
                }
            }
        }

        System.out.println("Wylosowane liczby:");
        for (int i = 0; i < results.length; i++) {
            System.out.print(results[i] + " ");
        }
        System.out.println();
        System.out.println("Liczba trafien: " + counter);

        sc.close();
    }
}