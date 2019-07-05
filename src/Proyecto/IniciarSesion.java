package Proyecto;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {
   final String UsuarioS;
   final String ContraseñaS;
   final String UsuarioP;
   final String ContraseñaP;
   ArrayList<RegistroPeliculas>Peliculas;
   AsientosComprados[] Salon1;
   AsientosComprados2[] Salon2;
   AsientosComprados3[] Salon3;
   
    public IniciarSesion( ArrayList<RegistroPeliculas> peliculas,AsientosComprados[] salon1, AsientosComprados2[] salon2, AsientosComprados3[] salon3) {
        initComponents();
        this.Salon1=salon1;
         this.Salon2=salon2;
         this.Salon3=salon3;
        this.setLocationRelativeTo(null);
        this.Peliculas=peliculas;
        this.getContentPane().setBackground(Color.DARK_GRAY);
       UsuarioS="enriquecs";
       ContraseñaS="enriquecs";
       UsuarioP="gerente";
       ContraseñaP="gerente";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnIniciar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Inicio de Sesion");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Pictures\\inicio sesion (2).jpg")); // NOI18N

        BtnIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnIniciar.setText("Iniciar Sesion");
        BtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(BtnRegresar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarActionPerformed
        
        MenuAdministrador administrador=new MenuAdministrador(Peliculas, TxtUsuario.getText(),Salon1, Salon2, Salon3);
        Gerente reportes=new Gerente(TxtUsuario.getText());

        if (UsuarioS.equalsIgnoreCase(TxtUsuario.getText())&&ContraseñaS.equalsIgnoreCase(TxtContraseña.getText())) {
            administrador.setVisible(true);
            this.dispose();
        }        
        else{ 
            if(UsuarioP.equalsIgnoreCase(TxtUsuario.getText())&& ContraseñaP.equalsIgnoreCase(TxtContraseña.getText())){
               reportes.setVisible(true);
               this.dispose();
            }
            else 
            JOptionPane.showMessageDialog(this, "El usuario o contraseña es incorrecto");
            TxtUsuario.setText("");
            TxtContraseña.setText("");          
        }
    }//GEN-LAST:event_BtnIniciarActionPerformed

    
    
    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
   MenuPrincipal Retornar=new MenuPrincipal(Peliculas,Salon1, Salon2, Salon3);
     Retornar.setVisible(true);
   this.setVisible(false);    
    }//GEN-LAST:event_BtnRegresarActionPerformed
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JPasswordField TxtContraseña;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
