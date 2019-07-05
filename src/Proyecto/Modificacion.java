package Proyecto;

import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Modificacion extends javax.swing.JFrame {

    private String UsuarioLog;
    ArrayList<RegistroPeliculas> Peliculas;
    String URL;
    AsientosComprados[] Salon1;
   AsientosComprados2[] Salon2;
   AsientosComprados3[] Salon3;

    public Modificacion(ArrayList<RegistroPeliculas> peliculas, String usuario,AsientosComprados[] salon1, AsientosComprados2[] salon2, AsientosComprados3[] salon3) {
        initComponents();
          this.Salon1=salon1;
         this.Salon2=salon2;
         this.Salon3=salon3;
        this.Peliculas = peliculas;
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.UsuarioLog = usuario;
        TxtUsuarioLog.setText(UsuarioLog);
        jPanel1.setBackground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CmbEdadN = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtCodigoL = new javax.swing.JTextField();
        TxtSinopsisL = new javax.swing.JTextField();
        TxtHorario1L = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtHorario2L = new javax.swing.JTextField();
        TxtEdadL = new javax.swing.JTextField();
        TxtSalonL = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtHorario3L = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CmbSalonN = new javax.swing.JComboBox<>();
        TxtNombreL = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtDuracionL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TxtFormatoL = new javax.swing.JTextField();
        CmbFormatoN = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        TxtGeneroL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ModificarImagen = new javax.swing.JLabel();
        CmbGeneroN = new javax.swing.JComboBox<>();
        CmbIdiomaN = new javax.swing.JComboBox<>();
        TxtIdiomaL = new javax.swing.JTextField();
        TxtPrecioNiñosL = new javax.swing.JTextField();
        TxtPrecioAncianosL = new javax.swing.JTextField();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        TxtFechaL = new javax.swing.JTextField();
        TxtPrecioAdultosL = new javax.swing.JTextField();
        TxtUsuarioLog = new javax.swing.JLabel();
        BtnModificarImagen = new javax.swing.JButton();
        BtnCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtURL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CmbEdadN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------------", "Mayores de 12 años", "Mayores de 17 años", "Mayores de 21 años" }));

        jLabel4.setText("Horario 1: ");

        jLabel5.setText("Salon: ");

        BtnBuscar.setText("Listar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Edad recomendada:");

        jLabel7.setText("Sinopsis:");

        jLabel12.setText("Horario 2: ");

        TxtEdadL.setEnabled(false);

        TxtSalonL.setEnabled(false);

        jLabel17.setText("Horario 3: ");

        jLabel2.setText("Codigo:");

        TxtHorario3L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHorario3LActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre: ");

        CmbSalonN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------", "Salon 1", "Salon 2", "Salon 3" }));

        jLabel14.setText("Duracion:");

        TxtDuracionL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDuracionLActionPerformed(evt);
            }
        });

        jLabel8.setText("Formato:");

        TxtFormatoL.setEnabled(false);
        TxtFormatoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFormatoLActionPerformed(evt);
            }
        });

        CmbFormatoN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "2D", "3D" }));

        jLabel9.setText("Genero:");

        TxtGeneroL.setEnabled(false);

        jLabel10.setText("Idioma: ");

        jLabel11.setText("Precio Adulto:");

        jLabel13.setText("Fecha de estreno:");

        jLabel16.setText("Precio anciano:");

        jLabel15.setText("Precio niño:");

        CmbGeneroN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------------", "Accion", "Aventura", "Comedia", "Dramatica", "Terror", "Musical", "Ciencia Ficcion", "Guerra", "Crimen", "Suspenso", "Todo Publico" }));

        CmbIdiomaN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---------------------", "Español Doblado", "Ingles Subtitulado", " " }));
        CmbIdiomaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbIdiomaNActionPerformed(evt);
            }
        });

        TxtIdiomaL.setEnabled(false);

        TxtPrecioNiñosL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrecioNiñosLActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar ");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        TxtUsuarioLog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BtnModificarImagen.setText("Modificar Imagen");
        BtnModificarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarImagenActionPerformed(evt);
            }
        });

        BtnCerrarSesion.setText("Regresar");
        BtnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manipulacion de Datos");

        TxtURL.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtCodigoL, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TxtUsuarioLog, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtSinopsisL, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtDuracionL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFormatoL, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtGeneroL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtIdiomaL, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxtHorario2L, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel17)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtHorario3L, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CmbSalonN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CmbFormatoN, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CmbGeneroN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CmbIdiomaN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(70, 70, 70)
                                        .addComponent(ModificarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(TxtNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxtHorario1L, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel12))
                                    .addComponent(TxtEdadL, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtSalonL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(CmbEdadN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxtFechaL, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxtPrecioAdultosL, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtPrecioNiñosL, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtPrecioAncianosL, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnModificarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TxtCodigoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BtnBuscar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtNombreL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(TxtUsuarioLog, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(TxtHorario2L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtHorario1L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(TxtHorario3L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtSalonL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(6, 6, 6))
                    .addComponent(CmbSalonN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ModificarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TxtEdadL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CmbEdadN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(TxtSinopsisL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(TxtDuracionL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtFormatoL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CmbFormatoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtGeneroL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CmbGeneroN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbIdiomaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtIdiomaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(BtnModificarImagen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtPrecioAdultosL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(TxtPrecioNiñosL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(TxtPrecioAncianosL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(TxtFechaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarSesionActionPerformed
        MenuAdministrador Regresar = new MenuAdministrador(Peliculas, UsuarioLog,Salon1, Salon2, Salon3);
        Regresar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnCerrarSesionActionPerformed

    private void BtnModificarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarImagenActionPerformed
        JFileChooser escoger = new JFileChooser();
        escoger.showOpenDialog(this);
        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        URL = escoger.getSelectedFile().toString();
        ImageIcon Poster = new ImageIcon(URL);
        ModificarImagen.setIcon(Poster);
        TxtURL.setText(URL);
    }//GEN-LAST:event_BtnModificarImagenActionPerformed

    public boolean Eliminar() {
        if (BuscarCodigo() != null) {
            for (int i = 0; i < Peliculas.size(); i++) {
                Peliculas.remove(i);
                return true;
            }
        }
        return false;
    }


    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        boolean Validar = false;
        Validar = Eliminar();
        if (Validar == true){
            JOptionPane.showMessageDialog(null, "La pelicula se elimino");
        }
        else{
            JOptionPane.showMessageDialog(null, "La pelicula no se elimino");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        boolean Validar = false;
        Validar = ModificarPelicula(TxtCodigoL.getText(), TxtNombreL.getText(), TxtHorario1L.getText(), TxtHorario2L.getText(), TxtHorario3L.getText(), CmbSalonN.getSelectedItem().toString(), CmbEdadN.getSelectedItem().toString(), TxtSinopsisL.getText(), TxtDuracionL.getText(), CmbFormatoN.getSelectedItem().toString(), CmbGeneroN.getSelectedItem().toString(), CmbIdiomaN.getSelectedItem().toString(), TxtPrecioAdultosL.getText(), TxtPrecioNiñosL.getText(), TxtPrecioAncianosL.getText(), TxtFechaL.getText(), TxtURL.getText());
        if (Validar == true) {
            JOptionPane.showMessageDialog(null, "Se modifico la pelicula correctamente");

        } else {
            JOptionPane.showMessageDialog(null, "No se pudo modifico la pelicula");
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void TxtPrecioNiñosLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrecioNiñosLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrecioNiñosLActionPerformed

    private void CmbIdiomaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbIdiomaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbIdiomaNActionPerformed

    private void TxtFormatoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFormatoLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFormatoLActionPerformed

    private void TxtDuracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDuracionLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDuracionLActionPerformed

    private void TxtHorario3LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHorario3LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHorario3LActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        boolean Validar = false;
        Validar = Listar();
        if (Validar == true) {
        } else {
            JOptionPane.showMessageDialog(null, "Codigo no existe");
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    public boolean ModificarPelicula(String codigo, String nombre, String horario1, String horario2, String horario3, String salon, String edad, String sinopsis, String duracion, String formato, String genero, String idioma, String precioAdultos, String precioNiños, String precioAncianos, String fecha, String url) {
        if (BuscarCodigo() != null) {
            for (int i = 0; i < Peliculas.size(); i++) {
                Peliculas.get(i).setNombre(nombre);
                Peliculas.get(i).setHorario1(horario1);
                Peliculas.get(i).setHorario2(horario2);
                Peliculas.get(i).setHorario3(horario3);
                Peliculas.get(i).setSalon(salon);
                Peliculas.get(i).setEdad(edad);
                Peliculas.get(i).setSinopsis(sinopsis);
                Peliculas.get(i).setDuracion(duracion);
                Peliculas.get(i).setFormato(formato);
                Peliculas.get(i).setGenero(genero);
                Peliculas.get(i).setIdioma(idioma);
                Peliculas.get(i).setPrecioAdultos(precioAdultos);
                Peliculas.get(i).setPrecioNiños(precioNiños);
                Peliculas.get(i).setPrecioAncianos(precioAncianos);
                Peliculas.get(i).setFecha(fecha);
                Peliculas.get(i).setURL(url);
                return true;
            }
        }
        return false;
    }

    public RegistroPeliculas BuscarCodigo() {
        for (RegistroPeliculas registro : Peliculas) {
            if (TxtCodigoL.getText().equals(registro.getCodigo())) {
                return registro;
            }
        }
        return null;
    }

    public boolean Listar() {
        for (int i = 0; i < Peliculas.size(); i++) {
            if (TxtCodigoL.getText().equals(Peliculas.get(i).getCodigo())) {
                TxtNombreL.setText(Peliculas.get(i).getNombre());
                TxtHorario1L.setText(Peliculas.get(i).getHorario1());
                TxtHorario2L.setText(Peliculas.get(i).getHorario2());
                TxtHorario3L.setText(Peliculas.get(i).getHorario3());
                TxtSalonL.setText(Peliculas.get(i).getSalon());
                TxtEdadL.setText(Peliculas.get(i).getEdad());
                TxtSinopsisL.setText(Peliculas.get(i).getSinopsis());
                TxtDuracionL.setText(Peliculas.get(i).getDuracion());
                TxtFormatoL.setText(Peliculas.get(i).getFormato());
                TxtGeneroL.setText(Peliculas.get(i).getGenero());
                TxtIdiomaL.setText(Peliculas.get(i).getIdioma());
                TxtPrecioAdultosL.setText(Peliculas.get(i).getPrecioAdultos());
                TxtPrecioNiñosL.setText(Peliculas.get(i).getPrecioNiños());
                TxtPrecioAncianosL.setText(Peliculas.get(i).getPrecioAncianos());
                TxtFechaL.setText(Peliculas.get(i).getFecha());
                TxtURL.setText(Peliculas.get(i).getURL());
                ImageIcon Poster = new ImageIcon(Peliculas.get(i).getURL());
                ModificarImagen.setIcon(Poster);
                return true;
            }
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCerrarSesion;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificarImagen;
    private javax.swing.JComboBox<String> CmbEdadN;
    private javax.swing.JComboBox<String> CmbFormatoN;
    private javax.swing.JComboBox<String> CmbGeneroN;
    private javax.swing.JComboBox<String> CmbIdiomaN;
    private javax.swing.JComboBox<String> CmbSalonN;
    private javax.swing.JLabel ModificarImagen;
    private javax.swing.JTextField TxtCodigoL;
    private javax.swing.JTextField TxtDuracionL;
    private javax.swing.JTextField TxtEdadL;
    private javax.swing.JTextField TxtFechaL;
    private javax.swing.JTextField TxtFormatoL;
    private javax.swing.JTextField TxtGeneroL;
    private javax.swing.JTextField TxtHorario1L;
    private javax.swing.JTextField TxtHorario2L;
    private javax.swing.JTextField TxtHorario3L;
    private javax.swing.JTextField TxtIdiomaL;
    private javax.swing.JTextField TxtNombreL;
    private javax.swing.JTextField TxtPrecioAdultosL;
    private javax.swing.JTextField TxtPrecioAncianosL;
    private javax.swing.JTextField TxtPrecioNiñosL;
    private javax.swing.JTextField TxtSalonL;
    private javax.swing.JTextField TxtSinopsisL;
    private javax.swing.JTextField TxtURL;
    private javax.swing.JLabel TxtUsuarioLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
