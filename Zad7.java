package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        System.out.println("Podaj liczbe wieksza od 0: ");
        while (number < 1) {
            number = sc.nextInt();
            if (number < 1) {
                System.out.println("Liczba musi byc wieksza od 0!");
            }
        }

        for (int i = 1; i <= number; i+=2) {
            System.out.println(i);
        }

        sc.close();
    }
}
