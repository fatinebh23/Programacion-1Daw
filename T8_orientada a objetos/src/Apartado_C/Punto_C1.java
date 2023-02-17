/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apartado_C;





/**
 *
 * @author 34601
 * Crea un programa con una clase llamada Punto que representará un punto de dos dimensiones en
un plano. Solo contendrá dos atributos enteros llamadas x e y (coordenadas).
En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0), (10,10) y (-3,
7). Muestra por pantalla sus coordenadas (utiliza un println para cada punto). Modifica todas las
coordenadas (prueba distintos operadores como = + - += *=...) y vuelve a imprimirlas por pantalla.
 */
public class Punto_C1 {
     //INSTANCIO LOS ATRIBUTOS DE LA CLASE
   private int x;
   private int y;
   //CONSTRUCTOR
 public Punto(int x, int y){
      
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
        
    }
    public void  setX(int x){
       this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

 
}
