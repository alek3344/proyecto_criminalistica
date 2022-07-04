/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.sujeto;

/**
 *
 * @author asus
 */
public abstract class sujeto {
    
    protected int id;
    protected String nombre;
    protected int edad;

    public sujeto(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "sujeto{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    public abstract String getDataStringFormat(); // retorna los datos del objeto en formato String
    public abstract String getStringFormat();
}
