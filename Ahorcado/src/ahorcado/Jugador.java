/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class Jugador {

    
    private String palabra;
    private int victorias;
    public List<String> letrasIntentadas;

    
    public Jugador() {
        this.palabra = "";
        this.victorias = 0;
        letrasIntentadas = new ArrayList<String>();
    }
   
    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    
    public void borrarLetrasIntentadas(){
        letrasIntentadas = new ArrayList<String>();
        
    }
    
    public String mostrarLetrasIntentadas(){
        String letras = "";
        for (int i = 0; i < letrasIntentadas.size(); i++) {
            letras += letrasIntentadas.get(i) + " ";
        }
        System.out.println(letras);
        
        return letras;
    }
    
    
   
    
    
}
