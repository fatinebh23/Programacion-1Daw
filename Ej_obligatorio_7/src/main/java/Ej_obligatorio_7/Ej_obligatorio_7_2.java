/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ej_obligatorio_7;

import java.util.Scanner;

/**
 *
 * @author 34601
 */
public class Ej_obligatorio_7_2 {
    public static void main(String[] args) {
      
        Scanner entrada=new Scanner(System.in);
        String NumeroContrato;
       
        double PotenciaContratada,kWConsumidos,importe,incremento;
        double potencia = 0;
        int opcion;
         do{
            System.out.println("Menú:");
            System.out.println("0-Termina el programa.");
            System.out.println("1-Informe de un nuevo cliente.");
            opcion = entrada.nextInt();
            if(opcion==1){
                NumeroContrato=ContNumCorrecto();
     PotenciaContratada=PotenciaCorrecta();
       kWConsumidos=pidekWConsumidos();
       importe=CalcularImporte(kWConsumidos,potencia);
       incremento=calcularIncremento(kWConsumidos,importe);
       
       //Se desea hacer un informe con los siguientes datos por cliente:
                System.out.println("INFORME:");
                System.out.println("Numero del contrato: " + NumeroContrato);
                System.out.println("Total de kW: "+ kWConsumidos);
                System.out.println("Potencia contratada: " + potencia);        
                System.out.println("Importe a pagar: " + importe);     
                System.out.println("Incremento según tramo: "+ incremento);
                            
                           
            }
            
            
        }
         while(opcion==0);
         }
    
    
    //Un método para pedir el número de contrato (validando posibles errores).
    public static String ContNumCorrecto(){
        Scanner entrada=new Scanner(System.in);
        String NumeroContrato;
        System.out.println("Introduce su numero de contrato,con el sigueiente formato(ddd-dddd) ");
       NumeroContrato=entrada.nextLine();
       
       if(NumeroContrato.length()<8&& NumeroContrato.charAt(3)!='-'){
            int i;
         for(i=0;i<=8;i++){
             if(NumeroContrato.charAt(i)!='1'&&NumeroContrato.charAt(i)!='2'&&NumeroContrato.charAt(i)!='3'&&NumeroContrato.charAt(i)!='4'&&NumeroContrato.charAt(i)!='5'&&NumeroContrato.charAt(i)!='6'&&NumeroContrato.charAt(i)!='7'&&NumeroContrato.charAt(i)!='8'&&NumeroContrato.charAt(i)!='9'&&NumeroContrato.charAt(i)!='0'){
                 return NumeroContrato;
             }else{
                 System.out.println("ERROR!!Introduce un numero positivo.");
             }
         }
       }
        System.out.println("ERROR!!Introduce un numero positivo.");
        return null;
    }
//Un método para pedir la potencia contratada (validando posibles errores).
    
   // Potencia Precio

    //3,45 ---> 10,23 euros.
   // 4,60 ---> 14,45 euros.
    //5,75 ---> 18,69 euros.
    //6,90 ---> 21,34 euros.
    //8,05 ---> 25,99 euros
   public static double PotenciaCorrecta(){
       Scanner entrada=new Scanner(System.in);
      double potencia;
      System.out.println("Introduce su potencia contratada: ");
        potencia=entrada.nextDouble();
       
        if(potencia==3.45&&potencia==4.60&&potencia==5.75&&potencia==6.90&&potencia==8.05){
            return potencia;
        }else{
            
        }
        return 0;
    }
   //Un método para pedir los kW consumidos (validando posibles errores).
     public static double pidekWConsumidos(){
    Scanner entrada = new Scanner(System.in);
        double kWConsumidos;
        
        do{
        System.out.println("Introduce kw consumidos válidos:");
        kWConsumidos = entrada.nextDouble();
        }while(kWConsumidos>0);
        
        return kWConsumidos;
     }
   //Un método para calcular el importe según los kW consumidos y la potencia contratada.
     
    public static double CalcularImporte(double kWConsumidos, double potencia){
        double importe;
        double kwh = 0.1684;
        
        importe = kWConsumidos * kwh;
        
        if(potencia==3.45){
            importe+=10.23;
        }else {
            if(potencia==4.60){
                importe+=14.45;
            }else{
                if(potencia==5.75){
                    importe+=18.69;
                }else{
                    if(potencia==6.90){
                        importe+=21.34;
                    }else{
                        importe+=25.99;
                              
                    }
                    
                }
            }return importe;
        }
        return 0;
         
    }    
   //  Un método para calcular el incremento.
public static double calcularIncremento(double kWConsumidos, double importe){
        double incremento;
        double incremento1 =0, incremento2 =0.05, incremento3 = 0.08, incremento4 =0.12;
        
        if(kWConsumidos>0 && kWConsumidos<150){
            incremento = importe*incremento1; 
        }else if(kWConsumidos>151 && kWConsumidos<300){
            incremento = importe*incremento2;            
        }else if(kWConsumidos>301 && kWConsumidos<400){
            incremento = importe*incremento3; 
        }else{
            incremento = importe*incremento4;             
        }
        
        return incremento;
    }
}
