/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sujeto;

import java.util.List;

/**
 *
 * @author asus
 */
public class ListaDetective implements  IDetectivesDao{
    
    private IDetectivesDao registroDetectives;

    public ListaDetective() {
        this.registroDetectives = new ArrayListDetective();
    }

    @Override
    public void insertarDetectives(sujeto p) {
        this.registroDetectives.insertarDetectives(p);
    }

    @Override
    public List<sujeto> leerDetectives() {
        return this.registroDetectives.leerDetectives();
    }

    @Override
    public sujeto buscarDetectives(sujeto p) {
        return this.registroDetectives.buscarDetectives(p);
    }

    @Override
    public sujeto eliminarDetectives(sujeto p) {
        return this.registroDetectives.eliminarDetectives(p);
    }
}
