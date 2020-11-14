/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendGestionDomicilio;

import modeloGestionUsuario.Usuario;

/**
 *
 * @author Aidis
 */
public class VentanaVerDomicilio extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaVerDomicilio(Usuario user) {
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
        jLabelBornDay = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelAsterisco5 = new javax.swing.JLabel();
        jTextFieldBuscar2 = new javax.swing.JTextField();
        jLabelNombre6 = new javax.swing.JLabel();
        jSeparatorUsuario2 = new javax.swing.JSeparator();
        jLabelNombre12 = new javax.swing.JLabel();
        jLabelNombre7 = new javax.swing.JLabel();
        jLabelNombre11 = new javax.swing.JLabel();
        jLabelNombre15 = new javax.swing.JLabel();
        jLabelNombre16 = new javax.swing.JLabel();
        jSeparatorUsuario5 = new javax.swing.JSeparator();
        jLabelNombre3 = new javax.swing.JLabel();
        jLabelNombre10 = new javax.swing.JLabel();
        jLabelNombre17 = new javax.swing.JLabel();
        jSeparatorUsuario6 = new javax.swing.JSeparator();
        jButtonGenerar = new javax.swing.JButton();
        jLabelNombre13 = new javax.swing.JLabel();
        jSeparatorUsuario3 = new javax.swing.JSeparator();
        jSeparatorUsuario4 = new javax.swing.JSeparator();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBornDay.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBornDay.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelBornDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBornDay.setText("FECHA");
        jPanelMenu.add(jLabelBornDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, -1));

        jLabelDireccion.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDireccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDireccion.setText("COD");
        jPanelMenu.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabelAsterisco5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco5.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco5.setText("*");
        jPanelMenu.add(jLabelAsterisco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 160, 0, -1));

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
        jPanelMenu.add(jTextFieldBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 270, 30));

        jLabelNombre6.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre6.setText("HORA");
        jPanelMenu.add(jLabelNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 90, 30));

        jSeparatorUsuario2.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 60, 10));

        jLabelNombre12.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre12.setOpaque(true);
        jPanelMenu.add(jLabelNombre12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 60, 30));

        jLabelNombre7.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre7.setText("DOMICILIO");
        jPanelMenu.add(jLabelNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 30));

        jLabelNombre11.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre11.setText("ESTADO");
        jPanelMenu.add(jLabelNombre11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabelNombre15.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jLabelNombre15.setOpaque(true);
        jPanelMenu.add(jLabelNombre15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 60, 30));

        jLabelNombre16.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre16.setOpaque(true);
        jPanelMenu.add(jLabelNombre16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 60, 30));

        jSeparatorUsuario5.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 60, 10));

        jLabelNombre3.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconSearch.png"))); // NOI18N
        jPanelMenu.add(jLabelNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, -1, 30));

        jLabelNombre10.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconSearch.png"))); // NOI18N
        jPanelMenu.add(jLabelNombre10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 40, 30));

        jLabelNombre17.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre17.setOpaque(true);
        jPanelMenu.add(jLabelNombre17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 60, 30));

        jSeparatorUsuario6.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 60, 10));

        jButtonGenerar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonGenerar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGenerar.setText("CODIGO VERIFICACIÓN");
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
        jPanelMenu.add(jButtonGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 190, 40));

        jLabelNombre13.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre13.setOpaque(true);
        jPanelMenu.add(jLabelNombre13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 60, 30));

        jSeparatorUsuario3.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 60, 10));

        jSeparatorUsuario4.setForeground(new java.awt.Color(255, 102, 51));
        jPanelMenu.add(jSeparatorUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 60, 10));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 610, 290));

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

        getContentPane().add(jPaneMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 510));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("ESTADO DOMICILIO");
        jPanelTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 330, -1));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setText("Administrador");
        jPanelTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, -1, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 160));

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

        getContentPane().add(jPaneMenuLateral1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 200, 510));

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
        jPanelTitulo1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 120, 40));

        getContentPane().add(jPanelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 850, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jTextFieldBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscar2ActionPerformed

    private Usuario user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGenerar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelAsterisco5;
    private javax.swing.JLabel jLabelBornDay;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelImageExit1;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelMiniUser2;
    private javax.swing.JLabel jLabelNombre10;
    private javax.swing.JLabel jLabelNombre11;
    private javax.swing.JLabel jLabelNombre12;
    private javax.swing.JLabel jLabelNombre13;
    private javax.swing.JLabel jLabelNombre15;
    private javax.swing.JLabel jLabelNombre16;
    private javax.swing.JLabel jLabelNombre17;
    private javax.swing.JLabel jLabelNombre3;
    private javax.swing.JLabel jLabelNombre6;
    private javax.swing.JLabel jLabelNombre7;
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
    private javax.swing.JSeparator jSeparatorUsuario4;
    private javax.swing.JSeparator jSeparatorUsuario5;
    private javax.swing.JSeparator jSeparatorUsuario6;
    private javax.swing.JTextField jTextFieldBuscar2;
    // End of variables declaration//GEN-END:variables
}
