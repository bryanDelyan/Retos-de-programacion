/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_1Simplificado;

import java.util.Arrays;

/**
 *
 * @author Usuario
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
