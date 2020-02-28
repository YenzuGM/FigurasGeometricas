/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.yeneli;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;



/**
 *
 * @author Yeneli Garcia Muñoz
 */
public class Triangulo extends FiguraG{
    
    LinkedList <Punto> listaPuntos = new LinkedList();  
    Punto p1;
    Punto p2;
    Punto p3;
    String tipoTriangulo;
    
    double lado1, lado2, lado3;
    
    public String getTipoTriangulo() {
        return tipoTriangulo;
    }

    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }
    
    

    public LinkedList<Punto> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(LinkedList<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }
    
    public double Hipotenusa(Punto punto1, Punto punto2){
        double hipotenusa=0;
        int cateto1 = punto1.getX()-punto2.getX();
        int cateto2 = punto1.getY()-punto2.getY();
         hipotenusa = Math.sqrt((cateto1*cateto1) +(cateto2*cateto2));
        
        return hipotenusa;
    }
    
    public double Perimetro(){
        double perimetro=0;
       System.out.println("Perimetro "+perimetro);
       
         lado1=Hipotenusa(listaPuntos.get(0),listaPuntos.get(1));
         lado2=Hipotenusa(listaPuntos.get(1),listaPuntos.get(2));
         lado3=Hipotenusa(listaPuntos.get(2),listaPuntos.get(0));
        
        perimetro=lado1+lado2+lado3;
        
        return perimetro;
        
    }
    public void DibujarTriangulo(Graphics g){
        p1=listaPuntos.get(0);
        p2=listaPuntos.get(1);
        p3=listaPuntos.get(2);
        
        g.setColor(Color.RED);
        g.drawLine(p1.getX(),p1.getY(), p2.getX(),p2.getY());
        g.drawLine(p2.getX(),p2.getY(), p3.getX(),p3.getY());
        g.drawLine(p3.getX(),p3.getY(), p1.getX(),p1.getY());
      
    }
    
    public void IdentificarTriangulo(){
        
         if(lado1==lado2 && lado2==lado3 &&lado1==lado3){
             tipoTriangulo="EQUILATERO";
             
         }
         if((lado1==lado2 && lado1!=lado3)||(lado3==lado2 && lado1!=lado3)||(lado1==lado3 && lado2!=lado3)){
             tipoTriangulo="ISOSCELES";
             
         }
         if(lado1!=lado2 && lado2!=lado3 &&lado1!=lado3){
             tipoTriangulo="ESCALENO";
             
         }
        
    }
    
    
}
