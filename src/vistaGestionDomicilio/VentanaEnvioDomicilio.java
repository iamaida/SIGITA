/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGestionDomicilio;

import modeloGestionUsuario.Usuario;

/**
 *
 * @author Aidis
 */
public class VentanaEnvioDomicilio extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaEnvioDomicilio(Usuario user) {
        initComponents();
        //Centra la ventana
        this.setLocationRelativeTo(null);
        this.user = new Usuario();
        this.user = user;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelMenu = new javax.swing.JPanel();
        jLabelNombre1 = new javax.swing.JLabel();
        jLabelAsterisco1 = new javax.swing.JLabel();
        jTextFieldNombre1 = new javax.swing.JTextField();
        jTextFieldBornDay = new javax.swing.JTextField();
        jLabelBornDay = new javax.swing.JLabel();
        jLabelAsterisco4 = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelAsterisco5 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jLabelNombre4 = new javax.swing.JLabel();
        jTextFieldBuscar1 = new javax.swing.JTextField();
        jLabelNombre5 = new javax.swing.JLabel();
        jTextFieldBuscar2 = new javax.swing.JTextField();
        jLabelNombre6 = new javax.swing.JLabel();
        jSeparatorUsuario2 = new javax.swing.JSeparator();
        jLabelNombre12 = new javax.swing.JLabel();
        jLabelDireccion1 = new javax.swing.JLabel();
        jLabelNombre13 = new javax.swing.JLabel();
        jSeparatorUsuario3 = new javax.swing.JSeparator();
        jLabelNombre7 = new javax.swing.JLabel();
        jLabelNombre8 = new javax.swing.JLabel();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jLabelNombre9 = new javax.swing.JLabel();
        jTextFieldNombre3 = new javax.swing.JTextField();
        jTextFieldNombre4 = new javax.swing.JTextField();
        jLabelNombre14 = new javax.swing.JLabel();
        jLabelAsterisco6 = new javax.swing.JLabel();
        jLabelAsterisco7 = new javax.swing.JLabel();
        jLabelAsterisco8 = new javax.swing.JLabel();
        jLabelNombre11 = new javax.swing.JLabel();
        jLabelAsterisco9 = new javax.swing.JLabel();
        jTextFieldNombre5 = new javax.swing.JTextField();
        jLabelBornDay1 = new javax.swing.JLabel();
        jLabelAsterisco10 = new javax.swing.JLabel();
        jTextFieldBornDay1 = new javax.swing.JTextField();
        jTextFieldNombre6 = new javax.swing.JTextField();
        jLabelAsterisco11 = new javax.swing.JLabel();
        jLabelNombre10 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanelTitulo1 = new javax.swing.JPanel();
        jLabelUserName1 = new javax.swing.JLabel();
        jLabelImageExit1 = new javax.swing.JLabel();
        jLabelMiniUser2 = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jButtonGenerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre1.setText("CONTACTO");
        jPanelMenu.add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jLabelAsterisco1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco1.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco1.setText("*");
        jPanelMenu.add(jLabelAsterisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jTextFieldNombre1.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 140, 30));

        jTextFieldBornDay.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldBornDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldBornDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBornDayActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldBornDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 110, 30));

        jLabelBornDay.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBornDay.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelBornDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBornDay.setText("FECHA");
        jPanelMenu.add(jLabelBornDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        jLabelAsterisco4.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco4.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco4.setText("*");
        jPanelMenu.add(jLabelAsterisco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        jLabelDireccion.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDireccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDireccion.setText("CODIGO");
        jPanelMenu.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        jLabelAsterisco5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco5.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco5.setText("*");
        jPanelMenu.add(jLabelAsterisco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 160, 0, -1));

        jLabelNombre2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconAddBill.png"))); // NOI18N
        jPanelMenu.add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, -1, 30));

        jLabelNombre4.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre4.setText("INFORMACIÓN DOMICILIARIO:");
        jPanelMenu.add(jLabelNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        jTextFieldBuscar1.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldBuscar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldBuscar1.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscar1.setText("Buscar");
        jTextFieldBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscar1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 240, 30));

        jLabelNombre5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconsAddUser.png"))); // NOI18N
        jPanelMenu.add(jLabelNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, 30));

        jTextFieldBuscar2.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldBuscar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldBuscar2.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldBuscar2.setText("Buscar");
        jTextFieldBuscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscar2ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 30));

        jLabelNombre6.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre6.setText("FACTURA");
        jPanelMenu.add(jLabelNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 90, 30));

        jSeparatorUsuario2.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 60, 10));

        jLabelNombre12.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre12.setOpaque(true);
        jPanelMenu.add(jLabelNombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 60, 30));

        jLabelDireccion1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDireccion1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDireccion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDireccion1.setText("NOMBRE ");
        jPanelMenu.add(jLabelDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabelNombre13.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre13.setOpaque(true);
        jPanelMenu.add(jLabelNombre13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 220, 30));

        jSeparatorUsuario3.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, 10));

        jLabelNombre7.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre7.setText(" CLIENTE");
        jPanelMenu.add(jLabelNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jLabelNombre8.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre8.setText("CODIGO");
        jPanelMenu.add(jLabelNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jTextFieldNombre2.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre2ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 150, 30));

        jLabelNombre9.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre9.setText("HORA");
        jPanelMenu.add(jLabelNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 20));

        jTextFieldNombre3.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre3ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 190, 30));

        jTextFieldNombre4.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre4ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 160, 30));

        jLabelNombre14.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre14.setText("C.C");
        jPanelMenu.add(jLabelNombre14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabelAsterisco6.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco6.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco6.setText("*");
        jPanelMenu.add(jLabelAsterisco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 10, -1));

        jLabelAsterisco7.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco7.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco7.setText("*");
        jPanelMenu.add(jLabelAsterisco7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 10, -1));

        jLabelAsterisco8.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco8.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco8.setText("*");
        jPanelMenu.add(jLabelAsterisco8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, 20));

        jLabelNombre11.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre11.setText("NOMBRE");
        jPanelMenu.add(jLabelNombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabelAsterisco9.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco9.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco9.setText("*");
        jPanelMenu.add(jLabelAsterisco9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jTextFieldNombre5.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre5ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 190, 30));

        jLabelBornDay1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBornDay1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelBornDay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBornDay1.setText("FECHA");
        jPanelMenu.add(jLabelBornDay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, -1, -1));

        jLabelAsterisco10.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco10.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco10.setText("*");
        jPanelMenu.add(jLabelAsterisco10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 10, -1));

        jTextFieldBornDay1.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldBornDay1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldBornDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBornDay1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldBornDay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 110, 30));

        jTextFieldNombre6.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre6ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 190, 30));

        jLabelAsterisco11.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco11.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco11.setText("*");
        jPanelMenu.add(jLabelAsterisco11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 10, 20));

        jLabelNombre10.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre10.setText("COSTO");
        jPanelMenu.add(jLabelNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, 20));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 850, 380));

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

        getContentPane().add(jPaneMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 510));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("FORMULARIO ENVIO DOMICILIO");
        jPanelTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 510, -1));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("Administrador");
        jPanelTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 110));

        jPaneMenuLateral1.setBackground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral1.setForeground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPaneMenuLateral1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator5.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 253, 1, 10));

        jSeparator7.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 257, 1, 22));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator8.setForeground(new java.awt.Color(255, 102, 51));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 60, 290, 10));

        jSeparator9.setForeground(new java.awt.Color(255, 102, 51));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 10));

        jPaneMenuLateral1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 10));

        getContentPane().add(jPaneMenuLateral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 100, 510));

        jPanelTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserName1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName1.setText("Administrador");
        jPanelTitulo1.add(jLabelUserName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));

        jLabelImageExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconExit.png"))); // NOI18N
        jLabelImageExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageExit1MouseClicked(evt);
            }
        });
        jPanelTitulo1.add(jLabelImageExit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        jLabelMiniUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo1.add(jLabelMiniUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

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
        jPanelTitulo1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 120, 40));

        jButtonGenerar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonGenerar.setText("GUARDAR");
        jButtonGenerar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerarMouseClicked(evt);
            }
        });
        jButtonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerarActionPerformed(evt);
            }
        });
        jPanelTitulo1.add(jButtonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 130, 40));

        getContentPane().add(jPanelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 850, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre1ActionPerformed

    private void jTextFieldBornDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBornDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBornDayActionPerformed

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
                  //Creación objeto ventana Usuarios
        VentanaPrincipalDomicilio ventanaD = new VentanaPrincipalDomicilio(user);
        ventanaD.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentro
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGenerarMouseClicked

    private void jButtonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGenerarActionPerformed

    private void jLabelImageExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelImageExit1MouseClicked

    private void jTextFieldBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscar1ActionPerformed

    private void jTextFieldBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscar2ActionPerformed

    private void jTextFieldNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre2ActionPerformed

    private void jTextFieldNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre3ActionPerformed

    private void jTextFieldNombre4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre4ActionPerformed

    private void jTextFieldNombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre5ActionPerformed

    private void jTextFieldBornDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBornDay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBornDay1ActionPerformed

    private void jTextFieldNombre6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre6ActionPerformed

   private Usuario user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelAsterisco1;
    private javax.swing.JLabel jLabelAsterisco10;
    private javax.swing.JLabel jLabelAsterisco11;
    private javax.swing.JLabel jLabelAsterisco4;
    private javax.swing.JLabel jLabelAsterisco5;
    private javax.swing.JLabel jLabelAsterisco6;
    private javax.swing.JLabel jLabelAsterisco7;
    private javax.swing.JLabel jLabelAsterisco8;
    private javax.swing.JLabel jLabelAsterisco9;
    private javax.swing.JLabel jLabelBornDay;
    private javax.swing.JLabel jLabelBornDay1;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDireccion1;
    private javax.swing.JLabel jLabelImageExit1;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelMiniUser2;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre11;
    private javax.swing.JLabel jLabelNombre12;
    private javax.swing.JLabel jLabelNombre13;
    private javax.swing.JLabel jLabelNombre14;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre4;
    private javax.swing.JLabel jLabelNombre5;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelNombre7;
    private javax.swing.JLabel jLabelNombre8;
    private javax.swing.JLabel jLabelNombre9;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserName1;
    private javax.swing.JLabel jLabelWindowTitle;
    private javax.swing.JPanel jPaneMenuLateral;
    private javax.swing.JPanel jPaneMenuLateral1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSeparator jSeparatorUsuario2;
    private javax.swing.JSeparator jSeparatorUsuario3;
    private javax.swing.JTextField jTextFieldBornDay;
    private javax.swing.JTextField jTextFieldBornDay1;
    private javax.swing.JTextField jTextFieldBuscar1;
    private javax.swing.JTextField jTextFieldBuscar2;
    private javax.swing.JTextField jTextFieldNombre1;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldNombre3;
    private javax.swing.JTextField jTextFieldNombre4;
    private javax.swing.JTextField jTextFieldNombre5;
    private javax.swing.JTextField jTextFieldNombre6;
    // End of variables declaration//GEN-END:variables
}
