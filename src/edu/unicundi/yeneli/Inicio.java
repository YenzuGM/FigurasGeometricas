/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.yeneli;

/**
 *
 * @author Yeneli Garcia Mu
 */
public class Inicio {
    
     public static void main(String[] args) {
        
        //Objeto tipo Menú
        PanelControl ob = new PanelControl();
        
        ob.opcion=ob.Opcion("Figura 1");
        ob.setVisible(true);
        ob.setTitle("Graficación");
        ob.setDefaultCloseOperation(PanelControl.EXIT_ON_CLOSE);
    }
    
}
