/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaMensEmerg;

import javax.swing.JFrame;

/**
 *
 * @author Aidis
 */
public class VentanaMRegistroNExit extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public VentanaMRegistroNExit() {
       
        
        initComponents();
        //Centra la ventana
        this.setLocationRelativeTo(null);
        
   
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
        jLabelAsterisco5 = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelMensaje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanelMenu.setForeground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAsterisco5.setBackground(new java.awt.Color(0, 0, 0));
        jLabelAsterisco5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelAsterisco5.setForeground(new java.awt.Color(255, 102, 51));
        jLabelAsterisco5.setText("*");
        jPanelMenu.add(jLabelAsterisco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 160, 0, -1));

        jButtonOk.setBackground(new java.awt.Color(204, 204, 255));
        jButtonOk.setText("OK");
        jButtonOk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 51), 2, true));
        jButtonOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOkMouseClicked(evt);
            }
        });
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 70, 30));

        jLabelMensaje.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMensaje.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelMensaje.setForeground(new java.awt.Color(153, 153, 153));
        jLabelMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconCancel.png"))); // NOI18N
        jLabelMensaje.setOpaque(true);
        jPanelMenu.add(jLabelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 50, 50));

        jLabelMensaje1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMensaje1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelMensaje1.setForeground(new java.awt.Color(153, 153, 153));
        jLabelMensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMensaje1.setText("!Registro NO hecho!");
        jLabelMensaje1.setOpaque(true);
        jPanelMenu.add(jLabelMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, 30));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOkMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jButtonOkMouseClicked

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelAsterisco5;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelMensaje1;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}
