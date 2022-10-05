/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_0;

/**
 *
 * @author Usuario
 */
public class FizzBuzz {

    boolean multiplo3 = false;
    boolean multiplo5 = false;

    public void calcular() {
        //Una forma
        for (int i = 0; i <= 100; i++) {
            multiplo3 = i % 3 == 0;
            multiplo5 = i % 5 == 0;
            if (multiplo3 == true && multiplo5 == true) {
                System.out.println("FizzBuzz");
            } else if (multiplo3 == true) {
                System.out.println("Fizz");
            } else if (multiplo5 == true) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }
    /** otra forma sin utilizar boolean
     *  for (int i = 0; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) // es multiplo de 5 y 7
            {
                System.out.println("fizzbuzz");
            } else if ((i % 3) == 0) // es multiplo de 3
            {
                System.out.println("fizz");
            } else if ((i % 5) == 0) // es multiplo de 5
            {
                System.out.println("buzz");
            } else {
                System.out.println(i); // no es multiplo de 3 ni 5
            }
        }
     */

}
