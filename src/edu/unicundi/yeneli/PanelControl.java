/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicundi.yeneli;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *Clase Panel de Control 
 * @author Yeneli Garcia M
 */
public class PanelControl extends javax.swing.JFrame{
   
    ///Variable que guarda la cantidad de puntos de cada Figura
     int numPuntos=0;
     //Lista que guarda los puntos de la figura
     LinkedList <Punto> listaPuntos = new LinkedList();  
     LinkedList <Punto> listaPuntos2 = new LinkedList();
     //Objeto tipo Punto 
     Punto obj = new Punto();
     //Objeto tipo FiguraG
     FiguraG objf= new Triangulo();
     //Objeto tipo Rectangulo
     Rectangulo objRec= new Rectangulo();
     //Objeto tipo triangulo
     Triangulo t = new Triangulo();
     //Contador de coordenadas(puntos) ingresadas por el usuario
     int contadorIngresos=0;
     //Ancho de la figura
     int anchoFigura;
     //Alto de la figura
     int altoFigura;
     //Variable que guarda la opcion del usuario
     int opcion;
     
     int nFigura=1;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
     int opcion2;
     //Formato de decimales para la impresion de areas y perimetros
     DecimalFormat df = new DecimalFormat("#0.0000");
     
     
    /**
     * Creates new form PanelControl
     */
    public PanelControl() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tY = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LPerimetro = new javax.swing.JLabel();
        LArea = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        areaDibujo1 = new edu.unicundi.yeneli.AreaDibujo();
        LTipoTriangulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bNuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LPerimetro2 = new javax.swing.JLabel();
        LArea2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LTipoTriangulo2 = new javax.swing.JLabel();
        areaDibujo2 = new edu.unicundi.yeneli.AreaDibujo();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        botonIngresar.setText("INGRESAR COORDENADAS");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("INGRESA X");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("INGRESA Y");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("AREA");

        LPerimetro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("PERIMETRO");

        javax.swing.GroupLayout areaDibujo1Layout = new javax.swing.GroupLayout(areaDibujo1);
        areaDibujo1.setLayout(areaDibujo1Layout);
        areaDibujo1Layout.setHorizontalGroup(
            areaDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        areaDibujo1Layout.setVerticalGroup(
            areaDibujo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        LTipoTriangulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LTipoTriangulo.setForeground(new java.awt.Color(255, 51, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unicundi/yeneli/imagenes/ejemploT.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/unicundi/yeneli/imagenes/ejemploC.jpg"))); // NOI18N

        bNuevo.setText("NUEVO");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("FIGURA 1 ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("PERIMETRO");

        LPerimetro2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("AREA");

        LTipoTriangulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LTipoTriangulo2.setForeground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout areaDibujo2Layout = new javax.swing.GroupLayout(areaDibujo2);
        areaDibujo2.setLayout(areaDibujo2Layout);
        areaDibujo2Layout.setHorizontalGroup(
            areaDibujo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        areaDibujo2Layout.setVerticalGroup(
            areaDibujo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("FIGURA 2 ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(areaDibujo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(areaDibujo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tY, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(tX, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(bNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(9, 9, 9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonIngresar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LTipoTriangulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 5, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LPerimetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LTipoTriangulo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel11)
                                                .addComponent(LArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(83, 83, 83))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(areaDibujo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonIngresar)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(bNuevo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LArea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(LPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LTipoTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(LArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(LPerimetro2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(LTipoTriangulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(areaDibujo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Metodo donde se agregan las coordenadas
 * a la lista, asi mismo, llama al metodo para dibujar
 * dependiendo de la opcion del usuario
 * @param evt 
 */
    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        //Condicion que ejecuta el metodo Opcion
       
        
        if(nFigura==1){
            MandarLista(listaPuntos);
           if (contadorIngresos==numPuntos) {
               System.out.println(">c");
               contadorIngresos=0; 
               return;
           }
        }
        if(nFigura==2){
            MandarLista(listaPuntos2);
        }
       if (nFigura==3){             
           FiguraUno();
           FiguraDos();
        
       }
    }//GEN-LAST:event_botonIngresarActionPerformed

    public void FiguraDos(){
        
         if(opcion2==1 || opcion2==2){
            CalcularAnchoYAlto(listaPuntos2); 
           //Se mandan a llamar el metodo que valida si las coordenadas coinciden con la opcion del usuario
            int retornaValidacion= objf.ValidarCoordenadas(listaPuntos2,altoFigura,anchoFigura);
         
            if(retornaValidacion==opcion2){
                MandarDibujar(areaDibujo2,listaPuntos2,LPerimetro2,LArea2,LTipoTriangulo2,opcion2);
//                MandarDibujar();
            }
            if(retornaValidacion!=opcion2){
                JOptionPane.showMessageDialog(null, "LAS COORDENADAS NO CONCUERDAN CON LA FIGURA SELECCIONADA");
                return;
            }
        }
        //Si opcion es 3 
        MandarDibujar(areaDibujo2,listaPuntos2,LPerimetro2,LArea2,LTipoTriangulo2,opcion2);
//        MandarDibujar();
        
    }
    public void FiguraUno(){
         if(opcion==1 || opcion==2){
            CalcularAnchoYAlto(listaPuntos); 
           //Se mandan a llamar el metodo que valida si las coordenadas coinciden con la opcion del usuario
            int retornaValidacion= objf.ValidarCoordenadas(listaPuntos,altoFigura,anchoFigura);
         
            if(retornaValidacion==opcion){
                MandarDibujar(areaDibujo1,listaPuntos,LPerimetro,LArea,LTipoTriangulo,opcion);
            }
            if(retornaValidacion!=opcion){
                JOptionPane.showMessageDialog(null, "LAS COORDENADAS NO CONCUERDAN CON LA FIGURA SELECCIONADA");
                return;
            }
        }
        //Si opcion es 3 
        MandarDibujar(areaDibujo1,listaPuntos,LPerimetro,LArea,LTipoTriangulo,opcion);
    
    }
    public void MandarLista(LinkedList <Punto> listaTemp){
        if (contadorIngresos<numPuntos-1){
            
            ingresarALista(listaTemp);
            return;
            
        } if (contadorIngresos==numPuntos-1){
            ingresarALista(listaTemp);
            
            for(Punto p : listaTemp){
                System.out.println(p);
            }
            
            System.out.println("////");
            if (nFigura==1){
            opcion2=Opcion("Figura 2");
            contadorIngresos=numPuntos;
                System.out.println("Despues de opcion");
           
            } nFigura++;
    }
        
    }
    
    
    
    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
       tX.setText(null);
       tY.setText(null);
       LArea.setText(null);
       LPerimetro.setText(null);
       LArea2.setText(null);
       LPerimetro2.setText(null);
       LTipoTriangulo.setText(null);
       LTipoTriangulo2.setText(null);
       numPuntos=0;
       nFigura=1;
       
       contadorIngresos=0;
       listaPuntos.clear();
       listaPuntos2.clear();
      opcion2=0;
      
     opcion=Opcion("Figura 1");
       
    }//GEN-LAST:event_bNuevoActionPerformed

    
    /**
     * Metodo que recibe la opcion del usuario y lo guarda
     * en la variable opcion, asi mismo, se asigna el numero
     * de puntos que tiene cada figura
     */
    public int Opcion(String n){
        int opc = 0;
        
        while (opc>3 ||  opc<1){
            
            opc = Integer.parseInt(JOptionPane.showInputDialog(n+"\n ¿Que quieres Dibujar? \n 1.-Cuadrado \n 2.-Rectangulo \n 3.-Triangulo"));
            
        }
        
        if (opc==1 || opc==2){
            numPuntos=4;
        }
        if (opc==3){
            numPuntos=3;
        }
        
        System.out.println(""+opc);
        return opc;
    }
    
    /**
     * Metodo que ingresa los objetos tipo punto (las coordenadas)
     * a la lista.
     */
    public void ingresarALista(LinkedList <Punto> listaPuntos  ){
        int x=0;
        int y=0;
       //Se extraen las coordenadas 
        x = Integer.parseInt(this.tX.getText());
        y = Integer.parseInt(this.tY.getText());
        Punto obj = new Punto();
       obj.setX(x);
       obj.setY(y);

       listaPuntos.add(obj);

      //Se limpian los campos
       tX.setText(null);
       tY.setText(null);
       //Incrementa el numero de ingresos del usuario
       contadorIngresos++;
    }
    /**
     * Se calcula el alto y el ancho de la figura
     */
    public void CalcularAnchoYAlto(LinkedList <Punto> listaAux){
        anchoFigura=(listaAux.get(1).getX()-listaAux.get(0).getX());
        
        altoFigura=(listaAux.get(2).getY()-listaAux.get(1).getY());
       
    } 
    /**
     * Metodo que ejecuta los metodos de dibujo
     * de las figuras, asi mismo los metodos de
     * calculo de area y perimetro
     */
    public void MandarDibujar(AreaDibujo areaD,LinkedList <Punto> listaAux,JLabel LPerimetro, JLabel LArea, JLabel LTipoTriangulo, int op){
        
       areaD.opcion=op;
        
        //Enviar coordenadas iniciales 
       areaD.CoordenadasXY(listaAux.get(0).getX(),listaAux.get(0).getY());
       
       if (op==1 || op==2){
       areaD.EnviarAnchoAlto(altoFigura, anchoFigura);
       }
       if (op==3){
           areaD.listaPuntos=listaAux;
       }
       
      areaD.Actualizar();
       
       if(op==1 || op==2){
           LArea.setText(""+objf.CalcularArea(altoFigura,anchoFigura));
           if(op==1){
           LPerimetro.setText(""+objf.CalcularPerimetro(altoFigura,anchoFigura));
            }
           if(op==2){
           LPerimetro.setText(""+objRec.CalcularPerimetro(altoFigura,anchoFigura));
            }
       }
       if(op==3){
           t.setListaPuntos(listaAux);
           LPerimetro.setText(""+df.format(t.CalcularPerimetro()));
           t.IdentificarTriangulo();
           LTipoTriangulo.setText("TRIANGULO "+t.getTipoTriangulo());
           LArea.setText(""+df.format(t.CalcularArea()));
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LArea;
    private javax.swing.JLabel LArea2;
    private javax.swing.JLabel LPerimetro;
    private javax.swing.JLabel LPerimetro2;
    private javax.swing.JLabel LTipoTriangulo;
    private javax.swing.JLabel LTipoTriangulo2;
    private edu.unicundi.yeneli.AreaDibujo areaDibujo1;
    private edu.unicundi.yeneli.AreaDibujo areaDibujo2;
    private javax.swing.JButton bNuevo;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tX;
    private javax.swing.JTextField tY;
    // End of variables declaration//GEN-END:variables
}
