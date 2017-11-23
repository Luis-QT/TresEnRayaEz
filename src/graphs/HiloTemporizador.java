/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LLLL
 */
public class HiloTemporizador implements Runnable{
    int segundos;
    JTextField muestra;
    Ventana1vsPc_Nivel_Dificil vista;
    Thread t;

    public HiloTemporizador(int segundos ,JTextField muestra, Ventana1vsPc_Nivel_Dificil vista) {
        segundos--;
        this.segundos = segundos;
        this.muestra = muestra;
        this.vista = vista;
        t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        try{
            for(int i=segundos;i>=0;i--){
                for(int j=999;j>=0;j--){
                    muestra.setText(i+":"+mili(j));
                    if(i==0 && j==0){
                        vista.botonVacio();
                    }
                    Thread.sleep(1);
                }
            }    
        }catch(InterruptedException e){
        }
    }
    
    public void detener(){
        t.interrupt();
    }
    private String mili(int m){
        if(1000>m){
            return ""+m;
        }else if(100>m){
            return "0"+m;
        }else {
            return "00"+m;
        }
    }
}
