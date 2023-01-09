/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarrasInicioFim;

/**
 *
 * @author v103760
 */
public class CodigoInicio {
  
    private String barrasInicio,barrasFinal;
    
    public void codigoInicio(){
      
      barrasInicio="^XA^PMY\n" +
      "^FO00,10^GB1890,0,8^FS\n" +
      "^XZ" ; 
        
  } 
  public void codigoFinal(String sap){
      
      barrasFinal="^XA^PMY\n" +
      "^FO00,10^GB1890,0,8^FS\n" +
      "^XZ";
  }  

    public String getBarrasInicio() {
        return barrasInicio;
    }

    public String getBarrasFinal() {
        return barrasFinal;
    }
}
