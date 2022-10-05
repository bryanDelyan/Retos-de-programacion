
package Reto_1Simplificado;

import java.util.Arrays;
/**
 *
 * @author Bryan Delgado - bryanadriands@ufps.edu.co
 */

/* Reto 1
 *Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class PalabrasAnagramas {
 
    public void sonAnagramas(String p1,String p2){
        //Pasamos todas las letras de la String a un arreglo de caracteres para luego ordenar y comparar
        char [] frase1  = p1.toCharArray();
        char [] frase2  = p2.toCharArray();
        
        Arrays.sort(frase2); //ordenamos alfabeticamente  ejm: hola --> ahlo 
        String cadena2 = new String(frase2); //ya ordenadas creamos una string donde se guarden los caracteres
        
        Arrays.sort(frase1);
        String cadena1 = new String(frase1);
        //Comparamos si son iguales
        if(cadena1.equals(cadena2))System.out.println("Son anagramas");
        else System.out.println("No son anagramas");
           
        
        
    }
}
