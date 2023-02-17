/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoA;


/**
 *
 * @author 34601
 */
public class Ej_A3 {
     public static void main(String[] args) {
         int lado1,lado2,lado3,lado4,perimetro1,perimetro2,area1,area2;
         
         Rectangulo p1=new Rectangulo();
         
        p1.x1=0;
        p1.y1=0;
         p1.x2=5;
        p1.y2=5;
        
         Rectangulo p2=new Rectangulo();
          p2.x1=7;
        p2.y1=9;
         p2.x2=2;
        p2.y2=3;
       
       
        //Calcular perimetro1
        lado1=Math.abs(p1.x2-p1.x1);
        lado2=Math.abs(p1.y2-p1.y1);
        perimetro1=(lado1*2)+(lado2*2);
       
         
          //Calcular perimetro2
         lado3=Math.abs(p2.x2-p2.x1);
        lado4=Math.abs(p2.y2-p2.y1);
        perimetro2=(lado3*2)+(lado4*2);
       
         
         //Calcular area 1
         area1=lado1*lado2;
         //Calcular area2
        area2=lado3*lado4;
        
          //Muestra por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto)
          
          //Mostrar por panatalla las cordenadas de l Reactangulo 1:
         System.out.println("Las coordenadas del Rectangulo 1 son ("+p1.x1+","+p1.y1+") "+"("+p1.x2+","+p1.y2+")");
         //Mostrar por pantalla las corrdenadas del rectangulo 2;
         System.out.println("Las coordenadas del Rectangulo 2 son ("+p2.x1+","+p2.y1+") "+"("+p2.x2+","+p2.y2+")");
         
        
         //Mostrar por pantalla perimetro1;
         System.out.println("El perimetro del Rectangulo 1 es "+perimetro1);
         //Mostrar por pantalla perimetro2;
         System.out.println("El perimetro del Rectangulo 2 es "+perimetro2);
         
         //Mostrar el area del rectangulo 1
         System.out.println("El area del rectangulo 1 es "+area1);
         
          //Mostrar el area del rectangulo 2
         System.out.println("El area del rectangulo 2 es "+area2);

     }
}
