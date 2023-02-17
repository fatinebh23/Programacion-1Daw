/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej_A;

import java.util.Scanner;

/**
 *
 * @author 34601
 * 2. Crea un programa que pida diez números reales por teclado, los almacene en un array, y
luego muestre la suma de todos los valores.
 */
public class Ejercicio_2 {
    public static void main(String[] args){

Scanner reader = new Scanner(System.in);

int valores[]= new int[10], valor, suma=0;


for(int i=0;i<10;i++){
System.out.println("Introduce un número real: ");
valor = reader.nextInt();

valores[i] = valor;
}

for (int i = 0; i < valores.length; i++) {
suma += valores[i];
}

System.out.println("La suma es: "+ suma);
}
    
}
