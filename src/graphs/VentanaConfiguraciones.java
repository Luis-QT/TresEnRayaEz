/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author GabrielGiancarlo
 */
public class VentanaConfiguraciones extends javax.swing.JFrame {
    
    /**
     * Creates new form VentanaConfiguraciones
     */
    public VentanaConfiguraciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonActSonido = new javax.swing.JButton();
        botonResetPuntuaciones = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();
        botonDesactSonido = new javax.swing.JButton();
        FondoPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exitB.png"))); // NOI18N
        botonExit.setBorder(null);
        botonExit.setBorderPainted(false);
        botonExit.setContentAreaFilled(false);
        botonExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonExit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exitB3_2.png"))); // NOI18N
        botonExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exitB2.png"))); // NOI18N
        botonExit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exitB3_2.png"))); // NOI18N
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });
        getContentPane().add(botonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 35, 25, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TresEnRaya_2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        botonActSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonActSon_1.png"))); // NOI18N
        botonActSonido.setBorder(null);
        botonActSonido.setBorderPainted(false);
        botonActSonido.setContentAreaFilled(false);
        botonActSonido.setFocusPainted(false);
        botonActSonido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonActSonido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonActSon_3.png"))); // NOI18N
        botonActSonido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonActSon_2.png"))); // NOI18N
        botonActSonido.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonActSon_3.png"))); // NOI18N
        botonActSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActSonidoActionPerformed(evt);
            }
        });
        getContentPane().add(botonActSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 210, 60));

        botonResetPuntuaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonReset_1.png"))); // NOI18N
        botonResetPuntuaciones.setBorder(null);
        botonResetPuntuaciones.setBorderPainted(false);
        botonResetPuntuaciones.setContentAreaFilled(false);
        botonResetPuntuaciones.setFocusPainted(false);
        botonResetPuntuaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonResetPuntuaciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonReset_3.png"))); // NOI18N
        botonResetPuntuaciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonReset_2.png"))); // NOI18N
        botonResetPuntuaciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonReset_3.png"))); // NOI18N
        getContentPane().add(botonResetPuntuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 210, 60));

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAtras_1.png"))); // NOI18N
        botonAtras.setBorder(null);
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setFocusPainted(false);
        botonAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAtras_3.png"))); // NOI18N
        botonAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAtras_2.png"))); // NOI18N
        botonAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonAtras_3.png"))); // NOI18N
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 110, 30));

        botonDesactSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonDesacSon_1.png"))); // NOI18N
        botonDesactSonido.setBorder(null);
        botonDesactSonido.setBorderPainted(false);
        botonDesactSonido.setContentAreaFilled(false);
        botonDesactSonido.setFocusPainted(false);
        botonDesactSonido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonDesactSonido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonDesacSon_3.png"))); // NOI18N
        botonDesactSonido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonDesacSon_2.png"))); // NOI18N
        botonDesactSonido.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonDesacSon_3.png"))); // NOI18N
        getContentPane().add(botonDesactSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 210, 60));

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActSonidoActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new VentanaJuego1vs1().setVisible(true);

    }//GEN-LAST:event_botonActSonidoActionPerformed

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonExitActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConfiguraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaConfiguraciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JButton botonActSonido;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonDesactSonido;
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonResetPuntuaciones;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
