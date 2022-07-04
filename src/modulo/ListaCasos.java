/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo;

import java.util.List;
import modelo.CASOS.Casos_1;

/**
 *
 * @author asus
 */

public class ListaCasos implements ICasosDao {
    
    private ICasosDao registroCasos;

    public ListaCasos() {
        this.registroCasos = new ArrayListCasos();
    }
    
    
    @Override
    public void insertarCasos(Casos_1 p) {
        
        this.registroCasos.insertarCasos(p);
        
    }

    @Override
    public List<Casos_1> leerCasos() {
        
        return this.registroCasos.leerCasos();
        
    }

    @Override
    public Casos_1 buscarCasos(Casos_1 p) {
        
        return this.registroCasos.buscarCasos(p);
        
    }

    @Override
    public Casos_1 eliminarCasos(Casos_1 p) {
        
        return this.registroCasos.eliminarCasos(p);
        
    }
    
}

