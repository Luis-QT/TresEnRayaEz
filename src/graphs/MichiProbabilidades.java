/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Giordano
 */
public class MichiProbabilidades {
    
    private int quienComenzoPrimero;
    // 1 para el Jugador
    // 2 para la Computadora
    
    public MichiProbabilidades(){
        this.quienComenzoPrimero=1;
    }
    
    public int obtenerCasillaElegida(int[] arreglo,int nivel){
        int respuesta=-1;
        double probabilidad=0;
        int[] contador =new int[3];
        
        int falta[] = this.obtenerFalta(arreglo, nivel);
        for(int i=0;i<falta.length;i++){
            this.vaciarContador(contador);
            int[] copia=new int[9];
            
            this.copiarArreglo(copia, arreglo, nivel);
            copia[nivel]=falta[i];
            this.obtenerProbabilidad(copia, contador, nivel+1);
            if(this.obtenerProbabilidadComputadoraGana(contador)>=probabilidad){
                probabilidad=this.obtenerProbabilidadComputadoraGana(contador);
                respuesta=falta[i];
            }
        }
        
        return respuesta;
    }
    
    public void obtenerProbabilidad(int[] arreglo, int[] contador,int nivel){
        int resultado = obtenerResultado(arreglo,nivel);
        if(resultado!=-2){
            
            if(resultado==-1){
                //Gano el Usuario
                contador[2]++;
            }else if(resultado==0){
                //Quedo en Empate
                contador[1]++;
            }else{
                
                //Gano la Computadora
                contador[0]++;
            }
        }else{
            int falta[] = this.obtenerFalta(arreglo, nivel);
            for(int i=0;i<falta.length;i++){
                int[] copia=new int[9];
                this.copiarArreglo(copia, arreglo, nivel);
                copia[nivel]=falta[i];
                obtenerProbabilidad(copia,contador,nivel+1);
            }
        }
    }
    public int obtenerResultado(int[] arreglo,int nivel){
        int w;
        int[] matriz =new int[9];
        for(int i=0;i<9;i++){
            matriz[i]=0;
        }
        if(quienComenzoPrimero==1){
            w=-1;
        }else{
            w=1;
        }
        for(int i=0;i<nivel;i++){
            matriz[arreglo[i]-1]=w;
            w=w*-1;
        }
        if(((matriz[0]==matriz[1] && matriz[1]==matriz[2]) || (matriz[0]==matriz[3] && matriz[3]==matriz[6]) )&& matriz[0]!=0){
            return matriz[0];
        }else if(((matriz[3]==matriz[4] && matriz[4]==matriz[5]) || (matriz[1]==matriz[4] && matriz[4]==matriz[7]) ||
                (matriz[0]==matriz[4] && matriz[4]==matriz[8]) || (matriz[6]==matriz[4] && matriz[4]==matriz[2]))&& matriz[4]!=0){
            return matriz[4];
        }else if(((matriz[6]==matriz[7] && matriz[7]==matriz[8]) || (matriz[2]==matriz[5] && matriz[5]==matriz[8]))&& matriz[8]!=0){
            return matriz[8];
        }
        if(matriz[0]!=0 && matriz[1]!=0&& matriz[2]!=0&& matriz[3]!=0&& matriz[4]!=0&& matriz[5]!=0&& matriz[6]!=0&&
                 matriz[7]!=0&& matriz[8]!=0){
            return 0;
        }
        return -2;
    }
    public int[] obtenerFalta(int[] arreglo,int nivel){
        int[] falta=new int[9-nivel];
        int incremento =0;
        boolean bandera=true;
        for(int i=0;i<9;i++){
            bandera=true;
            for(int j=0;j<nivel;j++){
                if((i+1)==arreglo[j]){
                    bandera=false;
                    break;
                }
            }
            if(bandera==true){
                falta[incremento]=(i+1);
                incremento++;
            }
            if(incremento==9-nivel){
                break;
            }
        }
        return falta;
    }
    public void copiarArreglo(int[] copia,int[] original,int nivel){
        for(int i=0;i<nivel;i++){
            copia[i]=original[i];
        }
    }
    public void vaciarContador(int[] contador){
        for(int i=0;i<3;i++){
            contador[i]=0;
        }
    }
    public double obtenerProbabilidadComputadoraGana(int[] contador){
        double total = contador[0]+contador[1]+contador[2];
        return contador[0]/total;
    }
    public double obtenerProbabilidadJugadorGana(int[] contador){
        double total = contador[0]+contador[1]+contador[2];
        return contador[2]/total;
    }
    public double obtenerProbabilidadEmpate(int[] contador){
        double total = contador[0]+contador[1]+contador[2];
        return contador[1]/total;
    }
}
