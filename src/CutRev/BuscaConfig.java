/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CutRev;

import Conexao.conexao;
import java.sql.SQLException;

/**
 *
 * @author v103760
 */
public class BuscaConfig {
 
     private conexao con_marca; 
     private String AlinhamenedoEsq,
                    EspacamentoLinha,
                    Logo,
                    colunaLogo,
                    AlturaLogo,
                    colunaDescricao,
                    alturadescricao,
                    LarguraDescricao,
                    TamanhoDescricao,                   
                    text1,
                    text2,
                    text3,
                    text4,
                    text5,
                    text6,
                    text7,
                    text8,
                    text9,
                    text10,
                    colunaText1,
                    colunaText2,
                    colunaText3,
                    colunaText4,       
                    colunaText5,
                    colunaText6,
                    colunaText7,
                    colunaText8,
                    colunaText9,
                    colunaText10,
                    alturaText1,
                    alturaText2,
                    alturaText3,
                    alturaText4,
                    alturaText5,
                    alturaText6,
                    alturaText7,
                    alturaText8,
                    alturaText9,
                    alturaText10,
                    LarguraText1,
                    LarguraText2,
                    LarguraText3,
                    LarguraText4,
                    LarguraText5,
                    LarguraText6,
                    LarguraText7,
                    LarguraText8,
                    LarguraText9,
                    LarguraText10,
                    TamanhoText1,
                    TamanhoText2,
                    TamanhoText3,
                    TamanhoText4,
                    TamanhoText5,
                    TamanhoText6,
                    TamanhoText7,
                    TamanhoText8,
                    TamanhoText9,
                    TamanhoText10,
                    DoisDColuna1,
                    DoisDColuna2,
                    doisDAltura1,
                    doisDAltura2,
                    colunaMadeIn,
                    alturaMadeIn,
                    colunaBrazil,
                    alturaBrazil,
                    LarguraMadeIn,
                    TamMadeIn
             
                    
             ;
    
    
    public void buscaMarca(String marca){
      
         con_marca = new conexao();
         con_marca.conecta();
         con_marca.executeSQL("select * from config");
        
        
        
        try
            
      
             {
                 String sql = "select * from config where marca = '"+
              marca.trim()  +"'";
                
              
                         //  Integer.parseInt(tf_quantidade.getText()
                 con_marca.executeSQL(sql);
                
                 if (con_marca.resultset.first())
                 {
                                      
                    AlinhamenedoEsq= con_marca.resultset.getString("AlinhamentoEsquerdo");
                     System.out.println(AlinhamenedoEsq);
                    EspacamentoLinha=con_marca.resultset.getString("EspacamentoLinha");
                    Logo=con_marca.resultset.getString("Logo");
                    colunaLogo=con_marca.resultset.getString("colunaLogo");
                    AlturaLogo=con_marca.resultset.getString("AlturaLogo");
                    colunaDescricao=con_marca.resultset.getString("colunaDescricao");
                    alturadescricao=con_marca.resultset.getString("alturadescricao");
                    LarguraDescricao=con_marca.resultset.getString("LarguraDescricao");
                    TamanhoDescricao=con_marca.resultset.getString("TamanhoDescricao");
                    text1=con_marca.resultset.getString("text1");
                    text2=con_marca.resultset.getString("text2");
                    text3=con_marca.resultset.getString("text3");
                    text4=con_marca.resultset.getString("text4");
                    text5=con_marca.resultset.getString("text5");
                    text6=con_marca.resultset.getString("text6");
                    text7=con_marca.resultset.getString("text7");
                    text8=con_marca.resultset.getString("text8");
                    text9=con_marca.resultset.getString("text9");
                    text10=con_marca.resultset.getString("text10");
                    colunaText1=con_marca.resultset.getString("colunaText1");
                    colunaText2=con_marca.resultset.getString("colunaText2");
                    colunaText3=con_marca.resultset.getString("colunaText3");
                    colunaText4=con_marca.resultset.getString("colunaText4");  
                    colunaText5=con_marca.resultset.getString("colunaText5");
                    colunaText6=con_marca.resultset.getString("colunaText6");
                    colunaText7=con_marca.resultset.getString("colunaText7");
                    colunaText8=con_marca.resultset.getString("colunaText8");
                    colunaText9=con_marca.resultset.getString("colunaText9");
                    colunaText10=con_marca.resultset.getString("colunaText10");
                    alturaText1=con_marca.resultset.getString("alturaText1");
                    alturaText2=con_marca.resultset.getString("alturaText2");
                    alturaText3=con_marca.resultset.getString("alturaText3");
                    alturaText4=con_marca.resultset.getString("alturaText4");
                    alturaText5=con_marca.resultset.getString("alturaText5");
                    alturaText6=con_marca.resultset.getString("alturaText6");
                    alturaText7=con_marca.resultset.getString("alturaText7");
                    alturaText8=con_marca.resultset.getString("alturaText8");
                    alturaText9=con_marca.resultset.getString("alturaText9");
                    alturaText10=con_marca.resultset.getString("alturaText10");
                    LarguraText1=con_marca.resultset.getString("LarguraText1");
                    LarguraText2=con_marca.resultset.getString("LarguraText2");
                    LarguraText3=con_marca.resultset.getString("LarguraText3");
                    LarguraText4=con_marca.resultset.getString("LarguraText4");
                    LarguraText5=con_marca.resultset.getString("LarguraText5");
                    LarguraText6=con_marca.resultset.getString("LarguraText6");
                    LarguraText7=con_marca.resultset.getString("LarguraText7");
                    LarguraText8=con_marca.resultset.getString("LarguraText8");
                    LarguraText9=con_marca.resultset.getString("LarguraText9");
                    LarguraText10=con_marca.resultset.getString("LarguraText10");
                    TamanhoText1=con_marca.resultset.getString("TamanhoText1");
                    TamanhoText2=con_marca.resultset.getString("TamanhoText2");
                    TamanhoText3=con_marca.resultset.getString("TamanhoText3");
                    TamanhoText4=con_marca.resultset.getString("TamanhoText4");
                    TamanhoText5=con_marca.resultset.getString("TamanhoText5");
                    TamanhoText6=con_marca.resultset.getString("TamanhoText6");
                    TamanhoText7=con_marca.resultset.getString("TamanhoText7");
                    TamanhoText8=con_marca.resultset.getString("TamanhoText8");
                    TamanhoText9=con_marca.resultset.getString("TamanhoText9");
                    TamanhoText10=con_marca.resultset.getString("TamanhoText10");
                    DoisDColuna1=con_marca.resultset.getString("DoisDColuna1");
                    DoisDColuna2=con_marca.resultset.getString("DoisDColuna2");
                    doisDAltura1=con_marca.resultset.getString("doisDAltura1");
                    doisDAltura2=con_marca.resultset.getString("doisDAltura2");
                    colunaMadeIn=con_marca.resultset.getString("colunaMadeIn");
                    alturaMadeIn=con_marca.resultset.getString("alturaMadeIn");
                    colunaBrazil=con_marca.resultset.getString("colunaBrazil");
                    alturaBrazil=con_marca.resultset.getString("alturaBrazil");
                    LarguraMadeIn=con_marca.resultset.getString("LarguraMadeIn");
                    TamMadeIn=con_marca.resultset.getString("TamMadeIn");
                                     
                     
                 }
                 else
                 
                    
                     {
                                 
                       
                     }
                 
               
             }
             catch(SQLException erro)
             {
                 
  }
} 

    public conexao getCon_marca() {
        return con_marca;
    }

    public String getAlinhamenedoEsq() {
        return AlinhamenedoEsq;
    }

    public String getEspacamentoLinha() {
        return EspacamentoLinha;
    }

    public String getLogo() {
        return Logo;
    }

    public String getColunaLogo() {
        return colunaLogo;
    }

    public String getAlturaLogo() {
        return AlturaLogo;
    }

    public String getColunaDescricao() {
        return colunaDescricao;
    }

    public String getAlturadescricao() {
        return alturadescricao;
    }

    public String getLarguraDescricao() {
        return LarguraDescricao;
    }

    public String getTamanhoDescricao() {
        return TamanhoDescricao;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }

    public String getText5() {
        return text5;
    }

    public String getText6() {
        return text6;
    }

    public String getText7() {
        return text7;
    }

    public String getText8() {
        return text8;
    }

    public String getText9() {
        return text9;
    }

    public String getText10() {
        return text10;
    }

    public String getColunaText1() {
        return colunaText1;
    }

    public String getColunaText2() {
        return colunaText2;
    }

    public String getColunaText3() {
        return colunaText3;
    }

    public String getColunaText4() {
        return colunaText4;
    }

    public String getColunaText5() {
        return colunaText5;
    }

    public String getColunaText6() {
        return colunaText6;
    }

    public String getColunaText7() {
        return colunaText7;
    }

    public String getColunaText8() {
        return colunaText8;
    }

    public String getColunaText9() {
        return colunaText9;
    }

    public String getColunaText10() {
        return colunaText10;
    }

    public String getAlturaText1() {
        return alturaText1;
    }

    public String getAlturaText2() {
        return alturaText2;
    }

    public String getAlturaText3() {
        return alturaText3;
    }

    public String getAlturaText4() {
        return alturaText4;
    }

    public String getAlturaText5() {
        return alturaText5;
    }

    public String getAlturaText6() {
        return alturaText6;
    }

    public String getAlturaText7() {
        return alturaText7;
    }

    public String getAlturaText8() {
        return alturaText8;
    }

    public String getAlturaText9() {
        return alturaText9;
    }

    public String getAlturaText10() {
        return alturaText10;
    }

    public String getLarguraText1() {
        return LarguraText1;
    }

    public String getLarguraText2() {
        return LarguraText2;
    }

    public String getLarguraText3() {
        return LarguraText3;
    }

    public String getLarguraText4() {
        return LarguraText4;
    }

    public String getLarguraText5() {
        return LarguraText5;
    }

    public String getLarguraText6() {
        return LarguraText6;
    }

    public String getLarguraText7() {
        return LarguraText7;
    }

    public String getLarguraText8() {
        return LarguraText8;
    }

    public String getLarguraText9() {
        return LarguraText9;
    }

    public String getLarguraText10() {
        return LarguraText10;
    }

    public String getTamanhoText1() {
        return TamanhoText1;
    }

    public String getTamanhoText2() {
        return TamanhoText2;
    }

    public String getTamanhoText3() {
        return TamanhoText3;
    }

    public String getTamanhoText4() {
        return TamanhoText4;
    }

    public String getTamanhoText5() {
        return TamanhoText5;
    }

    public String getTamanhoText6() {
        return TamanhoText6;
    }

    public String getTamanhoText7() {
        return TamanhoText7;
    }

    public String getTamanhoText8() {
        return TamanhoText8;
    }

    public String getTamanhoText9() {
        return TamanhoText9;
    }

    public String getTamanhoText10() {
        return TamanhoText10;
    }

    public String getDoisDColuna1() {
        return DoisDColuna1;
    }

    public String getDoisDColuna2() {
        return DoisDColuna2;
    }

    public String getDoisDAltura1() {
        return doisDAltura1;
    }

    public String getDoisDAltura2() {
        return doisDAltura2;
    }

    public String getColunaMadeIn() {
        return colunaMadeIn;
    }

    public String getAlturaMadeIn() {
        return alturaMadeIn;
    }

    public String getColunaBrazil() {
        return colunaBrazil;
    }

    public String getAlturaBrazil() {
        return alturaBrazil;
    }

    public String getLarguraMadeIn() {
        return LarguraMadeIn;
    }

    public String getTamMadeIn() {
        return TamMadeIn;
    }
}
