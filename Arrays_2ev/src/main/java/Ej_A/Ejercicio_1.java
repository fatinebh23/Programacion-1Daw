/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej_A;

import java.util.Scanner;

/**
 *
 * @author 34601
 * 1. Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre todos sus valores.
 */
public class Ejercicio_1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
       
       System.out.println("Introduzca 10 valores enteros: ");
       int enteros [] = new int[10];
            for (int i=0;i<enteros.length;i++){
                enteros[i] = in.nextInt();
            }
                for(int j=0;j<enteros.length;j++){
                    System.out.println("Valor " + j + " = " + enteros[j]);
                }
    }
}
