package pl.sdacademy.zadania;

import java.util.Scanner;

public class CelcToFarenheit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj temperature w C: ");
        float valC = sc.nextFloat();

        System.out.format("%.2f",1.8f * valC + 32.0f);

        sc.close();
    }

}
