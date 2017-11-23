/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import com.sun.awt.AWTUtilities;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Jugador;

/**
 *
 * @author GabrielGiancarlo
 */
public class Ventana1vsPc_Nivel_Dificil extends javax.swing.JFrame {
    Jugador jugador;
    HiloTemporizador hiloTempo;
    HiloMusica hiloMusica;
    private int[] arreglo;
    private int nivel;
    MichiProbabilidades michi;
    private boolean fin;
    
    public void botonTransparente(){ 
        botonExit.setOpaque(false);
        botonExit.setContentAreaFilled(false);
        botonExit.setBorderPainted(false);
    }
    
    
    public Ventana1vsPc_Nivel_Dificil(Jugador jugador) {
        michi=new MichiProbabilidades();
        arreglo=new int[9];
        nivel=0;
        fin=false;
        
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        this.setVisible(true);
        this.botonTransparente();
        
        hiloTempo = new HiloTemporizador(2, txtTemporizador, this);
        
        txtTemporizador.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        hiloMusica = new HiloMusica( 126 , "1vs1");
        this.jugador = jugador;
        jugador.setJuegaDificil(true);
        
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
    
    public void marcarComputadora(int i){
        
        if(i==1){
            boton1.setText("O");
        }else if(i==2){
            boton2.setText("O");
        }else if(i==3){
            boton3.setText("O");
        }else if(i==4){
            boton4.setText("O");
        }else if(i==5){
            boton5.setText("O");
        }else if(i==6){
            boton6.setText("O");
        }else if(i==7){
            boton7.setText("O");
        }else if(i==8){
            boton8.setText("O");
        }else if(i==9){
            boton9.setText("O");
        }
        hiloTempo.detener();
        hiloTempo = new HiloTemporizador(2, txtTemporizador, this);
    }
    public void terminoPartida(){
        String cadena="";
        if(((boton1.getText().equals(boton2.getText()) && boton2.getText().equals(boton3.getText())) || (boton1.getText().equals(boton4.getText()) && boton4.getText().equals(boton7.getText())) && !boton1.equals("") )){
            
            cadena=boton1.getText();
        }else if(((boton4.getText().equals(boton5.getText()) && boton5.getText().equals(boton6.getText())) || (boton2.getText().equals(boton5.getText()) && boton5.getText().equals(boton8.getText()))||
                (boton1.getText().equals(boton5.getText()) && boton5.getText().equals(boton9.getText()))|| (boton3.getText().equals(boton5.getText()) && boton5.getText().equals(boton7.getText()))) && !boton5.equals("")  ){
            cadena=boton5.getText();
        }else if(((boton7.getText().equals(boton8.getText()) && boton8.getText().equals(boton9.getText())) || (boton3.getText().equals(boton6.getText()) && boton6.getText().equals(boton9.getText())) ) && !boton9.equals("") ){
            cadena=boton9.getText();
        }
        if(cadena.equals("X")){
            hiloTempo.detener();
            JOptionPane.showMessageDialog(null, "Gano el Jugador");
            this.fin=true;
        }else if(cadena.equals("O")){
            hiloTempo.detener();
            JOptionPane.showMessageDialog(null, "Gano la Computadora");
            this.fin=true;
        }
        if(cadena.equals("")&&!boton1.getText().equals("") && !boton2.getText().equals("") &&!boton3.getText().equals("")&&
                !boton4.getText().equals("")&&!boton5.getText().equals("")&&!boton6.getText().equals("")&&
                !boton7.getText().equals("")&&!boton8.getText().equals("")&&!boton9.getText().equals("")){
            hiloTempo.detener();
            txtTemporizador.setText("00:000");
            JOptionPane.showMessageDialog(null, "Empate");
            this.fin=true;
        }
    }
    public int cuidadoConElJugador(){
        if(boton4.getText().equals(boton7.getText()) && boton4.getText().equals("X") && boton1.getText().equals("")){
            return 1;
        }else if(boton5.getText().equals(boton8.getText()) && boton5.getText().equals("X")&& boton2.getText().equals("")){
            return 2;
        }else if(boton6.getText().equals(boton9.getText()) && boton6.getText().equals("X")&& boton3.getText().equals("")){
            return 3;
        }else if(boton1.getText().equals(boton7.getText()) && boton1.getText().equals("X")&& boton4.getText().equals("")){
            return 4;
        }else if(boton2.getText().equals(boton8.getText()) && boton2.getText().equals("X")&& boton5.getText().equals("")){
            return 5;
        }else if(boton3.getText().equals(boton9.getText()) && boton3.getText().equals("X")&& boton6.getText().equals("")){
            return 6;
        }else if(boton1.getText().equals(boton4.getText()) && boton1.getText().equals("X")&& boton7.getText().equals("")){
            return 7;
        }else if(boton2.getText().equals(boton5.getText()) && boton2.getText().equals("X")&& boton8.getText().equals("")){
            return 8;
        }else if(boton3.getText().equals(boton6.getText()) && boton3.getText().equals("X")&& boton9.getText().equals("")){
            return 9;
        }else if(boton2.getText().equals(boton3.getText()) && boton2.getText().equals("X")&& boton1.getText().equals("")){
            return 1;
        }else if(boton1.getText().equals(boton3.getText()) && boton1.getText().equals("X")&& boton2.getText().equals("")){
            return 2;
        }else if(boton1.getText().equals(boton2.getText()) && boton1.getText().equals("X")&& boton3.getText().equals("")){
            return 3;
        }else if(boton5.getText().equals(boton6.getText()) && boton5.getText().equals("X")&& boton4.getText().equals("")){
            return 4;
        }else if(boton4.getText().equals(boton6.getText()) && boton4.getText().equals("X")&& boton5.getText().equals("")){
            return 5;
        }else if(boton4.getText().equals(boton5.getText()) && boton4.getText().equals("X")&& boton6.getText().equals("")){
            return 6;
        }else if(boton8.getText().equals(boton9.getText()) && boton8.getText().equals("X")&& boton7.getText().equals("")){
            return 7;
        }else if(boton7.getText().equals(boton9.getText()) && boton7.getText().equals("X")&& boton8.getText().equals("")){
            return 8;
        }else if(boton7.getText().equals(boton8.getText()) && boton7.getText().equals("X")&& boton9.getText().equals("")){
            return 9;
        }else if(boton5.getText().equals(boton9.getText()) && boton5.getText().equals("X")&& boton1.getText().equals("")){
            return 1;
        }else if(boton1.getText().equals(boton9.getText()) && boton1.getText().equals("X")&& boton5.getText().equals("")){
            return 5;
        }else if(boton1.getText().equals(boton5.getText()) && boton1.getText().equals("X")&& boton9.getText().equals("")){
            return 9;
        }else if(boton5.getText().equals(boton7.getText()) && boton5.getText().equals("X")&& boton3.getText().equals("")){
            return 3;
        }else if(boton3.getText().equals(boton7.getText()) && boton3.getText().equals("X")&& boton5.getText().equals("")){
            return 5;
        }else if(boton3.getText().equals(boton5.getText()) && boton3.getText().equals("X")&& boton7.getText().equals("")){
            return 7;
        }else{
            return 0;
        }
    }
    
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
        boton8 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botonExit = new javax.swing.JButton();
        FondoTablaJL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTemporizador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
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
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 110, 30));

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

        FondoTablaJL.setForeground(new java.awt.Color(255, 255, 255));
        FondoTablaJL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.png"))); // NOI18N
        FondoTablaJL.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(FondoTablaJL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 255, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("Te mamaste :v\n");
        jScrollPane1.setViewportView(jTextArea1);

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
        hiloMusica.detener();
        this.setVisible(false);
        new VentanaPrincipal().setVisible(true);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void txtTemporizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemporizadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemporizadorActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
        if(boton1.getText().equals("") && !this.fin){
            boton1.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=1;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
        if(boton2.getText().equals("") && !this.fin){
            boton2.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=2;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
        
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
        if(boton3.getText().equals("") && !this.fin){
            boton3.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=3;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        if(boton4.getText().equals("") && !this.fin){
            boton4.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=4;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
        if(boton5.getText().equals("") && !this.fin){
            boton5.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=5;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        if(boton6.getText().equals("") && !this.fin){
            boton6.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=6;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        if(boton8.getText().equals("") && !this.fin){
            boton8.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=8;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        if(boton7.getText().equals("") && !this.fin){
            boton7.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=7;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        if(boton9.getText().equals("") && !this.fin){
            boton9.setText("X");
            this.terminoPartida();
            nivel++;
            this.arreglo[nivel-1]=9;
            
            
            if(!this.fin){
                int vaAGanar=this.cuidadoConElJugador();
                if(vaAGanar!=0){
                    marcarComputadora(vaAGanar);
                    nivel++;
                    this.arreglo[nivel-1]=vaAGanar;
                }else{
                    int lugar=michi.obtenerCasillaElegida(arreglo, nivel);
                    nivel++;
                    marcarComputadora(lugar);
                    this.arreglo[nivel-1]=lugar;
                }
                this.terminoPartida();
            }
        }
    }//GEN-LAST:event_boton9ActionPerformed

    
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
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtTemporizador;
    // End of variables declaration//GEN-END:variables
}
