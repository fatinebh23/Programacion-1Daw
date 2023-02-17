/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoB;

import java.util.Scanner;

/**
 *
 * @author 34601
 */
public class Ej_B2 {
      public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in);
        //instanciar dos objetos;
       
        String dni1,dni2,nombre1,nombre2,apell1,apell2;
        int edad1,edad2;
        
        System.out.println("introduce el nombre de  persona 1: ");
        nombre1=entrada.nextLine();
        
        System.out.println(" Introduce el apellido de persona 1 : ");
        apell1=entrada.nextLine();
      
        System.out.println("Introduce el dni de persona 1 : ");
        dni1=entrada.nextLine();
        
        System.out.println("Introduce la edad de persona 1 :");
        edad1=entrada.nextInt();
        
        persona p1=new persona(nombre1,apell1,dni1,edad1);
        
         System.out.println("introduce el nombre de  persona 2 : ");
       nombre2=entrada.nextLine();
         System.out.println(" Introduce el apellido de persona 2: ");
         apell2=entrada.nextLine();
         System.out.println("Introduce el dni de persona 2 : ");
        dni2=entrada.nextLine();
          System.out.println("Introduce la edad de persona  2: ");
         edad2=entrada.nextInt();
          persona p2=new persona(nombre2,apell2,dni2,edad2);
         
        
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
