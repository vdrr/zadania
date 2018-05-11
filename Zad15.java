/*
Zadanie 15. Napisać program, który pobiera od użytkownika liczbę
całkowitą, a następnie: • oblicza sumę cyfr tej liczby,
• stosunek średniej arytmetycznej cyfr parzystych do średniej
arytmetycznej cyfr nieparzystych.
 */
package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita > 1");
        int number = sc.nextInt();

        // tutaj zapomnialem sprawdzic czy (number > 1)

        String sNumber = Integer.toString(number);

        int sumAll = 0;
        int sumOdds = 0, sumEvens = 0;
        int odd = 0, even = 0;


        for (int i = 0; i < sNumber.length(); i++) {
            String a = String.valueOf(sNumber.charAt(i));
            // tutaj wypadalo by sprawdzic czy 'a' nalezy do {'0'..'9'}
            int n = Integer.parseInt(a);

            sumAll += n;
            if (n%2 == 0) {
                sumEvens += n;
                even++;
            } else {
                sumOdds += n;
                odd++;
            }
        }

        System.out.println("Suma cyfr: " + sumAll);

        float avgOdds = (float)sumOdds / odd;
        float avgEvens = (float)sumEvens / even;
        float result = avgEvens / avgOdds;
        System.out.println("Stosunek srednich arytmetycznych parzystych do nieparzystych: " + result);

        sc.close();
    }
}
