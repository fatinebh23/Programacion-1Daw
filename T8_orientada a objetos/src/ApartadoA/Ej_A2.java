/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoA;

import java.util.Scanner;

/**
 *
 * @author 34601
 * Crea un programa con una clase llamada Persona que representará los datos principales de una
persona: dni, nombre, apellidos y edad.
En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por teclado
los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos mensajes por
pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI … es / no es
mayor de edad”.
 */
public class Ej_A2 {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        //instanciar dos objetos;
        persona p1=new persona();
        persona p2=new persona();
        
       // String dni1,dni2,nombre1,nombre2,apell1,apell2;
        //int edad1,edad2;
        
        System.out.println("introduce el nombre de  persona 1 y persona 2 : ");
        p1.nombre=entrada.nextLine();
        p2.nombre=entrada.nextLine();
        System.out.println(" Introduce el apellido de persona 1 y persona 2: ");
        p1.apellidos=entrada.nextLine();
        p2.apellidos=entrada.nextLine();
        System.out.println("Introduce el dni de persona 1 y persona 2 : ");
        p1.dni=entrada.nextLine();
         p2.dni=entrada.nextLine();
        System.out.println("Introduce la edad de persona 1 y persona 2: ");
        p1.edad=entrada.nextInt();
        p2.edad=entrada.nextInt();
       
        if(p1.edad>17){
            System.out.println("La persona 1 llamada "+p1.nombre+p1.apellidos+" con DNI "+p1.dni+" "+p1.edad+" es mayor de edad");
        }else{
         System.out.println("La persona 1 llamada "+p1.nombre+p1.apellidos+" con DNI "+p1.dni+" "+p1.edad+" es menor de edad");
    }
        if(p2.edad>17){
        
         System.out.println("La persona 2 llamada "+p2.nombre+p2.apellidos+" con DNI "+p2.dni+p2.edad+ " es mayor de edad");
    }else{
               System.out.println("La persona 2 llamada "+p2.nombre+p2.apellidos+" con DNI "+p2.dni+p2.edad+ " es menor de edad");
        }
    
     }
}
