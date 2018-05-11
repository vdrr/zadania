/*
Zadanie 13. Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie prostokąt.
Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego górnego rogu prostokąta (x, y) oraz
długości boków prostokąta (ab).
Przyjmujemy, że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).
 */
package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad13 {
    public static final char SPACE = '_';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int posX, posY; // coordinates
        int lenA, lenB; // rectangle sides length
        char cf;        // character to fill

        System.out.println("Podaj wspolrzedna X: ");
        posX = sc.nextInt();

        System.out.println("Podaj wspolrzedna Y: ");
        posY = sc.nextInt();

        System.out.println("Podaj dlugosc boku A: ");
        lenA = sc.nextInt();

        System.out.println("Podaj dlugosc boku B: ");
        lenB = sc.nextInt();

        System.out.println("Podaj znak wypelnienia: ");
        cf = sc.next().charAt(0);

        for (int y = 0; y < posY+lenA; y++) {
            if (y < posY) {
                System.out.println();
            } else {
                for (int x = 0; x < posX+lenB; x++) {
                    if (x < posX) {
                        System.out.print(SPACE);
                    } else {
                        System.out.print(cf);
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
