/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modelo.CASOS.Casos_1;

/**
 *
 * @author asus
 */
public class ArrayListCasos implements ICasosDao {
    
    private List<Casos_1> listaCasos;

    public ArrayListCasos() {
        this.listaCasos = new ArrayList();
    }
    
    
    @Override
    public void insertarCasos(Casos_1 p) {
        this.listaCasos.add(p);
    }

    @Override
    public List<Casos_1> leerCasos() {
       List<Casos_1> lista = new ArrayList(this.listaCasos);
       return lista;
    }

    @Override
    public Casos_1 buscarCasos(Casos_1 p) {
        Casos_1 buscar=null;
        for(Casos_1 i: this.listaCasos){
            if(i.getCodigo()==p.getCodigo()){
                buscar = i;
                break;
            }
        }
        return buscar;
        
    }

    @Override
    public Casos_1 eliminarCasos(Casos_1 p) {
        Iterator<Casos_1> i = this.listaCasos.iterator();
        Casos_1 eliminado=null;
        while(i.hasNext()){
            Casos_1 aux = i.next();
            if(aux.getCodigo()==p.getCodigo()){
                eliminado = aux;
                i.remove();
                break;
            }
        }
        return eliminado;
    }
    
}
