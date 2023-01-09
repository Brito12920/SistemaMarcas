package ExcelZpl;
   
  import java.io.File;
  import java.io.FileInputStream;
  import java.io.FileNotFoundException;
  import java.io.IOException;
  import java.util.ArrayList;
  import java.util.Iterator;
  import java.util.List;
   
  import org.apache.poi.hssf.usermodel.HSSFSheet;
  import org.apache.poi.hssf.usermodel.HSSFWorkbook;
  import org.apache.poi.ss.usermodel.Cell;
  import org.apache.poi.ss.usermodel.Row;
   
  public class AbreExcelPolyRev {

private static  String tipo;
private static  String qsi;
private static  String obs;
private static  String qsi_rev;
private static  String resp;
private static  String receita;
private static  String espacamento_simples_mm;
private static  String espacamento_duplo_mm;
private static  String sap_materia1_1;
private static  String descricao_material_1;
private static  String material_material1;
private static  String voltas_material1;
private static  String calibre_material1;
private static  String tol_material1_mm;
private static  String largura_material1_mm;
private static  String sap_materia1_2;
private static  String descricao_material_2;
private static  String material_material2;
private static  String voltas_material2;
private static  String calibre_material2;
private static  String tol_material2_mm;
private static  String largura_material2_mm;
private static  String sap_materia1_3;
private static  String descricao_material_3;
private static  String material_material3;
private static  String voltas_material3;
private static  String calibre_material3;
private static  String tol_material3_mm;
private static  String largura_material3_mm;
private static  String sap_materia1_4;
private static  String descricao_material_4;
private static  String material_material4;
private static  String voltas_material4;
private static  String calibre_material4;
private static  String tol_material4_mm;
private static  String largura_material4_mm;
private static  String sap_materia1_5;
private static  String descricao_material_5;
private static  String material_material5;
private static  String voltas_material5;
private static  String calibre_material5;
private static  String tol_material5_mm;
private static  String largura_material5_mm;
private static  String sap_materia1_6;
private static  String descricao_material_6;
private static  String material_material6;
private static  String voltas_material6;
private static  String calibre_material6;
private static  String tol_material6_mm;
private static  String largura_material6_mm;
private static  String sap_materia1_7;
private static  String descricao_material_7;
private static  String material_material7;
private static  String voltas_material7;
private static  String calibre_material7;
private static  String tol_material7_mm;
private static  String largura_material7_mm;
private static  String sap_materia1_8;
private static  String descricao_material_8;
private static  String material_material8;
private static  String voltas_material8;
private static  String calibre_material8;
private static  String tol_material8_mm;
private static  String largura_material8_mm;
private static  String sap_materia1_9;
private static  String descricao_material_9;
private static  String material_material9;
private static  String voltas_material9;
private static  String calibre_material9;
private static  String tol_material9_mm;
private static  String largura_material9_mm;
private static  String sap_materia1_10;
private static  String descricao_material_10;
private static  String material_material10;
private static  String voltas_material10;
private static  String calibre_material10;
private static  String tol_material10_mm;
private static  String largura_material10_mm;
private static  String perimetro_nominal;
private static  String perimetro_tambor_mm;
private static  String perimetro_do_tambor_com_luva_mm;
private static  String circ_ext_banda_crua;
private static  String tipo_diafragma;
private static  String diafragma_mm;
private static  String tol_diafragma_mm;
private static  String codigo_sap_fert;
private static  String codigo_fabrica;
private static  String codigo_sap_halb;
private static  String codigo_barras_ean13;
private static  String marca_1;
private static  String marcacao;
private static  String marca_2;
private static  String marca_3;
private static  String marcacao2;
private static  String marca_4;
private static  String marca_5;
private static  String marcacao3;
private static  String marca6;
private static  String marca_7;
private static  String marcacao4;
private static  String marca_8;
private static  String marca_9;
private static  String marcacao5;
private static  String marca_10;
private static  String marca_11;
private static  String marca_6;
private static  String marca_12;
private static  String marca_13;
private static  String marcacao7;
private static  String marca_14;
private static  String marca_15;
private static  String marcacao8;
private static  String marca_16;
private static  String marca_17;
private static  String marcacao9;
private static  String marca_18;
private static  String marca_19;
private static  String marcacao10;
private static  String marca_20;
private static  String per_externo_luva_corte;
private static  String tambor_de_corte_faixa_mm;
private static  String peso_da_correia_g;
private static  String tol_peso_da_correia_g;
private static  String quantidade_de_correias_por_banda;
private static  String suporte_de_facas_normal;
private static  String suporte_de_facas_normal_tol;
private static  String quant_tipo_das_fresas_nomal;
private static  String quant_tipo_das_fresas_nomal_tol;
private static  String pre_corte_ref;
private static  String Quantidade_de_Facas;
private static  String quantidade_de_facas_normal_tol;
private static  String aneis_esp_normal;
private static  String Aneis_espaçadores_Tol;
private static  String Pcorte_normal;
private static  String tol_1_corte_normal;
private static  String corte_referen;
private static  String retracao_da_fresa_normal;
private static  String passo_da_fresa_normal;
private static  String suporte_de_facas_fresao;
private static  String suporte_de_facas_fresao_tol;
private static  String quant_tipo_das_fresas_fresao;
private static  String quant_tipo_das_fresas_fresao_tol;
private static  String pre_corte2;
private static  String Quantidade_de_Facas_Fresao; 
private static  String quantidade_de_facas_fresao;
private static  String quantidade_de_facas_fresao_tol;
private static  String aneis_espacadores_fresao;
private static  String aneis_espacadores_fresao_tol;
private static  String Pcorte_fresao;
private static  String tol_1_corte_fresao;
private static  String prof_corte_ref_fresao;
private static  String retraçao_da_fresa_fresao;
private static  String passo_da_fresa_fresao;
private static  String polia_de_medicao;
private static  String contra_peso_polia;
private static  String tensao_medicao_lbs;
private static  String dec_mm;
private static  String Jogos;
private static  String largura_superior;
private static  String altura;
private static  String variacao_de_altura;
private static  String variacao_de_codigos;
private static  String tolerancia1;
private static  String tolerancia2;
private static  String codigo_de_vendas_revenda;
private static  String fresa;
private static  String fresa1;
private static  String fresa2;
private static  String fresa3;
private static  String fresa4;
private static  String fresa5;
private static  String fresa6;
private static  String fresa7;

private static  String auxiliar1;
private static  String auxiliar2;
private static  String auxiliar3;
private static  String auxiliar4;
private static  String auxiliar5;
private static  String auxiliar6;
private static  String auxiliar7;
private static  String auxiliar8;
private boolean confirmaSap;
private final String banco = "Poly Rev"; 
         
         
         
         private static final String fileName = "C:/bancoDados/Construção e Medição Poly-V.xls";

    public  String getFresa6() {
        return fresa6;
    }

    public  void setFresa6(String aFresa6) {
        fresa6 = aFresa6;
    }

    public  String getFresa7() {
        return fresa7;
    }

    public  void setFresa7(String aFresa7) {
        fresa7 = aFresa7;
    }

    public  String getFresa() {
        return fresa;
    }

    public  void setFresa(String aFresa) {
        fresa = aFresa;
    }

    public  String getFresa1() {
        return fresa1;
    }

    public  void setFresa1(String aFresa1) {
        fresa1 = aFresa1;
    }

    public  String getFresa2() {
        return fresa2;
    }

    public  void setFresa2(String aFresa2) {
        fresa2 = aFresa2;
    }

    public  String getFresa3() {
        return fresa3;
    }

    public  void setFresa3(String aFresa3) {
        fresa3 = aFresa3;
    }

    public  String getFresa4() {
        return fresa4;
    }

    public  void setFresa4(String aFresa4) {
        fresa4 = aFresa4;
    }

    public  String getFresa5() {
        return fresa5;
    }

    public  void setFresa5(String aFresa5) {
        fresa5 = aFresa5;
    }

    public  String getVariacao_de_altura() {
        return variacao_de_altura;
    }

    public  void setVariacao_de_altura(String aVariacao_de_altura) {
        variacao_de_altura = aVariacao_de_altura;
    }

    public  String getTolerancia1() {
        return tolerancia1;
    }

    public  void setTolerancia1(String aTolerancia1) {
        tolerancia1 = aTolerancia1;
    }

    public  String getTolerancia2() {
        return tolerancia2;
    }

    public  void setTolerancia2(String aTolerancia2) {
        tolerancia2 = aTolerancia2;
    }

    public String getQuantidade_de_Facas_Fresao() {
        return Quantidade_de_Facas_Fresao;
    }

    public void setQuantidade_de_Facas_Fresao(String aQuantidade_de_Facas_Fresao) {
        Quantidade_de_Facas_Fresao = aQuantidade_de_Facas_Fresao;
    }

    public String getAneis_espaçadores_Tol() {
        return Aneis_espaçadores_Tol;
    }

    public void setAneis_espaçadores_Tol(String aAneis_espaçadores_Tol) {
        Aneis_espaçadores_Tol = aAneis_espaçadores_Tol;
    }

    public  String getQuantidade_de_Facas() {
        return Quantidade_de_Facas;
    }

    public  void setQuantidade_de_Facas(String aQuantidade_de_Facas) {
        Quantidade_de_Facas = aQuantidade_de_Facas;
    }

    public  String getPre_corte2() {
        return pre_corte2;
    }

    public void setPre_corte2(String aPre_corte2) {
        pre_corte2 = aPre_corte2;
    }

    public String getTipo() {
        return tipo;
    }

    public static void setTipo(String aTipo) {
        tipo = aTipo;
    }

    public String getQsi() {
        return qsi;
    }

    public static void setQsi(String aQsi) {
        qsi = aQsi;
    }

    public String getObs() {
        return obs;
    }

    public static void setObs(String aObs) {
        obs = aObs;
    }

    public String getQsi_rev() {
        return qsi_rev;
    }

    public static void setQsi_rev(String aQsi_rev) {
        qsi_rev = aQsi_rev;
    }

    public String getResp() {
        return resp;
    }

    public static void setResp(String aResp) {
        resp = aResp;
    }

    public String getReceita() {
        return receita;
    }

    public static void setReceita(String aReceita) {
        receita = aReceita;
    }

    public String getEspacamento_simples_mm() {
        return espacamento_simples_mm;
    }

    public static void setEspacamento_simples_mm(String aEspacamento_simples_mm) {
        espacamento_simples_mm = aEspacamento_simples_mm;
    }

    public String getEspacamento_duplo_mm() {
        return espacamento_duplo_mm;
    }

    public static void setEspacamento_duplo_mm(String aEspacamento_duplo_mm) {
        espacamento_duplo_mm = aEspacamento_duplo_mm;
    }

    public String getSap_materia1_1() {
        return sap_materia1_1;
    }

    public static void setSap_materia1_1(String aSap_materia1_1) {
        sap_materia1_1 = aSap_materia1_1;
    }

    public String getDescricao_material_1() {
        return descricao_material_1;
    }

    public static void setDescricao_material_1(String aDescricao_material_1) {
        descricao_material_1 = aDescricao_material_1;
    }

    public String getMaterial_material1() {
        return material_material1;
    }

    public static void setMaterial_material1(String aMaterial_material1) {
        material_material1 = aMaterial_material1;
    }

    public String getVoltas_material1() {
        return voltas_material1;
    }

    public static void setVoltas_material1(String aVoltas_material1) {
        voltas_material1 = aVoltas_material1;
    }

    public String getCalibre_material1() {
        return calibre_material1;
    }

    public static void setCalibre_material1(String aCalibre_material1) {
        calibre_material1 = aCalibre_material1;
    }

    public String getTol_material1_mm() {
        return tol_material1_mm;
    }

    public static void setTol_material1_mm(String aTol_material1_mm) {
        tol_material1_mm = aTol_material1_mm;
    }

    public String getLargura_material1_mm() {
        return largura_material1_mm;
    }

    public static void setLargura_material1_mm(String aLargura_material1_mm) {
        largura_material1_mm = aLargura_material1_mm;
    }

    public String getSap_materia1_2() {
        return sap_materia1_2;
    }

    public static void setSap_materia1_2(String aSap_materia1_2) {
        sap_materia1_2 = aSap_materia1_2;
    }

    public String getDescricao_material_2() {
        return descricao_material_2;
    }

    public static void setDescricao_material_2(String aDescricao_material_2) {
        descricao_material_2 = aDescricao_material_2;
    }

    public String getMaterial_material2() {
        return material_material2;
    }

    public static void setMaterial_material2(String aMaterial_material2) {
        material_material2 = aMaterial_material2;
    }

    public String getVoltas_material2() {
        return voltas_material2;
    }

    public static void setVoltas_material2(String aVoltas_material2) {
        voltas_material2 = aVoltas_material2;
    }

    public String getCalibre_material2() {
        return calibre_material2;
    }

    public static void setCalibre_material2(String aCalibre_material2) {
        calibre_material2 = aCalibre_material2;
    }

    public String getTol_material2_mm() {
        return tol_material2_mm;
    }

    public static void setTol_material2_mm(String aTol_material2_mm) {
        tol_material2_mm = aTol_material2_mm;
    }

    public String getLargura_material2_mm() {
        return largura_material2_mm;
    }

    public static void setLargura_material2_mm(String aLargura_material2_mm) {
        largura_material2_mm = aLargura_material2_mm;
    }

    public String getSap_materia1_3() {
        return sap_materia1_3;
    }

    public static void setSap_materia1_3(String aSap_materia1_3) {
        sap_materia1_3 = aSap_materia1_3;
    }

    public String getDescricao_material_3() {
        return descricao_material_3;
    }

    public static void setDescricao_material_3(String aDescricao_material_3) {
        descricao_material_3 = aDescricao_material_3;
    }

    public String getMaterial_material3() {
        return material_material3;
    }

    public static void setMaterial_material3(String aMaterial_material3) {
        material_material3 = aMaterial_material3;
    }

    public String getVoltas_material3() {
        return voltas_material3;
    }

    public static void setVoltas_material3(String aVoltas_material3) {
        voltas_material3 = aVoltas_material3;
    }

    public String getCalibre_material3() {
        return calibre_material3;
    }

    public static void setCalibre_material3(String aCalibre_material3) {
        calibre_material3 = aCalibre_material3;
    }

    public String getTol_material3_mm() {
        return tol_material3_mm;
    }

    public static void setTol_material3_mm(String aTol_material3_mm) {
        tol_material3_mm = aTol_material3_mm;
    }

    public String getLargura_material3_mm() {
        return largura_material3_mm;
    }

    public static void setLargura_material3_mm(String aLargura_material3_mm) {
        largura_material3_mm = aLargura_material3_mm;
    }

    public String getSap_materia1_4() {
        return sap_materia1_4;
    }

    public static void setSap_materia1_4(String aSap_materia1_4) {
        sap_materia1_4 = aSap_materia1_4;
    }

    public String getDescricao_material_4() {
        return descricao_material_4;
    }

    public static void setDescricao_material_4(String aDescricao_material_4) {
        descricao_material_4 = aDescricao_material_4;
    }

    public String getMaterial_material4() {
        return material_material4;
    }

    public static void setMaterial_material4(String aMaterial_material4) {
        material_material4 = aMaterial_material4;
    }

    public String getVoltas_material4() {
        return voltas_material4;
    }

    public static void setVoltas_material4(String aVoltas_material4) {
        voltas_material4 = aVoltas_material4;
    }

    public String getCalibre_material4() {
        return calibre_material4;
    }

    public static void setCalibre_material4(String aCalibre_material4) {
        calibre_material4 = aCalibre_material4;
    }

    public String getTol_material4_mm() {
        return tol_material4_mm;
    }

    public static void setTol_material4_mm(String aTol_material4_mm) {
        tol_material4_mm = aTol_material4_mm;
    }

    public String getLargura_material4_mm() {
        return largura_material4_mm;
    }

    public static void setLargura_material4_mm(String aLargura_material4_mm) {
        largura_material4_mm = aLargura_material4_mm;
    }

    public String getSap_materia1_5() {
        return sap_materia1_5;
    }

    public static void setSap_materia1_5(String aSap_materia1_5) {
        sap_materia1_5 = aSap_materia1_5;
    }

    public String getDescricao_material_5() {
        return descricao_material_5;
    }

    public static void setDescricao_material_5(String aDescricao_material_5) {
        descricao_material_5 = aDescricao_material_5;
    }

    public String getMaterial_material5() {
        return material_material5;
    }

    public static void setMaterial_material5(String aMaterial_material5) {
        material_material5 = aMaterial_material5;
    }

    public String getVoltas_material5() {
        return voltas_material5;
    }

    public static void setVoltas_material5(String aVoltas_material5) {
        voltas_material5 = aVoltas_material5;
    }

    public String getCalibre_material5() {
        return calibre_material5;
    }

    public static void setCalibre_material5(String aCalibre_material5) {
        calibre_material5 = aCalibre_material5;
    }

    public String getTol_material5_mm() {
        return tol_material5_mm;
    }

    public static void setTol_material5_mm(String aTol_material5_mm) {
        tol_material5_mm = aTol_material5_mm;
    }

    public String getLargura_material5_mm() {
        return largura_material5_mm;
    }

    public static void setLargura_material5_mm(String aLargura_material5_mm) {
        largura_material5_mm = aLargura_material5_mm;
    }

    public String getSap_materia1_6() {
        return sap_materia1_6;
    }

    public static void setSap_materia1_6(String aSap_materia1_6) {
        sap_materia1_6 = aSap_materia1_6;
    }

    public String getDescricao_material_6() {
        return descricao_material_6;
    }

    public static void setDescricao_material_6(String aDescricao_material_6) {
        descricao_material_6 = aDescricao_material_6;
    }

    public String getMaterial_material6() {
        return material_material6;
    }

    public static void setMaterial_material6(String aMaterial_material6) {
        material_material6 = aMaterial_material6;
    }

    public String getVoltas_material6() {
        return voltas_material6;
    }

    public static void setVoltas_material6(String aVoltas_material6) {
        voltas_material6 = aVoltas_material6;
    }

    public String getCalibre_material6() {
        return calibre_material6;
    }

    public static void setCalibre_material6(String aCalibre_material6) {
        calibre_material6 = aCalibre_material6;
    }

    public String getTol_material6_mm() {
        return tol_material6_mm;
    }

    public static void setTol_material6_mm(String aTol_material6_mm) {
        tol_material6_mm = aTol_material6_mm;
    }

    public String getLargura_material6_mm() {
        return largura_material6_mm;
    }

    public static void setLargura_material6_mm(String aLargura_material6_mm) {
        largura_material6_mm = aLargura_material6_mm;
    }

    public String getSap_materia1_7() {
        return sap_materia1_7;
    }

    public static void setSap_materia1_7(String aSap_materia1_7) {
        sap_materia1_7 = aSap_materia1_7;
    }

    public String getDescricao_material_7() {
        return descricao_material_7;
    }

    public static void setDescricao_material_7(String aDescricao_material_7) {
        descricao_material_7 = aDescricao_material_7;
    }

    public String getMaterial_material7() {
        return material_material7;
    }

    public static void setMaterial_material7(String aMaterial_material7) {
        material_material7 = aMaterial_material7;
    }

    public String getVoltas_material7() {
        return voltas_material7;
    }

    public static void setVoltas_material7(String aVoltas_material7) {
        voltas_material7 = aVoltas_material7;
    }

    public String getCalibre_material7() {
        return calibre_material7;
    }

    public static void setCalibre_material7(String aCalibre_material7) {
        calibre_material7 = aCalibre_material7;
    }

    public String getTol_material7_mm() {
        return tol_material7_mm;
    }

    public static void setTol_material7_mm(String aTol_material7_mm) {
        tol_material7_mm = aTol_material7_mm;
    }

    public String getLargura_material7_mm() {
        return largura_material7_mm;
    }

    public static void setLargura_material7_mm(String aLargura_material7_mm) {
        largura_material7_mm = aLargura_material7_mm;
    }

    public String getSap_materia1_8() {
        return sap_materia1_8;
    }

    public static void setSap_materia1_8(String aSap_materia1_8) {
        sap_materia1_8 = aSap_materia1_8;
    }

    public String getDescricao_material_8() {
        return descricao_material_8;
    }

    public static void setDescricao_material_8(String aDescricao_material_8) {
        descricao_material_8 = aDescricao_material_8;
    }

    public String getMaterial_material8() {
        return material_material8;
    }

    public static void setMaterial_material8(String aMaterial_material8) {
        material_material8 = aMaterial_material8;
    }

    public String getVoltas_material8() {
        return voltas_material8;
    }

    public static void setVoltas_material8(String aVoltas_material8) {
        voltas_material8 = aVoltas_material8;
    }

    public String getCalibre_material8() {
        return calibre_material8;
    }

    public static void setCalibre_material8(String aCalibre_material8) {
        calibre_material8 = aCalibre_material8;
    }

    public String getTol_material8_mm() {
        return tol_material8_mm;
    }

    public static void setTol_material8_mm(String aTol_material8_mm) {
        tol_material8_mm = aTol_material8_mm;
    }

    public String getLargura_material8_mm() {
        return largura_material8_mm;
    }

    public static void setLargura_material8_mm(String aLargura_material8_mm) {
        largura_material8_mm = aLargura_material8_mm;
    }

    public String getSap_materia1_9() {
        return sap_materia1_9;
    }

    public static void setSap_materia1_9(String aSap_materia1_9) {
        sap_materia1_9 = aSap_materia1_9;
    }

    public String getDescricao_material_9() {
        return descricao_material_9;
    }

    public static void setDescricao_material_9(String aDescricao_material_9) {
        descricao_material_9 = aDescricao_material_9;
    }

    public String getMaterial_material9() {
        return material_material9;
    }

    public static void setMaterial_material9(String aMaterial_material9) {
        material_material9 = aMaterial_material9;
    }

    public String getVoltas_material9() {
        return voltas_material9;
    }

    public static void setVoltas_material9(String aVoltas_material9) {
        voltas_material9 = aVoltas_material9;
    }

    public String getCalibre_material9() {
        return calibre_material9;
    }

    public static void setCalibre_material9(String aCalibre_material9) {
        calibre_material9 = aCalibre_material9;
    }

    public String getTol_material9_mm() {
        return tol_material9_mm;
    }

    public static void setTol_material9_mm(String aTol_material9_mm) {
        tol_material9_mm = aTol_material9_mm;
    }

    public String getLargura_material9_mm() {
        return largura_material9_mm;
    }

    public static void setLargura_material9_mm(String aLargura_material9_mm) {
        largura_material9_mm = aLargura_material9_mm;
    }

    public String getSap_materia1_10() {
        return sap_materia1_10;
    }

    public static void setSap_materia1_10(String aSap_materia1_10) {
        sap_materia1_10 = aSap_materia1_10;
    }

    public String getDescricao_material_10() {
        return descricao_material_10;
    }

    public static void setDescricao_material_10(String aDescricao_material_10) {
        descricao_material_10 = aDescricao_material_10;
    }

    public String getMaterial_material10() {
        return material_material10;
    }

    public static void setMaterial_material10(String aMaterial_material10) {
        material_material10 = aMaterial_material10;
    }

    public String getVoltas_material10() {
        return voltas_material10;
    }

    public static void setVoltas_material10(String aVoltas_material10) {
        voltas_material10 = aVoltas_material10;
    }

    public String getCalibre_material10() {
        return calibre_material10;
    }

    public static void setCalibre_material10(String aCalibre_material10) {
        calibre_material10 = aCalibre_material10;
    }

    public String getTol_material10_mm() {
        return tol_material10_mm;
    }

    public static void setTol_material10_mm(String aTol_material10_mm) {
        tol_material10_mm = aTol_material10_mm;
    }

    public String getLargura_material10_mm() {
        return largura_material10_mm;
    }

    public static void setLargura_material10_mm(String aLargura_material10_mm) {
        largura_material10_mm = aLargura_material10_mm;
    }

    public String getPerimetro_nominal() {
        return perimetro_nominal;
    }

    public static void setPerimetro_nominal(String aPerimetro_nominal) {
        perimetro_nominal = aPerimetro_nominal;
    }

    public String getPerimetro_tambor_mm() {
        return perimetro_tambor_mm;
    }

    public static void setPerimetro_tambor_mm(String aPerimetro_tambor_mm) {
        perimetro_tambor_mm = aPerimetro_tambor_mm;
    }

    public String getPerimetro_do_tambor_com_luva_mm() {
        return perimetro_do_tambor_com_luva_mm;
    }

    public static void setPerimetro_do_tambor_com_luva_mm(String aPerimetro_do_tambor_com_luva_mm) {
        perimetro_do_tambor_com_luva_mm = aPerimetro_do_tambor_com_luva_mm;
    }

    public String getCirc_ext_banda_crua() {
        return circ_ext_banda_crua;
    }

    public static void setCirc_ext_banda_crua(String aCirc_ext_banda_crua) {
        circ_ext_banda_crua = aCirc_ext_banda_crua;
    }

    public String getTipo_diafragma() {
        return tipo_diafragma;
    }

    public static void setTipo_diafragma(String aTipo_diafragma) {
        tipo_diafragma = aTipo_diafragma;
    }

    public String getDiafragma_mm() {
        return diafragma_mm;
    }

    public static void setDiafragma_mm(String aDiafragma_mm) {
        diafragma_mm = aDiafragma_mm;
    }

    public String getTol_diafragma_mm() {
        return tol_diafragma_mm;
    }

    public static void setTol_diafragma_mm(String aTol_diafragma_mm) {
        tol_diafragma_mm = aTol_diafragma_mm;
    }

    public String getCodigo_sap_fert() {
        return codigo_sap_fert;
    }

    public static void setCodigo_sap_fert(String aCodigo_sap_fert) {
        codigo_sap_fert = aCodigo_sap_fert;
    }

    public String getCodigo_fabrica() {
        return codigo_fabrica;
    }

    public static void setCodigo_fabrica(String aCodigo_fabrica) {
        codigo_fabrica = aCodigo_fabrica;
    }

    public String getCodigo_sap_halb() {
        return codigo_sap_halb;
    }

    public static void setCodigo_sap_halb(String aCodigo_sap_halb) {
        codigo_sap_halb = aCodigo_sap_halb;
    }

    public String getCodigo_barras_ean13() {
        return codigo_barras_ean13;
    }

    public static void setCodigo_barras_ean13(String aCodigo_barras_ean13) {
        codigo_barras_ean13 = aCodigo_barras_ean13;
    }

    public String getMarca_1() {
        return marca_1;
    }

    public static void setMarca_1(String aMarca_1) {
        marca_1 = aMarca_1;
    }

    public String getMarcacao() {
        return marcacao;
    }

    public static void setMarcacao(String aMarcacao) {
        marcacao = aMarcacao;
    }

    public String getMarca_2() {
        return marca_2;
    }

    public static void setMarca_2(String aMarca_2) {
        marca_2 = aMarca_2;
    }

    public String getMarca_3() {
        return marca_3;
    }

    public static void setMarca_3(String aMarca_3) {
        marca_3 = aMarca_3;
    }

    public String getMarcacao2() {
        return marcacao2;
    }

    public static void setMarcacao2(String aMarcacao2) {
        marcacao2 = aMarcacao2;
    }

    public String getMarca_4() {
        return marca_4;
    }

    public static void setMarca_4(String aMarca_4) {
        marca_4 = aMarca_4;
    }

    public String getMarca_5() {
        return marca_5;
    }

    public static void setMarca_5(String aMarca_5) {
        marca_5 = aMarca_5;
    }

    public String getMarcacao3() {
        return marcacao3;
    }

    public static void setMarcacao3(String aMarcacao3) {
        marcacao3 = aMarcacao3;
    }

    public String getMarca6() {
        return marca6;
    }

    public static void setMarca6(String aMarca6) {
        marca6 = aMarca6;
    }

    public String getMarca_7() {
        return marca_7;
    }

    public static void setMarca_7(String aMarca_7) {
        marca_7 = aMarca_7;
    }

    public String getMarcacao4() {
        return marcacao4;
    }

    public static void setMarcacao4(String aMarcacao4) {
        marcacao4 = aMarcacao4;
    }

    public String getMarca_8() {
        return marca_8;
    }

    public static void setMarca_8(String aMarca_8) {
        marca_8 = aMarca_8;
    }

    public String getMarca_9() {
        return marca_9;
    }

    public static void setMarca_9(String aMarca_9) {
        marca_9 = aMarca_9;
    }

    public String getMarcacao5() {
        return marcacao5;
    }

    public static void setMarcacao5(String aMarcacao5) {
        marcacao5 = aMarcacao5;
    }

    public String getMarca_10() {
        return marca_10;
    }

    public static void setMarca_10(String aMarca_10) {
        marca_10 = aMarca_10;
    }

    public String getMarca_11() {
        return marca_11;
    }

    public static void setMarca_11(String aMarca_11) {
        marca_11 = aMarca_11;
    }

    public String getMarca_6() {
        return marca_6;
    }

    public static void setMarca_6(String aMarca_6) {
        marca_6 = aMarca_6;
    }

    public String getMarca_12() {
        return marca_12;
    }

    public static void setMarca_12(String aMarca_12) {
        marca_12 = aMarca_12;
    }

    public String getMarca_13() {
        return marca_13;
    }

    public static void setMarca_13(String aMarca_13) {
        marca_13 = aMarca_13;
    }

    public String getMarcacao7() {
        return marcacao7;
    }

    public static void setMarcacao7(String aMarcacao7) {
        marcacao7 = aMarcacao7;
    }

    public String getMarca_14() {
        return marca_14;
    }

    public static void setMarca_14(String aMarca_14) {
        marca_14 = aMarca_14;
    }

    public String getMarca_15() {
        return marca_15;
    }

    public static void setMarca_15(String aMarca_15) {
        marca_15 = aMarca_15;
    }

    public String getMarcacao8() {
        return marcacao8;
    }

    public static void setMarcacao8(String aMarcacao8) {
        marcacao8 = aMarcacao8;
    }

    public String getMarca_16() {
        return marca_16;
    }

    public static void setMarca_16(String aMarca_16) {
        marca_16 = aMarca_16;
    }

    public String getMarca_17() {
        return marca_17;
    }

    public static void setMarca_17(String aMarca_17) {
        marca_17 = aMarca_17;
    }

    public String getMarcacao9() {
        return marcacao9;
    }

    public static void setMarcacao9(String aMarcacao9) {
        marcacao9 = aMarcacao9;
    }

    public String getMarca_18() {
        return marca_18;
    }

    public static void setMarca_18(String aMarca_18) {
        marca_18 = aMarca_18;
    }

    public String getMarca_19() {
        return marca_19;
    }

    public static void setMarca_19(String aMarca_19) {
        marca_19 = aMarca_19;
    }

    public String getMarcacao10() {
        return marcacao10;
    }

    public static void setMarcacao10(String aMarcacao10) {
        marcacao10 = aMarcacao10;
    }

    public String getMarca_20() {
        return marca_20;
    }

    public static void setMarca_20(String aMarca_20) {
        marca_20 = aMarca_20;
    }

    public String getPer_externo_luva_corte() {
        return per_externo_luva_corte;
    }

    public static void setPer_externo_luva_corte(String aPer_externo_luva_corte) {
        per_externo_luva_corte = aPer_externo_luva_corte;
    }

    public String getTambor_de_corte_faixa_mm() {
        return tambor_de_corte_faixa_mm;
    }

    public static void setTambor_de_corte_faixa_mm(String aTambor_de_corte_faixa_mm) {
        tambor_de_corte_faixa_mm = aTambor_de_corte_faixa_mm;
    }

    public String getPeso_da_correia_g() {
        return peso_da_correia_g;
    }

    public static void setPeso_da_correia_g(String aPeso_da_correia_g) {
        peso_da_correia_g = aPeso_da_correia_g;
    }

    public String getTol_peso_da_correia_g() {
        return tol_peso_da_correia_g;
    }

    public static void setTol_peso_da_correia_g(String aTol_peso_da_correia_g) {
        tol_peso_da_correia_g = aTol_peso_da_correia_g;
    }

    public String getQuantidade_de_correias_por_banda() {
        return quantidade_de_correias_por_banda;
    }

    public static void setQuantidade_de_correias_por_banda(String aQuantidade_de_correias_por_banda) {
        quantidade_de_correias_por_banda = aQuantidade_de_correias_por_banda;
    }

    public String getSuporte_de_facas_normal() {
        return suporte_de_facas_normal;
    }

    public static void setSuporte_de_facas_normal(String aSuporte_de_facas_normal) {
        suporte_de_facas_normal = aSuporte_de_facas_normal;
    }

    public String getSuporte_de_facas_normal_tol() {
        return suporte_de_facas_normal_tol;
    }

    public static void setSuporte_de_facas_normal_tol(String aSuporte_de_facas_normal_tol) {
        suporte_de_facas_normal_tol = aSuporte_de_facas_normal_tol;
    }

    public String getQuant_tipo_das_fresas_nomal() {
        return quant_tipo_das_fresas_nomal;
    }

    public static void setQuant_tipo_das_fresas_nomal(String aQuant_tipo_das_fresas_nomal) {
        quant_tipo_das_fresas_nomal = aQuant_tipo_das_fresas_nomal;
    }

    public String getQuant_tipo_das_fresas_nomal_tol() {
        return quant_tipo_das_fresas_nomal_tol;
    }

    public static void setQuant_tipo_das_fresas_nomal_tol(String aQuant_tipo_das_fresas_nomal_tol) {
        quant_tipo_das_fresas_nomal_tol = aQuant_tipo_das_fresas_nomal_tol;
    }

    public String getPre_corte_ref() {
        return pre_corte_ref;
    }

    public static void setPre_corte_ref(String aPre_corte_ref) {
        pre_corte_ref = aPre_corte_ref;
    }

    public String getQuantidade_de_facas_normal_tol() {
        return quantidade_de_facas_normal_tol;
    }

    public static void setQuantidade_de_facas_normal_tol(String aQuantidade_de_facas_normal_tol) {
        quantidade_de_facas_normal_tol = aQuantidade_de_facas_normal_tol;
    }

    public String getAneis_esp_normal() {
        return aneis_esp_normal;
    }

    public static void setAneis_esp_normal(String aAneis_esp_normal) {
        aneis_esp_normal = aAneis_esp_normal;
    }

    public String getPcorte_normal() {
        return Pcorte_normal;
    }

    public static void setPcorte_normal(String aPcorte_normal) {
        Pcorte_normal = aPcorte_normal;
    }

    public String getTol_1_corte_normal() {
        return tol_1_corte_normal;
    }

    public static void setTol_1_corte_normal(String aTol_1_corte_normal) {
        tol_1_corte_normal = aTol_1_corte_normal;
    }

    public String getCorte_referen() {
        return corte_referen;
    }

    public static void setCorte_referen(String aCorte_referen) {
        corte_referen = aCorte_referen;
    }

    public String getRetracao_da_fresa_normal() {
        return retracao_da_fresa_normal;
    }

    public static void setRetracao_da_fresa_normal(String aRetracao_da_fresa_normal) {
        retracao_da_fresa_normal = aRetracao_da_fresa_normal;
    }

    public String getPasso_da_fresa_normal() {
        return passo_da_fresa_normal;
    }

    public static void setPasso_da_fresa_normal(String aPasso_da_fresa_normal) {
        passo_da_fresa_normal = aPasso_da_fresa_normal;
    }

    public String getSuporte_de_facas_fresao() {
        return suporte_de_facas_fresao;
    }

    public static void setSuporte_de_facas_fresao(String aSuporte_de_facas_fresao) {
        suporte_de_facas_fresao = aSuporte_de_facas_fresao;
    }

    public String getSuporte_de_facas_fresao_tol() {
        return suporte_de_facas_fresao_tol;
    }

    public static void setSuporte_de_facas_fresao_tol(String aSuporte_de_facas_fresao_tol) {
        suporte_de_facas_fresao_tol = aSuporte_de_facas_fresao_tol;
    }

    public String getQuant_tipo_das_fresas_fresao() {
        return quant_tipo_das_fresas_fresao;
    }

    public static void setQuant_tipo_das_fresas_fresao(String aQuant_tipo_das_fresas_fresao) {
        quant_tipo_das_fresas_fresao = aQuant_tipo_das_fresas_fresao;
    }

    public String getQuant_tipo_das_fresas_fresao_tol() {
        return quant_tipo_das_fresas_fresao_tol;
    }

    public static void setQuant_tipo_das_fresas_fresao_tol(String aQuant_tipo_das_fresas_fresao_tol) {
        quant_tipo_das_fresas_fresao_tol = aQuant_tipo_das_fresas_fresao_tol;
    }

    public String getQuantidade_de_facas_fresao() {
        return quantidade_de_facas_fresao;
    }

    public static void setQuantidade_de_facas_fresao(String aQuantidade_de_facas_fresao) {
        quantidade_de_facas_fresao = aQuantidade_de_facas_fresao;
    }

    public String getQuantidade_de_facas_fresao_tol() {
        return quantidade_de_facas_fresao_tol;
    }

    public static void setQuantidade_de_facas_fresao_tol(String aQuantidade_de_facas_fresao_tol) {
        quantidade_de_facas_fresao_tol = aQuantidade_de_facas_fresao_tol;
    }

    public String getAneis_espacadores_fresao() {
        return aneis_espacadores_fresao;
    }

    public static void setAneis_espacadores_fresao(String aAneis_espacadores_fresao) {
        aneis_espacadores_fresao = aAneis_espacadores_fresao;
    }

    public String getAneis_espacadores_fresao_tol() {
        return aneis_espacadores_fresao_tol;
    }

    public static void setAneis_espacadores_fresao_tol(String aAneis_espacadores_fresao_tol) {
        aneis_espacadores_fresao_tol = aAneis_espacadores_fresao_tol;
    }

    public String getPcorte_fresao() {
        return Pcorte_fresao;
    }

    public static void setPcorte_fresao(String aPcorte_fresao) {
        Pcorte_fresao = aPcorte_fresao;
    }

    public String getTol_1_corte_fresao() {
        return tol_1_corte_fresao;
    }

    public static void setTol_1_corte_fresao(String aTol_1_corte_fresao) {
        tol_1_corte_fresao = aTol_1_corte_fresao;
    }

    public String getProf_corte_ref_fresao() {
        return prof_corte_ref_fresao;
    }

    public static void setProf_corte_ref_fresao(String aProf_corte_ref_fresao) {
        prof_corte_ref_fresao = aProf_corte_ref_fresao;
    }

    public String getRetraçao_da_fresa_fresao() {
        return retraçao_da_fresa_fresao;
    }

    public static void setRetraçao_da_fresa_fresao(String aRetraçao_da_fresa_fresao) {
        retraçao_da_fresa_fresao = aRetraçao_da_fresa_fresao;
    }

    public String getPasso_da_fresa_fresao() {
        return passo_da_fresa_fresao;
    }

    public static void setPasso_da_fresa_fresao(String aPasso_da_fresa_fresao) {
        passo_da_fresa_fresao = aPasso_da_fresa_fresao;
    }

    public String getPolia_de_medicao() {
        return polia_de_medicao;
    }

    public static void setPolia_de_medicao(String aPolia_de_medicao) {
        polia_de_medicao = aPolia_de_medicao;
    }

    public String getContra_peso_polia() {
        return contra_peso_polia;
    }

    public static void setContra_peso_polia(String aContra_peso_polia) {
        contra_peso_polia = aContra_peso_polia;
    }

    public String getTensao_medicao_lbs() {
        return tensao_medicao_lbs;
    }

    public static void setTensao_medicao_lbs(String aTensao_medicao_lbs) {
        tensao_medicao_lbs = aTensao_medicao_lbs;
    }

    public String getDec_mm() {
        return dec_mm;
    }

    public static void setDec_mm(String aDec_mm) {
        dec_mm = aDec_mm;
    }

    public String getJogos() {
        return Jogos;
    }

    public static void setJogos(String aJogos) {
        Jogos = aJogos;
    }

    public String getLargura_superior() {
        return largura_superior;
    }

    public static void setLargura_superior(String aLargura_superior) {
        largura_superior = aLargura_superior;
    }

    public String getAltura() {
        return altura;
    }

    public static void setAltura(String aAltura) {
        altura = aAltura;
    }

    public String getVariacao_de_codigos() {
        return variacao_de_codigos;
    }

    public static void setVariacao_de_codigos(String aVariacao_de_codigos) {
        variacao_de_codigos = aVariacao_de_codigos;
    }

    public String getCodigo_de_vendas_revenda() {
        return codigo_de_vendas_revenda;
    }

    public static void setCodigo_de_vendas_revenda(String aCodigo_de_vendas_revenda) {
        codigo_de_vendas_revenda = aCodigo_de_vendas_revenda;
    }

    public String getAuxiliar1() {
        return auxiliar1;
    }

    public static void setAuxiliar1(String aAuxiliar1) {
        auxiliar1 = aAuxiliar1;
    }

    public String getAuxiliar2() {
        return auxiliar2;
    }

    public static void setAuxiliar2(String aAuxiliar2) {
        auxiliar2 = aAuxiliar2;
    }

    public String getAuxiliar3() {
        return auxiliar3;
    }

    public static void setAuxiliar3(String aAuxiliar3) {
        auxiliar3 = aAuxiliar3;
    }

    public String getAuxiliar4() {
        return auxiliar4;
    }

    public static void setAuxiliar4(String aAuxiliar4) {
        auxiliar4 = aAuxiliar4;
    }

    public String getAuxiliar5() {
        return auxiliar5;
    }

    public static void setAuxiliar5(String aAuxiliar5) {
        auxiliar5 = aAuxiliar5;
    }

    public String getAuxiliar6() {
        return auxiliar6;
    }

    public static void setAuxiliar6(String aAuxiliar6) {
        auxiliar6 = aAuxiliar6;
    }

    public String getAuxiliar7() {
        return auxiliar7;
    }

    public static void setAuxiliar7(String aAuxiliar7) {
        auxiliar7 = aAuxiliar7;
    }

    public static String getAuxiliar8() {
        return auxiliar8;
    }

    public static void setAuxiliar8(String aAuxiliar8) {
        auxiliar8 = aAuxiliar8;
    }

   

    

   

   
   
         public void main(String[] args) throws IOException {
          //   buscar();
         }
public  void buscar(String ativo) throws IOException{
      List<BancoExcel4> listaAlunos = new ArrayList<BancoExcel4>();
   
         //     System.out.println("entrou aqui");
                   try (FileInputStream arquivo = new FileInputStream(new File(
                           AbreExcelPolyRev.fileName))) {
                       HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
                       
                       HSSFSheet sheetAlunos = workbook.getSheetAt(2); //primeira planilha
                       
                       Iterator<Row> rowIterator = sheetAlunos.iterator();
                       
                       while (rowIterator.hasNext()) {                         //ler a linhas
                           Row row = rowIterator.next();
                           Iterator<Cell> cellIterator = row.cellIterator();
                           
                           BancoExcel4 dados = new BancoExcel4();
                           listaAlunos.add(dados);
                           
                           while (cellIterator.hasNext()) {                     //ler a células
                               Cell cell = cellIterator.next();
                               switch (cell.getColumnIndex()) {
                                   case 0:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setA(cell.getStringCellValue()); //coluna 1 pega valor 
                                   
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 1:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setB(cell.getStringCellValue()); //coluna 1 pega valor 
                                       
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 2:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setC(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 3:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setD(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                case 4:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setE(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                  case 5:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setF(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 6:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setG(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 7:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setH(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                 case 8:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setI(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                 case 9:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJ(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                 case 10:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setK(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                               case 11:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setL(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 12:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setM(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 13:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setN(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 14:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setO(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                            case 15:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setP(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 16:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setQ(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                 case 17:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setR(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 18:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setS(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 19:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setT(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 20:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setU(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 21:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setV(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                     case 22:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setW(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                     case 23:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setX(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                     case 24:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setY(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break; 
                                      case 25:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setZ(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 26:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAa(cell.getStringCellValue()); //coluna 1 pega valor 
                                   
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 27:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAb(cell.getStringCellValue()); //coluna 1 pega valor 
                                       
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 28:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 29:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                case 30:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                  case 31:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 32:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 33:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                 case 34:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                 case 35:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                 case 36:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                               case 37:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 38:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 39:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 40:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                            case 41:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 42:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                               case 43:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 44:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 45:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 46:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 47:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                     case 48:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                     case 49:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                     case 50:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break; 
                                      case 51:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setAz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 52:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBa(cell.getStringCellValue()); //coluna 1 pega valor 
                                   
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 53:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBb(cell.getStringCellValue()); //coluna 1 pega valor 
                                       
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 54:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 55:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                case 56:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                  case 57:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 58:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 59:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                 case 60:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                 case 61:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                 case 62:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                               case 63:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 64:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 65:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 66:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                            case 67:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 68:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 69:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                             case 70:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 71:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 72:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                              case 73:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                               case 74:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                               case 75:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;    
                                case 76:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break; 
                                 case 77:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setBz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 78:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 79:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCb(cell.getStringCellValue()); //coluna 1 pega valor 
                                    //    System.out.println(dados.getCb());
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 80:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 81:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 82:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 83:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 84:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 85:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 86:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 87:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 88:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 89:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 90:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 91:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 92:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 93:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 94:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 95:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 96:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 97:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 98:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 99:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 100:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 101:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 102:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 103:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setCz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                  case 104:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 105:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDb(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 106:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 107:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 108:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 109:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 110:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 111:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 112:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 113:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 114:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 115:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 116:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 117:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 118:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDo_(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 119:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 120:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 121:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 122:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 123:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 124:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 125:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 126:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 127:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 128:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 129:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setDz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break; 
                                  case 130:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 131:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEb(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 132:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 133:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 134:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 135:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 136:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 137:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 138:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 139:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 140:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 141:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 142:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 143:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 144:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 145:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 146:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 147:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 148:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 149:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 150:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 151:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 152:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 153:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 154:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 155:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setEz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                    case 156:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 157:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFb(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 158:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 159:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 160:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 161:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 162:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 163:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 164:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 165:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 166:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 167:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 168:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 169:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 170:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 171:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 172:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 173:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 174:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 175:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 176:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                   case 177:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 178:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 179:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;     
                                   case 180:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 181:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setFz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;       
                                      
                       }
                   }
                       }
               } catch (FileNotFoundException e) {
                      System.out.println("Arquivo Excel não encontrado!");
               }
   
               if (listaAlunos.isEmpty()) {
                      System.out.println("Nenhum Ativo encontrado!");
               } else {
                 for (BancoExcel4 dados : listaAlunos) {
                            try{
                              
                             if (dados.getCb().contains(ativo) | dados.getCb().equals(ativo)) {

 confirmaSap = true;

   tipo= dados.getA();
   qsi= dados.getB();
   obs= dados.getC();
   qsi_rev= dados.getD();
   resp= dados.getE();
   receita= dados.getF();
   espacamento_simples_mm= dados.getG();
   espacamento_duplo_mm= dados.getH();
   sap_materia1_1= dados.getI();
   descricao_material_1= dados.getJ();
   material_material1= dados.getK();
   voltas_material1= dados.getL();
   calibre_material1= dados.getM();
   tol_material1_mm= dados.getN();
   largura_material1_mm= dados.getO();
   sap_materia1_2= dados.getP();
   descricao_material_2= dados.getQ();
   material_material2= dados.getR();
   voltas_material2= dados.getS();
   calibre_material2= dados.getT();
   tol_material2_mm= dados.getU();
   largura_material2_mm= dados.getV();
   sap_materia1_3= dados.getW();
   descricao_material_3= dados.getX();
   material_material3= dados.getY();
   voltas_material3= dados.getZ();
   calibre_material3= dados.getAa();
   tol_material3_mm= dados.getAb();
   largura_material3_mm= dados.getAc();
   sap_materia1_4= dados.getAd();
   descricao_material_4= dados.getAe();
   material_material4= dados.getAf();
   voltas_material4= dados.getAg();
   calibre_material4= dados.getAh();
   tol_material4_mm= dados.getAi();
   largura_material4_mm= dados.getAj();
   sap_materia1_5= dados.getAk();
   descricao_material_5= dados.getAl();
   material_material5= dados.getAm();
   voltas_material5= dados.getAn();
   calibre_material5= dados.getAo();
   tol_material5_mm= dados.getAp();
   largura_material5_mm= dados.getAq();
   sap_materia1_6= dados.getAr();
   descricao_material_6= dados.getAs();
   material_material6= dados.getAt();
   voltas_material6= dados.getAu();
   calibre_material6= dados.getAv();
   tol_material6_mm= dados.getAw();
   largura_material6_mm= dados.getAx();
   sap_materia1_7= dados.getAy();
   descricao_material_7= dados.getAz();
   material_material7= dados.getBa();
   voltas_material7= dados.getBb();
   calibre_material7= dados.getBc();
   tol_material7_mm= dados.getBd();
   largura_material7_mm= dados.getBe();
   sap_materia1_8= dados.getBf();
   descricao_material_8= dados.getBg();
   material_material8= dados.getBh();
   voltas_material8= dados.getBi();
   calibre_material8= dados.getBj();
   tol_material8_mm= dados.getBk();
   largura_material8_mm= dados.getBl();
   sap_materia1_9= dados.getBm();
   descricao_material_9= dados.getBn();
   material_material9= dados.getBo();
   voltas_material9= dados.getBp();
   calibre_material9= dados.getBq();
  
   perimetro_nominal= dados.getBt();
   perimetro_tambor_mm= dados.getBu();
   circ_ext_banda_crua= dados.getBv();
   diafragma_mm= dados.getBw();
   tipo_diafragma= dados.getBx();
   tol_diafragma_mm= dados.getBy();
   codigo_sap_fert= dados.getBz();
   codigo_fabrica= dados.getCa();
   codigo_sap_halb= dados.getCb();
   codigo_barras_ean13= dados.getCc();
  
   marca_1= dados.getCd();
   marcacao= dados.getCe();
   marca_2= dados.getCf();
   marca_3= dados.getCg();
   marcacao2= dados.getCh();
   marca_4= dados.getCi();
   marca_5= dados.getCj();
   marcacao3= dados.getCk();
   marca6= dados.getCl();
   marca_7= dados.getCm();
   marcacao4= dados.getCn();
   marca_8= dados.getCo();
   marca_9= dados.getCp();
   marcacao5= dados.getCq();
   marca_10= dados.getCr();
   marca_11= dados.getCs();
   marca_6= dados.getCt();
   marca_12= dados.getCu();
   marca_13= dados.getCv();
   marcacao7= dados.getCw();
   marca_14= dados.getCx();
   marca_15= dados.getCy();
   marcacao8= dados.getCz();
   marca_16= dados.getDa();
   marca_17= dados.getDb();
   marcacao9= dados.getDc();
   marca_18= dados.getDd();
   marca_19= dados.getDe();
   marcacao10= dados.getDf();
   marca_20= dados.getDg();
   
   per_externo_luva_corte= dados.getDh();
   tambor_de_corte_faixa_mm= dados.getDi();
   peso_da_correia_g= dados.getDj();
   tol_peso_da_correia_g= dados.getDk();
   quantidade_de_correias_por_banda= dados.getDl();
   suporte_de_facas_normal= dados.getDm();
   suporte_de_facas_normal_tol= dados.getDn();
   quant_tipo_das_fresas_nomal= dados.getDo_();
   quant_tipo_das_fresas_nomal_tol= dados.getDp();
   Quantidade_de_Facas= dados.getDq();
   quantidade_de_facas_normal_tol= dados.getDr();
   aneis_esp_normal= dados.getDs();
   Aneis_espaçadores_Tol= dados.getDt();
   Pcorte_normal = dados.getDu();
   tol_1_corte_normal= dados.getDv();
   corte_referen= dados.getDw();
   retracao_da_fresa_normal= dados.getDx();
   passo_da_fresa_normal= dados.getDy();
   suporte_de_facas_fresao= dados.getDz();
   suporte_de_facas_fresao_tol= dados.getEa();
   quant_tipo_das_fresas_fresao= dados.getEb();
   quant_tipo_das_fresas_fresao_tol= dados.getEc();
   Quantidade_de_Facas_Fresao = dados.getEd();
   quantidade_de_facas_fresao_tol= dados.getEe();
   aneis_espacadores_fresao= dados.getEf();
   aneis_espacadores_fresao_tol= dados.getEg();
   Pcorte_fresao= dados.getEh();
   tol_1_corte_fresao= dados.getEi();
   prof_corte_ref_fresao= dados.getEj();
   retraçao_da_fresa_fresao= dados.getEk();
   passo_da_fresa_fresao= dados.getEl();
   polia_de_medicao= dados.getEm();
   contra_peso_polia= dados.getEn();
   tensao_medicao_lbs= dados.getEo();
   dec_mm= dados.getEp();
   largura_superior= dados.getEq();
   altura= dados.getEr();
   tolerancia1= dados.getEs();
   tolerancia2= dados.getEt();
   variacao_de_altura= dados.getEu();
   variacao_de_codigos= dados.getEv();
   codigo_de_vendas_revenda= dados.getEw();
   fresa= dados.getEz();
   fresa1= dados.getFa();
   fresa2= dados.getFb();
   fresa3= dados.getFc();
   fresa4= dados.getFd();
   fresa5= dados.getFe();
   fresa6= dados.getFf();
   fresa7= dados.getFg();
   auxiliar1= dados.getFh();
   auxiliar2= dados.getFi();
   auxiliar3= dados.getFj();
   auxiliar4= dados.getFk();
   auxiliar5= dados.getFl();
   auxiliar6= dados.getFm();
   auxiliar7= dados.getFn();
   auxiliar8= dados.getFo();


                               //    break;
                             }else{
                              
                             }
                            }catch(NullPointerException e){
                           //     System.out.println(e);
                            }
                      }  
               }
         }

    public boolean isConfirmaSap() {
        return confirmaSap;
    }

    public String getBanco() {
        return banco;
    }


   
 
  }