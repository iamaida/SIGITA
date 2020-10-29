/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendGestionUsuario;

import frontendMensEmerg.VentanaMensajeError;
import frontendMensEmerg.VentanaMActualizacionNExit;
import frontendMensEmerg.VentanaMActualizacionExit;
import backend.ConexionBaseDatos;
import backend.Usuario;

/**
 *
 * @author Aidis
 */
public class VentanaEdicionUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaEdicionUsuario(Usuario user) {
        initComponents();
        //Centra la ventana
        this.setLocationRelativeTo(null);
        this.user = new Usuario();
        this.user = user;
        System.out.println(user.getNombreUsuario());
        jLabelUserName.setText(user.getNombreUsuario());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jLabelAsterisco = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jLabelAsterisco1 = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldContrasenha = new javax.swing.JTextField();
        jTextFieldCC = new javax.swing.JTextField();
        jLabelCC = new javax.swing.JLabel();
        jLabelAsterisco3 = new javax.swing.JLabel();
        jLabelFechaRegistro = new javax.swing.JLabel();
        jLabelAsterisco4 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelAsterisco5 = new javax.swing.JLabel();
        jLabelAsterisco6 = new javax.swing.JLabel();
        jLabelContrasenha = new javax.swing.JLabel();
        jLabelAsterisco7 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jLabelAsterisco8 = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabelNombreUsuario = new javax.swing.JLabel();
        jLabelAsterisco9 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jPaneMenuLateral = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelWindowTitle = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelMiniUser1 = new javax.swing.JLabel();
        jPaneMenuLateral1 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanelBotones = new javax.swing.JPanel();
        jLabelUserName1 = new javax.swing.JLabel();
        jLabelImageExit1 = new javax.swing.JLabel();
        jLabelMiniUser2 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonInactivar1 = new javax.swing.JButton();
        jPanelTitulo3 = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelBCodigo = new javax.swing.JLabel();
        jBotonBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAsterisco.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco.setText("*");
        jPanelMenu.add(jLabelAsterisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabelTelefono.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTelefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTelefono.setText("TELEFONO");
        jPanelMenu.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jTextFieldNombreUsuario.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombreUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldNombreUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreUsuarioActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 180, 30));

        jLabelAsterisco1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco1.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco1.setText("*");
        jPanelMenu.add(jLabelAsterisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jTextFieldFecha.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldFecha.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 180, 30));

        jTextFieldContrasenha.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldContrasenha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldContrasenha.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldContrasenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldContrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContrasenhaActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 180, 30));

        jTextFieldCC.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldCC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldCC.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCCActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 180, 30));

        jLabelCC.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCC.setText("C.C");
        jPanelMenu.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabelAsterisco3.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco3.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco3.setText("*");
        jPanelMenu.add(jLabelAsterisco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        jLabelFechaRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFechaRegistro.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelFechaRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaRegistro.setText("FECHA REGISTRO");
        jPanelMenu.add(jLabelFechaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabelAsterisco4.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco4.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco4.setText("*");
        jPanelMenu.add(jLabelAsterisco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 10, -1));

        jTextFieldDireccion.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldDireccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldDireccion.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 180, 30));

        jLabelDireccion.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDireccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDireccion.setText("DIRECCIÓN");
        jPanelMenu.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabelAsterisco5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco5.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco5.setText("*");
        jPanelMenu.add(jLabelAsterisco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 160, 0, -1));

        jLabelAsterisco6.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco6.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco6.setText("*");
        jPanelMenu.add(jLabelAsterisco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jLabelContrasenha.setBackground(new java.awt.Color(0, 0, 0));
        jLabelContrasenha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelContrasenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContrasenha.setText("CONTRASEÑA");
        jPanelMenu.add(jLabelContrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, -1, -1));

        jLabelAsterisco7.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco7.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco7.setText("*");
        jPanelMenu.add(jLabelAsterisco7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 10, -1));

        jTextFieldTelefono.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldTelefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldTelefono.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 180, 30));

        jLabelCargo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCargo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCargo.setText("CARGO");
        jPanelMenu.add(jLabelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabelAsterisco8.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco8.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco8.setText("*");
        jPanelMenu.add(jLabelAsterisco8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jTextFieldCargo.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldCargo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldCargo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCargoActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 180, 30));

        jLabelNombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombreUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreUsuario.setText("USUARIO");
        jPanelMenu.add(jLabelNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabelAsterisco9.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco9.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco9.setText("*");
        jPanelMenu.add(jLabelAsterisco9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 10, -1));

        jTextFieldNombre.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 590, 30));

        jLabelNombre.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("NOMBRE");
        jPanelMenu.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 850, 370));

        jPaneMenuLateral.setBackground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setForeground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPaneMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 253, 1, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 257, 1, 22));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setForeground(new java.awt.Color(255, 102, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 60, 290, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 102, 51));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 10));

        jPaneMenuLateral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 10));

        getContentPane().add(jPaneMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 460));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("FORMULARIO EDICIÓN USUARIO");
        jPanelTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 510, 40));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("Administrador");
        jPanelTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, -1, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, 40));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 70));

        jPaneMenuLateral1.setBackground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral1.setForeground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPaneMenuLateral1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 253, 1, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 257, 1, 22));

        getContentPane().add(jPaneMenuLateral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 100, 460));

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserName1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName1.setText("Administrador");
        jPanelBotones.add(jLabelUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));

        jLabelImageExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconExit.png"))); // NOI18N
        jLabelImageExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageExit1MouseClicked(evt);
            }
        });
        jPanelBotones.add(jLabelImageExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        jLabelMiniUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelBotones.add(jLabelMiniUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 120, 40));

        jButtonGuardar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGuardarMouseClicked(evt);
            }
        });
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 40));

        jButtonInactivar1.setBackground(new java.awt.Color(204, 204, 255));
        jButtonInactivar1.setText("INACTIVAR");
        jButtonInactivar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonInactivar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInactivar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInactivar1MouseClicked(evt);
            }
        });
        jButtonInactivar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInactivar1ActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonInactivar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 130, 40));

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 850, 80));

        jPanelTitulo3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldBuscar.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldBuscar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextFieldBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldBuscar.setText("Buscar");
        jTextFieldBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldBuscarFocusGained(evt);
            }
        });
        jTextFieldBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarMouseClicked(evt);
            }
        });
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        jPanelTitulo3.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 380, 30));

        jLabelBCodigo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBCodigo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelBCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBCodigo.setText("CODIGO");
        jPanelTitulo3.add(jLabelBCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 30));

        jBotonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jBotonBuscar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jBotonBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconSearch.png"))); // NOI18N
        jBotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotonBuscarMouseClicked(evt);
            }
        });
        jPanelTitulo3.add(jBotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, 30));

        getContentPane().add(jPanelTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreUsuarioActionPerformed

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldContrasenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContrasenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContrasenhaActionPerformed

    private void jTextFieldCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCCActionPerformed

    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCargoActionPerformed

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
                  //Creación objeto ventana VentanaPrincipalUsuario
        VentanaPrincipalUsuario ventanaUsuarios = new VentanaPrincipalUsuario(user);
        ventanaUsuarios.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentro
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jLabelImageExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImageExit1MouseClicked

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGuardarMouseClicked
        boolean comp = true;
        ConexionBaseDatos conexionBD = new ConexionBaseDatos();
        
        String codigo = jTextFieldBuscar.getText();
                
        String nombre =jTextFieldNombre.getText();
        conexionBD.actualizarUsuario("nombre", nombre, codigo);
        comp= comp && conexionBD.getDatoEncontrado();
        
        String docid= jTextFieldCC.getText();
        conexionBD.actualizarUsuario("docid", docid, codigo);
        comp= comp && conexionBD.getDatoEncontrado();
        
        String nomU= jTextFieldNombreUsuario.getText();
        conexionBD.actualizarUsuario("nombreusuario",nomU,codigo);
        comp= comp && conexionBD.getDatoEncontrado();
        
        String password= jTextFieldContrasenha.getText();
        conexionBD.actualizarUsuario("contrasenha",password,codigo);
        comp= comp && conexionBD.getDatoEncontrado();
        
        String fecha= jTextFieldFecha.getText();
        conexionBD.actualizarUsuario("fecharegistro",fecha,codigo);
        comp= comp && conexionBD.getDatoEncontrado();
        
        String direccion= jTextFieldDireccion.getText();
        conexionBD.actualizarUsuario("direccion",direccion,codigo);
        comp= comp && conexionBD.getDatoEncontrado();
        
        String tel= jTextFieldTelefono.getText();
        conexionBD.actualizarUsuario("telefono",tel,codigo);
        comp= comp && conexionBD.getDatoEncontrado();
        
        String cargo= jTextFieldCargo.getText();
        conexionBD.actualizarUsuario("cargo",cargo,codigo);
        comp= comp && conexionBD.getDatoEncontrado();

        compActualizacion(comp);
        
    }//GEN-LAST:event_jButtonGuardarMouseClicked
    private void compActualizacion(boolean comp)
    {
        if(comp)
        {
            VentanaMActualizacionExit  vMAE= new VentanaMActualizacionExit();
            vMAE.setVisible(true);
        }else
        {
            VentanaMActualizacionNExit  vMANE= new VentanaMActualizacionNExit();
            vMANE.setVisible(true);
        }
    }
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonInactivar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInactivar1MouseClicked
        boolean comp = true;
        ConexionBaseDatos conexionBD = new ConexionBaseDatos();
        
        String codigo = jTextFieldBuscar.getText();  
        conexionBD.actualizarUsuario("estado", "Inactivo",codigo);
        
        comp= comp && conexionBD.getDatoEncontrado();
        compActualizacion(comp);
        
    }//GEN-LAST:event_jButtonInactivar1MouseClicked

    private void jButtonInactivar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInactivar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInactivar1ActionPerformed

    private void jTextFieldBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscarFocusGained
        
    }//GEN-LAST:event_jTextFieldBuscarFocusGained

    private void jBotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonBuscarMouseClicked
       ConexionBaseDatos conexionBD = new ConexionBaseDatos();
       conexionBD.consultarUsuario(jTextFieldBuscar.getText());
        
       Usuario miUsuario = conexionBD.consultarUsuario(jTextFieldBuscar.getText());
       if(conexionBD.getDatoEncontrado())
       { 
            jTextFieldNombre.setText(miUsuario.getNombre());
            jTextFieldCC.setText(miUsuario.getDocId());
            jTextFieldNombreUsuario.setText(miUsuario.getNombreUsuario());
            jTextFieldContrasenha.setText(miUsuario.getContrasenha());
            jTextFieldFecha.setText(miUsuario.getFechaRegistro());
            jTextFieldDireccion.setText(miUsuario.getDireccion());
            jTextFieldTelefono.setText(miUsuario.getTelefono());
            jTextFieldCargo.setText(miUsuario.getCargo());
       }else
       {
           VentanaMensajeError mensajeError = new VentanaMensajeError();
           mensajeError.setVisible(true);
            jTextFieldNombre.setText("");
            jTextFieldCC.setText("");
            jTextFieldNombreUsuario.setText("");
            jTextFieldContrasenha.setText("");
            jTextFieldFecha.setText("");
            jTextFieldDireccion.setText("");
            jTextFieldTelefono.setText("");
            jTextFieldCargo.setText("");
           
       }
    }//GEN-LAST:event_jBotonBuscarMouseClicked

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
            jTextFieldBuscar.setText(""); 
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

   private Usuario user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBotonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonInactivar1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelAsterisco;
    private javax.swing.JLabel jLabelAsterisco1;
    private javax.swing.JLabel jLabelAsterisco3;
    private javax.swing.JLabel jLabelAsterisco4;
    private javax.swing.JLabel jLabelAsterisco5;
    private javax.swing.JLabel jLabelAsterisco6;
    private javax.swing.JLabel jLabelAsterisco7;
    private javax.swing.JLabel jLabelAsterisco8;
    private javax.swing.JLabel jLabelAsterisco9;
    private javax.swing.JLabel jLabelBCodigo;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelContrasenha;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFechaRegistro;
    private javax.swing.JLabel jLabelImageExit1;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelMiniUser2;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserName1;
    private javax.swing.JLabel jLabelWindowTitle;
    private javax.swing.JPanel jPaneMenuLateral;
    private javax.swing.JPanel jPaneMenuLateral1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelTitulo3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCC;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldContrasenha;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
