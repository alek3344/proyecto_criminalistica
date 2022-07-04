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
public interface ICasosDao {
    void insertarCasos(Casos_1 p);
    List<Casos_1> leerCasos();
    Casos_1 buscarCasos(Casos_1 p);
    Casos_1 eliminarCasos(Casos_1 p);
}
