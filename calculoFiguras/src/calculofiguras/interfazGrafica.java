package calculofiguras;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiantes
 */

public class interfazGrafica extends javax.swing.JFrame {

    /**
     * Creates new form interfazGrafica
     */
    public interfazGrafica() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tablero = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija la figura", "Cuadrado", "Circulo", "Triangulo", "Rectangulo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Radio");

        jLabel2.setText("Altura");

        jLabel5.setText("AREA");

        jLabel6.setText("PERIMETRO");

        tablero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablero.setFocusCycleRoot(true);

        javax.swing.GroupLayout tableroLayout = new javax.swing.GroupLayout(tablero);
        tablero.setLayout(tableroLayout);
        tableroLayout.setHorizontalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        tableroLayout.setVerticalGroup(
            tableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(jTextField1))))
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(jButton1)))))
                        .addGap(80, 80, 80))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tablero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
              String e="";
              String label="";
              String label2="";
        switch(jComboBox1.getSelectedIndex()){
           case 0:
               e="Por favor escoga una opción";
               label="";
               label2="";
               this.jLabel4.setText(e);
               this.jLabel1.setText(label);
               this.jLabel2.setText(label2);
               this.jTextField1.setVisible(false);
               this.jTextField2.setVisible(false);
               break;
           case 1:
               e="Cuadrado";
               label="Lado";
               label2="";
               this.jLabel4.setText(e);
               this.jLabel1.setText(label);
               this.jLabel2.setText(label2);
               this.jTextField1.setVisible(true);
               this.jTextField2.setVisible(false);
               break;
           case 2:
               e="Circulo";
               label="Radio";
               label2="";
               this.jLabel4.setText(e);
               this.jLabel1.setText(label);
               this.jLabel2.setText(label2);
               this.jTextField1.setVisible(true);
               this.jTextField2.setVisible(false);
               break;
           case 3:
               e="Triangulo";
               label="Lado";
               label2="";
               this.jLabel4.setText(e);
               this.jLabel1.setText(label);
               this.jLabel2.setText(label2);
               this.jTextField1.setVisible(true);
               this.jTextField2.setVisible(false);
               break;
           case 4:
               e="Rectangulo";
               label="Base";
               label2="Altura";
               this.jLabel4.setText(e);
               this.jLabel1.setText(label);
               this.jLabel2.setText(label2);
               this.jTextField1.setVisible(true);
               this.jTextField2.setVisible(true);
               break;
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // TODO add your handling code here:
       double x = 0;
       double y = 0;
       String a="";
       String b="";
       a= this.jTextField1.getText(); 
       b= this.jTextField2.getText(); 
       if(a != null && !a.isEmpty()){
       x = Double.parseDouble(a);
       }else{   x=0; 
       }
       if(b != null && !b.isEmpty()){
          y = Double.parseDouble(b);}
       else{ y=0;
       }
       
       String c="";
       String d="";
       calculo prueba =new calculo();
      
       prueba.setLado(x);
       prueba.setBase(y);
        
         switch(jComboBox1.getSelectedIndex()){
           case 0:
               break;
           case 1:
             //  calculo.cuadrado_perimetro(x);
               c = Double.toString(calculo.cuadrado_perimetro(x)); 
               //calculo.cuadrado_area(x);
               d = Double.toString(calculo.cuadrado_area(x)); 
               //Graficas.Dibujarcuadrado(tablero.getGraphics(), x);
                       
               break;
           case 2:
               calculo.circulo_perimetro(x);
               c = Double.toString(calculo.circulo_perimetro(x)); 
               calculo.circulo_area(x);
               d = Double.toString(calculo.circulo_area(x)); 
               break;
           case 3:
               calculo.triangulo_perimetro(x);
               c = Double.toString(calculo.triangulo_perimetro(x)); 
               calculo.triangulo_area(x);
               d = Double.toString(calculo.triangulo_area(x)); 
               break;
           case 4:
               calculo.rectangulo_perimetro(x,y);
               c = Double.toString(calculo.rectangulo_perimetro(x,y)); 
               calculo.rectangulo_area(x,y);
               d = Double.toString(calculo.rectangulo_area(x,y)); 
               break;
               
               
       }
       this.jLabel7.setText(c);
       this.jLabel8.setText(d);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int x = 0;
       int y = 0;
       String a="";
       String b="";
       a= this.jTextField1.getText(); 
       b= this.jTextField2.getText(); 
       if(a != null && !a.isEmpty()){
       x = Integer.parseInt(a);
       }else{   x=0; 
       }
       if(b != null && !b.isEmpty()){
          y = Integer.parseInt(b);}
       else{ y=0;
       }
       
       String c="";
       String d="";
       
       Graficas graf=new Graficas();
       graf.setLado(x);
       graf.setBase(y);
       
        
         switch(jComboBox1.getSelectedIndex()){
           case 0:
               break;
           case 1:
      
              Graficas.Dibujarcuadrado(tablero.getGraphics(), x);
            
               break;
           case 2:
             Graficas.DibujarCirculo(tablero.getGraphics(), x);
               break;
           case 3:
                Graficas.DibujarTriangulo(tablero.getGraphics(), x);
               break;
           case 4:
               Graficas.Dibujarrectangulo(tablero.getGraphics(), y,x);
               break;
               
               
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel tablero;
    // End of variables declaration//GEN-END:variables
}
