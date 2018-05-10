package pl.sdacademy.zadania;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wzrost: ");
        float height = sc.nextFloat();

        System.out.println("Podaj wage: ");
        float weight = sc.nextFloat();

        float bmi = weight / (height * height);

        if (bmi < 18.5f) {
            System.out.println("Niedowaga");
        } else if (bmi > 24.9f) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Waga prawidlowa");
        }

        System.out.println(bmi);
    }
}
