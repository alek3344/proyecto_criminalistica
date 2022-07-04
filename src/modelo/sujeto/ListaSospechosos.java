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
public class ListaSospechosos extends sujeto{

    String alias;
    int numvivienda;
    String ciudad;
    String departamento;
    String pais;
    String descripcion;


    public ListaSospechosos(String alias, int numvivienda, String ciudad, String departamento, String pais, String descripcion, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.alias = alias;
        this.numvivienda = numvivienda;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.descripcion = descripcion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getNumvivienda() {
        return numvivienda;
    }

    public void setNumvivienda(int numvivienda) {
        this.numvivienda = numvivienda;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "ListaSospechosos{" + "alias=" + alias + ", numvivienda=" + numvivienda + ", ciudad=" + ciudad + ", departamento=" + departamento + ", pais=" + pais + ", descripcion=" + descripcion + '}';
    }
    
    @Override
    public String getDataStringFormat() {
        return this.id + ";" + this.nombre + ";" + this.id + ";" + this.alias + ";" + this.edad + ";" + this.numvivienda
                + ";" + this.ciudad + ";" + this.pais + ";" + this.departamento + ";" + this.descripcion;
    }

    @Override
    public String getStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
