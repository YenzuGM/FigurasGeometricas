
package edu.unicundi.yeneli;

import java.awt.Color;
import java.awt.Graphics;

/**
 *Interface IFiguras 
 * @author Yeneli Garcia Muñoz 
 */
public interface IFiguras {
    //Metodo para dibujar
    public void DibujarEnPlano(Graphics g);
    //Metodo para calcular el perimetro 
    public int CalcularPerimetro(int fAncho, int fAlto);
    
}
