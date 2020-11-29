/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGestionUsuario;

import controladorGestionUsuario.ControladorMenu;
import controladorGestionUsuario.ControladorUsuario;
import modeloGestionUsuario.Usuario;


/**
 *
 * @author Aidis
 */
public class VentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaLogin
     */
    public VentanaInicio(Usuario user) {
        initComponents();
        //Centra la ventana
        this.setLocationRelativeTo(null);
        this.user = user;
        controlMenu = new ControladorMenu();
        jLNombreEmp.setText(user.getNombre());
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
        jLUsuario = new javax.swing.JLabel();
        jLReporte = new javax.swing.JLabel();
        jLSoporte = new javax.swing.JLabel();
        jLInventario = new javax.swing.JLabel();
        jLVenta = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jIconSoporte = new javax.swing.JLabel();
        jIconVenta = new javax.swing.JLabel();
        jIconCliente = new javax.swing.JLabel();
        jIconInventario = new javax.swing.JLabel();
        jIconReporte = new javax.swing.JLabel();
        jIconUsuario = new javax.swing.JLabel();
        jPanelTitulo = new javax.swing.JPanel();
        jLTituloVentana = new javax.swing.JLabel();
        jPanelIntreso = new javax.swing.JPanel();
        jSNomEmpleado = new javax.swing.JSeparator();
        jIconUser = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jLNombreEmp = new javax.swing.JLabel();
        jIconTienda = new javax.swing.JLabel();
        jLBienvenida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jLUsuario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLUsuario.setForeground(new java.awt.Color(255, 102, 51));
        jLUsuario.setText("USUARIO");
        jPanelMenu.add(jLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLReporte.setBackground(new java.awt.Color(0, 0, 0));
        jLReporte.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLReporte.setForeground(new java.awt.Color(255, 102, 51));
        jLReporte.setText("REPORTE");
        jPanelMenu.add(jLReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        jLSoporte.setBackground(new java.awt.Color(0, 0, 0));
        jLSoporte.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLSoporte.setForeground(new java.awt.Color(255, 102, 51));
        jLSoporte.setText("SOPORTE");
        jPanelMenu.add(jLSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        jLInventario.setBackground(new java.awt.Color(0, 0, 0));
        jLInventario.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLInventario.setForeground(new java.awt.Color(255, 102, 51));
        jLInventario.setText("INVENTARIO");
        jPanelMenu.add(jLInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jLVenta.setBackground(new java.awt.Color(0, 0, 0));
        jLVenta.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLVenta.setForeground(new java.awt.Color(255, 102, 51));
        jLVenta.setText("VENTA");
        jPanelMenu.add(jLVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLCliente.setBackground(new java.awt.Color(0, 0, 0));
        jLCliente.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLCliente.setForeground(new java.awt.Color(255, 102, 51));
        jLCliente.setText("CLIENTE");
        jPanelMenu.add(jLCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jIconSoporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconSet.png"))); // NOI18N
        jIconSoporte.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconSoporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconSoporteMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 150, 130));

        jIconVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconSell.png"))); // NOI18N
        jIconVenta.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconVentaMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 150, 130));

        jIconCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconClientes.png"))); // NOI18N
        jIconCliente.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconClienteMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 150, 130));

        jIconInventario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconInventory.png"))); // NOI18N
        jIconInventario.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconInventarioMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 150, 130));

        jIconReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconForm.png"))); // NOI18N
        jIconReporte.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconReporteMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 150, 130));

        jIconUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUsers.png"))); // NOI18N
        jIconUsuario.setPreferredSize(new java.awt.Dimension(34, 34));
        jIconUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIconUsuarioMouseClicked(evt);
            }
        });
        jPanelMenu.add(jIconUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 150, 140));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 760, 480));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLTituloVentana.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLTituloVentana.setForeground(new java.awt.Color(255, 102, 51));
        jLTituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLTituloVentana.setText("MENU");
        jPanelTitulo.add(jLTituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, -1, -1));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 100));

        jPanelIntreso.setBackground(new java.awt.Color(255, 255, 255));
        jPanelIntreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanelIntreso.setForeground(new java.awt.Color(255, 255, 255));
        jPanelIntreso.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPanelIntreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSNomEmpleado.setForeground(new java.awt.Color(255, 102, 51));
        jPanelIntreso.add(jSNomEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 22));

        jIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUser.png"))); // NOI18N
        jPanelIntreso.add(jIconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jBSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBSalir.setText("SALIR");
        jBSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });
        jPanelIntreso.add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 90, 40));

        jLNombreEmp.setBackground(new java.awt.Color(0, 0, 0));
        jLNombreEmp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLNombreEmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLNombreEmp.setText("NOMBRE EMPLEADO");
        jPanelIntreso.add(jLNombreEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, -1));

        jIconTienda.setBackground(new java.awt.Color(0, 0, 0));
        jIconTienda.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jIconTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIconTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/store.png"))); // NOI18N
        jPanelIntreso.add(jIconTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 60, 50));

        jLBienvenida.setBackground(new java.awt.Color(0, 0, 0));
        jLBienvenida.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLBienvenida.setText("¡ Bienvenido a SIGITA!");
        jPanelIntreso.add(jLBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        getContentPane().add(jPanelIntreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIconClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconClienteMouseClicked
      controlMenu.irModuloGCliente(user);
      this.setVisible(false);
    }//GEN-LAST:event_jIconClienteMouseClicked

    private void jIconVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconVentaMouseClicked
        controlMenu.irModuloGVenta(user);
        this.setVisible(false);
    }//GEN-LAST:event_jIconVentaMouseClicked

    private void jIconInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconInventarioMouseClicked
        controlMenu.irModuloGInventario(user);
        this.setVisible(false);
    }//GEN-LAST:event_jIconInventarioMouseClicked

    private void jIconReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconReporteMouseClicked
        controlMenu.irModuloGReporte(user);
        this.setVisible(false);
    }//GEN-LAST:event_jIconReporteMouseClicked

    private void jIconSoporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconSoporteMouseClicked
        controlMenu.irVentanaSoporte(user);
        this.setVisible(false);
    }//GEN-LAST:event_jIconSoporteMouseClicked

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        controlMenu.irVentanaLogin();
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jIconUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIconUsuarioMouseClicked
        controlMenu.irModuloGUsuario(user);
        this.setVisible(false);
    }//GEN-LAST:event_jIconUsuarioMouseClicked

    /**
     * @param args the command line arguments
     */

    private Usuario user;
    private ControladorMenu controlMenu;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jIconCliente;
    private javax.swing.JLabel jIconInventario;
    private javax.swing.JLabel jIconReporte;
    private javax.swing.JLabel jIconSoporte;
    private javax.swing.JLabel jIconTienda;
    private javax.swing.JLabel jIconUser;
    private javax.swing.JLabel jIconUsuario;
    private javax.swing.JLabel jIconVenta;
    private javax.swing.JLabel jLBienvenida;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLInventario;
    private javax.swing.JLabel jLNombreEmp;
    private javax.swing.JLabel jLReporte;
    private javax.swing.JLabel jLSoporte;
    private javax.swing.JLabel jLTituloVentana;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JLabel jLVenta;
    private javax.swing.JPanel jPanelIntreso;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JSeparator jSNomEmpleado;
    // End of variables declaration//GEN-END:variables

    private void setText(String a_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
