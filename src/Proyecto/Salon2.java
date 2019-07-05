
package Proyecto;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class Salon2 extends javax.swing.JFrame {

     AsientosComprados[] Salon1;
    AsientosComprados2[] Salon2;
   AsientosComprados3[] Salon3;
    
    DefaultListModel ListaModelo;
    int contador;
    ArrayList<RegistroPeliculas> Peliculas;
    int BoletosVendidos;
    String ValorVenta;
    String Fecha;
    
    
    public Salon2(ArrayList<RegistroPeliculas> peliculas, String valorVenta, int boletosVendidos, String fecha, AsientosComprados[] salon1, AsientosComprados2[] salon2, AsientosComprados3[] salon3) {
        initComponents();
        this.Salon1=salon1;
        this.Salon2=salon2;
        this.Salon3=salon3;
        this.Peliculas=peliculas;
        this.BoletosVendidos=boletosVendidos;
        this.ValorVenta=valorVenta;
        this.Peliculas=peliculas;
        this.Fecha=fecha;
     
        ListaModelo = new DefaultListModel();
        ListaAsientos.setModel(ListaModelo);
        TxtAsientosDisponibles.setText(Integer.toString(Salon2.length-contador));    
        for (int i = 0; i < Salon2.length; i++) {
            if(Salon2[i]==null)
                contador++;
        }
         this.getContentPane().setBackground(Color.DARK_GRAY);
    }

     public AsientosComprados2 Buscar() {
        for (AsientosComprados2 seleccionarAsiento : Salon2) {
            if (seleccionarAsiento!=null && seleccionarAsiento.getAsiento() == Integer.parseInt(TxtNumeroAsiento.getText())) {
                return seleccionarAsiento;
            }
        }
        return null;
    }

    public boolean GuardarAsiento() {
        if (Buscar() == null) {
            for (int i = 0; i < Salon2.length; i++) {
                if (Salon2[i] == null) {
                    Salon2[i] = new AsientosComprados2(Integer.parseInt(TxtNumeroAsiento.getText()));
                }
                return true;
            }
        }
        return false;
    }
    
    
    public boolean QuitarAsiento(){
        for (int i = 0; i < Salon2.length; i++) {
            if(Salon2[i].getAsiento()==ListaAsientos.getSelectedIndex())
               Salon2[i]=null;
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

        TxtIngresarAsiento = new javax.swing.JButton();
        TxtQuitarAsiento = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TxtAsientosDisponibles = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtNumeroAsiento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaAsientos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\Proyecto1Programacion2\\src\\Proyecto\\pantalla cine 2.gif")); // NOI18N

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
        jLabel3.setText("Salon 2");

        jScrollPane1.setViewportView(ListaAsientos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(TxtAsientosDisponibles)))
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
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNumeroAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIngresarAsiento)
                    .addComponent(TxtQuitarAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtAsientosDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtIngresarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIngresarAsientoActionPerformed
        boolean Validar = false;
        Validar = GuardarAsiento();
        if (Validar == true) {
            JOptionPane.showMessageDialog(null, "Asiento apartado");
            AnexarListado();
            TxtNumeroAsiento.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "El asiento ya esta ocupado");
        }
    }//GEN-LAST:event_TxtIngresarAsientoActionPerformed

    private void TxtQuitarAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQuitarAsientoActionPerformed
        QuitarListado();

    }//GEN-LAST:event_TxtQuitarAsientoActionPerformed

    private void ContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinuarActionPerformed
     FinalizarPago llamar=new FinalizarPago(Peliculas,BoletosVendidos, ValorVenta,Fecha, Salon1, Salon2, Salon3);
     llamar.setVisible(true);
     this.dispose();
        
    }//GEN-LAST:event_ContinuarActionPerformed

    private void TxtNumeroAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroAsientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumeroAsientoActionPerformed

    /**
     * @param args the command line arguments
     */
  

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
