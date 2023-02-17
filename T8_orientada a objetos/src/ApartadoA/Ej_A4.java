/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoA;

/**
 *
 * @author 34601
 * Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre, precio (sin
IVA), iva (siempre será 21) y cuantosQuedan (representa cuantos quedan en el almacén).
En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a todos sus
atributos (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -
IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio con IVA). Luego,
cambia el precio y vuelve a imprimir el mensaje.
 */
public class Ej_A4 {
    public static void main(String[] args) {
        double ConIVA,PVP;
        Articulo p1=new Articulo();
        p1.nombre="pijama";
        p1.precio=10;
        p1.iva=0.21;
        p1.cuantosQuedan=1;
        ConIVA=p1.precio*p1.iva;
        PVP=p1.precio+ConIVA;
        
        System.out.println(p1.nombre+"- Precio:"+p1.precio+"€ - IVA:"+p1.iva+"% - PVP:"+PVP+"€");
    }
}
