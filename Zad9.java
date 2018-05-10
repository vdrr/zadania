package pl.sdacademy.zadania;

import java.util.Scanner;

public class Zad9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe calkowita dodatnia:");
        int n = sc.nextInt();

        if (n >= 0) {
            int pow = 0;

            while (true) {
                int current = (int)Math.pow(2,pow);
                if (current < n) {
                    System.out.print(current + " ");
                } else {
                    break;
                }
                pow++;
            }
        } else {
            System.out.println("Error: Invalid value!");
        }

        sc.close();
    }
}
