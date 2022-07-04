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
public class homicidio extends Casos_1{

    public homicidio(int codigo, String tipo, String descrip, String priori, String nomclave, String fecha, String observacion) {
        super(codigo, tipo, descrip, priori, nomclave, fecha, observacion);
    }
    
    
    @Override
    public String getDataStringFormat() {
        return this.codigo +";"+ "homicidio" +";"+ this.descrip +";"+ this.priori+";"+this.nomclave+";"+this.fecha+";"+this.observacion+"\n";
    }

    @Override
    public String getStringFormat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
