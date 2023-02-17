/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoB;

/**
 *
 * @author 34601
 */
public class Articulo {
    public double precio;
    public String nombre;
    public int cuantosQuedan;
    public double iva;
    //CONSTRUCTOR
     public Articulo(double precio,String nombre,double iva,int cuantosQuedan){
         if(precio>=0&&iva==0.21&&cuantosQuedan>=0){
             this.iva=iva;
             this.precio=precio;
             this.cuantosQuedan=cuantosQuedan;
         }else{
             System.err.println("ERROR!!");
         }
            
     }
    
    
}
