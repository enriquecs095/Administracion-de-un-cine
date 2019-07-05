
package Proyecto;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class VerPeliculas extends javax.swing.JFrame {

   ArrayList<RegistroPeliculas> Peliculas;
       AsientosComprados[] Salon1;
   AsientosComprados2[] Salon2;
   AsientosComprados3[] Salon3;
   
    
    public VerPeliculas(ArrayList<RegistroPeliculas> peliculas,AsientosComprados[] salon1, AsientosComprados2[] salon2, AsientosComprados3[] salon3) {
        initComponents();
         this.Salon1=salon1;
         this.Salon2=salon2;
         this.Salon3=salon3;
        this.setLocationRelativeTo(null);
        this.Peliculas=peliculas;
        //Primera imagen      
        if(Peliculas.size()==1){
        ImageIcon Poster1 = new ImageIcon(Peliculas.get(0).getURL());
        Imagen1.setIcon(Poster1);
        Nombre1.setText(Peliculas.get(0).getNombre());
        Clasificacion1.setText(Peliculas.get(0).getEdad());
        Duracion1.setText(Peliculas.get(0).getDuracion());
        Formato1.setText(Peliculas.get(0).getFormato());
        Genero1.setText(Peliculas.get(0).getGenero());
        Idioma1.setText(Peliculas.get(0).getIdioma());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario1());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario2());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario3());
        Peliculas.get(0).getPrecioAdultos();
        Peliculas.get(0).getPrecioAncianos();
        Peliculas.get(0).getPrecioNiños();
        Peliculas.get(0).getFecha();
        Peliculas.get(0).getSalon();      
        } 
        //Segunnda pelicula
        if(Peliculas.size()==2){    
        ImageIcon Poster1 = new ImageIcon(Peliculas.get(0).getURL());
        Imagen1.setIcon(Poster1);
        Nombre1.setText(Peliculas.get(0).getNombre());
        Clasificacion1.setText(Peliculas.get(0).getEdad());
        Duracion1.setText(Peliculas.get(0).getDuracion());
        Formato1.setText(Peliculas.get(0).getFormato());
        Genero1.setText(Peliculas.get(0).getGenero());
        Idioma1.setText(Peliculas.get(0).getIdioma());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario1());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario2());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario3());
        Peliculas.get(0).getPrecioAdultos();
        Peliculas.get(0).getPrecioAncianos();
        Peliculas.get(0).getPrecioNiños();
        Peliculas.get(0).getFecha();
        Peliculas.get(0).getSalon();     
        ImageIcon Poster2 = new ImageIcon(Peliculas.get(1).getURL());
        Imagen2.setIcon(Poster2);
        Nombre2.setText(Peliculas.get(1).getNombre());
        Clasificacion2.setText(Peliculas.get(1).getEdad());
        Duracion2.setText(Peliculas.get(1).getDuracion());
        Formato2.setText(Peliculas.get(1).getFormato());
        Genero2.setText(Peliculas.get(1).getGenero());
        Idioma2.setText(Peliculas.get(1).getIdioma());
        CmbHorarioCompra2.addItem(Peliculas.get(1).getHorario1());
        CmbHorarioCompra2.addItem(Peliculas.get(1).getHorario2());
        CmbHorarioCompra2.addItem(Peliculas.get(1).getHorario3());
        Peliculas.get(1).getPrecioAdultos();
        Peliculas.get(1).getPrecioAncianos();
        Peliculas.get(1).getPrecioNiños();
        Peliculas.get(1).getFecha();
        Peliculas.get(1).getSalon();
        }
        //Tercera Pelicula
        if(Peliculas.size()==3){ 
        ImageIcon Poster1 = new ImageIcon(Peliculas.get(0).getURL());
        Imagen1.setIcon(Poster1);
        Nombre1.setText(Peliculas.get(0).getNombre());
        Clasificacion1.setText(Peliculas.get(0).getEdad());
        Duracion1.setText(Peliculas.get(0).getDuracion());
        Formato1.setText(Peliculas.get(0).getFormato());
        Genero1.setText(Peliculas.get(0).getGenero());
        Idioma1.setText(Peliculas.get(0).getIdioma());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario1());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario2());
        CmbHorarioCompra1.addItem(Peliculas.get(0).getHorario3());
        Peliculas.get(0).getPrecioAdultos();
        Peliculas.get(0).getPrecioAncianos();
        Peliculas.get(0).getPrecioNiños();
        Peliculas.get(0).getFecha();
        Peliculas.get(0).getSalon();     
        ImageIcon Poster2 = new ImageIcon(Peliculas.get(1).getURL());
        Imagen2.setIcon(Poster2);
        Nombre2.setText(Peliculas.get(1).getNombre());
        Clasificacion2.setText(Peliculas.get(1).getEdad());
        Duracion2.setText(Peliculas.get(1).getDuracion());
        Formato2.setText(Peliculas.get(1).getFormato());
        Genero2.setText(Peliculas.get(1).getGenero());
        Idioma2.setText(Peliculas.get(1).getIdioma());
        CmbHorarioCompra2.addItem(Peliculas.get(1).getHorario1());
        CmbHorarioCompra2.addItem(Peliculas.get(1).getHorario2());
        CmbHorarioCompra2.addItem(Peliculas.get(1).getHorario3());
        Peliculas.get(1).getPrecioAdultos();
        Peliculas.get(1).getPrecioAncianos();
        Peliculas.get(1).getPrecioNiños();
        Peliculas.get(1).getFecha();
        Peliculas.get(1).getSalon();    
        ImageIcon Poster3 = new ImageIcon(Peliculas.get(2).getURL());
        Imagen3.setIcon(Poster3);
        Nombre3.setText(Peliculas.get(2).getNombre());
        Clasificacion3.setText(Peliculas.get(2).getEdad());
        Duracion3.setText(Peliculas.get(2).getDuracion());
        Formato3.setText(Peliculas.get(2).getFormato());
        Genero3.setText(Peliculas.get(2).getGenero());
        Idioma3.setText(Peliculas.get(2).getIdioma());
        CmbHorarioCompra3.addItem(Peliculas.get(2).getHorario1());
        CmbHorarioCompra3.addItem(Peliculas.get(2).getHorario2());
        CmbHorarioCompra3.addItem(Peliculas.get(2).getHorario3());
        Peliculas.get(2).getPrecioAdultos();
        Peliculas.get(2).getPrecioAncianos();
        Peliculas.get(2).getPrecioNiños();
        Peliculas.get(2).getFecha();
        Peliculas.get(2).getSalon();
        }
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setExtendedState(MAXIMIZED_BOTH);
        jPanel1.setBackground(Color.GRAY);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Clasificacion1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CmbHorarioCompra1 = new javax.swing.JComboBox<>();
        BtnComprarBoletos1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Duracion1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Formato1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Genero1 = new javax.swing.JLabel();
        Idioma1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Idioma3 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Clasificacion3 = new javax.swing.JLabel();
        Duracion3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Formato3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Genero3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CmbHorarioCompra3 = new javax.swing.JComboBox<>();
        BtnComprarBoletos3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        BtnComprarBoletos2 = new javax.swing.JButton();
        Genero2 = new javax.swing.JLabel();
        Idioma2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Clasificacion2 = new javax.swing.JLabel();
        Duracion2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Formato2 = new javax.swing.JLabel();
        CmbHorarioCompra2 = new javax.swing.JComboBox<>();
        Imagen3 = new javax.swing.JLabel();
        Imagen2 = new javax.swing.JLabel();
        Imagen1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Nombre: ");

        jLabel5.setText("Clasificacion: ");

        jLabel7.setText("Seleccione Horario: ");

        BtnComprarBoletos1.setText("Comprar Tickets");
        BtnComprarBoletos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarBoletos1ActionPerformed(evt);
            }
        });

        jLabel20.setText("Duracion(minutos):");

        jLabel22.setText("Formato:");

        jLabel24.setText("Genero:");

        jLabel27.setText("Idioma:");

        jLabel28.setText("Idioma:");

        jLabel4.setText("Nombre: ");

        jLabel6.setText("Clasificacion: ");

        jLabel21.setText("Duracion(minutos):");

        jLabel23.setText("Formato:");

        jLabel25.setText("Genero:");

        jLabel8.setText("Seleccione Horario: ");

        BtnComprarBoletos3.setText("Comprar Tickets");
        BtnComprarBoletos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarBoletos3ActionPerformed(evt);
            }
        });

        jLabel26.setText("Genero:");

        BtnComprarBoletos2.setText("Comprar Tickets");
        BtnComprarBoletos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarBoletos2ActionPerformed(evt);
            }
        });

        jLabel29.setText("Idioma:");

        jLabel9.setText("Nombre: ");

        jLabel10.setText("Clasificacion: ");

        jLabel30.setText("Duracion(minutos):");

        jLabel11.setText("Seleccione Horario: ");

        jLabel31.setText("Formato:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Peliculas Disponibles");

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(BtnComprarBoletos1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(48, 48, 48)
                                    .addComponent(CmbHorarioCompra1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel20)
                                            .addGap(54, 54, 54))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addGap(56, 56, 56)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Formato1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(83, 83, 83))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Idioma1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Clasificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, 6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(CmbHorarioCompra2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnComprarBoletos2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(302, 302, 302))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel29))
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Idioma2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Clasificacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Duracion2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Formato2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Genero2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(174, 174, 174))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addGap(46, 46, 46)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Clasificacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Duracion3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Formato3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Genero3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Imagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)))
                            .addGap(109, 109, 109))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addGap(75, 75, 75)
                                    .addComponent(Idioma3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel21)
                                .addComponent(jLabel23)
                                .addComponent(jLabel25)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(CmbHorarioCompra3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(112, 112, 112)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BtnComprarBoletos3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagen3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imagen2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imagen1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clasificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(Duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(Formato1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(Genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(Idioma1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(CmbHorarioCompra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Clasificacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Clasificacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10)))))
                                    .addComponent(Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel21)
                                    .addComponent(Duracion3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(Duracion2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel23)
                                    .addComponent(Formato3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Formato2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25)
                                    .addComponent(Genero3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Genero2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel28)
                                    .addComponent(Idioma3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Idioma2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbHorarioCompra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CmbHorarioCompra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnComprarBoletos3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnComprarBoletos2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnComprarBoletos1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
      MenuPrincipal llamar=new MenuPrincipal(Peliculas,Salon1, Salon2, Salon3);
      llamar.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed


    
    private void BtnComprarBoletos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarBoletos1ActionPerformed
   Pagos llamar=new Pagos(Peliculas, Peliculas.get(0).getNombre(), Peliculas.get(0).getIdioma(), Peliculas.get(0).getPrecioAdultos(), Peliculas.get(0).getPrecioAncianos(), Peliculas.get(0).getPrecioNiños(),Peliculas.get(0).getFecha(), Peliculas.get(0).getSalon() , CmbHorarioCompra1.getSelectedItem().toString(),Salon1, Salon2, Salon3);
    llamar.setVisible(true);
    this.dispose();
    
    }//GEN-LAST:event_BtnComprarBoletos1ActionPerformed

    private void BtnComprarBoletos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarBoletos3ActionPerformed
    Pagos llamar=new Pagos(Peliculas, Peliculas.get(2).getNombre(), Peliculas.get(2).getIdioma(), Peliculas.get(2).getPrecioAdultos(), Peliculas.get(2).getPrecioAncianos(), Peliculas.get(2).getPrecioNiños(),Peliculas.get(2).getFecha(), Peliculas.get(2).getSalon(),CmbHorarioCompra3.getSelectedItem().toString(),Salon1, Salon2, Salon3 );
    llamar.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_BtnComprarBoletos3ActionPerformed

    private void BtnComprarBoletos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarBoletos2ActionPerformed
    Pagos llamar=new Pagos(Peliculas, Peliculas.get(1).getNombre(), Peliculas.get(1).getIdioma(), Peliculas.get(1).getPrecioAdultos(), Peliculas.get(1).getPrecioAncianos(), Peliculas.get(1).getPrecioNiños(),Peliculas.get(1).getFecha(), Peliculas.get(1).getSalon(),CmbHorarioCompra2.getSelectedItem().toString(),Salon1, Salon2, Salon3 );
    llamar.setVisible(true);
    this.dispose();

    }//GEN-LAST:event_BtnComprarBoletos2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnComprarBoletos1;
    private javax.swing.JButton BtnComprarBoletos2;
    private javax.swing.JButton BtnComprarBoletos3;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel Clasificacion1;
    private javax.swing.JLabel Clasificacion2;
    private javax.swing.JLabel Clasificacion3;
    private javax.swing.JComboBox<String> CmbHorarioCompra1;
    private javax.swing.JComboBox<String> CmbHorarioCompra2;
    private javax.swing.JComboBox<String> CmbHorarioCompra3;
    private javax.swing.JLabel Duracion1;
    private javax.swing.JLabel Duracion2;
    private javax.swing.JLabel Duracion3;
    private javax.swing.JLabel Formato1;
    private javax.swing.JLabel Formato2;
    private javax.swing.JLabel Formato3;
    private javax.swing.JLabel Genero1;
    private javax.swing.JLabel Genero2;
    private javax.swing.JLabel Genero3;
    private javax.swing.JLabel Idioma1;
    private javax.swing.JLabel Idioma2;
    private javax.swing.JLabel Idioma3;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JLabel Imagen3;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Nombre3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
