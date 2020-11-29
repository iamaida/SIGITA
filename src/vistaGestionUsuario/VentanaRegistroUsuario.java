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
public class VentanaRegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaRegistroUsuario(Usuario user) {
        initComponents();
        //Centra la ventana
        this.setLocationRelativeTo(null);
        this.user = user;
        controlUS = new ControladorUsuario();
        controlMenu = new ControladorMenu();
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

        jPFormulario = new javax.swing.JPanel();
        jAstTelefono = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTFNomUser = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jAstNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jTFFecha = new javax.swing.JTextField();
        jTFPassword = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jAstCodigo = new javax.swing.JLabel();
        jTFCC = new javax.swing.JTextField();
        jLabelCC = new javax.swing.JLabel();
        jAstCC = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jAstFecha = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jAstDireccion = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jAstPassword = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jAstCargo = new javax.swing.JLabel();
        jTFCargo = new javax.swing.JTextField();
        jLabelNUser = new javax.swing.JLabel();
        jAstNUsuario = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jPLateralI = new javax.swing.JPanel();
        jPTitulo = new javax.swing.JPanel();
        jLabelWindowTitle = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelMiniUser1 = new javax.swing.JLabel();
        jPLateralD = new javax.swing.JPanel();
        jPBotones = new javax.swing.JPanel();
        jButtonSalir = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPFormulario.setBackground(new java.awt.Color(255, 255, 255));
        jPFormulario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jPFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jAstTelefono.setBackground(new java.awt.Color(0, 0, 0));
        jAstTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstTelefono.setForeground(new java.awt.Color(255, 102, 51));
        jAstTelefono.setText("*");
        jPFormulario.add(jAstTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabelTelefono.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTelefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTelefono.setText("TELEFONO");
        jPFormulario.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jTFNomUser.setBackground(new java.awt.Color(220, 220, 220));
        jTFNomUser.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFNomUser.setForeground(new java.awt.Color(102, 102, 102));
        jTFNomUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFNomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, 30));

        jLabelNombre.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("NOMBRE");
        jPFormulario.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jAstNombre.setBackground(new java.awt.Color(0, 0, 0));
        jAstNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstNombre.setForeground(new java.awt.Color(255, 102, 51));
        jAstNombre.setText("*");
        jPFormulario.add(jAstNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jTFNombre.setBackground(new java.awt.Color(220, 220, 220));
        jTFNombre.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFNombre.setForeground(new java.awt.Color(102, 102, 102));
        jTFNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 590, 30));

        jTFFecha.setBackground(new java.awt.Color(220, 220, 220));
        jTFFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFFecha.setForeground(new java.awt.Color(102, 102, 102));
        jTFFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 180, 30));

        jTFPassword.setBackground(new java.awt.Color(220, 220, 220));
        jTFPassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFPassword.setForeground(new java.awt.Color(102, 102, 102));
        jTFPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 180, 30));

        jLabelCodigo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCodigo.setText("CODIGO");
        jPFormulario.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jAstCodigo.setBackground(new java.awt.Color(0, 0, 0));
        jAstCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstCodigo.setForeground(new java.awt.Color(255, 102, 51));
        jAstCodigo.setText("*");
        jPFormulario.add(jAstCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, -1, -1));

        jTFCC.setBackground(new java.awt.Color(220, 220, 220));
        jTFCC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFCC.setForeground(new java.awt.Color(102, 102, 102));
        jTFCC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 180, 30));

        jLabelCC.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCC.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCC.setText("C.C");
        jPFormulario.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jAstCC.setBackground(new java.awt.Color(0, 0, 0));
        jAstCC.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstCC.setForeground(new java.awt.Color(255, 102, 51));
        jAstCC.setText("*");
        jPFormulario.add(jAstCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabelFecha.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFecha.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFecha.setText("FECHA REGISTRO");
        jPFormulario.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jAstFecha.setBackground(new java.awt.Color(0, 0, 0));
        jAstFecha.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstFecha.setForeground(new java.awt.Color(255, 102, 51));
        jAstFecha.setText("*");
        jPFormulario.add(jAstFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jTFDireccion.setBackground(new java.awt.Color(220, 220, 220));
        jTFDireccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFDireccion.setForeground(new java.awt.Color(102, 102, 102));
        jTFDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 30));

        jLabelDireccion.setBackground(new java.awt.Color(0, 0, 0));
        jLabelDireccion.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDireccion.setText("DIRECCIÓN");
        jPFormulario.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jAstDireccion.setBackground(new java.awt.Color(0, 0, 0));
        jAstDireccion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstDireccion.setForeground(new java.awt.Color(255, 102, 51));
        jAstDireccion.setText("*");
        jPFormulario.add(jAstDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabelPassword.setBackground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setText("CONTRASEÑA");
        jPFormulario.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jAstPassword.setBackground(new java.awt.Color(0, 0, 0));
        jAstPassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstPassword.setForeground(new java.awt.Color(255, 102, 51));
        jAstPassword.setText("*");
        jPFormulario.add(jAstPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 10, -1));

        jTFTelefono.setBackground(new java.awt.Color(220, 220, 220));
        jTFTelefono.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFTelefono.setForeground(new java.awt.Color(102, 102, 102));
        jTFTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 180, 30));

        jLabelCargo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCargo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCargo.setText("CARGO");
        jPFormulario.add(jLabelCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jAstCargo.setBackground(new java.awt.Color(0, 0, 0));
        jAstCargo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstCargo.setForeground(new java.awt.Color(255, 102, 51));
        jAstCargo.setText("*");
        jPFormulario.add(jAstCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jTFCargo.setBackground(new java.awt.Color(220, 220, 220));
        jTFCargo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFCargo.setForeground(new java.awt.Color(102, 102, 102));
        jTFCargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 30));

        jLabelNUser.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNUser.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelNUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNUser.setText("NUSUARIO");
        jPFormulario.add(jLabelNUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jAstNUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jAstNUsuario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jAstNUsuario.setForeground(new java.awt.Color(255, 102, 51));
        jAstNUsuario.setText("*");
        jPFormulario.add(jAstNUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 10, -1));

        jTFCodigo.setBackground(new java.awt.Color(220, 220, 220));
        jTFCodigo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTFCodigo.setForeground(new java.awt.Color(102, 102, 102));
        jTFCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 51)));
        jPFormulario.add(jTFCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, 180, 30));

        getContentPane().add(jPFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 850, 370));

        jPLateralI.setBackground(new java.awt.Color(255, 255, 255));
        jPLateralI.setForeground(new java.awt.Color(255, 255, 255));
        jPLateralI.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPLateralI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPLateralI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 480));

        jPTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jPTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWindowTitle.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabelWindowTitle.setForeground(new java.awt.Color(255, 102, 51));
        jLabelWindowTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWindowTitle.setText("FORMULARIO REGISTRO USUARIO");
        jPTitulo.add(jLabelWindowTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 530, -1));

        jLabelUserName.setBackground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUserName.setText("Administrador");
        jPTitulo.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 60, 90, -1));

        jLabelMiniUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconUserMini.png"))); // NOI18N
        jPTitulo.add(jLabelMiniUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

        getContentPane().add(jPTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        jPLateralD.setBackground(new java.awt.Color(255, 255, 255));
        jPLateralD.setForeground(new java.awt.Color(255, 255, 255));
        jPLateralD.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jPLateralD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPLateralD, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 100, 480));

        jPBotones.setBackground(new java.awt.Color(255, 255, 255));
        jPBotones.setForeground(new java.awt.Color(255, 255, 255));
        jPBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });
        jPBotones.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 120, 40));

        jButtonRegistrar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 1, true));
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMouseClicked(evt);
            }
        });
        jPBotones.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 40));

        getContentPane().add(jPBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 850, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
        controlMenu.irModuloGUsuario(user);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMouseClicked
        
        userR = new Usuario();
        tomarInfoUsuario();
        controlUS.procesarRegistroUsuario(userR);
        
        borrarInfoCampos();

    }//GEN-LAST:event_jButtonRegistrarMouseClicked
    
    private void tomarInfoUsuario()
    {
        
        userR.setCodigo(jTFCodigo.getText());
        userR.setDocId(jTFCC.getText());
        userR.setNombre(jTFNombre.getText());
        userR.setCargo(jTFCargo.getText());
        userR.setNombreUsuario(jTFNomUser.getText());
        userR.setContrasenha(jTFPassword.getText());
        userR.setEstado("Activo");
        userR.setFechaRegistro(jTFFecha.getText());
        userR.setDireccion(jTFDireccion.getText());
        userR.setTelefono(jTFTelefono.getText());
    }
    
    private void borrarInfoCampos()
    {
        jTFCodigo.setText("");
        jTFCC.setText("");
        jTFNombre.setText("");
        jTFCargo.setText("");
        jTFNomUser.setText("");
        jTFPassword.setText("");
        jTFFecha.setText("");
        jTFDireccion.setText("");
        jTFTelefono.setText("");
    }
    
    private Usuario userR;
    private Usuario user;
    private ControladorUsuario controlUS;
    private ControladorMenu controlMenu;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAstCC;
    private javax.swing.JLabel jAstCargo;
    private javax.swing.JLabel jAstCodigo;
    private javax.swing.JLabel jAstDireccion;
    private javax.swing.JLabel jAstFecha;
    private javax.swing.JLabel jAstNUsuario;
    private javax.swing.JLabel jAstNombre;
    private javax.swing.JLabel jAstPassword;
    private javax.swing.JLabel jAstTelefono;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMiniUser1;
    private javax.swing.JLabel jLabelNUser;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelWindowTitle;
    private javax.swing.JPanel jPBotones;
    private javax.swing.JPanel jPFormulario;
    private javax.swing.JPanel jPLateralD;
    private javax.swing.JPanel jPLateralI;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JTextField jTFCC;
    private javax.swing.JTextField jTFCargo;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFFecha;
    private javax.swing.JTextField jTFNomUser;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPassword;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables
}
