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
public interface IDetectivesDao {
    void insertarDetectives(sujeto p);
    List<sujeto> leerDetectives();
    sujeto buscarDetectives(sujeto p);
    sujeto eliminarDetectives(sujeto p);
}
