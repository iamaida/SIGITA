/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontendGestionInventario;

import backend.Usuario;
import frontendGestionUsuario.VentanaLogin;
import frontendGestionReporte.VentanaPrincipalReporte;
import frontendSoporteMenuPrincipal.VentanaPrincipalSoporte;
import frontendGestionVenta.VentanaPrincipalVenta;
import frontendGestionReporte.VentanaReporteAveriaProducto;
import frontendGestionUsuario.VentanaPrincipalUsuario;
import frontendGestionCliente.VentanaPrincipalCliente;

/**
 *
 * @author Aidis
 */
public class VentanaPrincipalInventario extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaPrincipalInventario(Usuario user) {
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

        jPanelMenu = new javax.swing.JPanel();
        jLabelHacerPedido = new javax.swing.JLabel();
        jLabelBuscarProducto = new javax.swing.JLabel();
        jLabelImageProducto = new javax.swing.JLabel();
        jLabelImageAveria = new javax.swing.JLabel();
        jLabelImagePedido1 = new javax.swing.JLabel();
        jLabelHacerPedido1 = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelWindowTitle = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelImageExit = new javax.swing.JLabel();
        jLabelMiniUser1 = new javax.swing.JLabel();
        jPaneMenuLateral = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelMenuUsuarios = new javax.swing.JLabel();
        jLabelMenuVentas = new javax.swing.JLabel();
        jLabelMenuSoporte = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabelMenuReportes = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jLabelMenuInventario = new javax.swing.JLabel();
        jLabelMenuClientes = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHacerPedido.setBackground(new java.awt.Color(0, 0, 0));
        jLabelHacerPedido.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelHacerPedido.setForeground(new java.awt.Color(255, 102, 51));
        jLabelHacerPedido.setText("REPORTAR");
        jPanelMenu.add(jLabelHacerPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabelBuscarProducto.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBuscarProducto.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelBuscarProducto.setForeground(new java.awt.Color(255, 102, 51));
        jLabelBuscarProducto.setText("VER");
        jPanelMenu.add(jLabelBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, 20));

        jLabelImageProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImageProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconProduct.png"))); // NOI18N
        jLabelImageProducto.setPreferredSize(new java.awt.Dimension(34, 34));
        jLabelImageProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageProductoMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelImageProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 120, 110));

        jLabelImageAveria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImageAveria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconChangeProduct.png"))); // NOI18N
        jLabelImageAveria.setPreferredSize(new java.awt.Dimension(34, 34));
        jLabelImageAveria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageAveriaMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelImageAveria, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 150, 130));

        jLabelImagePedido1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelImagePedido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagePedido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconPedido.png"))); // NOI18N
        jLabelImagePedido1.setPreferredSize(new java.awt.Dimension(34, 34));
        jLabelImagePedido1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImagePedido1MouseClicked(evt);
            }
        });
        jPanelMenu.add(jLabelImagePedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 100));

        jLabelHacerPedido1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelHacerPedido1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelHacerPedido1.setForeground(new java.awt.Color(255, 102, 51));
        jLabelHacerPedido1.setText("PEDIR");
        jPanelMenu.add(jLabelHacerPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 810, 480));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("INVENTARIO");
        jPanelTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("Administrador");
        jPanelTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, -1, -1));

        jLabelImageExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconExit.png"))); // NOI18N
        jLabelImageExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelImageExitMouseClicked(evt);
            }
        });
        jPanelTitulo.add(jLabelImageExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        jPaneMenuLateral.setBackground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setForeground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPaneMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 253, 1, 10));

        jLabelMenuUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMenuUsuarios.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniUsers .png"))); // NOI18N
        jLabelMenuUsuarios.setText("USUARIO");
        jLabelMenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuUsuariosMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLabelMenuUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, -1));

        jLabelMenuVentas.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMenuVentas.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelMenuVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniSell.png"))); // NOI18N
        jLabelMenuVentas.setText("VENTA");
        jLabelMenuVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuVentasMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLabelMenuVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, -1));

        jLabelMenuSoporte.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMenuSoporte.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelMenuSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniSetting.png"))); // NOI18N
        jLabelMenuSoporte.setText("SOPORTE ");
        jLabelMenuSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuSoporteMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLabelMenuSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 257, 1, 22));

        jSeparator7.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator10.setForeground(new java.awt.Color(255, 102, 51));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 238, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 102, 51));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 60, 290, 10));

        jSeparator6.setForeground(new java.awt.Color(255, 102, 51));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 10));

        jPaneMenuLateral.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 10));

        jLabelMenuReportes.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMenuReportes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelMenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniForm.png"))); // NOI18N
        jLabelMenuReportes.setText("REPORTE");
        jLabelMenuReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuReportesMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLabelMenuReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 230, 26));

        jSeparator11.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 10));

        jSeparator12.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 10));

        jSeparator13.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 10));

        jLabelMenuInventario.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMenuInventario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelMenuInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniInventory.png"))); // NOI18N
        jLabelMenuInventario.setText("INVENTARIO");
        jLabelMenuInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuInventarioMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLabelMenuInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 40));

        jLabelMenuClientes.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMenuClientes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabelMenuClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniClientes.png"))); // NOI18N
        jLabelMenuClientes.setText("CLIENTE");
        jLabelMenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuClientesMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLabelMenuClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        jSeparator8.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 10));

        jSeparator9.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 10));

        getContentPane().add(jPaneMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelImageExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageExitMouseClicked
        VentanaLogin ventanaLogin= new VentanaLogin();
        ventanaLogin.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentro
    }//GEN-LAST:event_jLabelImageExitMouseClicked

    private void jLabelMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuUsuariosMouseClicked
          //Creación objeto ventana VentanaPrincipalUsuario
        VentanaPrincipalUsuario ventanaU = new VentanaPrincipalUsuario(user);
        ventanaU.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentro
    }//GEN-LAST:event_jLabelMenuUsuariosMouseClicked

    private void jLabelMenuVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuVentasMouseClicked
        //Creación objeto ventana VentanaPrincipalVenta
        VentanaPrincipalVenta ventanaVentas= new VentanaPrincipalVenta(user);
        ventanaVentas.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentro
    }//GEN-LAST:event_jLabelMenuVentasMouseClicked

    private void jLabelMenuSoporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuSoporteMouseClicked
        //Creación objeto ventana VentanaPrincipalVenta
        VentanaPrincipalSoporte ventanaSoporte= new VentanaPrincipalSoporte(user);
        ventanaSoporte.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentr
    }//GEN-LAST:event_jLabelMenuSoporteMouseClicked

    private void jLabelMenuReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuReportesMouseClicked
        //Creación objeto ventana VentanaPrincipalVenta
        VentanaPrincipalReporte ventanaReportes= new VentanaPrincipalReporte(user);
        ventanaReportes.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentr
    }//GEN-LAST:event_jLabelMenuReportesMouseClicked

    private void jLabelMenuInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuInventarioMouseClicked
        //Creación objeto ventana VentanaPrincipalVenta
        VentanaPrincipalInventario ventanaInventario= new VentanaPrincipalInventario(user);
        ventanaInventario.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentr
    }//GEN-LAST:event_jLabelMenuInventarioMouseClicked

    private void jLabelMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuClientesMouseClicked
        //Creación objeto ventana VentanaPrincipalVenta
        VentanaPrincipalCliente ventanaC= new VentanaPrincipalCliente(user);
        ventanaC.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentr
    }//GEN-LAST:event_jLabelMenuClientesMouseClicked

    private void jLabelImageProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageProductoMouseClicked
        VentanaVerProducto ventanaVP= new VentanaVerProducto(user);
        ventanaVP.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentr
    }//GEN-LAST:event_jLabelImageProductoMouseClicked

    private void jLabelImageAveriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImageAveriaMouseClicked
        // TODO add your handling code here:
        VentanaReporteAveriaProducto ventanaAP= new VentanaReporteAveriaProducto(user);
        ventanaAP.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentr
    }//GEN-LAST:event_jLabelImageAveriaMouseClicked

    private void jLabelImagePedido1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagePedido1MouseClicked

        VentanaRegistroPedido ventanaP= new VentanaRegistroPedido(user);
        ventanaP.setVisible(true);//mostrar ventana usuarios
        this.setVisible(false);//Ocultar ventana en la que me encuentr  
    }//GEN-LAST:event_jLabelImagePedido1MouseClicked

    private Usuario user;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBuscarProducto;
    private javax.swing.JLabel jLabelHacerPedido;
    private javax.swing.JLabel jLabelHacerPedido1;
    private javax.swing.JLabel jLabelImageAveria;
    private javax.swing.JLabel jLabelImageExit;
    private javax.swing.JLabel jLabelImagePedido1;
    private javax.swing.JLabel jLabelImageProducto;
    private javax.swing.JLabel jLabelMenuClientes;
    private javax.swing.JLabel jLabelMenuInventario;
    private javax.swing.JLabel jLabelMenuReportes;
    private javax.swing.JLabel jLabelMenuSoporte;
    private javax.swing.JLabel jLabelMenuUsuarios;
    private javax.swing.JLabel jLabelMenuVentas;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelWindowTitle;
    private javax.swing.JPanel jPaneMenuLateral;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
