package Ej_B;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fatine bouhrich
 * 1. Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.
 */
public class Ejercicio_1 {
    public static void main(String[] args) {
        String cadena;
        Scanner entrada=new Scanner(System.in);
         
        System.out.println("Introduzca una cadena de texto:");
        
        cadena=entrada.nextLine();
         String[] cadena_sep=cadena.split(" ");

        for (String cadena_sep1 : cadena_sep) {
            System.out.println(cadena_sep1);
        }

    }
    }

