package Ej_B;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatine bouhrich
 * 2. Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */
public class Ejerciocio_2 {
    public static void main(String[] args) {
        String cadena1,cadena2;
        Scanner entrada=new Scanner(System.in);
         
        System.out.println("Introduzca una cadena de texto: ");
        
        cadena1=entrada.nextLine();
        
        System.out.println("Introduzca otra cadena de texto: ");
        cadena2=entrada.nextLine();
        
        if(cadena1 == null ? cadena2 == null : cadena1.equals(cadena2)){
            System.out.println("LA CADENA 1 Y LA CADENA 2 SON IGUALES");
        }else{
            System.out.println("LA CADENA 1 Y LA CADENA NO SON IGAULES ");
        }
        
  
    
}
}
