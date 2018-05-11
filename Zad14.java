/*
Zadanie 14. Napisać program rysujący w konsoli „choinkę” złożoną
ze znaków gwiazdki (*). Użytkownik programu powinien podać liczbę
całkowitą n, n > 0, określającą wysokość choinki (liczbę wierszy).
 */

package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wysokosc choinki: ");
        int height = sc.nextInt();

        if (height <= 0) System.out.println("Error: Invalid param!");
        else {
            for (int line = 0; line < height; line++) {
                for (int i = 0; i < height+line; i++) {
                    if (i < height-line-1) System.out.print(" ");
                    else System.out.print("*");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
