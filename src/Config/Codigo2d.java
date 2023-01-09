/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author v103760
 */
public class Codigo2d {

    private String codigoDuplo;
    
    
    public Codigo2d() {
    }
   
    public void codigo2d(String valor){
      
        codigoDuplo ="^FO200,100^BXN,6,200,,,,,1^FD"+valor+"^FS ^FO380,380^BXN,6,200,,,,,1^FD"+valor+"^FS";
        
        
    }

    public String getCodigoDuplo() {
        return codigoDuplo;
    }
    
}
