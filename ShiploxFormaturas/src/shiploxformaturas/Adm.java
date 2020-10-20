/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shiploxformaturas;


import java.util.ArrayList;
import java.util.List;
import shiploxformaturas.Evento;

/**
 *
 * @author nicol
 */
public class Adm {
    private List<Evento> listaEvento;
    
    public Adm(){
        listaEvento = new ArrayList<>();
    }

    /**
     * @return the listaEvento
     */
    public List<Evento> getListaEvento() {
        return listaEvento;
    }

    /**
     * @param listaEvento the listaEvento to set
     */
    public void setListaEvento(List<Evento> listaEvento) {
        this.listaEvento = listaEvento;
    }
    
    public void remover(int id, List<Evento> listaEvento) {
        for(int i = 0; i < listaEvento.size(); i++){
            if(id == listaEvento.get(i).getId()){
                listaEvento.remove(i); //Remove do vetor
                i = listaEvento.size();
            }
        }
    }
}
