package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int val;

        System.out.println("Podaj wartosci do sumowania, podaj 0 aby zakonczyc:");

        do {
            val = sc.nextInt();
            sum += val;
        } while (val != 0);

        System.out.println(sum);

        sc.close();
    }
}
