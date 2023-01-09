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
public class CodigoBarras {
  
    private String barrasInicio,barrasFinal,espaco;
    
    public void codigoInicio(String sap){
   
  barrasInicio=" ^XA^PMY\n" +
"      ^MMT\n" +
"      ^PW1720\n" +
"      ^LL0145\n" +
"      ^LS0 \n" +
"      ^FO20,10^GB1890,0,8^FS\n" +
"      ^FO20,30^GB480,20,90^FS\n" +
"      ^FR\n" +
"      ^FO100,40^BY3,^BCN,65,N,N,N^FD"+sap+"^FS\n" +
"       CFA^FO50,300^FD   ^FS\n" +

"      ^FO1200,30^GB480,20,90^FS\n" +
"      ^FR\n" +              
"      ^FO1250,40^BY3,^BCN,65,N,N,N^FD"+sap+"^FS\n" +
"       CFA^FO50,300^FD   ^FS\n" +              
"      ^FT577,111^A0N,85,74^FH\\^FD^FS\n" +
"       CFA^FO50,300^FD   ^FS\n" +                     
"      ^FT1115,111^A0N,85,74^LR^FDOK^FS\n" +   
"^FO600,13^GFA,04480,04480,00028,:Z64:\n" +
"eJzt18GNwyAUhGEjDhwpgVIojdZSSjphVxhQdjPzO8ptV+EWfUk0ftj4veP4eyvcvEWwBFbAKlj3FsASWAarYM1b6N4iWAarYM3bdxRrESyDFbAG1r1FsARWwCpY9xbBElgGq2D9ae3vhWe7/4yirYBVsOZNRNkWwTKYiLJNRNkmaJmKskxFWVbAVJRpqirLZJRpYvO2ySjTZJRpkk7TUU7TUU6TFZtWwTQN0xU7zUQZZqIMM1GGNW8uyvgdGfyn2b3ra6Brp5q5MJd7RHtL94QJc3kPmjB3/2i+8KzQM6bDTJNhXjgLZJhpdPbIqk3Ds06FWUZnqwq6jM5yegfgu0OE2SYqs01s0zYR9LZ/V399flwFjN7hAYx6hrNqxgoY9TbUE1EvNSrjrIBRz0e94kHW3uxpqRdOYNR7U8+OvX55c7agmYRmGZyBaHaimYtmtYPssz7rn6wvl69Yog==:5B62" +         
"       ^XZ " ; 
        
  } 
  public void codigoFinal(String sap){
      
      barrasFinal="^XA^PMY\n" +
"      ^MFF\n" +
"      ^MMT\n" +
"      ^PW1720\n" +
"      ^LL0155\n" +
"      ^LS0\n" +
"      ^FO20,30\n" +
"      ^GB480,80,90^FS\n" +
"      ^FR\n" +
"      ^FO100,40^BY3,^BCN,65,N,N,N^FD"+sap+"^FS\n" +
"      ^FO1200,30\n" +
"      ^GB480,80,90^FS\n" +
"      ^FR\n" +
"      ^FO1250,40^BY3,^BCN,65,N,N,N^FD"+sap+"^FS\n" +              
"      CFA\n" +
"      ^FO50,300^FD   ^FS     \n" +
"      ^XZ";
  
  
  }  

  public void espaco(){
      
      espaco="^XA^PMY\n" +
      "^FO10,160^GB1890,0,8^FS\n" +
          
      "^XZ";
  }  
    public String getBarrasInicio() {
        return barrasInicio;
    }

    public String getBarrasFinal() {
        return barrasFinal;
    }

    public String getEspaco() {
        return espaco;
    }

    public void setEspaco(String espaco) {
        this.espaco = espaco;
    }
}
