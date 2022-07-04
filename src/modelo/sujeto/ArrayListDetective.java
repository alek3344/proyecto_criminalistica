/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sujeto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelo.CASOS.Casos_1;
import modulo.ArrayListCasos;
import modulo.ICasosDao;

/**
 *
 * @author asus
 */
public class ArrayListDetective implements IDetectivesDao{

    private List<sujeto> ListaDetectives;
    
    public ArrayListDetective(){
        this.ListaDetectives = new ArrayList(); 
    }
    
    @Override
    public void insertarDetectives(sujeto p) {
        this.ListaDetectives.add(p);
    }

    @Override
    public List<sujeto> leerDetectives() {
        List<sujeto> lista = new ArrayList(this.ListaDetectives);
       return lista;
    }

    @Override
    public sujeto buscarDetectives(sujeto p) {
        sujeto buscar=null;
        for(sujeto i: this.ListaDetectives){
            if(i.getId() == p.getId()){
                buscar = i;
                break;
            }
        }
        return buscar;
    }

    @Override
    public sujeto eliminarDetectives(sujeto p) {
        Iterator<sujeto> i = this.ListaDetectives.iterator();
        sujeto eliminado=null;
        while(i.hasNext()){
            sujeto aux = i.next();
            if(aux.getId() == p.getId()){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }

    
}
