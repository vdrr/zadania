package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ciag liczb calkowitych, podaj 0 by zakonczyc.");

        int number;
        int min=0, max=0;

        do {
            number = sc.nextInt();
            if (min==0) {
                min = number;
                max = number;
            } else if (number != 0){
                if (number < min) min = number;
                if (number > max) max = number;
            }

        } while (number != 0);

        System.out.println("Suma: " + (min+max));
        System.out.println("Srednia: " + ((min+max)/2.0f));

        sc.close();
    }
}
