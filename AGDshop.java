package pl.sdacademy.zadania;

import java.util.Scanner;

public class AGDshop {
    public static void main(String[] args) {

        float unitPrice;
        int count;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj cene produktu (100-10000): ");

        do {
            unitPrice = sc.nextFloat();
            if ((unitPrice < 100) || (unitPrice > 10000)) {
                System.out.println("Invalid value, must be 100-10000");
            }
        } while ((unitPrice < 100) || (unitPrice > 10000));

        System.out.println("Podaj liczbe rat (6-48): ");

        do {
            count = sc.nextInt();
            if ((count < 6) || (count > 48)) {
                System.out.println("Invalid value, must be 6-48");
            }
        } while ((count < 6) || (count > 48));

        float p;

        if (count <= 12) {
            p = 0.025f;
        } else if (count <= 24) {
            p = 0.05f;
        } else {
            p = 0.1f;
        }

        System.out.println(p);

        float monthlyFee = (unitPrice / count) * (1 + p);

        System.out.println("Rata miesieczna: " + monthlyFee);
    }
}
