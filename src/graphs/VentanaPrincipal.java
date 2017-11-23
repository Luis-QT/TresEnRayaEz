/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;
import model.Jugador;

/**
 *
 * @author GabrielGiancarlo
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    HiloMusica hiloMusica;
    Jugador jugador;
    private VentanaConfiguraciones ventanaConfiguraciones;
    
    /**
     * Creates new form VentanaPrincipal
     */
    
    public void botonTransparente(){ 
        botonExit.setOpaque(false);
        botonExit.setContentAreaFilled(false);
        botonExit.setBorderPainted(false);
        
        boton1vsPc.setOpaque(false);
        boton1vsPc.setContentAreaFilled(false);
        boton1vsPc.setBorderPainted(false);
        
        boton1vs1.setOpaque(false);
        boton1vs1.setContentAreaFilled(false);
        boton1vs1.setBorderPainted(false);
        
        botonOpciones.setOpaque(false);
        botonOpciones.setContentAreaFilled(false);
        botonOpciones.setBorderPainted(false);
        
                
        botonPuntuaciones.setOpaque(false);
        botonPuntuaciones.setContentAreaFilled(false);
        botonPuntuaciones.setBorderPainted(false);
    }
    
    public VentanaPrincipal() {
        
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        
        this.botonTransparente();
        hiloMusica = new HiloMusica( 28 , "intro");
        jugador = new Jugador("Desconocido");
    }
    public void setHiloMusica(HiloMusica hiloMusica){
        this.hiloMusica=hiloMusica;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boton1vs1 = new javax.swing.JButton();
        botonOpciones = new javax.swing.JButton();
        botonPuntuaciones = new javax.swing.JButton();
        boton1vsPc = new javax.swing.JButton();
        botonExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        FondoPrincipal = new javax.swing.JLabel();
        botonPuntuaciones2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TresEnRaya_2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        boton1vs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vs1_1_2.png"))); // NOI18N
        boton1vs1.setBorder(null);
        boton1vs1.setBorderPainted(false);
        boton1vs1.setContentAreaFilled(false);
        boton1vs1.setFocusPainted(false);
        boton1vs1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton1vs1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vs1_3_2.png"))); // NOI18N
        boton1vs1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vs1_2_2.png"))); // NOI18N
        boton1vs1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vs1_3_2.png"))); // NOI18N
        boton1vs1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1vs1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1vs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 210, 60));

        botonOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpciones_1_2.png"))); // NOI18N
        botonOpciones.setBorder(null);
        botonOpciones.setBorderPainted(false);
        botonOpciones.setContentAreaFilled(false);
        botonOpciones.setFocusPainted(false);
        botonOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonOpciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpciones_3_2.png"))); // NOI18N
        botonOpciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpciones_2_2.png"))); // NOI18N
        botonOpciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonOpciones_3_2.png"))); // NOI18N
        botonOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOpcionesActionPerformed(evt);
            }
        });
        getContentPane().add(botonOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 60));

        botonPuntuaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_1.png"))); // NOI18N
        botonPuntuaciones.setBorder(null);
        botonPuntuaciones.setBorderPainted(false);
        botonPuntuaciones.setContentAreaFilled(false);
        botonPuntuaciones.setFocusPainted(false);
        botonPuntuaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPuntuaciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_3.png"))); // NOI18N
        botonPuntuaciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_2.png"))); // NOI18N
        botonPuntuaciones.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_3.png"))); // NOI18N
        botonPuntuaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntuacionesActionPerformed(evt);
            }
        });
        getContentPane().add(botonPuntuaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 210, 60));

        boton1vsPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vsPc_1_2.png"))); // NOI18N
        boton1vsPc.setBorder(null);
        boton1vsPc.setBorderPainted(false);
        boton1vsPc.setContentAreaFilled(false);
        boton1vsPc.setFocusPainted(false);
        boton1vsPc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton1vsPc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vsPc_3_2.png"))); // NOI18N
        boton1vsPc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vsPc_2_2.png"))); // NOI18N
        boton1vsPc.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton1vsPc_3_2.png"))); // NOI18N
        boton1vsPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1vsPcActionPerformed(evt);
            }
        });
        getContentPane().add(boton1vsPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, 60));

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

        jButton1.setText("Nuevo Jugador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        botonPuntuaciones2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_1.png"))); // NOI18N
        botonPuntuaciones2.setBorder(null);
        botonPuntuaciones2.setBorderPainted(false);
        botonPuntuaciones2.setContentAreaFilled(false);
        botonPuntuaciones2.setFocusPainted(false);
        botonPuntuaciones2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPuntuaciones2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_3.png"))); // NOI18N
        botonPuntuaciones2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_2.png"))); // NOI18N
        botonPuntuaciones2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonPuntuaciones_3.png"))); // NOI18N
        getContentPane().add(botonPuntuaciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 210, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_botonExitActionPerformed

    private void boton1vs1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1vs1ActionPerformed
        // TODO add your handling code here:
        hiloMusica.detener();
        this.setVisible(false); 
        new VentanaJuego1vs1().setVisible(true);
        
    }//GEN-LAST:event_boton1vs1ActionPerformed

    private void boton1vsPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1vsPcActionPerformed
        // TODO add your handling code here:
        hiloMusica.detener();
        this.setVisible(false); 
        new Ventana1vsPc_Niveles(jugador).setVisible(true);

    }//GEN-LAST:event_boton1vsPcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Nombre del jugador :", "Nuevo Jugador", JOptionPane.INFORMATION_MESSAGE);
        jugador = new Jugador(nombre);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonPuntuacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntuacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPuntuacionesActionPerformed

    private void botonOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOpcionesActionPerformed
        this.setVisible(false); 
        ventanaConfiguraciones=new VentanaConfiguraciones();
        ventanaConfiguraciones.setVisible(true);
        ventanaConfiguraciones.setVentanaPrincipal(this);
    }//GEN-LAST:event_botonOpcionesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JButton boton1vs1;
    private javax.swing.JButton boton1vsPc;
    private javax.swing.JButton botonExit;
    private javax.swing.JButton botonOpciones;
    private javax.swing.JButton botonPuntuaciones;
    private javax.swing.JButton botonPuntuaciones2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
