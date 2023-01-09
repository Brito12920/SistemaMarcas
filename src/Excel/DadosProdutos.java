/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excel;

/**
 *
 * @author v103760
 */
public class DadosProdutos {
private final String tipo;
private final String QSI;
private final String OBS;
private final String QSI_rev;	
private final String RESP;
private final String Receita_N;
private final String Espaçamento_Simples;
private final String Espacamento_Duplo;
private final String SAP_material1;
private final String Descricao_material1;//10

private final String Material_material1;
private final String Voltas_material1;
private final String Calibre_material1;
private final String Tol_material1;
private final String Largura_material1;
private final String SAP_material2;
private final String Descricao_material2;
private final String Material_material2;
private final String Voltas_material2;
private final String Calibre_material2;//20

private final String Tol_material2;
private final String Largura_material2;
private final String SAP_material3;
private final String Descricao_material3;
private final String Material_material3;
private final String Voltas_material3;
private final String Calibre_material3;
private final String Tol_material3;
private final String Largura_material3;
private final String SAP_material4;//30

private final String Descricao_material4;
private final String Material_material4;
private final String Voltas_material4;
private final String Calibre_material4;
private final String Tol_material4;
private final String Largura_material4;
private final String SAP_material5;
private final String Descricao_material5;
private final String Material_material5;
private final String Voltas_material5;//40

private final String Calibre_material5;
private final String Tol_material5;
private final String Largura_material5;
private final String SAP_material6;
private final String Descricao_material6;
private final String Material_material6;
private final String Voltas_material6;
private final String Calibre_material6;
private final String Tol_material6;
private final String Largura_material6;//50

private final String SAP_material7;
private final String Descricao_material7;
private final String Material_material7;
private final String Voltas_material7;
private final String Calibre_material7;
private final String Tol_material7;
private final String Largura_material7;
private final String SAP_material8;
private final String Descricao_material8;
private final String Material_material8;//60

private final String Voltas_material8;
private final String Calibre_material8;
private final String Tol_material8;
private final String Largura_material8;
private final String SAP_material9;
private final String Descricao_material9;
private final String Material_material9;
private final String Voltas_material9;
private final String Calibre_material9;
private final String Cordonel_S;//70

private final String Cordonel_Z;
private final String SAP_material10;
private final String Descricao_material10;
private final String Material_10;
private final String Voltas_material10;
private final String Calibre_material10;
private final String Tol_Calibre_material10;
private final String Largura_material10;
private final String Perimetro_nominal_mm;
private final String Perimetro_do_Tambor_mm;//80

private final String Perimetro_do_tambor_com_luva;
private final String Circ_Ext_Banda_Crua;
private final String Tipo_Diafragma;
private final String Tamanho_diafragma;
private final String Tol_Diafragma_mm;
private final String Codigo_SAP_FERT;
private final String Codigo_de_Fabrica;
private final String Codigo_SAP_HALB;
private final String Codigo_Barras_EAN13;
private final String Marca_1;//90

private final String Marcacao;
private final String Marca_2;
private final String Marca_3;
private final String Marcacao_2;
private final String Marca_4;
private final String Marca_5;
private final String Marcacao_3;
private final String Marca_6;
private final String Marca_7;
private final String Marcacao_4;//100

private final String Marca_8;
private final String Marca_9;
private final String Marcacao_5;
private final String Marca_10;
private final String Marca_11;
private final String Marcacao_6;
private final String Marca_12;
private final String Marca_13;
private final String Marcacao_7;
private final String Marca_14;//110

private final String Marca_15;
private final String Marcacao_8;
private final String Marca_16;
private final String Marca_17;
private final String Marcacao_9;
private final String Marca_18;
private final String Marca_19;
private final String Marcacao_10;
private final String Marca_20;
private final String Per_Externo_Luva_Corte_ref;//120

private final String Tambor_de_Corte_faixa_mm;
private final String Peso_da_Correia_g;
private final String Tol_Peso_da_Correia_g;
private final String Quantidade_de_correias_por_banda;
private final String Suporte_de_Facas;
private final String Suporte_de_Facas_Tol;
private final String Quantidade_e_Tipo_das_Fresas;
private final String Quantidade_e_Tipo_das_Fresas_tol;
private final String Quantidade_de_Facas;
private final String Pre_corte;//130

private final String Aneis_espacadores;
private final String Aneis_espacadores_Tol;
private final String Primeiro_Corte;
private final String TolerAncia_primeiro_corte;
private final String Profundidade_do_corte_Referencia;
private final String Retracao_da_fresa;
private final String Passo_da_Fresa_Rib_0_140;
private final String Suporte_de_Fresao;
private final String Suporte_de_Fresao_Tol;
private final String Quantidade_e_Tipo_das_Fresao;//140

private final String Quantidade_e_Tipo_das_Fresao_tol;
private final String Quantidade_de_Facas_Fresao;
private final String Quantidade_de_Facas_Fresao_Tol;
private final String Aneis_espacadores_Fresao;
private final String Aneis_espacadores_Fresao_Tol;
private final String Primeiro_Corte_5;
private final String TolerAncia_Primeiro_Corte_2;
private final String Profundidade_do_corte_Referencia6;
private final String Retracao_da_fresa7;
private final String Passo_da_Fresa_Rib_0_140_8;//150

private final String Polia_de_Medicao;
private final String Contra_Peso_da_Polia_kg;
private final String Maquina_Tensao_p_Medicao_lbs;
private final String D_E_C_mm;
private final String Jogos;
private final String Largura_superior;
private final String Altura;
private final String TolerAncia;
private final String TolerAncia_2;
private final String Variacao_max_altura_na_mesma_peca;//160

private final String Variacao_de_codigos_SICaracteristica_Significativa;
private final String Codigo_de_Vendas_Revenda;
private final String Codigo_de_Vendas_Exportacao;
private final String Codigo_de_Vendas_EO;
private final String Fresa_1;	
private final String Circ_Polia_mm;
private final String DEC_Cal;
private final String DEC2;
private final String Verif;
private final String Fresao_2;//170

private final String Fresao_3;
private final String Fresao_4;
private final String Aux_1;
private final String Aux_2;
private final String EMB1;
private final String quantidade;
private final String EMB2;
private final String EMB3;
private final String EMB4;
private final String EMB5;//180

private final String EMB6;
private final String FRESA;
private final String QUANT;
private final String ANGULO;
private final String ANEIS1;
private final String QUANT_A1;
private final String FRESA1;	
private final String QUANT1;
private final String ANeIS2;
private final String QUANT_A2;//190

private final String FRESA2;	
private final String QUANT2;
private final String ANGULO3;
private final String ANEIS14;
private final String QUANT_A15;
private final String FRESA16;
private final String QUANT17;
private final String ANGULO18;
private final String Cod_fresa;
private final String Cod_fresao;//200

private final String modelo;
private final String OBS_;
private final String Impressao_codigo_barras_2D;

   
private final String Coluna1;
private final String Espessura_correia;
private final String Fator_perimetro_2000;
private final String Fator_EPDM;
private final String Fator_Espess_total;
private final String Nova_Receita;
private final String Form_Circunf_banda;//210

private final String Coluna3;
private final String Coluna4;
private final String Polia2;
private final String tamanho_polia;//214


 public DadosProdutos(String tipo, String QSI, String OBS, String QSI_rev, String RESP, String Receita_N, String Espaçamento_Simples, String Espacamento_Duplo, String SAP_material1, String Descricao_material1, String Material_material1, String Voltas_material1, String Calibre_material1, String Tol_material1, String Largura_material1, String SAP_material2, String Descricao_material2, String Material_material2, String Voltas_material2, String Calibre_material2, String Tol_material2, String Largura_material2, String SAP_material3, String Descricao_material3, String Material_material3, String Voltas_material3, String Calibre_material3, String Tol_material3, String Largura_material3, String SAP_material4, String Descricao_material4, String Material_material4, String Voltas_material4, String Calibre_material4, String Tol_material4, String Largura_material4, String SAP_material5, String Descricao_material5, String Material_material5, String Voltas_material5, String Calibre_material5, String Tol_material5, String Largura_material5, String SAP_material6, String Descricao_material6, String Material_material6, String Voltas_material6, String Calibre_material6, String Tol_material6, String Largura_material6, String SAP_material7, String Descricao_material7, String Material_material7, String Voltas_material7, String Calibre_material7, String Tol_material7, String Largura_material7, String SAP_material8, String Descricao_material8, String Material_material8, String Voltas_material8, String Calibre_material8, String Tol_material8, String Largura_material8, String SAP_material9, String Descricao_material9, String Material_material9, String Voltas_material9, String Calibre_material9, String Cordonel_S, String Cordonel_Z, String SAP_material10, String Descricao_material10, String Material_10, String Voltas_material10, String Calibre_material10, String Tol_Calibre_material10, String Largura_material10, String Perimetro_nominal_mm, String Perimetro_do_Tambor_mm, String Perimetro_do_tambor_com_luva, String Circ_Ext_Banda_Crua, String Tipo_Diafragma, String Tamanho_diafragma, String Tol_Diafragma_mm, String Codigo_SAP_FERT, String Codigo_de_Fabrica, String Codigo_SAP_HALB, String Codigo_Barras_EAN13, String Marca_1, String Marcacao, String Marca_2, String Marca_3, String Marcacao_2, String Marca_4, String Marca_5, String Marcacao_3, String Marca_6, String Marca_7, String Marcacao_4, String Marca_8, String Marca_9, String Marcacao_5, String Marca_10, String Marca_11, String Marcacao_6, String Marca_12, String Marca_13, String Marcacao_7, String Marca_14, String Marca_15, String Marcacao_8, String Marca_16, String Marca_17, String Marcacao_9, String Marca_18, String Marca_19, String Marcacao_10, String Marca_20, String Per_Externo_Luva_Corte_ref, String Tambor_de_Corte_faixa_mm, String Peso_da_Correia_g, String Tol_Peso_da_Correia_g, String Quantidade_de_correias_por_banda, String Suporte_de_Facas, String Suporte_de_Facas_Tol, String Quantidade_e_Tipo_das_Fresas, String Quantidade_e_Tipo_das_Fresas_tol, String Quantidade_de_Facas, String Pre_corte, String Aneis_espacadores, String Aneis_espacadores_Tol, String Primeiro_Corte, String TolerAncia_primeiro_corte, String Profundidade_do_corte_Referencia, String Retracao_da_fresa, String Passo_da_Fresa_Rib_0_140, String Suporte_de_Fresao, String Suporte_de_Fresao_Tol, String Quantidade_e_Tipo_das_Fresao, String Quantidade_e_Tipo_das_Fresao_tol, String Quantidade_de_Facas_Fresao, String Quantidade_de_Facas_Fresao_Tol, String Aneis_espacadores_Fresao, String Aneis_espacadores_Fresao_Tol, String Primeiro_Corte_5, String TolerAncia_Primeiro_Corte_2, String Profundidade_do_corte_Referencia6, String Retracao_da_fresa7, String Passo_da_Fresa_Rib_0_140_8, String Polia_de_Medicao, String Contra_Peso_da_Polia_kg, String Maquina_Tensao_p_Medicao_lbs, String D_E_C_mm, String Jogos, String Largura_superior, String Altura, String TolerAncia, String TolerAncia_2, String Variacao_max_altura_na_mesma_peca, String Variacao_de_codigos_SICaracteristica_Significativa, String Codigo_de_Vendas_Revenda, String Codigo_de_Vendas_Exportacao, String Codigo_de_Vendas_EO, String Fresa_1, String Circ_Polia_mm, String DEC_Cal, String DEC2, String Verif, String Fresao_2, String Fresao_3, String Fresao_4, String Aux_1, String Aux_2, String EMB1, String quantidade, String EMB2, String EMB3, String EMB4, String EMB5, String EMB6, String FRESA, String QUANT, String ANGULO, String ANEIS1, String QUANT_A1, String FRESA1, String QUANT1, String ANeIS2, String QUANT_A2, String FRESA2, String QUANT2, String ANGULO3, String ANEIS14, String QUANT_A15, String FRESA16, String QUANT17, String ANGULO18, String Cod_fresa, String Cod_fresao, String modelo, String OBS_, String Impressao_codigo_barras_2D, String Coluna1, String Espessura_correia, String Fator_perimetro_2000, String Fator_EPDM, String Fator_Espess_total, String Nova_Receita, String Form_Circunf_banda, String Coluna3, String Coluna4, String Polia2, String tamanho_polia) {
        this.tipo = tipo;
        this.QSI = QSI;
        this.OBS = OBS;
        this.QSI_rev = QSI_rev;
        this.RESP = RESP;
        this.Receita_N = Receita_N;
        this.Espaçamento_Simples = Espaçamento_Simples;
        this.Espacamento_Duplo = Espacamento_Duplo;
        this.SAP_material1 = SAP_material1;
        this.Descricao_material1 = Descricao_material1;
        this.Material_material1 = Material_material1;
        this.Voltas_material1 = Voltas_material1;
        this.Calibre_material1 = Calibre_material1;
        this.Tol_material1 = Tol_material1;
        this.Largura_material1 = Largura_material1;
        this.SAP_material2 = SAP_material2;
        this.Descricao_material2 = Descricao_material2;
        this.Material_material2 = Material_material2;
        this.Voltas_material2 = Voltas_material2;
        this.Calibre_material2 = Calibre_material2;
        this.Tol_material2 = Tol_material2;
        this.Largura_material2 = Largura_material2;
        this.SAP_material3 = SAP_material3;
        this.Descricao_material3 = Descricao_material3;
        this.Material_material3 = Material_material3;
        this.Voltas_material3 = Voltas_material3;
        this.Calibre_material3 = Calibre_material3;
        this.Tol_material3 = Tol_material3;
        this.Largura_material3 = Largura_material3;
        this.SAP_material4 = SAP_material4;
        this.Descricao_material4 = Descricao_material4;
        this.Material_material4 = Material_material4;
        this.Voltas_material4 = Voltas_material4;
        this.Calibre_material4 = Calibre_material4;
        this.Tol_material4 = Tol_material4;
        this.Largura_material4 = Largura_material4;
        this.SAP_material5 = SAP_material5;
        this.Descricao_material5 = Descricao_material5;
        this.Material_material5 = Material_material5;
        this.Voltas_material5 = Voltas_material5;
        this.Calibre_material5 = Calibre_material5;
        this.Tol_material5 = Tol_material5;
        this.Largura_material5 = Largura_material5;
        this.SAP_material6 = SAP_material6;
        this.Descricao_material6 = Descricao_material6;
        this.Material_material6 = Material_material6;
        this.Voltas_material6 = Voltas_material6;
        this.Calibre_material6 = Calibre_material6;
        this.Tol_material6 = Tol_material6;
        this.Largura_material6 = Largura_material6;
        this.SAP_material7 = SAP_material7;
        this.Descricao_material7 = Descricao_material7;
        this.Material_material7 = Material_material7;
        this.Voltas_material7 = Voltas_material7;
        this.Calibre_material7 = Calibre_material7;
        this.Tol_material7 = Tol_material7;
        this.Largura_material7 = Largura_material7;
        this.SAP_material8 = SAP_material8;
        this.Descricao_material8 = Descricao_material8;
        this.Material_material8 = Material_material8;
        this.Voltas_material8 = Voltas_material8;
        this.Calibre_material8 = Calibre_material8;
        this.Tol_material8 = Tol_material8;
        this.Largura_material8 = Largura_material8;
        this.SAP_material9 = SAP_material9;
        this.Descricao_material9 = Descricao_material9;
        this.Material_material9 = Material_material9;
        this.Voltas_material9 = Voltas_material9;
        this.Calibre_material9 = Calibre_material9;
        this.Cordonel_S = Cordonel_S;
        this.Cordonel_Z = Cordonel_Z;
        this.SAP_material10 = SAP_material10;
        this.Descricao_material10 = Descricao_material10;
        this.Material_10 = Material_10;
        this.Voltas_material10 = Voltas_material10;
        this.Calibre_material10 = Calibre_material10;
        this.Tol_Calibre_material10 = Tol_Calibre_material10;
        this.Largura_material10 = Largura_material10;
        this.Perimetro_nominal_mm = Perimetro_nominal_mm;
        this.Perimetro_do_Tambor_mm = Perimetro_do_Tambor_mm;
        this.Perimetro_do_tambor_com_luva = Perimetro_do_tambor_com_luva;
        this.Circ_Ext_Banda_Crua = Circ_Ext_Banda_Crua;
        this.Tipo_Diafragma = Tipo_Diafragma;
        this.Tamanho_diafragma = Tamanho_diafragma;
        this.Tol_Diafragma_mm = Tol_Diafragma_mm;
        this.Codigo_SAP_FERT = Codigo_SAP_FERT;
        this.Codigo_de_Fabrica = Codigo_de_Fabrica;
        this.Codigo_SAP_HALB = Codigo_SAP_HALB;
        this.Codigo_Barras_EAN13 = Codigo_Barras_EAN13;
        this.Marca_1 = Marca_1;
        this.Marcacao = Marcacao;
        this.Marca_2 = Marca_2;
        this.Marca_3 = Marca_3;
        this.Marcacao_2 = Marcacao_2;
        this.Marca_4 = Marca_4;
        this.Marca_5 = Marca_5;
        this.Marcacao_3 = Marcacao_3;
        this.Marca_6 = Marca_6;
        this.Marca_7 = Marca_7;
        this.Marcacao_4 = Marcacao_4;
        this.Marca_8 = Marca_8;
        this.Marca_9 = Marca_9;
        this.Marcacao_5 = Marcacao_5;
        this.Marca_10 = Marca_10;
        this.Marca_11 = Marca_11;
        this.Marcacao_6 = Marcacao_6;
        this.Marca_12 = Marca_12;
        this.Marca_13 = Marca_13;
        this.Marcacao_7 = Marcacao_7;
        this.Marca_14 = Marca_14;
        this.Marca_15 = Marca_15;
        this.Marcacao_8 = Marcacao_8;
        this.Marca_16 = Marca_16;
        this.Marca_17 = Marca_17;
        this.Marcacao_9 = Marcacao_9;
        this.Marca_18 = Marca_18;
        this.Marca_19 = Marca_19;
        this.Marcacao_10 = Marcacao_10;
        this.Marca_20 = Marca_20;
        this.Per_Externo_Luva_Corte_ref = Per_Externo_Luva_Corte_ref;
        this.Tambor_de_Corte_faixa_mm = Tambor_de_Corte_faixa_mm;
        this.Peso_da_Correia_g = Peso_da_Correia_g;
        this.Tol_Peso_da_Correia_g = Tol_Peso_da_Correia_g;
        this.Quantidade_de_correias_por_banda = Quantidade_de_correias_por_banda;
        this.Suporte_de_Facas = Suporte_de_Facas;
        this.Suporte_de_Facas_Tol = Suporte_de_Facas_Tol;
        this.Quantidade_e_Tipo_das_Fresas = Quantidade_e_Tipo_das_Fresas;
        this.Quantidade_e_Tipo_das_Fresas_tol = Quantidade_e_Tipo_das_Fresas_tol;
        this.Quantidade_de_Facas = Quantidade_de_Facas;
        this.Pre_corte = Pre_corte;
        this.Aneis_espacadores = Aneis_espacadores;
        this.Aneis_espacadores_Tol = Aneis_espacadores_Tol;
        this.Primeiro_Corte = Primeiro_Corte;
        this.TolerAncia_primeiro_corte = TolerAncia_primeiro_corte;
        this.Profundidade_do_corte_Referencia = Profundidade_do_corte_Referencia;
        this.Retracao_da_fresa = Retracao_da_fresa;
        this.Passo_da_Fresa_Rib_0_140 = Passo_da_Fresa_Rib_0_140;
        this.Suporte_de_Fresao = Suporte_de_Fresao;
        this.Suporte_de_Fresao_Tol = Suporte_de_Fresao_Tol;
        this.Quantidade_e_Tipo_das_Fresao = Quantidade_e_Tipo_das_Fresao;
        this.Quantidade_e_Tipo_das_Fresao_tol = Quantidade_e_Tipo_das_Fresao_tol;
        this.Quantidade_de_Facas_Fresao = Quantidade_de_Facas_Fresao;
        this.Quantidade_de_Facas_Fresao_Tol = Quantidade_de_Facas_Fresao_Tol;
        this.Aneis_espacadores_Fresao = Aneis_espacadores_Fresao;
        this.Aneis_espacadores_Fresao_Tol = Aneis_espacadores_Fresao_Tol;
        this.Primeiro_Corte_5 = Primeiro_Corte_5;
        this.TolerAncia_Primeiro_Corte_2 = TolerAncia_Primeiro_Corte_2;
        this.Profundidade_do_corte_Referencia6 = Profundidade_do_corte_Referencia6;
        this.Retracao_da_fresa7 = Retracao_da_fresa7;
        this.Passo_da_Fresa_Rib_0_140_8 = Passo_da_Fresa_Rib_0_140_8;
        this.Polia_de_Medicao = Polia_de_Medicao;
        this.Contra_Peso_da_Polia_kg = Contra_Peso_da_Polia_kg;
        this.Maquina_Tensao_p_Medicao_lbs = Maquina_Tensao_p_Medicao_lbs;
        this.D_E_C_mm = D_E_C_mm;
        this.Jogos = Jogos;
        this.Largura_superior = Largura_superior;
        this.Altura = Altura;
        this.TolerAncia = TolerAncia;
        this.TolerAncia_2 = TolerAncia_2;
        this.Variacao_max_altura_na_mesma_peca = Variacao_max_altura_na_mesma_peca;
        this.Variacao_de_codigos_SICaracteristica_Significativa = Variacao_de_codigos_SICaracteristica_Significativa;
        this.Codigo_de_Vendas_Revenda = Codigo_de_Vendas_Revenda;
        this.Codigo_de_Vendas_Exportacao = Codigo_de_Vendas_Exportacao;
        this.Codigo_de_Vendas_EO = Codigo_de_Vendas_EO;
        this.Fresa_1 = Fresa_1;
        this.Circ_Polia_mm = Circ_Polia_mm;
        this.DEC_Cal = DEC_Cal;
        this.DEC2 = DEC2;
        this.Verif = Verif;
        this.Fresao_2 = Fresao_2;
        this.Fresao_3 = Fresao_3;
        this.Fresao_4 = Fresao_4;
        this.Aux_1 = Aux_1;
        this.Aux_2 = Aux_2;
        this.EMB1 = EMB1;
        this.quantidade = quantidade;
        this.EMB2 = EMB2;
        this.EMB3 = EMB3;
        this.EMB4 = EMB4;
        this.EMB5 = EMB5;
        this.EMB6 = EMB6;
        this.FRESA = FRESA;
        this.QUANT = QUANT;
        this.ANGULO = ANGULO;
        this.ANEIS1 = ANEIS1;
        this.QUANT_A1 = QUANT_A1;
        this.FRESA1 = FRESA1;
        this.QUANT1 = QUANT1;
        this.ANeIS2 = ANeIS2;
        this.QUANT_A2 = QUANT_A2;
        this.FRESA2 = FRESA2;
        this.QUANT2 = QUANT2;
        this.ANGULO3 = ANGULO3;
        this.ANEIS14 = ANEIS14;
        this.QUANT_A15 = QUANT_A15;
        this.FRESA16 = FRESA16;
        this.QUANT17 = QUANT17;
        this.ANGULO18 = ANGULO18;
        this.Cod_fresa = Cod_fresa;
        this.Cod_fresao = Cod_fresao;
        this.modelo = modelo;
        this.OBS_ = OBS_;
        this.Impressao_codigo_barras_2D = Impressao_codigo_barras_2D;
        this.Coluna1 = Coluna1;
        this.Espessura_correia = Espessura_correia;
        this.Fator_perimetro_2000 = Fator_perimetro_2000;
        this.Fator_EPDM = Fator_EPDM;
        this.Fator_Espess_total = Fator_Espess_total;
        this.Nova_Receita = Nova_Receita;
        this.Form_Circunf_banda = Form_Circunf_banda;
        this.Coluna3 = Coluna3;
        this.Coluna4 = Coluna4;
        this.Polia2 = Polia2;
        this.tamanho_polia = tamanho_polia;
    }

    public String getTipo() {
        return tipo;
    }

    public String getQSI() {
        return QSI;
    }

    public String getOBS() {
        return OBS;
    }

    public String getQSI_rev() {
        return QSI_rev;
    }

    public String getRESP() {
        return RESP;
    }

    public String getReceita_N() {
        return Receita_N;
    }

    public String getEspaçamento_Simples() {
        return Espaçamento_Simples;
    }

    public String getEspacamento_Duplo() {
        return Espacamento_Duplo;
    }

    public String getSAP_material1() {
        return SAP_material1;
    }

    public String getDescricao_material1() {
        return Descricao_material1;
    }

    public String getMaterial_material1() {
        return Material_material1;
    }

    public String getVoltas_material1() {
        return Voltas_material1;
    }

    public String getCalibre_material1() {
        return Calibre_material1;
    }

    public String getTol_material1() {
        return Tol_material1;
    }

    public String getLargura_material1() {
        return Largura_material1;
    }

    public String getSAP_material2() {
        return SAP_material2;
    }

    public String getDescricao_material2() {
        return Descricao_material2;
    }

    public String getMaterial_material2() {
        return Material_material2;
    }

    public String getVoltas_material2() {
        return Voltas_material2;
    }

    public String getCalibre_material2() {
        return Calibre_material2;
    }

    public String getTol_material2() {
        return Tol_material2;
    }

    public String getLargura_material2() {
        return Largura_material2;
    }

    public String getSAP_material3() {
        return SAP_material3;
    }

    public String getDescricao_material3() {
        return Descricao_material3;
    }

    public String getMaterial_material3() {
        return Material_material3;
    }

    public String getVoltas_material3() {
        return Voltas_material3;
    }

    public String getCalibre_material3() {
        return Calibre_material3;
    }

    public String getTol_material3() {
        return Tol_material3;
    }

    public String getLargura_material3() {
        return Largura_material3;
    }

    public String getSAP_material4() {
        return SAP_material4;
    }

    public String getDescricao_material4() {
        return Descricao_material4;
    }

    public String getMaterial_material4() {
        return Material_material4;
    }

    public String getVoltas_material4() {
        return Voltas_material4;
    }

    public String getCalibre_material4() {
        return Calibre_material4;
    }

    public String getTol_material4() {
        return Tol_material4;
    }

    public String getLargura_material4() {
        return Largura_material4;
    }

    public String getSAP_material5() {
        return SAP_material5;
    }

    public String getDescricao_material5() {
        return Descricao_material5;
    }

    public String getMaterial_material5() {
        return Material_material5;
    }

    public String getVoltas_material5() {
        return Voltas_material5;
    }

    public String getCalibre_material5() {
        return Calibre_material5;
    }

    public String getTol_material5() {
        return Tol_material5;
    }

    public String getLargura_material5() {
        return Largura_material5;
    }

    public String getSAP_material6() {
        return SAP_material6;
    }

    public String getDescricao_material6() {
        return Descricao_material6;
    }

    public String getMaterial_material6() {
        return Material_material6;
    }

    public String getVoltas_material6() {
        return Voltas_material6;
    }

    public String getCalibre_material6() {
        return Calibre_material6;
    }

    public String getTol_material6() {
        return Tol_material6;
    }

    public String getLargura_material6() {
        return Largura_material6;
    }

    public String getSAP_material7() {
        return SAP_material7;
    }

    public String getDescricao_material7() {
        return Descricao_material7;
    }

    public String getMaterial_material7() {
        return Material_material7;
    }

    public String getVoltas_material7() {
        return Voltas_material7;
    }

    public String getCalibre_material7() {
        return Calibre_material7;
    }

    public String getTol_material7() {
        return Tol_material7;
    }

    public String getLargura_material7() {
        return Largura_material7;
    }

    public String getSAP_material8() {
        return SAP_material8;
    }

    public String getDescricao_material8() {
        return Descricao_material8;
    }

    public String getMaterial_material8() {
        return Material_material8;
    }

    public String getVoltas_material8() {
        return Voltas_material8;
    }

    public String getCalibre_material8() {
        return Calibre_material8;
    }

    public String getTol_material8() {
        return Tol_material8;
    }

    public String getLargura_material8() {
        return Largura_material8;
    }

    public String getSAP_material9() {
        return SAP_material9;
    }

    public String getDescricao_material9() {
        return Descricao_material9;
    }

    public String getMaterial_material9() {
        return Material_material9;
    }

    public String getVoltas_material9() {
        return Voltas_material9;
    }

    public String getCalibre_material9() {
        return Calibre_material9;
    }

    public String getCordonel_S() {
        return Cordonel_S;
    }

    public String getCordonel_Z() {
        return Cordonel_Z;
    }

    public String getSAP_material10() {
        return SAP_material10;
    }

    public String getDescricao_material10() {
        return Descricao_material10;
    }

    public String getMaterial_10() {
        return Material_10;
    }

    public String getVoltas_material10() {
        return Voltas_material10;
    }

    public String getCalibre_material10() {
        return Calibre_material10;
    }

    public String getTol_Calibre_material10() {
        return Tol_Calibre_material10;
    }

    public String getLargura_material10() {
        return Largura_material10;
    }

    public String getPerimetro_nominal_mm() {
        return Perimetro_nominal_mm;
    }

    public String getPerimetro_do_Tambor_mm() {
        return Perimetro_do_Tambor_mm;
    }

    public String getPerimetro_do_tambor_com_luva() {
        return Perimetro_do_tambor_com_luva;
    }

    public String getCirc_Ext_Banda_Crua() {
        return Circ_Ext_Banda_Crua;
    }

    public String getTipo_Diafragma() {
        return Tipo_Diafragma;
    }

    public String getTamanho_diafragma() {
        return Tamanho_diafragma;
    }

    public String getTol_Diafragma_mm() {
        return Tol_Diafragma_mm;
    }

    public String getCodigo_SAP_FERT() {
        return Codigo_SAP_FERT;
    }

    public String getCodigo_de_Fabrica() {
        return Codigo_de_Fabrica;
    }

    public String getCodigo_SAP_HALB() {
        return Codigo_SAP_HALB;
    }

    public String getCodigo_Barras_EAN13() {
        return Codigo_Barras_EAN13;
    }

    public String getMarca_1() {
        return Marca_1;
    }

    public String getMarcacao() {
        return Marcacao;
    }

    public String getMarca_2() {
        return Marca_2;
    }

    public String getMarca_3() {
        return Marca_3;
    }

    public String getMarcacao_2() {
        return Marcacao_2;
    }

    public String getMarca_4() {
        return Marca_4;
    }

    public String getMarca_5() {
        return Marca_5;
    }

    public String getMarcacao_3() {
        return Marcacao_3;
    }

    public String getMarca_6() {
        return Marca_6;
    }

    public String getMarca_7() {
        return Marca_7;
    }

    public String getMarcacao_4() {
        return Marcacao_4;
    }

    public String getMarca_8() {
        return Marca_8;
    }

    public String getMarca_9() {
        return Marca_9;
    }

    public String getMarcacao_5() {
        return Marcacao_5;
    }

    public String getMarca_10() {
        return Marca_10;
    }

    public String getMarca_11() {
        return Marca_11;
    }

    public String getMarcacao_6() {
        return Marcacao_6;
    }

    public String getMarca_12() {
        return Marca_12;
    }

    public String getMarca_13() {
        return Marca_13;
    }

    public String getMarcacao_7() {
        return Marcacao_7;
    }

    public String getMarca_14() {
        return Marca_14;
    }

    public String getMarca_15() {
        return Marca_15;
    }

    public String getMarcacao_8() {
        return Marcacao_8;
    }

    public String getMarca_16() {
        return Marca_16;
    }

    public String getMarca_17() {
        return Marca_17;
    }

    public String getMarcacao_9() {
        return Marcacao_9;
    }

    public String getMarca_18() {
        return Marca_18;
    }

    public String getMarca_19() {
        return Marca_19;
    }

    public String getMarcacao_10() {
        return Marcacao_10;
    }

    public String getMarca_20() {
        return Marca_20;
    }

    public String getPer_Externo_Luva_Corte_ref() {
        return Per_Externo_Luva_Corte_ref;
    }

    public String getTambor_de_Corte_faixa_mm() {
        return Tambor_de_Corte_faixa_mm;
    }

    public String getPeso_da_Correia_g() {
        return Peso_da_Correia_g;
    }

    public String getTol_Peso_da_Correia_g() {
        return Tol_Peso_da_Correia_g;
    }

    public String getQuantidade_de_correias_por_banda() {
        return Quantidade_de_correias_por_banda;
    }

    public String getSuporte_de_Facas() {
        return Suporte_de_Facas;
    }

    public String getSuporte_de_Facas_Tol() {
        return Suporte_de_Facas_Tol;
    }

    public String getQuantidade_e_Tipo_das_Fresas() {
        return Quantidade_e_Tipo_das_Fresas;
    }

    public String getQuantidade_e_Tipo_das_Fresas_tol() {
        return Quantidade_e_Tipo_das_Fresas_tol;
    }

    public String getQuantidade_de_Facas() {
        return Quantidade_de_Facas;
    }

    public String getPre_corte() {
        return Pre_corte;
    }

    public String getAneis_espacadores() {
        return Aneis_espacadores;
    }

    public String getAneis_espacadores_Tol() {
        return Aneis_espacadores_Tol;
    }

    public String getPrimeiro_Corte() {
        return Primeiro_Corte;
    }

    public String getTolerAncia_primeiro_corte() {
        return TolerAncia_primeiro_corte;
    }

    public String getProfundidade_do_corte_Referencia() {
        return Profundidade_do_corte_Referencia;
    }

    public String getRetracao_da_fresa() {
        return Retracao_da_fresa;
    }

    public String getPasso_da_Fresa_Rib_0_140() {
        return Passo_da_Fresa_Rib_0_140;
    }

    public String getSuporte_de_Fresao() {
        return Suporte_de_Fresao;
    }

    public String getSuporte_de_Fresao_Tol() {
        return Suporte_de_Fresao_Tol;
    }

    public String getQuantidade_e_Tipo_das_Fresao() {
        return Quantidade_e_Tipo_das_Fresao;
    }

    public String getQuantidade_e_Tipo_das_Fresao_tol() {
        return Quantidade_e_Tipo_das_Fresao_tol;
    }

    public String getQuantidade_de_Facas_Fresao() {
        return Quantidade_de_Facas_Fresao;
    }

    public String getQuantidade_de_Facas_Fresao_Tol() {
        return Quantidade_de_Facas_Fresao_Tol;
    }

    public String getAneis_espacadores_Fresao() {
        return Aneis_espacadores_Fresao;
    }

    public String getAneis_espacadores_Fresao_Tol() {
        return Aneis_espacadores_Fresao_Tol;
    }

    public String getPrimeiro_Corte_5() {
        return Primeiro_Corte_5;
    }

    public String getTolerAncia_Primeiro_Corte_2() {
        return TolerAncia_Primeiro_Corte_2;
    }

    public String getProfundidade_do_corte_Referencia6() {
        return Profundidade_do_corte_Referencia6;
    }

    public String getRetracao_da_fresa7() {
        return Retracao_da_fresa7;
    }

    public String getPasso_da_Fresa_Rib_0_140_8() {
        return Passo_da_Fresa_Rib_0_140_8;
    }

    public String getPolia_de_Medicao() {
        return Polia_de_Medicao;
    }

    public String getContra_Peso_da_Polia_kg() {
        return Contra_Peso_da_Polia_kg;
    }

    public String getMaquina_Tensao_p_Medicao_lbs() {
        return Maquina_Tensao_p_Medicao_lbs;
    }

    public String getD_E_C_mm() {
        return D_E_C_mm;
    }

    public String getJogos() {
        return Jogos;
    }

    public String getLargura_superior() {
        return Largura_superior;
    }

    public String getAltura() {
        return Altura;
    }

    public String getTolerAncia() {
        return TolerAncia;
    }

    public String getTolerAncia_2() {
        return TolerAncia_2;
    }

    public String getVariacao_max_altura_na_mesma_peca() {
        return Variacao_max_altura_na_mesma_peca;
    }

    public String getVariacao_de_codigos_SICaracteristica_Significativa() {
        return Variacao_de_codigos_SICaracteristica_Significativa;
    }

    public String getCodigo_de_Vendas_Revenda() {
        return Codigo_de_Vendas_Revenda;
    }

    public String getCodigo_de_Vendas_Exportacao() {
        return Codigo_de_Vendas_Exportacao;
    }

    public String getCodigo_de_Vendas_EO() {
        return Codigo_de_Vendas_EO;
    }

    public String getFresa_1() {
        return Fresa_1;
    }

    public String getCirc_Polia_mm() {
        return Circ_Polia_mm;
    }

    public String getDEC_Cal() {
        return DEC_Cal;
    }

    public String getDEC2() {
        return DEC2;
    }

    public String getVerif() {
        return Verif;
    }

    public String getFresao_2() {
        return Fresao_2;
    }

    public String getFresao_3() {
        return Fresao_3;
    }

    public String getFresao_4() {
        return Fresao_4;
    }

    public String getAux_1() {
        return Aux_1;
    }

    public String getAux_2() {
        return Aux_2;
    }

    public String getEMB1() {
        return EMB1;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public String getEMB2() {
        return EMB2;
    }

    public String getEMB3() {
        return EMB3;
    }

    public String getEMB4() {
        return EMB4;
    }

    public String getEMB5() {
        return EMB5;
    }

    public String getEMB6() {
        return EMB6;
    }

    public String getFRESA() {
        return FRESA;
    }

    public String getQUANT() {
        return QUANT;
    }

    public String getANGULO() {
        return ANGULO;
    }

    public String getANEIS1() {
        return ANEIS1;
    }

    public String getQUANT_A1() {
        return QUANT_A1;
    }

    public String getFRESA1() {
        return FRESA1;
    }

    public String getQUANT1() {
        return QUANT1;
    }

    public String getANeIS2() {
        return ANeIS2;
    }

    public String getQUANT_A2() {
        return QUANT_A2;
    }

    public String getFRESA2() {
        return FRESA2;
    }

    public String getQUANT2() {
        return QUANT2;
    }

    public String getANGULO3() {
        return ANGULO3;
    }

    public String getANEIS14() {
        return ANEIS14;
    }

    public String getQUANT_A15() {
        return QUANT_A15;
    }

    public String getFRESA16() {
        return FRESA16;
    }

    public String getQUANT17() {
        return QUANT17;
    }

    public String getANGULO18() {
        return ANGULO18;
    }

    public String getCod_fresa() {
        return Cod_fresa;
    }

    public String getCod_fresao() {
        return Cod_fresao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getOBS_() {
        return OBS_;
    }

    public String getImpressao_codigo_barras_2D() {
        return Impressao_codigo_barras_2D;
    }

    public String getColuna1() {
        return Coluna1;
    }

    public String getEspessura_correia() {
        return Espessura_correia;
    }

    public String getFator_perimetro_2000() {
        return Fator_perimetro_2000;
    }

    public String getFator_EPDM() {
        return Fator_EPDM;
    }

    public String getFator_Espess_total() {
        return Fator_Espess_total;
    }

    public String getNova_Receita() {
        return Nova_Receita;
    }

    public String getForm_Circunf_banda() {
        return Form_Circunf_banda;
    }

    public String getColuna3() {
        return Coluna3;
    }

    public String getColuna4() {
        return Coluna4;
    }

    public String getPolia2() {
        return Polia2;
    }

    public String getTamanho_polia() {
        return tamanho_polia;
    }

   
   

    

  
   
    
}
