/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendGestionInventario;

import backend.Usuario;

/**
 *
 * @author Aidis
 */
public class VentanaRegistroPedido extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaRegistroPedido(Usuario user) {
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
        jTextFieldBornDay = new javax.swing.JTextField();
        jLabelBornDay = new javax.swing.JLabel();
        jLabelAsterisco4 = new javax.swing.JLabel();
        jLabelAsterisco5 = new javax.swing.JLabel();
        jLabelNombre2 = new javax.swing.JLabel();
        jSeparatorUsuario1 = new javax.swing.JSeparator();
        jLabelNombre10 = new javax.swing.JLabel();
        jTextFieldBornDay1 = new javax.swing.JTextField();
        jLabelBornDay1 = new javax.swing.JLabel();
        jTextFieldBuscar1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelNombre6 = new javax.swing.JLabel();
        jButtonGenerar1 = new javax.swing.JButton();
        jTextFieldNombre2 = new javax.swing.JTextField();
        jLabelAsterisco11 = new javax.swing.JLabel();
        jLabelDireccion1 = new javax.swing.JLabel();
        jLabelAsterisco12 = new javax.swing.JLabel();
        jTextFieldNombre5 = new javax.swing.JTextField();
        jLabelNombre3 = new javax.swing.JLabel();
        jPaneMenuLateral = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
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
        jLabelNombre1.setText("CODIGO");
        jPanelMenu.add(jLabelNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabelAsterisco1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco1.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco1.setText("*");
        jPanelMenu.add(jLabelAsterisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jTextFieldBornDay.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldBornDay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldBornDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBornDayActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldBornDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 110, 30));

        jLabelBornDay.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBornDay.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelBornDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBornDay.setText("ALMACENISTA");
        jPanelMenu.add(jLabelBornDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        jLabelAsterisco4.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco4.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco4.setText("*");
        jPanelMenu.add(jLabelAsterisco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jLabelAsterisco5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco5.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco5.setText("*");
        jPanelMenu.add(jLabelAsterisco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 160, 0, -1));

        jLabelNombre2.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconSearch.png"))); // NOI18N
        jPanelMenu.add(jLabelNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, 30));

        jSeparatorUsuario1.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 100, 10));

        jLabelNombre10.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre10.setOpaque(true);
        jPanelMenu.add(jLabelNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 100, 30));

        jTextFieldBornDay1.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldBornDay1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldBornDay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBornDay1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldBornDay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 180, 30));

        jLabelBornDay1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBornDay1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelBornDay1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBornDay1.setText("FECHA");
        jPanelMenu.add(jLabelBornDay1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

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
        jPanelMenu.add(jTextFieldBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 380, 30));

        jScrollPane2.setBackground(new java.awt.Color(220, 220, 220));
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTable1.setBackground(new java.awt.Color(220, 220, 220));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIPCIÓN", "PRECIO", "CANTIDAD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setFillsViewportHeight(true);
        jTable1.setGridColor(new java.awt.Color(255, 102, 51));
        jTable1.setName(""); // NOI18N
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        jPanelMenu.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 780, 200));

        jLabelNombre6.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre6.setText("PRODUCTO");
        jPanelMenu.add(jLabelNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 30));

        jButtonGenerar1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGenerar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGenerar1.setText("TOTAL");
        jButtonGenerar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonGenerar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGenerar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGenerar1MouseClicked(evt);
            }
        });
        jButtonGenerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerar1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonGenerar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 60, 30));

        jTextFieldNombre2.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre2ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 150, 30));

        jLabelAsterisco11.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco11.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco11.setText("*");
        jPanelMenu.add(jLabelAsterisco11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 10, -1));

        jLabelDireccion1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDireccion1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDireccion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDireccion1.setText("CANTIDAD");
        jPanelMenu.add(jLabelDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        jLabelAsterisco12.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco12.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco12.setText("*");
        jPanelMenu.add(jLabelAsterisco12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 10, -1));

        jTextFieldNombre5.setBackground(new java.awt.Color(220, 220, 220));
        jTextFieldNombre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTextFieldNombre5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombre5ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jTextFieldNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 50, 30));

        jLabelNombre3.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconAddProducto.png"))); // NOI18N
        jPanelMenu.add(jLabelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, 30));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 850, 430));

        jPaneMenuLateral.setBackground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setForeground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPaneMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 253, 1, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 257, 1, 22));

        getContentPane().add(jPaneMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 100, 520));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("FORMULARIO REGISTRO PEDIDO");
        jPanelTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 530, -1));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("Administrador");
        jPanelTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 90));

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

        getContentPane().add(jPaneMenuLateral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 100, 520));

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
        jPanelTitulo1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 120, 40));

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
        jPanelTitulo1.add(jButtonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 40));

        getContentPane().add(jPanelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 850, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBornDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBornDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBornDayActionPerformed

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
                  //Creación objeto ventana Usuarios
        VentanaPrincipalInventario ventanaI = new VentanaPrincipalInventario(user);
        ventanaI.setVisible(true);//mostrar ventana usuarios
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

    private void jTextFieldBornDay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBornDay1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBornDay1ActionPerformed

    private void jTextFieldBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscar1ActionPerformed

    private void jButtonGenerar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGenerar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGenerar1MouseClicked

    private void jButtonGenerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGenerar1ActionPerformed

    private void jTextFieldNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre2ActionPerformed

    private void jTextFieldNombre5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombre5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombre5ActionPerformed

    private Usuario user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonGenerar1;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelAsterisco1;
    private javax.swing.JLabel jLabelAsterisco11;
    private javax.swing.JLabel jLabelAsterisco12;
    private javax.swing.JLabel jLabelAsterisco4;
    private javax.swing.JLabel jLabelAsterisco5;
    private javax.swing.JLabel jLabelBornDay;
    private javax.swing.JLabel jLabelBornDay1;
    private javax.swing.JLabel jLabelDireccion1;
    private javax.swing.JLabel jLabelImageExit1;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelMiniUser2;
    private javax.swing.JLabel jLabelNombre1;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre2;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelUserName1;
    private javax.swing.JLabel jLabelWindowTitle;
    private javax.swing.JPanel jPaneMenuLateral;
    private javax.swing.JPanel jPaneMenuLateral1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelTitulo1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSeparator jSeparatorUsuario1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBornDay;
    private javax.swing.JTextField jTextFieldBornDay1;
    private javax.swing.JTextField jTextFieldBuscar1;
    private javax.swing.JTextField jTextFieldNombre2;
    private javax.swing.JTextField jTextFieldNombre5;
    // End of variables declaration//GEN-END:variables
}
