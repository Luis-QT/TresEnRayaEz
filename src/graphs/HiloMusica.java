/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.applet.AudioClip;

/**
 *
 * @author LLLL
 */
public class HiloMusica implements Runnable{
    
    int segundos;
    private AudioClip sonido;
    Thread t;

    public HiloMusica(int segundos, String url) {
        segundos--;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/"+url+".wav"));
        this.segundos = segundos;
        t = new Thread(this);
        t.start();
    }
    
    @Override
    public void run() {
        sonido.play();
        try{
            for(int i=segundos;i>=0;i--){
                for(int j=999;j>=0;j--){
                    Thread.sleep(1);
                }
            }    
            run();
        }catch(InterruptedException e){
        }
    }
    public void detener(){
        t.interrupt();
        sonido.stop();
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
