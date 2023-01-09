/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodigoData;

/**
 *
 * @author Valdenir Brito
 */
public class CodigoData {
    private String codigoData;

    public String getCodigoData() {
        return codigoData;
    }

    public void setCodigoData(String codigoData) {
        this.codigoData = codigoData;
    }
    
    public void codigoData(){
        codigoData = ""+
"^FT1130,0^A0N,44,40^FH^FD+dataForm+^FS\n" +
"^FT1300,0^A0N,44,40^SN100,-1,Y^FS\n" +
"^FT1130,82^A0N,44,40^FH^FD+dataForm+^FS\n" +
"^FT1300,82^A0N,44,40^SN100,-1,Y^FS\n" +
"^FT1630,0^A0N,44,40^FH^FD+re+^FS\n" +
"^FT1630,82^A0N,44,40^FH^FD+re+^FS";
    }
}
