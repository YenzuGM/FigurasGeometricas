
package edu.unicundi.yeneli;
import java.awt.Graphics;
import java.awt.Color;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author 52753
 */
public class FiguraG extends Punto{
    
    private int ancho;
    private int alto;
    
    Scanner sc = new Scanner(System.in);

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
    
    
    public void DibujarEnPlano(Graphics g){
        
        g.drawString("Canvas",10,10);
        
        g.setColor(Color.RED);
        g.drawRect(this.getX(),this.getY(),this.getAlto(), this.getAncho());
        g.fillRect(this.getX(),this.getY(),this.getAlto(), this.getAncho());
        
    }
    
    public int ValidarCoordenadas(LinkedList <Punto> listaC,int altoFigura, int anchoFigura){
      int cumple=0;
      
      if (listaC.get(0).getX()==listaC.get(3).getX() && listaC.get(1).getX()==listaC.get(2).getX()
              && listaC.get(0).getY()==listaC.get(1).getY()&& listaC.get(3).getY()==listaC.get(2).getY())
      {
          if(altoFigura==anchoFigura){
             System.out.println("ES UN CUADRADO");
             cumple=1;
          }
          if(altoFigura!=anchoFigura){
              System.out.println("ES UN RECTANGULOOo");
              cumple=2;
          }
      }
      for(int c=0; c<listaC.size(); c++){
           System.out.println("==========X="+ listaC.get(c).getX()+ "Y="+ listaC.get(c).getY());
       }
      return cumple;
    }
    
    public int CalcularArea(int fAncho, int fAlto){
        int area=fAncho*fAlto;
        System.out.println("Area"+area);
        return area;
    }
    
    public int CalcularPerimetro(int fAncho, int fAlto){
        int perimetro=fAncho*4;
        
        return perimetro;
        
    }
    
    
}
