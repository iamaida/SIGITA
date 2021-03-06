/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaGestionUsuario;

import controladorGestionUsuario.ControladorMenu;
import controladorGestionUsuario.ControladorUsuario;
import java.awt.HeadlessException;
import modeloGestionUsuario.Usuario;

/**
 *
 * @author Aidis
 */
public class VentanaVerUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaVerUsuario(Usuario user) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.user = user;
        controlUS = new ControladorUsuario();
        controlMenu = new ControladorMenu();
        jTFBuscar.setText("B-002");
        jLabelUserName.setText(user.getNombreUsuario());
    }
    
    


    public VentanaVerUsuario() throws HeadlessException {
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLateralI = new javax.swing.JPanel();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelWindowTitle = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelMiniUser1 = new javax.swing.JLabel();
        jPLateralD = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jPBusqueda = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jBotonBuscar = new javax.swing.JLabel();
        jPFormulario = new javax.swing.JPanel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelCC = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelCargo = new javax.swing.JLabel();
        jLabelFotoUsuario = new javax.swing.JLabel();
        jLabelRCargo = new javax.swing.JLabel();
        jSCargo = new javax.swing.JSeparator();
        jLabelRNombre = new javax.swing.JLabel();
        jSNombre = new javax.swing.JSeparator();
        jLabelRFecha = new javax.swing.JLabel();
        jSNUsuario = new javax.swing.JSeparator();
        jLabelRPassword = new javax.swing.JLabel();
        jSFecha = new javax.swing.JSeparator();
        jLabelNomUsario = new javax.swing.JLabel();
        jLabelRNUsuario = new javax.swing.JLabel();
        jSPassword = new javax.swing.JSeparator();
        jSdocId = new javax.swing.JSeparator();
        jLabelRCC = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPLateralI.setBackground(new java.awt.Color(255, 255, 255));
        jPLateralI.setForeground(new java.awt.Color(255, 255, 255));
        jPLateralI.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPLateralI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPLateralI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 460));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("VER USUARIO");
        jPanelTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 40));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("Administrador");
        jPanelTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 90, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPanelTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, 40));

        getContentPane().add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 70));

        jPLateralD.setBackground(new java.awt.Color(255, 255, 255));
        jPLateralD.setForeground(new java.awt.Color(255, 255, 255));
        jPLateralD.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPLateralD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPLateralD, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 100, 460));

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setForeground(new java.awt.Color(255, 255, 255));
        jPanelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jPanelBotones.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 120, 40));

        getContentPane().add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 850, 120));

        jPBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        jPBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jPBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFBuscar.setBackground(new java.awt.Color(220, 220, 220));
        jTFBuscar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFBuscar.setForeground(new java.awt.Color(102, 102, 102));
        jTFBuscar.setText("Buscar");
        jTFBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jTFBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFBuscarMouseClicked(evt);
            }
        });
        jPBusqueda.add(jTFBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 300, 30));

        jLCodigo.setBackground(new java.awt.Color(0, 0, 0));
        jLCodigo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCodigo.setText("CODIGO");
        jPBusqueda.add(jLCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 30));

        jBotonBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jBotonBuscar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jBotonBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconSearch.png"))); // NOI18N
        jBotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBotonBuscarMouseClicked(evt);
            }
        });
        jPBusqueda.add(jBotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, -1, 30));

        getContentPane().add(jPBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 80));

        jPFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jPFormulario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jPFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPassword.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setText("CONTRASEÑA");
        jPFormulario.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabelCC.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCC.setText("C.C");
        jPFormulario.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabelFecha.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFecha.setText("FECHA REGISTRO");
        jPFormulario.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabelCargo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCargo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCargo.setText("CARGO");
        jPFormulario.add(jLabelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabelFotoUsuario.setBackground(new java.awt.Color(220, 220, 220));
        jLabelFotoUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelFotoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFotoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconMale.png"))); // NOI18N
        jLabelFotoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jLabelFotoUsuario.setOpaque(true);
        jPFormulario.add(jLabelFotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 210, 170));

        jLabelRCargo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRCargo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelRCargo.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRCargo.setOpaque(true);
        jPFormulario.add(jLabelRCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 130, 30));

        jSCargo.setForeground(new java.awt.Color(255, 102, 51));
        jPFormulario.add(jSCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 130, 20));

        jLabelRNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelRNombre.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRNombre.setOpaque(true);
        jPFormulario.add(jLabelRNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 320, 30));

        jSNombre.setForeground(new java.awt.Color(255, 102, 51));
        jPFormulario.add(jSNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 320, 10));

        jLabelRFecha.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelRFecha.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRFecha.setOpaque(true);
        jPFormulario.add(jLabelRFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 260, 30));

        jSNUsuario.setForeground(new java.awt.Color(255, 102, 51));
        jPFormulario.add(jSNUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 250, 10));

        jLabelRPassword.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRPassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelRPassword.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRPassword.setOpaque(true);
        jPFormulario.add(jLabelRPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 270, 30));

        jSFecha.setForeground(new java.awt.Color(255, 102, 51));
        jPFormulario.add(jSFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 260, 20));

        jLabelNomUsario.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNomUsario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNomUsario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomUsario.setText("NOMBRE USUARIO");
        jPFormulario.add(jLabelNomUsario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabelRNUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRNUsuario.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelRNUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRNUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRNUsuario.setOpaque(true);
        jPFormulario.add(jLabelRNUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 250, 30));

        jSPassword.setForeground(new java.awt.Color(255, 102, 51));
        jPFormulario.add(jSPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 260, 20));

        jSdocId.setForeground(new java.awt.Color(255, 102, 51));
        jPFormulario.add(jSdocId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 320, 10));

        jLabelRCC.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRCC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelRCC.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRCC.setOpaque(true);
        jPFormulario.add(jLabelRCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 320, 30));

        jLabelNombre.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("NOMBRE");
        jPFormulario.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        getContentPane().add(jPFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 850, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        controlMenu.irModuloGUsuario(user);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirMouseClicked
    
    private void mostrarInfoUsuario()
    {
        
        jLabelRNombre.setText(userB.getNombre());
        jLabelRCC.setText(userB.getDocId());
        jLabelRNUsuario.setText(userB.getNombreUsuario());
        jLabelRPassword.setText(userB.getContrasenha());
        jLabelRFecha.setText(userB.getFechaRegistro());
        jLabelRCargo.setText(userB.getCargo());
    }
    
    private void borrarInfoCampos()
    {
        jTFBuscar.setText("Buscar");
        jLabelRNombre.setText("");
        jLabelRCC.setText("");
        jLabelRNUsuario.setText("");
        jLabelRPassword.setText("");
        jLabelRFecha.setText("");
        jLabelRCargo.setText("");
        
    }
     
    private void jBotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBotonBuscarMouseClicked
      
      userB = controlUS.procesarVistaUsuario(jTFBuscar.getText());
      
      if(controlUS.getEncontrado())
      {
          mostrarInfoUsuario();
          
      }else
      {
          borrarInfoCampos();
      }
      
    }//GEN-LAST:event_jBotonBuscarMouseClicked

    private void jTFBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBuscarMouseClicked
        jTFBuscar.setText(""); 
    }//GEN-LAST:event_jTFBuscarMouseClicked
   
    private Usuario user;
    private Usuario userB;
    private ControladorUsuario controlUS;
    private ControladorMenu controlMenu;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBotonBuscar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFotoUsuario;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelNomUsario;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRCC;
    private javax.swing.JLabel jLabelRCargo;
    private javax.swing.JLabel jLabelRFecha;
    private javax.swing.JLabel jLabelRNUsuario;
    private javax.swing.JLabel jLabelRNombre;
    private javax.swing.JLabel jLabelRPassword;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelWindowTitle;
    private javax.swing.JPanel jPBusqueda;
    private javax.swing.JPanel jPFormulario;
    private javax.swing.JPanel jPLateralD;
    private javax.swing.JPanel jPLateralI;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JSeparator jSCargo;
    private javax.swing.JSeparator jSFecha;
    private javax.swing.JSeparator jSNUsuario;
    private javax.swing.JSeparator jSNombre;
    private javax.swing.JSeparator jSPassword;
    private javax.swing.JSeparator jSdocId;
    private javax.swing.JTextField jTFBuscar;
    // End of variables declaration//GEN-END:variables
}
