/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.function.Function;
import model.Jugador;

/**
 *
 * @author LLLL
 */
public class Puntaje {
       public static ArrayList<Jugador> listaFacil(){
           ArrayList<String> lista = new ArrayList();
           ArrayList<Jugador> listaJugador = new ArrayList<>();
           try{
               File f = new File("facil.txt");
                FileReader fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
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
           ArrayList<String> lista = new ArrayList();
           ArrayList<Jugador> listaJugador = new ArrayList<>();
           try{
                File f = new File("medio.txt");
                FileReader fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
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
          
           ArrayList<String> lista = new ArrayList();
           ArrayList<Jugador> listaJugador = new ArrayList<>();
           try{ 
                File f = new File("dificil.txt");
                FileReader fr = new FileReader(f);
                BufferedReader bf = new BufferedReader(fr);
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
       public static void insertarFacil(Jugador jugador){
            File f;
            FileWriter w;
            BufferedWriter bw ;
            PrintWriter wr;
            
            try{
                f = new File("facil.txt");
                w = new FileWriter(f,true);
                wr = new PrintWriter(w);
                
                wr.println(jugador.getNombre()+","+jugador.getPuntuacionFacil());
                wr.close();
            }catch(Exception e){
                
            }
            
      }
       public static void insertarMedio(Jugador jugador){
            File f;
            FileWriter w;
            BufferedWriter bw ;
            PrintWriter wr;
            
            try{
                f = new File("medio.txt");
                w = new FileWriter(f,true);
                wr = new PrintWriter(w);
                
                wr.println(jugador.getNombre()+","+jugador.getPuntuacionFacil());
                wr.close();
            }catch(Exception e){
                
            }
            
      }
       public static void insertarDificil(Jugador jugador){
            File f;
            FileWriter w;
            BufferedWriter bw ;
            PrintWriter wr;
            
            try{
                f = new File("dificil.txt");
                w = new FileWriter(f,true);
                wr = new PrintWriter(w);
                
                wr.println(jugador.getNombre()+","+jugador.getPuntuacionFacil());
                wr.close();
            }catch(Exception e){
                
            }
            
      }
       
}






































