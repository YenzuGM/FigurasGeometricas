/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.yeneli;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 *Area de dibujo
 * @author Yeneli Garcia Muñoz
 */
public class AreaDibujo extends javax.swing.JPanel {
    //Objeto tipo triangulo
    Triangulo t = new Triangulo();
    //Objeto tipo FiguraG
    FiguraG r = new Rectangulo();
    //Objeto que guarda la opcion del usuario
    int opcion=0;
    //Lista de puntos
    LinkedList <Punto> listaPuntos = new LinkedList(); 
    //Get de la lista Puntos
    public LinkedList<Punto> getListaPuntos() {
        return listaPuntos;
    }
    //Set de la Lista Puntos
    public void setListaPuntos(LinkedList<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }
    //Get de opcion
    public int getOpcion() {
        return opcion;
    }
    //Set de opcion
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    
    /**
     * Creates new form AreaDibujo
     */
    public AreaDibujo() {
        initComponents();
        r=new Rectangulo();
    }
    /**
     * Se reciben las coordenadas X,Y
     * @param x
     * @param y 
     */
    public void CoordenadasXY(int x, int y){
        r.setX(x);
        r.setY(y);
    }
    /**
     * Se reciben el ancho y alto 
     * @param ancho
     * @param alto 
     */
    public void EnviarAnchoAlto(int ancho, int alto){
        r.setAncho(ancho);
        r.setAlto(alto);
        
    }
    /**
     * Metodo que ejecuta los metodos de dibujo
     * de las figuras, dependiendo de la opcion
     * del usuario
     * @param g 
     */
    @Override
    public void paint(Graphics g) {
        
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        //Si es cuadrado o rectangulo 
        if(opcion==1 || opcion==2){
            //Se manda a llamar el metodo dibujar en plano que esta en figuras 
             r.DibujarEnPlano(g);
        }
        //Si es triangulo
       if (opcion==3){
           //Se setea la lista de coordenadas
           t.setListaPuntos(listaPuntos);
           //Se manda a llamar el metodo diibujar en plano que esta en triangulo 
           t.DibujarEnPlano(g);
       }
    }
    /**
     * metodo que actualiza o repinta el panel 
     */
    public void Actualizar(){
        repaint();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
