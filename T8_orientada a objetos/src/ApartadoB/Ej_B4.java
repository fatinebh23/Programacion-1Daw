/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoB;

/**
 *
 * @author 34601
 * Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y
cuantosQuedan. Dicho constructor deberá mostrar un mensaje de error si alguno de los valores
nombre, precio, iva o cuantosQuedan no son válidos. ¿Qué coindiciones crees que podrían
determinar si son válidos o no? Razónalo e implementa el código.
Corrige el main y prueba a crear varios artículos. Introduce algunos con valores incorrectos para
comprobar si avisa del error.

 */
public class Ej_B4 {
    public static void main(String[] args) {
        double ConIVA,PVP;
       
        Articulo p1=new Articulo("pijama",10,0.21,1);
       
        ConIVA=p1.precio*p1.iva;
        PVP=p1.precio+ConIVA;
        
        System.out.println(p1.nombre+"- Precio:"+p1.precio+"€ - IVA:"+p1.iva+"% - PVP:"+PVP+"€");
    }
}

 //p1.nombre="pijama";
        //p1.precio=10;
        //p1.iva=0.21;
        //p1.cuantosQuedan=1;