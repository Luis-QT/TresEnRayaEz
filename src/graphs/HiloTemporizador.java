/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author LLLL
 */
public class HiloTemporizador implements Runnable{
    int segundos;
    JTextField muestra;
    Thread t;

    public HiloTemporizador(int segundos ,JTextField muestra) {
        this.segundos = segundos;
        this.muestra = muestra;
        t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        try{
            for(int i=segundos;i>=0;i--){
                for(int j=999;j>=0;j--){
                    muestra.setText(i+":"+mili(j));
                    Thread.sleep(1);
                }
            }    
        }catch(InterruptedException e){
        }
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
