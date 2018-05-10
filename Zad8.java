package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe A: ");
        int a = sc.nextInt();

        System.out.println("Podaj liczbe B (B>A): ");
        int b = sc.nextInt();

        if (a<b) {
            int sum = 0;
            int i = a;

            do {
                sum += i;
                i++;
            } while (i <= b);
            System.out.println(sum);

            i = a;
            sum = 0;
            while (i <= b) {
                sum += i;
                i++;
            }
            System.out.println(sum);

            sum = 0;
            for (i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Error: Invalid value of B!");
        }

        sc.close();
    }
}
