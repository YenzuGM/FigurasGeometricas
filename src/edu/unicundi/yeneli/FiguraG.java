
package edu.unicundi.yeneli;
import java.awt.Graphics;
import java.awt.Color;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *Clase FiguraG 
 * @author Yeneli Garcia M
 */
public abstract class FiguraG extends Punto implements IFiguras{
 //Variable que guarda la opcion del usuario  
    private int opcion;
//Variables de ancho y alto de la figura
    private int ancho;
    private int alto;
    //Objeto Scanner
    Scanner sc = new Scanner(System.in);
    //Get de opcion
    public int getOpcion() {
        return opcion;
    }
   //Set de Opcion
    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    //Contructor de la clase figuraG
    public FiguraG() {
        this.ancho = ancho;
        this.alto = alto;
    }
    //Get del Ancho
    public int getAncho() {
        return ancho;
    }
    //Set del Ancho
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
   //Get del Alto
    public int getAlto() {
        return alto;
    }
    //Set del Alto
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
     //Entero donde se guardara si las coordenadas introducidas cumplen con caracteristicas de un cuadrado o rectangulo
      int cumple=0;
      //Si se cumple esta condicion es que puede ser un cuadrado o rectangulo
      if (listaC.get(0).getX()==listaC.get(3).getX() && listaC.get(1).getX()==listaC.get(2).getX()
              && listaC.get(0).getY()==listaC.get(1).getY()&& listaC.get(3).getY()==listaC.get(2).getY())
      {
          //Si el alto y el ancho de la figura son iguales es un cuadrado 
          if(altoFigura==anchoFigura){
             //Cumple obtiene el valor de 1
             cumple=1;
          }
          //Si el alto y el ancho son diferentes es un rectangulo
          if(altoFigura!=anchoFigura){
              //Cumple obtiene el valor de 2
              cumple=2;
          }
      }
      //Se retorna el valor de cumple
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
       //Se calcula el area y se guarda en la variable area
        int area=fAncho*fAlto;
      //Se returna el area 
        return area;
    }
    
    /**
     * Metodo que calcula el perimetro del cuadrado
     * @param fAncho
     * @param fAlto
     * @return 
     */
    public int CalcularPerimetro(int fAncho, int fAlto){
        //Se calcula el perimetro y se guarda en la variable perimetro
        int perimetro=fAncho*4;
        //Se retorna el perimetro 
        return perimetro;
        
    }
    
    
}
