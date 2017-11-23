/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielGiancarlo
 */
public class VentanaJuego1vs1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    
    
    int turno,contp,contimp;
    boolean gano = false;//indica si ya hubo o no triky
    boolean emp = true;
    public JButton[][] cuadros;//matriz para guardar los datos
    public Color colorx = Color.red;//indica el color de la letra X
    public Color coloro = Color.blue;//indica el color de la letra O
    
    public void botonTransparente(){ 
        botonExit.setOpaque(false);
        botonExit.setContentAreaFilled(false);
        botonExit.setBorderPainted(false);
        
        boton1.setOpaque(false);
        boton1.setContentAreaFilled(false);
        boton1.setBorderPainted(false);
        
        boton2.setOpaque(false);
        boton2.setContentAreaFilled(false);
        boton2.setBorderPainted(false);
        
        boton3.setOpaque(false);
        boton3.setContentAreaFilled(false);
        boton3.setBorderPainted(false);
        
        boton4.setOpaque(false);
        boton4.setContentAreaFilled(false);
        boton4.setBorderPainted(false);
        
        boton5.setOpaque(false);
        boton5.setContentAreaFilled(false);
        boton5.setBorderPainted(false);
        
        boton6.setOpaque(false);
        boton6.setContentAreaFilled(false);
        boton6.setBorderPainted(false);
        
        boton7.setOpaque(false);
        boton7.setContentAreaFilled(false);
        boton7.setBorderPainted(false);
        
        boton8.setOpaque(false);
        boton8.setContentAreaFilled(false);
        boton8.setBorderPainted(false);
        
        boton9.setOpaque(false);
        boton9.setContentAreaFilled(false);
        boton9.setBorderPainted(false);
        
    }
    
    
    public VentanaJuego1vs1() {
        
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);       
        this.botonTransparente();
        
        turno = contp = contimp = 1;
        cuadros = new JButton[][]{{boton1,boton2,boton3},{boton4,boton5,boton6},{boton7,boton8,boton9}};
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtras = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        FondoTablaJL = new javax.swing.JLabel();
        botonExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        FondoJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 110, 30));

        boton1.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton1.setBorder(null);
        boton1.setBorderPainted(false);
        boton1.setContentAreaFilled(false);
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        boton1.setFocusPainted(false);
        boton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 73, 70));

        boton2.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton2.setBorder(null);
        boton2.setBorderPainted(false);
        boton2.setContentAreaFilled(false);
        boton2.setFocusPainted(false);
        boton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 73, 70));

        boton3.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton3.setBorder(null);
        boton3.setBorderPainted(false);
        boton3.setContentAreaFilled(false);
        boton3.setFocusPainted(false);
        boton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 73, 70));

        boton4.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton4.setBorder(null);
        boton4.setBorderPainted(false);
        boton4.setContentAreaFilled(false);
        boton4.setFocusPainted(false);
        boton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 73, 70));

        boton5.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton5.setBorder(null);
        boton5.setBorderPainted(false);
        boton5.setContentAreaFilled(false);
        boton5.setFocusPainted(false);
        boton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 73, 70));

        boton6.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton6.setBorder(null);
        boton6.setBorderPainted(false);
        boton6.setContentAreaFilled(false);
        boton6.setFocusPainted(false);
        boton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 73, 70));

        boton7.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton7.setBorder(null);
        boton7.setBorderPainted(false);
        boton7.setContentAreaFilled(false);
        boton7.setFocusPainted(false);
        boton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 73, 70));

        boton8.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton8.setBorder(null);
        boton8.setBorderPainted(false);
        boton8.setContentAreaFilled(false);
        boton8.setFocusPainted(false);
        boton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 73, 70));

        boton9.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        boton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton9.setBorder(null);
        boton9.setBorderPainted(false);
        boton9.setContentAreaFilled(false);
        boton9.setFocusPainted(false);
        boton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_2.png"))); // NOI18N
        boton9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_3.png"))); // NOI18N
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 73, 70));

        FondoTablaJL.setForeground(new java.awt.Color(255, 255, 255));
        FondoTablaJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.png"))); // NOI18N
        FondoTablaJL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(FondoTablaJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 180, 230));

        FondoJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(FondoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        // TODO add your handling code here:   
        System.exit(0); 
    }//GEN-LAST:event_botonExitActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
        Dato(boton1);
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
        Dato(boton2);
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
        Dato(boton3);
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
        Dato(boton4);
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        // TODO add your handling code here:
        Dato(boton5);
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        // TODO add your handling code here:
        Dato(boton6);
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        // TODO add your handling code here:
        Dato(boton7);
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        // TODO add your handling code here:
        Dato(boton8);
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        // TODO add your handling code here:
        Dato(boton9);
    }//GEN-LAST:event_boton9ActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new VentanaPrincipal().setVisible(true);

    }//GEN-LAST:event_botonAtrasActionPerformed

    
    public void Dato(JButton cuadro){
        if (!gano)//verifica si no se gano el juego 
        {
            if(cuadro.getText().equals(""))//comprueba que el label no tenga letras
            {
                if (turno%2==1)//verifica el valor del turno para saber que letra asigna 
                {
                    cuadro.setText("x");
                    cuadro.setForeground(colorx);//asigna el color a la letra x
                    if (contimp>=3)//comprueba que ya esten almenos 3 x en el tablero 
                    {
                        verificar("x");//verifica si la x ya esta en triky
                    }
                    contimp++;//cuenta las x
                } 
                else{
                    cuadro.setText("o");
                    cuadro.setForeground(coloro);//asigna el color a la letra x
                    if (contp>=3) //comprueba que ya esten almenos 3 0 en el tablero 
                    {
                        verificar("o");//verifica si la o ya esta en triky
                    }
                    contp++;
                }
                turno++;//cuenta las o
            }
        }        
    }
    
    public void verificar(String parametro){
        
        int contador = 0;
        int a,b;  
        boolean reinicio = false;//inidica si ya se reinicio el juego
        
        for (int x = 0; x < 2; x++){
            for (int i = 0; i < cuadros.length; i++){  
                for (int j = 0; j < cuadros.length; j++){
                    if (x==0){
                        a=i;//posicion de la fila
                        b=j;//posicion de la columna 
                    } else{
                        a=j;//posicion de la fila
                        b=i;//posicion de la columna 
                    }
                    if (cuadros[a][b].getText().equals(parametro)) {
                        contador++;//cuenta las de una misma letra
                    }
                }
                if (!gano && contador == 3){
                    if (turno%2==1){
                        JOptionPane.showMessageDialog(null, "Gano Jugador 1");
                    } else{
                        JOptionPane.showMessageDialog(null, "Gano Jugador 2");
                    }
                    /*JOptionPane.showMessageDialog(null, ":v");
                    if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0){
                        nuevo();//reinicia el juego
                        reinicio = true;//indica q el juego se reinicio
                    }
                    else{
                        gano = false;
                    } 
                    break;*/
                    nuevo();
                }
                contador = 0;
            } 
        }
        
        if (!reinicio) {
            int pos;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < cuadros.length; j++) {
                   if (i==0) {
                        pos = j;
                    } else {
                        pos = 2-j;
                    }
                    if (cuadros[j][pos].getText().equals(parametro)) {
                        contador++;
                    }
                }
                
                if (contador == 3){                    
                    if (turno%2==1){
                        JOptionPane.showMessageDialog(null, "Gano Jugador 1");
                    } else{
                        JOptionPane.showMessageDialog(null, "Gano Jugador 2");
                    }
                    /*JOptionPane.showMessageDialog(null, ":v");
                    if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0){
                        nuevo();
                        break;
                    } else{
                        gano = false;
                        break;
                    }*/
                    nuevo();
                }
                contador=0;
            }
        }
        
    }
    //Esta funcion reinicia el juego
    public void nuevo() {
        
        gano = false;
        turno=contp=contimp=2;
        Color colorx=Color.red;
        Color coloro=Color.YELLOW;
        for (int i = 0; i < cuadros.length; i++) {
            for (int j = 0; j < cuadros.length; j++) {
                cuadros[i][j].setText("");
            }
        }
    }

    
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
            java.util.logging.Logger.getLogger(VentanaJuego1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego1vs1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego1vs1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoJL;
    private javax.swing.JLabel FondoTablaJL;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}