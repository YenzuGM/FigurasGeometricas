/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.yeneli;

import java.awt.Graphics;
import java.util.LinkedList;

/**
 *
 * @author Yeneli Garcia Muñoz
 */
public class AreaDibujo extends javax.swing.JPanel {

    Triangulo t = new Triangulo();
    FiguraG r = new FiguraG();
    int opcion=0;
    LinkedList <Punto> listaPuntos = new LinkedList(); 

    public LinkedList<Punto> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(LinkedList<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    
    /**
     * Creates new form AreaDibujo
     */
    public AreaDibujo() {
        initComponents();
        r=new FiguraG();
    }
    
    public void CoordenadasXY(int x, int y){
        r.setX(x);
        r.setY(y);
    }
    
    public void EnviarAnchoAlto(int ancho, int alto){
        r.setAncho(ancho);
        r.setAlto(alto);
        
    }

    
    
    @Override
    public void paint(Graphics g) {
        
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        if(opcion==1 || opcion==2){
             r.DibujarEnPlano(g);
        }
       if (opcion==3){
           for(int c=0; c<listaPuntos.size(); c++){
           System.out.println("AREA DIBUJO "+ listaPuntos.get(c).getX()+ "Y="+ listaPuntos.get(c).getY());
           }
           
           t.setListaPuntos(listaPuntos);
           t.DibujarTriangulo(g);
       }
    }
    
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
