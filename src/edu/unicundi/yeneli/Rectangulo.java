/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.yeneli;

/**
 *Clase Rectangulo
 * @author Yeneli Garcia M
 */
public class Rectangulo extends FiguraG{
    
    /**
     * Metodo sobreescrito que calcula el
     * perimetro del rectangulo
     * @param fAncho
     * @param fAlto
     * @return 
     */
    @Override
    public int CalcularPerimetro(int fAncho, int fAlto){
        int perimetro=0;
        
        perimetro=(fAncho*2)+(fAlto*2);
        
        return perimetro;
    }
    
}
