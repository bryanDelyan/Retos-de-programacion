/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto_1;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class PalabrasAnagrama {
    private String p1; //palabra 1
    private String p2;// palabra 2
    
    public void imprimir(){
        String[][] cadenas = {{"Hola", "Hellow"},{"Amor","romA"}};
        for (String[] x : cadenas) {
            //con este String.format le damos formato a nuestra cadena con %s le pasamos la cadena luego y %s le pasamos la
            
            System.out.println(String.format("'%s' y '%s' son anagramas :%b", x[0], x[1], anagrama(x[0], x[1])));
            // con el signo %b le pasamos nuestro metodo con los parametros.
            //con este metodo de impresion primero mandamos el valor a mostrar y luego al final escribimos el valor de la variable
        }
   }
    
    
    
    //Como para que sea anagrama las palabras tienen que ser iguales podemos comparar solo una de ellas
    public String ordenar (String p1){
    //Para comparar primero creamos un arreglo tipo char donde convierte la cadena en caracteres y la guardamos en un arreglo
    char [] caracteres = p1.toCharArray();
    //Ordena los caracteres alfabeticamente
    Arrays.sort(caracteres);
   
        return new String(caracteres); //retronamos una string con 
    }
    
   public boolean anagrama(String p1,String p2){
       //toLowerCase convertimos todas las letras en minusculas y con .replace remplazmaos los espacios, puntos etc
        p1 = p1.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
        p2 = p2.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
       
       //Ordenar 
       p1 = ordenar(p1);
       p2 = ordenar (p2);
       
       // Regresar resultado de la comparación
   
        return p1.equals(p2); //Return true si son anagrama 
       
   } 

   }
    

