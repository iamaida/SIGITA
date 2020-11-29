/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGestionCliente;

import controladorGestionCliente.ControladorCliente;
import controladorGestionUsuario.ControladorMenu;
import modeloGestionUsuario.Usuario;


/**
 *
 * @author Aidis
 */
public class VentanaPrincipalCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaPrincipalCliente(Usuario user) {
        initComponents();
        //Centra la ventana
        this.setLocationRelativeTo(null);
        this.user = user;
        controlMenu = new ControladorMenu();
        controlClient = new ControladorCliente(); 
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
        jLAddCliente = new javax.swing.JLabel();
        jLFindCliente = new javax.swing.JLabel();
        jIconFindCliente = new javax.swing.JLabel();
        jIconAddCliente = new javax.swing.JLabel();
        jLIconEditCliente = new javax.swing.JLabel();
        jLEditCliente = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelWindowTitle = new javax.swing.JLabel();
        jLabelMiniUser1 = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLExit = new javax.swing.JLabel();
        jPaneMenuLateral = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLMUsuario = new javax.swing.JLabel();
        jLMVenta = new javax.swing.JLabel();
        jLMSoporte = new javax.swing.JLabel();
        jSUsuarioVenta = new javax.swing.JSeparator();
        jSCliente = new javax.swing.JSeparator();
        jLMReporte = new javax.swing.JLabel();
        jSClienteInventario = new javax.swing.JSeparator();
        jSoporteInventario = new javax.swing.JSeparator();
        jSoporteUsuario = new javax.swing.JSeparator();
        jLMInventario = new javax.swing.JLabel();
        jLMCliente = new javax.swing.JLabel();
        jSReporte = new javax.swing.JSeparator();
        jSVentaSoporte = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLAddCliente.setBackground(new java.awt.Color(0, 0, 0));
        jLAddCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLAddCliente.setForeground(new java.awt.Color(255, 102, 51));
        jLAddCliente.setText("REGISTRAR");
        jPanelMenu.add(jLAddCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        jLFindCliente.setBackground(new java.awt.Color(0, 0, 0));
        jLFindCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLFindCliente.setForeground(new java.awt.Color(255, 102, 51));
        jLFindCliente.setText("VER");
        jPanelMenu.add(jLFindCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

        jIconFindCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconFindCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconFindCliente.png"))); // NOI18N
        jIconFindCliente.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconFindCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconFindClienteMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconFindCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 150, 130));

        jIconAddCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconAddCliente.png"))); // NOI18N
        jIconAddCliente.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconAddCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconAddClienteMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconAddCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 130));

        jLIconEditCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLIconEditCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconEditCliente.png"))); // NOI18N
        jLIconEditCliente.setPreferredSize(new java.awt.Dimension(34, 34));
        jLIconEditCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLIconEditClienteMouseClicked(evt);
            }
        });
        jPanelMenu.add(jLIconEditCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 150, 130));

        jLEditCliente.setBackground(new java.awt.Color(0, 0, 0));
        jLEditCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLEditCliente.setForeground(new java.awt.Color(255, 102, 51));
        jLEditCliente.setText("EDITAR ");
        jPanelMenu.add(jLEditCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 810, 480));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("CLIENTE");
        jPanelTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("Administrador");
        jPanelTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 90, -1));

        jLExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconExit.png"))); // NOI18N
        jLExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLExitMouseClicked(evt);
            }
        });
        jPanelTitulo.add(jLExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, -1, -1));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        jPaneMenuLateral.setBackground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setForeground(new java.awt.Color(255, 255, 255));
        jPaneMenuLateral.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPaneMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 253, 1, 10));

        jLMUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLMUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLMUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniUsers .png"))); // NOI18N
        jLMUsuario.setText("USUARIO");
        jLMUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMUsuarioMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLMUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, -1));

        jLMVenta.setBackground(new java.awt.Color(0, 0, 0));
        jLMVenta.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLMVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniSell.png"))); // NOI18N
        jLMVenta.setText("VENTA");
        jLMVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMVentaMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLMVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 230, -1));

        jLMSoporte.setBackground(new java.awt.Color(0, 0, 0));
        jLMSoporte.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLMSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniSetting.png"))); // NOI18N
        jLMSoporte.setText("SOPORTE ");
        jLMSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMSoporteMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLMSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, -1));

        jSUsuarioVenta.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSUsuarioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 10));

        jSCliente.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 238, 10));

        jLMReporte.setBackground(new java.awt.Color(0, 0, 0));
        jLMReporte.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLMReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniForm.png"))); // NOI18N
        jLMReporte.setText("REPORTE");
        jLMReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMReporteMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLMReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 230, 40));

        jSClienteInventario.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSClienteInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 10));

        jSoporteInventario.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSoporteInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 240, 10));

        jSoporteUsuario.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSoporteUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 10));

        jLMInventario.setBackground(new java.awt.Color(0, 0, 0));
        jLMInventario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLMInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniInventory.png"))); // NOI18N
        jLMInventario.setText("INVENTARIO");
        jLMInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMInventarioMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLMInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 40));

        jLMCliente.setBackground(new java.awt.Color(0, 0, 0));
        jLMCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLMCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMiniClientes.png"))); // NOI18N
        jLMCliente.setText("CLIENTE");
        jLMCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMClienteMouseClicked(evt);
            }
        });
        jPaneMenuLateral.add(jLMCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

        jSReporte.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 240, 10));

        jSVentaSoporte.setForeground(new java.awt.Color(255, 102, 51));
        jPaneMenuLateral.add(jSVentaSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 240, 10));

        getContentPane().add(jPaneMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIconAddClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconAddClienteMouseClicked
       controlClient.irRegistroCliente(user );
       this.setVisible(false);        
    }//GEN-LAST:event_jIconAddClienteMouseClicked

    private void jLIconEditClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLIconEditClienteMouseClicked
        controlClient.irEdicionCliente( user);
        this.setVisible(false);
    }//GEN-LAST:event_jLIconEditClienteMouseClicked

    private void jIconFindClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconFindClienteMouseClicked
        controlClient.irVistaCliente( user);
        this.setVisible(false);   
    }//GEN-LAST:event_jIconFindClienteMouseClicked

    private void jLMUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMUsuarioMouseClicked
        controlMenu.irModuloGUsuario(user);
        this.setVisible(false);
    }//GEN-LAST:event_jLMUsuarioMouseClicked

    private void jLMVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMVentaMouseClicked
        controlMenu.irModuloGVenta(user);
        this.setVisible(false);
    }//GEN-LAST:event_jLMVentaMouseClicked

    private void jLMSoporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMSoporteMouseClicked
        controlMenu.irVentanaSoporte(user);
        this.setVisible(false);
    }//GEN-LAST:event_jLMSoporteMouseClicked

    private void jLMReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMReporteMouseClicked
        controlMenu.irModuloGReporte(user);
        this.setVisible(false);
    }//GEN-LAST:event_jLMReporteMouseClicked

    private void jLMInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMInventarioMouseClicked
        controlMenu.irModuloGInventario(user);
        this.setVisible(false);
    }//GEN-LAST:event_jLMInventarioMouseClicked

    private void jLMClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMClienteMouseClicked
        controlMenu.irModuloGCliente(user);
        this.setVisible(false);
    }//GEN-LAST:event_jLMClienteMouseClicked

    private void jLExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLExitMouseClicked
        controlMenu.irVentanaLogin();
        this.setVisible(false);
    }//GEN-LAST:event_jLExitMouseClicked

    private final Usuario user;
    private final ControladorMenu controlMenu;
    private final ControladorCliente controlClient;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jIconAddCliente;
    private javax.swing.JLabel jIconFindCliente;
    private javax.swing.JLabel jLAddCliente;
    private javax.swing.JLabel jLEditCliente;
    private javax.swing.JLabel jLExit;
    private javax.swing.JLabel jLFindCliente;
    private javax.swing.JLabel jLIconEditCliente;
    private javax.swing.JLabel jLMCliente;
    private javax.swing.JLabel jLMInventario;
    private javax.swing.JLabel jLMReporte;
    private javax.swing.JLabel jLMSoporte;
    private javax.swing.JLabel jLMUsuario;
    private javax.swing.JLabel jLMVenta;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelWindowTitle;
    private javax.swing.JPanel jPaneMenuLateral;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JSeparator jSCliente;
    private javax.swing.JSeparator jSClienteInventario;
    private javax.swing.JSeparator jSReporte;
    private javax.swing.JSeparator jSUsuarioVenta;
    private javax.swing.JSeparator jSVentaSoporte;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSoporteInventario;
    private javax.swing.JSeparator jSoporteUsuario;
    // End of variables declaration//GEN-END:variables
}
