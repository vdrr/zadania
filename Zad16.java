/*
Zadanie 16. Napisać program, dla podanej liczby całkowitej
wyświetla jej dzielniki. Przykła- dowo, dla liczby 21 dzielniki to: 1, 3,
7, 21.
 */
package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita: ");
        int x = sc.nextInt();

        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                if (x%i == 0) System.out.print(i + " ");
            }
        } else if (x < 0) {
            for (int i = -1; i >= x; i--) {
                if (x%i == 0) System.out.print(-i + " ");
            }
        }

        sc.close();
    }
}
