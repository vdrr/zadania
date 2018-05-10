package pl.sdacademy.zadania;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {

        System.out.println("Podaj kolejno: liczba, znak, liczba.");

        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        char sign = sc.next().charAt(0);
        float y = sc.nextFloat();

        switch(sign) {
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Error: Divide by 0!");
                } else {
                    System.out.println(x/y);
                }
                break;
            default:
                System.out.println("Error: Incorrect symbol!");
        }

    }
}
