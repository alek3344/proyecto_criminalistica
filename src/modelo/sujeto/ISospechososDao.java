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
public interface ISospechososDao {
    void insertarCasos(sujeto p);
    List<sujeto> leerCasos();
    sujeto buscarCasos(sujeto p);
    sujeto eliminarCasos(sujeto p);
}
