/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoA;

/**
 *
 * @author 34601
 */
public class A1_punto {
    public static void main(String[] args) {

 Punto p1=new Punto();
p1.x=5;
p1.y=0;

Punto p2=new Punto();
p2.x=5;
p2.y=0;

Punto p3=new Punto();
p3.x=5;
p3.y=0;
        System.out.println("Cordenadas del punto p1(" +p1.x+","+p1.y+")");
        System.out.println("Cordenadas del punto p2(" +p2.x+","+p2.y+")");
        System.out.println("Cordenadas del punto p1(" +p3.x+","+p3.y+")");
//Modificacion de coordenadas:

p1.x+=5;
p1.y=0;


p2.x-=5;
p2.y=0;


p3.x*=5;
p3.y=0;
System.out.println("Cordenadas del punto p1(" +p1.x+","+p1.y+")");
        System.out.println("Cordenadas del punto p2(" +p2.x+","+p2.y+")");
        System.out.println("Cordenadas del punto p1(" +p3.x+","+p3.y+")");
}
}
