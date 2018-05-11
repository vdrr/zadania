/*
Zadanie 19. Napisz program, który:
• stworzy tablicę (macierz) 5 x 5 liczb całkowitych,
• wypełnij ją losowymi wartościami z zakresu {−5, −4, . . . , 5},
• dla każdej kolumny wyznacz minimum,
• dla każdej kolumny wyznaczy maksimum.
Program ma wyświetlać tablicę wypełnioną liczbami oraz tablice z minimami oraz
maksymami.
 */
package pl.sdacademy.zadania;

import java.util.Random;

public class Zad19 {
    public static final int TABLE_SIZE = 5;

    public static void main(String[] args) {

        Random rand = new Random();
        int[][] matrix = new int[TABLE_SIZE][TABLE_SIZE];

        for (int y = 0; y < TABLE_SIZE; y++) {
            for (int x = 0; x < TABLE_SIZE; x++) {
                matrix[x][y] = rand.nextInt(11) - 5;
                System.out.format("|%3d",matrix[x][y]);
            }
            System.out.println();
        }

        System.out.println("Minima: ");
        for (int col = 0; col < TABLE_SIZE; col++) {
            int min = 5;
            for (int row = 0; row < TABLE_SIZE; row++) {
                if (matrix[col][row] < min) min = matrix[col][row];
            }
            System.out.format("|%3d",min);
        }

        System.out.println();
        System.out.println("Maksima: ");
        for (int col = 0; col < TABLE_SIZE; col++) {
            int max = -5;
            for (int row = 0; row < TABLE_SIZE; row++) {
                if (matrix[col][row] > max) max = matrix[col][row];
            }
            System.out.format("|%3d",max);
        }
    }
}
