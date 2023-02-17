/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ApartadoB;

/**
 *
 * @author 34601
 */
public class Rectangulo {
    public int x1,y1,x2,y2;
    
    //CONSTRUCTOR
    public Rectangulo(int x1,int x2,int y1, int y2){
        if(x2>x1&&y2>y1){
            this.x1=x1;
            this.x2=x2;
            this.y1=y1;
            this.y2=y2;
        }else{
            System.err.println("ERROR!!");
        }
    }
}
