
import java.util.ArrayList;
import java.util.function.Consumer;
import model.Jugador;
import registro.Puntaje;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LLLL
 */
public class prueba {
    public static void main(String[] args) {
        ArrayList<Jugador> lista = Puntaje.listaFacil();
        System.out.println("dsfdsf");
        lista.stream().forEach(n->System.out.println(n.getNombre()));
    
//            Jugador juega = new Jugador("dsafsadf");
//            juega.setPuntuacionFacil(5);
//            Puntaje.insertarFacil(juega);

    }
}
