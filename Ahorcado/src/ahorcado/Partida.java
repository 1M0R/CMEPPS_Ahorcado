/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author Pablo
 */
public class Partida {
    private Jugador jugador1;
    private Jugador jugador2;

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }
    
    public Partida(){
        jugador1 = new Jugador();
        jugador2 = new Jugador();
    }
    
    
    
    
}
