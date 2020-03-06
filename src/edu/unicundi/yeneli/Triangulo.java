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
   
    //Get de la variable del tipo de triangulo
    public String getTipoTriangulo() {
        return tipoTriangulo;
    }
   //Set de la variable del tipo de triangulo
    public void setTipoTriangulo(String tipoTriangulo) {
        this.tipoTriangulo = tipoTriangulo;
    }
   //Get de la Variable de lista, que contiene coordenadas 
    public LinkedList<Punto> getListaPuntos() {
        return listaPuntos;
    }
    //Set de la Variable de lista, que contiene coordenadas 
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
        //Variable que guarda la hipotenusa 
        double hipotenusa=0;
        //Variables que guardan los catetos 1 y 2
        int cateto1 = punto1.getX()-punto2.getX();
        int cateto2 = punto1.getY()-punto2.getY();
        //Calculo de la hipotenusa
         hipotenusa = Math.sqrt((cateto1*cateto1) +(cateto2*cateto2));
       //Se returna el valor de la hipotenusa 
        return hipotenusa;
    }
    /**
     * Metodo que calcula el perimetro 
     * llamando al metodo hipotenusa y
     * sumando los lados que este retorna.
     * @return 
     */
    public double CalcularPerimetro(){
       //Variable double que guardara el perimetro  
       double perimetro=0;
       
       //Calculo de los lados llamando al metodo hipotenusa 
         lado1=Hipotenusa(listaPuntos.get(0),listaPuntos.get(1));
         lado2=Hipotenusa(listaPuntos.get(1),listaPuntos.get(2));
         lado3=Hipotenusa(listaPuntos.get(2),listaPuntos.get(0));
        //Calculo del perimetro sumando los lados
        perimetro=lado1+lado2+lado3;
        //Se returna el perimetro
        return perimetro;
    }
    
    /**
     * Metodo sobreescrito que dibuja el triangulo en 
     * el area de dibujo
     * @param g 
     */
    @Override
    public void DibujarEnPlano(Graphics g){
       //Se guarda cada punto del triangulo (que contiene coordenadas x y y en variables individuales 
        p1=listaPuntos.get(0); 
        p2=listaPuntos.get(1);
        p3=listaPuntos.get(2);
        //Se le setea un color a lo que se va a dibujar
        g.setColor(Color.RED);
        //Se dibuja linea por linea estableciendo un punto de inicio y uno de fin 
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
       //Variable double donde se guardara el area
        double area=0;
        //Si el tipo de triangulo es equilatero
        if (tipoTriangulo.equals("EQUILATERO")){
            //Se calcula el area
            area=(Math.sqrt(3)/4);
            area=area*(lado1*lado1);
        }
        //Si el tipo de triangulo es Isosceles 
        if(tipoTriangulo.equals("ISOSCELES")){
            //Se calcula el area
            area=(ladoDiferente*Math.sqrt((ladoIgual*ladoIgual)-(ladoDiferente*ladoDiferente)/4))/2;
            
        }
        //Si el tipo de triangulo es escaleno
        if (tipoTriangulo.equals("ESCALENO")){
            //Variable double que guarda el semiperimetro calculado 
            double semiPerimetro= (lado1+lado2+lado3)/2;
            //se calcula el area y se guarda en la variable area
            area=Math.sqrt((semiPerimetro)*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));
        }
        //Se returna el area obtenida de cualquiera de los 3 casos
        return area;
    }
    /**
     * Metodo que identifica el tipo de 
     * triangulo introducido por el usuario
     */
    public void IdentificarTriangulo(){
        //Si los tres lados son iguales 
         if(lado1==lado2 && lado2==lado3 &&lado1==lado3){
             //El tipo de triangulo sera escaleno 
             tipoTriangulo="EQUILATERO";
         }
         //Si hay dos lados iguales y uno diferente 
         if((lado1==lado2 && lado1!=lado3)||(lado3==lado2 && lado1!=lado3)||(lado1==lado3 && lado2!=lado3)){
             //El tipo de triangulo es isosceles
             tipoTriangulo="ISOSCELES";
             //Condiciones donde se identifica cual es el lado igual y cual el diferente 
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
         //Si todos los lados son diferentes
         if(lado1!=lado2 && lado2!=lado3 &&lado1!=lado3){
             //El tipo de triangulo es escaleno 
             tipoTriangulo="ESCALENO";
         }
    }
    
    
}
