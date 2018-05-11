/*
Zadanie 12. Gra w ”Za dużo, za mało”.
Komputer losuje liczbę z zakresu 1...100, a gracz (użytkownik) ma za zadanie odgadnąć,
co to za liczba poprzez podawanie kolejnych wartości.
Jeżeli podana wartość jest:
• większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
• mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
• identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra się kończy.
 */
package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomValue = (int)Math.floor(Math.random()*100+1);

        System.out.println("Wylosowano liczbe 1-100. Zgadnij jaka!");

        while(true) {
            int guess = sc.nextInt();
            if (guess < randomValue) {
                System.out.println("Podales za mala wartosc.");
            } else if (guess > randomValue) {
                System.out.println("Podales za duza wartosc.");
            } else {
                System.out.println("Gratulacje!");
                break;
            }
        }

        sc.close();
    }
}
