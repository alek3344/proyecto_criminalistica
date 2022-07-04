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
public class narcotrafico extends Casos_1{

    String asociacion;

    public narcotrafico(String asociacion, int codigo, String tipo, String descrip, String priori, String nomclave, String fecha, String observacion) {
        super(codigo, tipo, descrip, priori, nomclave, fecha, observacion);
        this.asociacion = asociacion;
    }

    public String getAsociacion() {
        return asociacion;
    }

    public void setAsociacion(String asociacion) {
        this.asociacion = asociacion;
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
    public String getDataStringFormat() {
        return this.codigo +";"+ "narcotrafico" +";"+ this.descrip +";"+ this.priori+";"+this.nomclave+";"+this.fecha+";"+this.observacion+"\n";
    }

    @Override
    public String getStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
