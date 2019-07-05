package Proyecto;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FinalizarPago extends javax.swing.JFrame {

    TarjetasCredito[] Pagos;
    ArrayList<RegistroPeliculas> Peliculas;
    int CantidadBoletos;
    String ValorVenta;
    String Fecha;
    AsientosComprados[] Salon1;
   AsientosComprados2[] Salon2;
   AsientosComprados3[] Salon3;
    

    public FinalizarPago(ArrayList<RegistroPeliculas> peliculas, int cantidadBoletos, String valorVenta, String fecha,AsientosComprados[] salon1, AsientosComprados2[] salon2, AsientosComprados3[] salon3) {
        initComponents();
        this.Salon1=salon1;
         this.Salon2=salon2;
         this.Salon3=salon3;
        this.Peliculas = peliculas;
        this.CantidadBoletos=cantidadBoletos;
        this.ValorVenta=valorVenta;
        this.Fecha=fecha;
        TxtCantidadPagar.setText(ValorVenta);
        Pagos = new TarjetasCredito[5];
        Pagos[0] = new TarjetasCredito("Enrique Abimael Cruz Sanchez", "10001", "12/12/2020", "101", "VISA", 50);
        Pagos[1] = new TarjetasCredito("Nelson Recarte", "10002", "12/12/2020", "102", "VISA", 2000);
        Pagos[2] = new TarjetasCredito("Aaron Bonilla", "20001", "12/12/2021", "201", "MASTERCARD", 500);
        Pagos[3] = new TarjetasCredito("Leonardo Pazzeti", "20002", "12/12/2021", "202", "MASTERCARD", 700);
        Pagos[4] = new TarjetasCredito("Mauricio Rios", "20001", "12/12/2021", "201", "AMERICAN EXPRESS", 800);
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNumeroTarjeta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtVencimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CmbTipoTarjeta = new javax.swing.JComboBox<>();
        BtnRealizarPago = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtNumeroFactura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Facturacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtCodigoSeguridad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtCantidadPagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Correo Electronico: ");

        TxtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreoActionPerformed(evt);
            }
        });

        jLabel2.setText("TarjetaHabiente: ");

        TxtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de Tarjeta:");

        TxtNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroTarjetaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha de Vencimiento: ");

        TxtVencimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtVencimientoActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Tarjeta");

        CmbTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------------", "VISA", "MASTERCARD", "AMERICAN EXPRESS", " " }));

        BtnRealizarPago.setText("Realizar Pago");
        BtnRealizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRealizarPagoActionPerformed(evt);
            }
        });

        jLabel6.setText("Aceptamos tarjetas de credito:");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\Proyecto1Programacion2\\src\\Proyecto\\Tarjetas de credito.jpg")); // NOI18N

        jLabel8.setText("Factura #");

        Facturacion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Facturacion.setText("Facturacion");

        jLabel9.setText("Codigo de seguridad:");

        TxtCodigoSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoSeguridadActionPerformed(evt);
            }
        });

        jLabel10.setText("Cantidad a Pagar:");

        TxtCantidadPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCantidadPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(69, 69, 69)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CmbTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(BtnRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(171, 171, 171)
                            .addComponent(jLabel7))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6))))
                .addGap(30, 191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Facturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtNumeroFactura)
                            .addComponent(TxtCantidadPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(Facturacion)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNumeroFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtCantidadPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CmbTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BtnRealizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public TarjetasCredito Buscar() {
        for (TarjetasCredito seleccionarTarjeta : Pagos) {
            if (seleccionarTarjeta != null && seleccionarTarjeta.getNombreCompleto().equals(TxtNombre.getText())
                    && seleccionarTarjeta.getTarjetaCredito().equals(TxtNumeroTarjeta.getText())
                    && seleccionarTarjeta.getCodigoSeguridad().equals(TxtCodigoSeguridad.getText())
                    && seleccionarTarjeta.getTipoTarjeta().equals(CmbTipoTarjeta.getSelectedItem().toString())) {
                return seleccionarTarjeta;
            }
        }
        return null;
    }

    public boolean RealizarPago() {
        if (Buscar() != null) {
            for (int i = 0; i < Pagos.length; i++) {
                if (Pagos[i] != null) {
                    if (Pagos[i].getDineroDisponible() > (Integer.parseInt(TxtCantidadPagar.getText()))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private void TxtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreoActionPerformed

    private void TxtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombreActionPerformed

    private void TxtNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroTarjetaActionPerformed

    private void TxtVencimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtVencimientoActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtVencimientoActionPerformed

    private void TxtCodigoSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoSeguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoSeguridadActionPerformed

    private void BtnRealizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealizarPagoActionPerformed
       CompraRealizada llamar=new CompraRealizada(Peliculas, TxtNumeroFactura.getText(), TxtCantidadPagar.getText(),Fecha,CantidadBoletos,"Usuario",Salon1, Salon2, Salon3);
        boolean Validar = false;
        Validar = RealizarPago();
        if (Validar == true) {
            JOptionPane.showMessageDialog(null, "Pago realizado");
             llamar.setVisible(true);
              this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No se realizo el pago");
        }
    }//GEN-LAST:event_BtnRealizarPagoActionPerformed

    private void TxtCantidadPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCantidadPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCantidadPagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRealizarPago;
    private javax.swing.JComboBox<String> CmbTipoTarjeta;
    private javax.swing.JLabel Facturacion;
    private javax.swing.JTextField TxtCantidadPagar;
    private javax.swing.JTextField TxtCodigoSeguridad;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumeroFactura;
    private javax.swing.JTextField TxtNumeroTarjeta;
    private javax.swing.JTextField TxtVencimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
