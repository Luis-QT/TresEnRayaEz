/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Random;

/**
 *
 * @author GabrielGiancarlo
 */

public class JuegoFacil {
    
    private int tabla3Raya[][]; //Representa el tablero de 3 en raya
    private int nGanador = -1; //Representa al jugador que Ganara
    private int uv[];//Representara la posicion donde jugara la maquina
    
    public JuegoFacil(){
        tabla3Raya = new int [3][3];
        uv = new int [2];
    }
    
    public int[][] getTablero(){
        return tabla3Raya;
    }
    
    public void empezarPartida(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //LLenar el tablero de -1(casillas vacias).
                tabla3Raya[i][j] = -1;
            }
        }
        nGanador = -1;
    }
    
    public void pulsaBoton(int n,int m){
        //Movimiento del jugador "persona".
        if((n >= 0)&& (n < 3) && (m < 3) && (tabla3Raya[n][m] == -1)){
            if(nGanador == -1){
                //El "0" es la ficha de la persona.
                tabla3Raya[n][m] = 0;
                nGanador = ganarPartida();
                jugadaOrdenador();
            }
        }
    }
    
    public int ganarPartida(){
        //Verificar diagonal "\".
        if((tabla3Raya[0][0]!=-1)&&(tabla3Raya[0][0]==tabla3Raya[1][1])&&(tabla3Raya[0][0]==tabla3Raya[2][2])){
            return tabla3Raya[0][0];
        }
        //Verificar diagonal "/".
        if((tabla3Raya[0][2]!=-1)&&(tabla3Raya[0][2]==tabla3Raya[1][1])&&(tabla3Raya[0][2]==tabla3Raya[2][0])){
            return tabla3Raya[0][2];
        }
        //Verificar lineas horizontales y verticales.
        for(int n=0;n<3;n++){
            if(tabla3Raya[n][0]!=-1 && tabla3Raya[n][0]==tabla3Raya[n][1] && tabla3Raya[n][0]==tabla3Raya[n][2]){
                return tabla3Raya[n][0];
            }
            if(tabla3Raya[0][n]!=-1 && tabla3Raya[0][n]==tabla3Raya[1][n] && tabla3Raya[0][n]==tabla3Raya[2][n]){
                return tabla3Raya[0][n];
            }
        }
        return -1;
    }
    
    public int getGanador(){
        return nGanador;
    }
    
    public int [] getUltimaPosicion(){
        return uv;
    }
    
    public boolean tableroCompleto(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(tabla3Raya[i][j]==-1){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean finPartida(){
        if(tableroCompleto() || ganarPartida()!=-1){
            return true;
        }else{
            return false;
        }
    }
    
    public void jugadaOrdenador(){
        if(!finPartida()){
            int f=0;
            int c=0;
    
            do{
                f = (int) (Math.random() * 3);
                c = (int) (Math.random() * 3);
            } while(tabla3Raya[f][c] != -1);
            //Jugada del ordenador.
            
            tabla3Raya[f][c] = 1;
            uv[0] = f;
            uv[1] = c;
        }
    }
   
}
