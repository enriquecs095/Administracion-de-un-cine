
package Proyecto;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Salon3 extends javax.swing.JFrame {

    AsientosComprados[] Salon1;
   AsientosComprados2[] Salon2;
   AsientosComprados3[] Salon3;
    DefaultListModel ListaModelo;
    int contador;
     ArrayList<RegistroPeliculas> Peliculas;
         int BoletosVendidos;
    String ValorVenta;
    String Fecha;
    
     
    
    public Salon3(ArrayList<RegistroPeliculas> peliculas,String valorVenta, int boletosVendidos, String fecha, AsientosComprados[] salon1, AsientosComprados2[] salon2, AsientosComprados3[] salon3) {
        initComponents();
          this.Salon1=salon1;
         this.Salon2=salon2;
         this.Salon3=salon3;
        this.Peliculas=peliculas;
       
        ListaModelo = new DefaultListModel();
        ListaAsientos.setModel(ListaModelo);
        TxtAsientosDisponibles.setText(Integer.toString(Salon3.length-contador));    
        for (int i = 0; i < Salon3.length; i++) {
            if(Salon3[i]==null)
                contador++;
        }
         this.getContentPane().setBackground(Color.DARK_GRAY);
    }

   public AsientosComprados3 Buscar() {
        for (AsientosComprados3 seleccionarAsiento : Salon3) {
            if (seleccionarAsiento!=null && seleccionarAsiento.getAsiento() == Integer.parseInt(TxtNumeroAsiento.getText())) {
                return seleccionarAsiento;
            }
        }
        return null;
    }

    public boolean GuardarAsiento() {
        if (Buscar() == null) {
            for (int i = 0; i < Salon3.length; i++) {
                if (Salon3[i] == null) {
                    Salon3[i] = new AsientosComprados3(Integer.parseInt(TxtNumeroAsiento.getText()));
                }
                return true;
            }
        }
        return false;
    }
    
    
    public boolean QuitarAsiento(){
        for (int i = 0; i < Salon3.length; i++) {
            if(Salon3[i].getAsiento()==ListaAsientos.getSelectedIndex())
               Salon3[i]=null;
            return true;
        }   
    return false;
    }

    public void AnexarListado() {
        String Asiento=TxtNumeroAsiento.getText();
        ListaModelo.addElement(Asiento);
        
    }

    public boolean QuitarListado() {
        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro desea eliminar este asiento: ");
        if (respuesta == 0) {
            ListaModelo.remove(ListaAsientos.getSelectedIndex());     
            QuitarAsiento();
              JOptionPane.showMessageDialog(null, "Asiento eliminado");
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtAsientosDisponibles = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtNumeroAsiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaAsientos = new javax.swing.JList<>();
        TxtIngresarAsiento = new javax.swing.JButton();
        TxtQuitarAsiento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\Proyecto1Programacion2\\src\\Proyecto\\salon 3.gif")); // NOI18N

        Continuar.setText("Continuar");
        Continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinuarActionPerformed(evt);
            }
        });

        jLabel2.setText("Escriba el numero de asiento del 1 al 200:");

        TxtNumeroAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroAsientoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("Salon 3");

        jScrollPane1.setViewportView(ListaAsientos);

        TxtIngresarAsiento.setText("Ingresar asiento");
        TxtIngresarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIngresarAsientoActionPerformed(evt);
            }
        });

        TxtQuitarAsiento.setText("Quitar asiento");
        TxtQuitarAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQuitarAsientoActionPerformed(evt);
            }
        });

        jLabel4.setText("Asientos Disponibles:  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TxtAsientosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(TxtIngresarAsiento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtQuitarAsiento))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIngresarAsiento)
                    .addComponent(TxtQuitarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtAsientosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 210, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
     FinalizarPago llamar=new FinalizarPago(Peliculas,BoletosVendidos, ValorVenta,Fecha, Salon1, Salon2, Salon3);
     llamar.setVisible(true);
     this.dispose();
        
    }//GEN-LAST:event_ContinuarActionPerformed

    private void TxtNumeroAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroAsientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroAsientoActionPerformed

    private void TxtIngresarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIngresarAsientoActionPerformed
        boolean Validar = false;
        Validar = GuardarAsiento();
        if (Validar == true) {
            JOptionPane.showMessageDialog(null, "Asiento apartado");
            AnexarListado();
           
        } else {
            JOptionPane.showMessageDialog(null, "El asiento ya esta ocupado");
        }
    }//GEN-LAST:event_TxtIngresarAsientoActionPerformed

    private void TxtQuitarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuitarAsientoActionPerformed
        QuitarListado();
    }//GEN-LAST:event_TxtQuitarAsientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continuar;
    private javax.swing.JList<String> ListaAsientos;
    private javax.swing.JTextField TxtAsientosDisponibles;
    private javax.swing.JButton TxtIngresarAsiento;
    private javax.swing.JTextField TxtNumeroAsiento;
    private javax.swing.JButton TxtQuitarAsiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
