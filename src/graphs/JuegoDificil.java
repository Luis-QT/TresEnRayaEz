/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author LLLL
 */
public class JuegoDificil {
    private int ntablero[][];
    private int nGanador=-1;
    private int nContar=0;
    private int uv[];
    
    public JuegoDificil(){
        ntablero=new int [3][3];
        uv=new int [3];
    }
    public int[][] getTablero(){
        return ntablero;
    }
    
    public void empezarPartida(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //LLenar el tablero de -1(casillas vacias).
                ntablero[i][j]=-1;
            }
        }
        nGanador=-1;
    }
    
    public void pulsaBoton(int n,int m){
        //Movimiento del jugador "persona".
        if((n>=0)&& (n<3) && (m<3) && (ntablero[n][m]==-1)){
            if(nGanador==-1){
                //El "0" es la ficha de la persona.
                ntablero[n][m]=0;
                nGanador=ganarPartida();
                ponerFichaOrdenador();
            }
        }
    }
    
    public int ganarPartida(){
        //Verificar diagonal "/".
        if((ntablero[0][0]!=-1)&&(ntablero[0][0]==ntablero[1][1])&&(ntablero[0][0]==ntablero[2][2])){
            return ntablero[0][0];
        }
        //Verificar diagonal "/".
        if((ntablero[0][2]!=-1)&&(ntablero[0][2]==ntablero[1][1])&&(ntablero[0][2]==ntablero[2][0])){
            return ntablero[0][2];
        }
        //Verificar lineas horizontales y verticales.
        for(int n=0;n<3;n++){
            if(ntablero[n][0]!=-1 && ntablero[n][0]==ntablero[n][1] && ntablero[n][0]==ntablero[n][2]){
                return ntablero[n][0];
            }
            if(ntablero[0][n]!=-1 && ntablero[0][n]==ntablero[1][n] && ntablero[0][n]==ntablero[2][n]){
                return ntablero[0][n];
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
                if(ntablero[i][j]==-1){
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
    
    public void ponerFichaOrdenador(){
        if(!finPartida()){
            int f=0;
            int c=0;
            int v=-9999;
            int aux;
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(ntablero[i][j]==-1){
                        ntablero[i][j]=1;
                        aux=min();
                        if(aux>v){
                            v=aux;
                            f=i;
                            c=j;
                        }
                        ntablero[i][j]=-1;
                    }
                }
            }
            //Ficha del ordenador.
            ntablero[f][c]=1;
            uv[0]=f;
            uv[1]=c;
        }
    }
    
    public int max(){
        if(finPartida()){
            if(ganarPartida()!=-1){
                return -1;
            }else{
                return 0;
            }
        }
        int v=-9999;
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ntablero[i][j]==-1){
                    ntablero[i][j]=1;
                    aux=min();
                    if(aux>v){
                        v=aux;
                    }
                    ntablero[i][j]=-1;
                }
            }
        }
        return v;
    }
    
    public int min(){
         if(finPartida()){
            if(ganarPartida()!=-1){
                return 1;
            }else{
                return 0;
            }
        }
        int v=9999;
        int aux;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(ntablero[i][j]==-1){
                    ntablero[i][j]=0;
                    aux=max();
                    if(aux<v){
                        v=aux;
                    }
                    ntablero[i][j]=-1;
                }
            }
        }
        return v;
    }
}
