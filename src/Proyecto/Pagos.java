package Proyecto;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pagos extends javax.swing.JFrame implements KeyListener{

    ArrayList<RegistroPeliculas> Peliculas;
   AsientosComprados[] Salon1;
   AsientosComprados2[] Salon2;
   AsientosComprados3[] Salon3;
String FechaI;

    public Pagos(ArrayList<RegistroPeliculas> peliculas, String nombre, String idioma, String adultos, String ancianos, String niños, String fecha, String salon, String horario,AsientosComprados[] salon1, AsientosComprados2[] salon2, AsientosComprados3[] salon3) {
        initComponents();
        this.Salon1=salon1;
        this.Salon2=salon2;
        this.Salon3=salon3;      
        this.Peliculas = peliculas;
        NombrePelicula.setText(nombre);
        this.FechaI=fecha;
        Idioma.setText(idioma);
        Fecha.setText(fecha);
        Sala.setText(salon);
        Horario.setText(horario);
        PrecioAdultos.setText(adultos);
        PrecioAncianos.setText(ancianos);
        PrecioNiños.setText(niños);
        SubtotalAdultos.addKeyListener(this);
        SubtotalAncianos.addKeyListener(this);  
        SubtotalNiños.addKeyListener(this);
        Total.addKeyListener(this);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Idioma = new javax.swing.JLabel();
        NombrePelicula = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Horario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CantidadAncianos = new javax.swing.JComboBox<>();
        CantidadAdultos = new javax.swing.JComboBox<>();
        CantidadNiños = new javax.swing.JComboBox<>();
        PrecioAdultos = new javax.swing.JLabel();
        PrecioNiños = new javax.swing.JLabel();
        PrecioAncianos = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        CmbRegresar = new javax.swing.JButton();
        BtnSeleccionarAsientos = new javax.swing.JButton();
        Fecha = new javax.swing.JLabel();
        Sala = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SubtotalAdultos = new javax.swing.JTextField();
        SubtotalAncianos = new javax.swing.JTextField();
        SubtotalNiños = new javax.swing.JTextField();
        BtnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pelicula: ");

        jLabel4.setText("Horario: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tipo de Asiento ");

        jLabel3.setText("Adultos");

        jLabel5.setText("Ancianos");

        jLabel6.setText("Niños");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cantidad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Precio");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Subtotal");

        jLabel10.setText("Total: ");

        CantidadAncianos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        CantidadAdultos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        CantidadNiños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", " " }));

        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        CmbRegresar.setText("Regresar");
        CmbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbRegresarActionPerformed(evt);
            }
        });

        BtnSeleccionarAsientos.setText("Seleccionar Asientos");
        BtnSeleccionarAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSeleccionarAsientosActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Clientes ");

        BtnCalcular.setText("Calcular");
        BtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CantidadAncianos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CantidadAdultos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(CantidadNiños, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BtnCalcular))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel8))
                    .addComponent(PrecioNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioAncianos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrecioAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Total)
                            .addComponent(SubtotalAncianos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(SubtotalAdultos)
                            .addComponent(SubtotalNiños))))
                .addGap(91, 164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(CmbRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSeleccionarAsientos)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sala, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombrePelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sala, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(6, 6, 6))
                                    .addComponent(SubtotalAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecioAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PrecioAncianos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SubtotalAncianos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SubtotalNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecioNiños, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(24, 24, 24)
                                .addComponent(CantidadAdultos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CantidadAncianos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CantidadNiños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSeleccionarAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BtnCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CmbRegresar)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void BtnSeleccionarAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSeleccionarAsientosActionPerformed
       int BoletosVendidos=Integer.parseInt(CantidadAdultos.getSelectedItem().toString())+Integer.parseInt(CantidadAncianos.getSelectedItem().toString())+Integer.parseInt(CantidadNiños.getSelectedItem().toString());
        Salon1 llamar1 = new Salon1(Peliculas, Total.getText(), BoletosVendidos,FechaI,Salon1, Salon2, Salon3);
        Salon2 llamar2 = new Salon2(Peliculas, Total.getText(), BoletosVendidos,FechaI,Salon1, Salon2, Salon3);
        Salon3 llamar3=new Salon3(Peliculas, Total.getText(), BoletosVendidos,FechaI,Salon1, Salon2, Salon3);
        int SumarCantidades = Integer.parseInt(CantidadAdultos.getSelectedItem().toString()) + Integer.parseInt(CantidadAncianos.getSelectedItem().toString()) + Integer.parseInt(CantidadNiños.getSelectedItem().toString());
            if (Sala.getText().equals("Salon 1")) {
                llamar1.setVisible(true);
            } else if(Sala.getText().equals("Salon 2")){
                llamar2.setVisible(true);
            }else if(Sala.getText().equals("Salon 3")){
                llamar3.setVisible(true);
            }
            this.dispose();
    }//GEN-LAST:event_BtnSeleccionarAsientosActionPerformed

    private void BtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCalcularActionPerformed
        int resultado1 = Integer.parseInt(CantidadAdultos.getSelectedItem().toString()) * Integer.parseInt(PrecioAdultos.getText());
        int resultado2 = Integer.parseInt(CantidadAncianos.getSelectedItem().toString()) * Integer.parseInt(PrecioAncianos.getText());
        int resultado3 = Integer.parseInt(CantidadNiños.getSelectedItem().toString()) * Integer.parseInt(PrecioNiños.getText());
        SubtotalAdultos.setText(Integer.toString(resultado1));
        SubtotalAncianos.setText(Integer.toString(resultado2));
        SubtotalNiños.setText(Integer.toString(resultado3));
        int TotalSuma = Integer.parseInt(SubtotalAdultos.getText()) + Integer.parseInt(SubtotalAncianos.getText()) + Integer.parseInt(SubtotalNiños.getText());
        Total.setText(Integer.toString(TotalSuma));   
    }//GEN-LAST:event_BtnCalcularActionPerformed

    private void CmbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbRegresarActionPerformed
       VerPeliculas llamar =new VerPeliculas(Peliculas,Salon1, Salon2, Salon3);
       llamar.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_CmbRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCalcular;
    private javax.swing.JButton BtnSeleccionarAsientos;
    private javax.swing.JComboBox<String> CantidadAdultos;
    private javax.swing.JComboBox<String> CantidadAncianos;
    private javax.swing.JComboBox<String> CantidadNiños;
    private javax.swing.JButton CmbRegresar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Horario;
    private javax.swing.JLabel Idioma;
    private javax.swing.JLabel NombrePelicula;
    private javax.swing.JLabel PrecioAdultos;
    private javax.swing.JLabel PrecioAncianos;
    private javax.swing.JLabel PrecioNiños;
    private javax.swing.JLabel Sala;
    private javax.swing.JTextField SubtotalAdultos;
    private javax.swing.JTextField SubtotalAncianos;
    private javax.swing.JTextField SubtotalNiños;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
