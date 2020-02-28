
package edu.unicundi.yeneli;
import java.awt.Graphics;
import java.awt.Color;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *Clase FiguraG 
 * @author Yeneli Garcia M
 */
public class FiguraG extends Punto{
 //Variable que guarda la opcion del usuario  
    private int opcion;
//Variables de ancho y alto de la figura
    private int ancho;
    private int alto;
    //Objeto Scanner
    Scanner sc = new Scanner(System.in);
    
    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public FiguraG() {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    /**
     * Metodo que dibuja el cuadrado o rectangulo
     * dependiendo de los parametros del usuario
     * @param g 
     */
    public void DibujarEnPlano(Graphics g){
        
        g.drawString("Canvas",10,10);
        
        g.setColor(Color.RED);
        g.drawRect(this.getX(),this.getY(),this.getAlto(), this.getAncho());
        g.fillRect(this.getX(),this.getY(),this.getAlto(), this.getAncho());
       
     
    }
    /**
     * Metodo que Valida si las coordenadas del usuario
     * son coherentes con la opcion elegida por el mismo
     * (Valida triangulo y rectangulo)
     * @param listaC
     * @param altoFigura
     * @param anchoFigura
     * @return 
     */
    public int ValidarCoordenadas(LinkedList <Punto> listaC,int altoFigura, int anchoFigura){
      int cumple=0;
      if (listaC.get(0).getX()==listaC.get(3).getX() && listaC.get(1).getX()==listaC.get(2).getX()
              && listaC.get(0).getY()==listaC.get(1).getY()&& listaC.get(3).getY()==listaC.get(2).getY())
      {
          if(altoFigura==anchoFigura){
             cumple=1;
          }
          if(altoFigura!=anchoFigura){
              cumple=2;
          }
      }
      return cumple;
    }
    
    /**
     * Metodo que calcula el area tanto de 
     * el cuadrado como del rectangulo
     * @param fAncho
     * @param fAlto
     * @return 
     */
    public int CalcularArea(int fAncho, int fAlto){
        int area=fAncho*fAlto;
        System.out.println("Area"+area);
        return area;
    }
    
    /**
     * Metodo que calcula el perimetro del cuadrado
     * @param fAncho
     * @param fAlto
     * @return 
     */
    public int CalcularPerimetro(int fAncho, int fAlto){
        int perimetro=fAncho*4;
        
        return perimetro;
        
    }
    
    
}
