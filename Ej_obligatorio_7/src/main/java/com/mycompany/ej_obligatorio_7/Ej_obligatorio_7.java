/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ej_obligatorio_7;

import static Ej_obligatorio_7.Ej_obligatorio_7_2.CalcularImporte;
import static Ej_obligatorio_7.Ej_obligatorio_7_2.ContNumCorrecto;
import static Ej_obligatorio_7.Ej_obligatorio_7_2.PotenciaCorrecta;
import static Ej_obligatorio_7.Ej_obligatorio_7_2.calcularIncremento;
import static Ej_obligatorio_7.Ej_obligatorio_7_2.pidekWConsumidos;
import java.util.Scanner;

/**
 *
 * @author 34601
 */
public class Ej_obligatorio_7 {

     public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
          String respuesta;
          System.out.println("Introduce si hay algun cliente: ");
          respuesta=entrada.nextLine();
       
          while("Si".equals(respuesta)){
            
          double potencia,precioPot,kW,preciokW;
          
          //Un método para pedir el número de contrato (validando posibles errores).
          
          
        
         
        if(ContNumCorrecto(NumCont1,NumCont2)){
        System.out.println("El  numero de contarto es "+NumCont1+"-"+NumCont2);
        }else{
            System.out.println("Error!!El numero de contrato es incorrecto.");
        }
        
        
          //Un método para pedir la potencia contratada (validando posibles errores).
          
          
        System.out.println("Introduce su potencia contratada: ");
        potencia=entrada.nextDouble();
        
        //potencia precio
        
        if(PotenciaCorrecta(potencia)){
            if(potencia==3.45){
                precioPot=10.23;
              
            }else{
                if(potencia==4.60){
                     precioPot=14.45;
                      
                }else{
                    if(potencia==5.75){
                         precioPot=18.69;
                          
                    }else{
                        if(potencia==6.9){
                             precioPot=21.34;
                              
                        }else{
                             precioPot=25.99;
                              
                        }
                       //System.out.println("La potencia es "+potencia+" y su precio es "+precioPot);
                }
                }
            }
        }else{
            System.out.println("Error!!La potencia es incorrecta. ");
        }
        //El total de kW consumidos en el mes.
        System.out.println("Total de kW consumidos en el mes: ");
        
        kW=entrada.nextDouble();
        if(KWconsumidos(kW)){
            preciokW=kW*0.1684;
        }
        
        
        
        
        
          }
    }
    //Un método para pedir el número de contrato (validando posibles errores).
    
    public static boolean ContNumCorrecto(int NumCont1,int NumCont2){
         Scanner entrada=new Scanner(System.in);
       int NumCont1,NumCont2;
        
       System.out.println("Introduce su numero de contrato,con el sigueiente formato(ddd-dddd) ");
        System.out.println("Introduce sus tres primeros digitos: ");
        NumCont1=entrada.nextInt();
        System.out.println("Introduce sus cuatro ultimos digitos: ");
        NumCont2=entrada.nextInt();
        
        if(NumCont1>0&&NumCont2>0){
            return true;
        }else{ 
            return false;
        }
        }
    
    //Un método para pedir la potencia contratada (validando posibles errores).
    
   // Potencia Precio

    //3,45 ---> 10,23 euros.
   // 4,60 ---> 14,45 euros.
    //5,75 ---> 18,69 euros.
    //6,90 ---> 21,34 euros.
    //8,05 ---> 25,99 euros
    
    public static boolean PotenciaCorrecta(double potencia){
        if(potencia==3.45&&potencia==4.60&&potencia==5.75&&potencia==6.90&&potencia==8.05){
            return true;
        }else{
            return false;
        }
    }
    
    //Un método para pedir los kW consumidos (validando posibles errores).
    public static boolean KWconsumidos(double kW){
        if(kW>=0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean PotenciaContratada(double precioPot){
       
    }
}
}
 NumeroContrato=ContNumCorrecto();
     PotenciaContratada=PotenciaCorrecta();
       kWConsumidos=pidekWConsumidos();
       
       importe=CalcularImporte();
       incremento=calcularIncremento();
