package Reto_2;

import java.util.Scanner;

/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */
/**
 *
 * Escribe un programa que imprima los 50 primeros números de la sucesión de
 * Fibonacci empezando en 0. . La serie Fibonacci se compone por una sucesión de
 * números en la que el siguiente siempre es la suma de los dos anteriores. 0,
 * 1, 1, 2, 3, 5, 8, 13...
 */
public class Fibonacci {

    long  first, second, sum, count;
    double num;
    public void fibonacci() {
        first = 1;
        second = 1;
        sum = 0;
        count = 1;

        for (int i = 0; i < 50; i++) {

            System.out.println(sum);
            count += 1;
            first = second;
            second = sum;
            sum = first + second;

        }

    }
}
