/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.CASOS;

/**
 *
 * @author asus
 */
public abstract class Casos_1 {
    
    protected int codigo;
    protected String tipo;
    protected String descrip;
    protected String priori;
    protected String nomclave;
    protected String fecha;
    protected String observacion;

    public Casos_1() {
    }
    
    public Casos_1(int codigo) {
        this.codigo = codigo;
    }

    public Casos_1(int codigo, String tipo, String descrip,String priori, String nomclave, String fecha, String observacion) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.descrip = descrip;
        this.priori = priori;
        this.nomclave = nomclave;
        this.fecha = fecha;
        this.observacion = observacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }


    public String getPriori() {
        return priori;
    }

    public void setPriori(String priori) {
        this.priori = priori;
    }

    public String getNomclave() {
        return nomclave;
    }

    public void setNomclave(String nomclave) {
        this.nomclave = nomclave;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Casos_1{" + "codigo=" + codigo + ", tipo=" + tipo + ", descrip=" + descrip + ", priori=" + priori + ", nomclave=" + nomclave + ", fecha=" + fecha + ", observacion=" + observacion + '}';
    }
    
    
    public abstract String getDataStringFormat(); // retorna los datos del objeto en formato String
    public abstract String getStringFormat();

}
