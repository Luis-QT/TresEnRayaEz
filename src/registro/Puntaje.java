/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.function.Function;
import model.Jugador;

/**
 *
 * @author LLLL
 */
public class Puntaje {
       public static ArrayList<Jugador> listaFacil(){
           String direccion = "C:\\Users\\LLLL\\Desktop\\TresEnRaya\\src/facil.txt";
           ArrayList<String> lista = new ArrayList();
           ArrayList<Jugador> listaJugador = new ArrayList<>();
           try{
                BufferedReader bf = new BufferedReader(new FileReader(direccion));
                String temp = "";
                String bfRead;
                while((bfRead = bf.readLine()) != null){
                    lista.add(bfRead);
                }

                lista.stream().map(new Function<String, Jugador>(){
                    @Override
                    public Jugador apply(String t) {
                        String[] txt = ((String)t).split(",");
                        Jugador aux = new Jugador(txt[0]);
                        aux.setPuntuacionFacil(Integer.parseInt(txt[1]));
                        return aux;
                    }
                }).forEach(n->listaJugador.add(n));
            }catch(Exception e){
           }
           return listaJugador;
       }
      public static ArrayList<Jugador> listaMedio(){
           String direccion = "C:\\Users\\LLLL\\Desktop\\TresEnRaya\\src/medio.txt";
           ArrayList<String> lista = new ArrayList();
           ArrayList<Jugador> listaJugador = new ArrayList<>();
           try{
                BufferedReader bf = new BufferedReader(new FileReader(direccion));
                String temp = "";
                String bfRead;
                while((bfRead = bf.readLine()) != null){
                    lista.add(bfRead);
                }

                lista.stream().map(new Function<String, Jugador>(){
                    @Override
                    public Jugador apply(String t) {
                        String[] txt = ((String)t).split(",");
                        Jugador aux = new Jugador(txt[0]);
                        aux.setPuntuacionMedio(Integer.parseInt(txt[1]));
                        return aux;
                    }
                }).forEach(n->listaJugador.add(n));
            }catch(Exception e){
           }
           return listaJugador;
       }
      public static ArrayList<Jugador> listaDificil(){
           String direccion = "C:\\Users\\LLLL\\Desktop\\TresEnRaya\\src/dificil.txt";
           ArrayList<String> lista = new ArrayList();
           ArrayList<Jugador> listaJugador = new ArrayList<>();
           try{
                BufferedReader bf = new BufferedReader(new FileReader(direccion));
                String temp = "";
                String bfRead;
                while((bfRead = bf.readLine()) != null){
                    lista.add(bfRead);
                }

                lista.stream().map(new Function<String, Jugador>(){
                    @Override
                    public Jugador apply(String t) {
                        String[] txt = ((String)t).split(",");
                        Jugador aux = new Jugador(txt[0]);
                        aux.setPuntuacionDificil(Integer.parseInt(txt[1]));
                        return aux;
                    }
                }).forEach(n->listaJugador.add(n));
            }catch(Exception e){
           }
           return listaJugador;
       }
       
}
