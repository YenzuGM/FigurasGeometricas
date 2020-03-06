/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.yeneli;

/**
 * Clase Inicial, donde comienza el programa 
 * @author Yeneli Garcia Mu
 */
public class Inicio {
    
    /**
     * Metodo main donde se manda a llamar el panel de control 
     * @param args 
     */
     public static void main(String[] args) {
        
        //Objeto tipo Menú
        PanelControl ob = new PanelControl();
        //Se manda a llamar el metodo opcion, enviandole 'Figura 1' como parametro
        ob.opcion=ob.Opcion("Figura 1");
        //Se llama al Panel 
        ob.setVisible(true);
        ob.setTitle("Graficación");
        ob.setDefaultCloseOperation(PanelControl.EXIT_ON_CLOSE);
    }
    
}
