
package Reto_0;

/**
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */

/** Reto 0
 *  Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
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
