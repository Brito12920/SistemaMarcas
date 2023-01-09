/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fonts;

/**
 *
 * @author v103760
 */
public class Fonts {
private String fonte1,fonte2,fonte3,fonte4,fonte5;
    
    
    public Fonts() {
        
        
        
    }
    public void fontes(int tamanho){
        fonte1="A0N,"+tamanho+"";
        fonte2="CF0,"+tamanho+"";
    }
   
    public void fontesLarAlt(int Paltura,int Plargura,int tamanho,int largura){
        
        fonte1="^FO"+Paltura+","+Plargura+"^AQN,"+tamanho+","+largura+"^FDZEBRA^FS";
        fonte2="^FO"+Paltura+","+Plargura+"^ARN,"+tamanho+","+largura+"^FDZEBRA^FS";
        fonte3="^FO"+Paltura+","+Plargura+"^ASN,"+tamanho+","+largura+"^FDZEBRA^FS";
        fonte4="^FO"+Paltura+","+Plargura+"^AUN,"+tamanho+","+largura+"^FDZEBRA^FS";
    }  

    public String getFonte1() {
        return fonte1;
    }

    public void setFonte1(String fonte1) {
        this.fonte1 = fonte1;
    }

    public String getFonte2() {
        return fonte2;
    }

    public void setFonte2(String fonte2) {
        this.fonte2 = fonte2;
    }

    public String getFonte3() {
        return fonte3;
    }

    public void setFonte3(String fonte3) {
        this.fonte3 = fonte3;
    }

    public String getFonte4() {
        return fonte4;
    }

    public void setFonte4(String fonte4) {
        this.fonte4 = fonte4;
    }

    public String getFonte5() {
        return fonte5;
    }

    public void setFonte5(String fonte5) {
        this.fonte5 = fonte5;
    }
    
    
}
