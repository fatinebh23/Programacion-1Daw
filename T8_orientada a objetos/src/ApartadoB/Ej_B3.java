/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoB;

/**
 *
 * @author 34601
 * En nuestro software necesitamos asegurarnos de que la coordenada (x1,y1)
represente la esquina inferior izquierda y la (x2,y2) la superior derecha del
rectangulo, como en el dibujo.
Añade a Rectangulo un constructor con los 4 parámetros. Incluye un if que
compruebe los valores (*). Si son válidos guardará los parámetros en el objeto.
Si no lo son mostrará un mensaje del estilo “ERROR al instanciar Rectangulo...”
utilizando System.err.println(…). No podremos evitar que se instancie el objeto
pero al menos avisaremos por pantalla.
Corrige el main para utilizar dicho constructor. Debería mostrar un mensaje de error.
(*) Pista: Es suficiente con un if ( (condición) && (condición) )

 */
public class Ej_B3 {
    public static void main(String[] args) {
         int lado1,lado2,lado3,lado4,perimetro1,perimetro2,area1,area2;
         
        //Instanciando las cordenadas
        
         Rectangulo p1=new Rectangulo(0,0,5,5);
         Rectangulo p2=new Rectangulo(7,9,2,3);
         
       
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

