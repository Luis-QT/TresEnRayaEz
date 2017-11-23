/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import com.sun.awt.AWTUtilities;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author GabrielGiancarlo
 */
public class Ventana1vsPc_Nivel_Dificil extends javax.swing.JFrame {
    HiloTemporizadorDificil hiloTempo;
    HiloMusica hiloMusica;
    
    JuegoDificil juego=new JuegoDificil();
    int [][]ntablero=new int[3][3];
    int nganador=-1;
    
    public void botonTransparente(){ 
        botonExit.setOpaque(false);
        botonExit.setContentAreaFilled(false);
        botonExit.setBorderPainted(false);
    }
    
    public void chekGanador(){
        int uv[]=new int[3];
        uv=juego.getUltimaPosicion();
        if(uv[0]==0 && uv[1]==0){
            boton1.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==0 && uv[1]==1){
            boton2.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==0 && uv[1]==2){
            boton3.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==1 && uv[1]==0){
            boton4.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==1 && uv[1]==1){
            boton5.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==1 && uv[1]==2){
            boton6.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==2 && uv[1]==0){
            boton7.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==2 && uv[1]==1){
            boton8.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(uv[0]==2 && uv[1]==2){
            boton9.setText("0");
            hiloTempo.detener();
            hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        }
        if(nganador==0){
            txtResultados.setText("Has ganado!!!");
            hiloTempo.detener();
            if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0){
                reiniciar();//reinicia el juego
            }else{
                hiloMusica.detener();
                this.setVisible(false);
                new VentanaPrincipal().setVisible(true);
            }
        }
        if(nganador==1){
            txtResultados.setText("Has sido derrotado :/");
            hiloTempo.detener();
            if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0){
                reiniciar();//reinicia el juego
            }else{
                hiloMusica.detener();
                this.setVisible(false);
                new VentanaPrincipal().setVisible(true);
            }
        }
        
        if(nganador==-1){
            if(juego.tableroCompleto()){
            txtResultados.setText("Hubo empate.");
            hiloTempo.detener();
                if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ") == 0){
                    reiniciar();//reinicia el juego
                }else{
                    hiloMusica.detener();
                    this.setVisible(false);
                    new VentanaPrincipal().setVisible(true);
                }
            }
            
        }
    }
    public void botonVacio(){
        ActionEvent evt = null;
        if(boton1.getText().equals("")){
            boton1ActionPerformed(evt);
        }else if(boton2.getText().equals("")){
            boton2ActionPerformed(evt);
        }else if(boton3.getText().equals("")){
            boton3ActionPerformed(evt);
        }else if(boton4.getText().equals("")){
            boton4ActionPerformed(evt);
        }else if(boton5.getText().equals("")){
            boton5ActionPerformed(evt);
        }else if(boton6.getText().equals("")){
            boton6ActionPerformed(evt);
        }else if(boton7.getText().equals("")){
            boton7ActionPerformed(evt);
        }else if(boton8.getText().equals("")){
            boton8ActionPerformed(evt);
        }else if(boton9.getText().equals("")){
            boton9ActionPerformed(evt);
        }
    }
    
    public Ventana1vsPc_Nivel_Dificil() {
        
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        
        this.botonTransparente();
        hiloTempo = new HiloTemporizadorDificil(2, txtTemporizador, this);
        
        txtTemporizador.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hiloMusica = new HiloMusica( 126 , "1vs1");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTemporizador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FondoTablaJL = new javax.swing.JLabel();
        botonExit = new javax.swing.JButton();
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

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadroM_1.png"))); // NOI18N
        boton1.setBorder(null);
        boton1.setBorderPainted(false);
        boton1.setContentAreaFilled(false);
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
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, 70));

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
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, 70));

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
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, 70));

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
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, 70));

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
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, 70));

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
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, 70));

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
        getContentPane().add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, 70));

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
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, 70));

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
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, 70));

        txtResultados.setBackground(new java.awt.Color(0, 0, 0));
        txtResultados.setColumns(20);
        txtResultados.setForeground(new java.awt.Color(0, 255, 102));
        txtResultados.setRows(5);
        txtResultados.setText("Te mamaste :v\n");
        jScrollPane1.setViewportView(txtResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, 240));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8_Alarm_Clock_30px.png"))); // NOI18N

        txtTemporizador.setEditable(false);
        txtTemporizador.setBackground(new java.awt.Color(0, 0, 0));
        txtTemporizador.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txtTemporizador.setForeground(new java.awt.Color(0, 255, 0));
        txtTemporizador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTemporizador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtTemporizador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtTemporizador.setDisabledTextColor(new java.awt.Color(0, 255, 51));
        txtTemporizador.setEnabled(false);
        txtTemporizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemporizadorActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconos/icons8_Alarm_Clock_30px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTemporizador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtTemporizador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 160, -1));

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

        FondoJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        getContentPane().add(FondoJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        // TODO add your handling code here:   
        System.exit(0); 
    }//GEN-LAST:event_botonExitActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void txtTemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemporizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemporizadorActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        // TODO add your handling code here:
        if(boton1.getText().equals("")){
            boton1.setText("X");
            juego.pulsaBoton(0,0);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        // TODO add your handling code here:
        if(boton2.getText().equals("")){
            boton2.setText("X");
            juego.pulsaBoton(0,1);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        // TODO add your handling code here:
        if(boton3.getText().equals("")){
            boton3.setText("X");
            juego.pulsaBoton(0,2);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        // TODO add your handling code here:
        if(boton4.getText().equals("")){
            boton4.setText("X");
            juego.pulsaBoton(1,0);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        // TODO add your handling code here:
        if(boton5.getText().equals("")){
            boton5.setText("X");
            juego.pulsaBoton(1,1);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        // TODO add your handling code here:
        if(boton6.getText().equals("")){
            boton6.setText("X");
            juego.pulsaBoton(1,2);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        // TODO add your handling code here:
        if(boton7.getText().equals("")){
            boton7.setText("X");
            juego.pulsaBoton(2,0);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        // TODO add your handling code here:
        if(boton8.getText().equals("")){
            boton8.setText("X");
            juego.pulsaBoton(2,1);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        // TODO add your handling code here:
        if(boton9.getText().equals("")){
            boton9.setText("X");
            juego.pulsaBoton(2,2);
            nganador=juego.ganarPartida();
            chekGanador();
        }
    }//GEN-LAST:event_boton9ActionPerformed
    private void reiniciar() {                                          

        juego = new JuegoDificil();
        juego.empezarPartida();
        ntablero = juego.getTablero();
        nganador = -1;
        boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");
        boton7.setText("");
        boton8.setText("");
        boton9.setText("");
        txtResultados.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VentanaJuego().setVisible(true);
//            }
//        });
//    }

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultados;
    private javax.swing.JTextField txtTemporizador;
    // End of variables declaration//GEN-END:variables
}
