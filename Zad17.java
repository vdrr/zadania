/*
Zadanie 17. Napisać program, który sprawdza, czy podana liczba
całkowita n,n > 1, jest liczbą pierwszą.
 */
package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita n, n>1");
        int n = sc.nextInt();

        if (n>1) {
            boolean isPrime = false;
            for (int i = 2; i <= n; i++) {
                if (!isPrime && (i == n)) isPrime = true;
                else if (n%i == 0) break;
            }
            String msg = isPrime ? "Jest liczba pierwsza." :
                                   "Nie jest liczba pierwsza.";
            System.out.println(msg);
        } else {
            System.out.println("Error: Invalid input!");
        }

        sc.close();
    }
}
