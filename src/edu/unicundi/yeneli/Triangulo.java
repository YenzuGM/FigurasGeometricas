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
 *Clase Triangulo
 * @author Yeneli Garcia Muñoz
 */
public class Triangulo extends FiguraG{
    //Lista de Puntos 
    LinkedList <Punto> listaPuntos = new LinkedList();  
    //Variables para guardar los 3 puntos del triangulo
    Punto p1;
    Punto p2;
    Punto p3;
    //Variable para guardar el tipo de triangulo
    String tipoTriangulo;
    //Variables para guardar lados iguales y diferentes 
    double ladoIgual, ladoDiferente;
    //Varianles para los 3 lados
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
   
    /**
     * Metodo que calcula la hipotenusa a travez de coordenadas. 
     * @param punto1
     * @param punto2
     * @return 
     */
    public double Hipotenusa(Punto punto1, Punto punto2){
        double hipotenusa=0;
        int cateto1 = punto1.getX()-punto2.getX();
        int cateto2 = punto1.getY()-punto2.getY();
         hipotenusa = Math.sqrt((cateto1*cateto1) +(cateto2*cateto2));
        
        return hipotenusa;
    }
    /**
     * Metodo que calcula el perimetro 
     * llamando al metodo hipotenusa y
     * sumando los lados que este retorna.
     * @return 
     */
    public double CalcularPerimetro(){
        double perimetro=0;
       System.out.println("Perimetro "+perimetro);
       
         lado1=Hipotenusa(listaPuntos.get(0),listaPuntos.get(1));
         lado2=Hipotenusa(listaPuntos.get(1),listaPuntos.get(2));
         lado3=Hipotenusa(listaPuntos.get(2),listaPuntos.get(0));
        
        perimetro=lado1+lado2+lado3;
        
        return perimetro;
    }
    
    @Override
    public void DibujarEnPlano(Graphics g){
        p1=listaPuntos.get(0);
        p2=listaPuntos.get(1);
        p3=listaPuntos.get(2);
        
        g.setColor(Color.RED);
        g.drawLine(p1.getX(),p1.getY(), p2.getX(),p2.getY());
        g.drawLine(p2.getX(),p2.getY(), p3.getX(),p3.getY());
        g.drawLine(p3.getX(),p3.getY(), p1.getX(),p1.getY());
      
    }
    /**
     * Metodo que encuentra el area, 
     * dependiendo del tipo de triangulo
     * @return 
     */
    public double CalcularArea(){
        double area=0;
        if (tipoTriangulo.equals("EQUILATERO")){
             area=(Math.sqrt(3)/4);
             area=area*(lado1*lado1);
        }
        
        if(tipoTriangulo.equals("ISOSCELES")){
            
            area=(ladoDiferente*Math.sqrt((ladoIgual*ladoIgual)-(ladoDiferente*ladoDiferente)/4))/2;
            
        }
        
        if (tipoTriangulo.equals("ESCALENO")){
            double semiPerimetro= (lado1+lado2+lado3)/2;
            area=Math.sqrt((semiPerimetro)*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
        }
        return area;
    }
    /**
     * Metodo que identifica el tipo de 
     * triangulo introducido por el usuario
     */
    public void IdentificarTriangulo(){
        
         if(lado1==lado2 && lado2==lado3 &&lado1==lado3){
             tipoTriangulo="EQUILATERO";
         }
         if((lado1==lado2 && lado1!=lado3)||(lado3==lado2 && lado1!=lado3)||(lado1==lado3 && lado2!=lado3)){
             tipoTriangulo="ISOSCELES";
             if(lado1==lado2 && lado1!=lado3){
                 ladoIgual=lado1;
                 ladoDiferente=lado3;
             }
             if(lado3==lado2 && lado1!=lado3){
                 ladoIgual=lado3;
                 ladoDiferente=lado1;
             }
             if(lado1==lado3 && lado2!=lado3){
                 ladoIgual=lado3;
                 ladoDiferente=lado2;
             }
         }
         if(lado1!=lado2 && lado2!=lado3 &&lado1!=lado3){
             tipoTriangulo="ESCALENO";
         }
    }
    
    
}
