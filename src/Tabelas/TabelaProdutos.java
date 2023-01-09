/*
 * To change ConverteValores license header, choose License Headers in Project Properties.
 * To change ConverteValores template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import Excel.AbreaArquivoExcel;
import Excel.ConverteValores;
import Excel2.BancoExcel2;

import static java.awt.Color.WHITE;
import java.awt.Font;
import static java.awt.Font.BOLD;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author v103760
 */
public class TabelaProdutos {

    @SuppressWarnings("PackageVisibleField")
    public static TableRowSorter sorter = null;

    @SuppressWarnings("unchecked")
    public static void preencher_CutRev(JTable jTable6, JTable tabela) throws IOException {

        AbreaArquivoExcel ab = new AbreaArquivoExcel();
        ab.setFileName("C:/bancoDados/Espec A.xls");
        try {
            ab.buscar("DB");
        } catch (IOException ex) {
            // Logger.getLogger(FXMLTelaMonitroamentoController.class.getName()).log(Level.SEVERE, null, ex);
        }

        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(300);

        //     con_produto.executeSQL("SELECT  SAP,descricao  from BD");
        //    String[] colunas = {"Marca", "Local"};
        String[] colunas = {
            "0-tipo",
            "1-QSI#",
            "2-OBS",
            "3-QSI rev",
            "4-RESP",
            "5-Receita N°",
            "6-Espaçamento Simples",
            "7-Espaçamento Duplo",
            "8-SAP material1",
            "9-Descrição material1",
            "10-Material material1",
            "11-Voltas material1",
            "12-Calibre material1",
            "13-Tol material1",
            "14-Largura material1",
            "15-SAP material2",
            "16-Descrição material2",
            "17-Material material2",
            "18-Voltas material2",
            "19-Calibre material2",
            "20-Tol material2",
            "21-Largura material2",
            "22-SAP material3",
            "23-Descrição material3",
            "24-Material material3",
            "25-Voltas material3",
            "26-Calibre material3",
            "27-Tol material3",
            "28-Largura material3",
            "29-SAP material4",
            "30-Descrição material4",
            "31-Material material4",
            "32-Voltas material4",
            "33-Calibre material4",
            "34-Tol material4",
            "35-Largura material4",
            "36-SAP material5",
            "37-Descrição material5",
            "38-Material material5",
            "39-Voltas material5",
            "40-Calibre material5",
            "41-Tol material5",
            "42-Largura material5",
            "43-SAP material6",
            "44-Descrição material6",
            "45-Material material6",
            "46-Voltas material6",
            "47-Calibre material6",
            "48-Tol material6",
            "49-Largura material6",
            "50-SAP material7",
            "51-Descrição material7",
            "52-Material material7",
            "53-Voltas material7",
            "54-Calibre material7",
            "55-Tol material7",
            "56-Largura material7",
            "57-SAP material8",
            "58-Descrição material8",
            "59-Material material8",
            "60-Voltas material8",
            "61-Calibre material8",
            "62-Tol material8",
            "63-Largura material8",
            "64-SAP material9",
            "65-Descrição material9",
            "66-Material material9",
            "67-Voltas material9",
            "68-Calibre material9",
            "69-Cordonel S",
            "70-Cordonel Z",
            "71-SAP material10",
            "72-Descrição material10",
            "73-Material 10",
            "74-Voltas material10",
            "75-Calibre material10",
            "76-Tol Calibre material10",
            "77-Largura material10",
            "78-Perímetro nominal (mm)",
            "79-Perímetro do Tambor (mm)",
            "80-Perimetro do tambor com luva",
            "81-Circ. Ext. Banda Crua (± 3mm)",
            "82-Tipo Diafragma (mm)",
            "83-Tamanho diafragma",
            "84-Tol. Diafragma (mm)",
            "85-Código SAP - FERT",
            "86-Código de Fábrica",
            "87-Código SAP - HALB",
            "88-Código Barras - EAN13",
            "89-Marca 1 CutRev",
            "90-Marcação",
            "91-Marca 2",
            "92-Marca 3",
            "93-Marcação 2",
            "94-Marca 4",
            "95-Marca 5",
            "96-Marcação 3",
            "97-Marca 6",
            "98-Marca 7",
            "99-Marcação 4",
            "100-Marca 8",
            "101-Marca 9",
            "102-Marcação 5",
            "103-Marca 10",
            "104-Marca 11",
            "105-Marcação 6",
            "106-Marca 12",
            "107-Marca 13",
            "108-Marcação 7",
            "109-Marca 14",
            "110-Marca 15",
            "111-Marcação 8",
            "112-Marca 16",
            "113-Marca 17",
            "114-Marcação 9",
            "115-Marca 18",
            "116-Marca 19",
            "117-Marcação 10",
            "118-Marca 20",
            "119-Per. Externo Luva Corte (ref.)",
            "120-Tambor de Corte (faixa-mm)",
            "121-Peso da Correia (g)",
            "122-Tol. Peso da Correia (g) ±",
            "123-Quantidade de correias por banda",
            "124-Suporte de Facas",
            "125-Suporte de Facas Tol.:",
            "126-Quantidade e Tipo das Fresas",
            "127-Quantidade e Tipo das Fresas tol.:",
            "128-Quantidade de Facas",
            "129-Pré corte",
            "130-Anéis espaçadores",
            "131-Anéis espaçadores Tol.:",
            "132-Primeiro Corte",
            "133-Tolerância primeiro corte",
            "134-Profundidade do corte (Referência)",
            "135-Retraçao da fresa",
            "136-Passo da Fresa (Rib = 0.140')",
            "137-Suporte de Fresão",
            "138-Suporte de Fresão Tol.:",
            "139-Quantidade e Tipo das Fresão",
            "140-Quantidade e Tipo das Fresão tol.:",
            "141-Quantidade de Facas Fresão",
            "142-Quantidade de Facas Fresão Tol.:",
            "143-Anéis espaçadores Fresão:",
            "144-Anéis espaçadores Fresão Tol.:",
            "145-Primeiro Corte 5",
            "146-Tolerância Primeiro Corte 2",
            "147-Profundidade do corte (Referência)6",
            "148-Retraçao da fresa7",
            "149-Passo da Fresa (Rib = 0.140')8",
            "150-Polia de Medição",
            "151-Contra-Peso da Polia (kg)",
            "152-Máquina - Tensão p/ Medição (lbs)",
            "153-D.E.C. (mm)",
            "154-Jogos",
            "155-Largura superior:",
            "156-Altura:",
            "157-Tolerância",
            "158-Tolerância 2",
            "159-Variação máx. altura na mesma peça:",
            "160-Variação de códigos: *(SI - Característica Significativa)",
            "161-Código de Vendas Revenda",
            "162-Código de Vendas Exportação",
            "163-Código de Vendas EO",
            "164-Fresa 1",
            "165-Circ Polia mm",
            "166-DEC Cal",
            "167-DEC2",
            "168-Verif",
            "169-Fresão 2",
            "170-Fresão 3",
            "171-Fresão 4",
            "172-Aux 1",
            "173-Aux 2",
            "174-EMB1",
            "175-quantidade",
            "176-EMB2",
            "177-EMB3",
            "178-EMB4",
            "179-EMB5",
            "180-EMB6",
            "181-FRESA",
            "182-QUANT",
            "183-ÂNGULO",
            "184-ANEIS1",
            "185-QUANT A1",
            "186-FRESA1",
            "187-QUANT1",
            "188-ANÉIS2",
            "189-QUANT A2",
            "190-FFRESA2",
            "191-QUANT2",
            "192-ÂNGULO3",
            "193-ANEIS14",
            "194-QUANT A15",
            "195-FRESA16",
            "196-QUANT17",
            "197-ÂNGULO18",
            "198-Cod fresão",
            "199-modelo",
            "200-OBS.:",
            "201-Impressão codigo barras/ 2D",
            "202-Coluna1",
            "203-Espessura correia",
            "204-Fator perimetro 2000",
            "205-Fator EPDM",
            "206-Fator",
            "207-Espess total",
            "208-Nova Receita",
            "209-Form Circunf banda",
            "210-Coluna3",
            "211-Coluna4",
            "212-Polia2",
            "213-tamanho polia",};
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setColumnIdentifiers(colunas);
        modelo.setNumRows(0);
        sorter = new TableRowSorter<>(modelo);
        tabela.setRowSorter(sorter);

        JTableHeader titulos = tabela.getTableHeader();
        titulos.setBackground(WHITE);
        titulos.setFont(new Font("Dialog", BOLD, 8));

        ab.listaAlunos.stream().forEach((listaAlunos) -> {
            if (tabela == jTable6) {
                modelo.addRow(new Object[]{listaAlunos.getA(), listaAlunos.getB(), listaAlunos.getC(), listaAlunos.getD(), listaAlunos.getE(), listaAlunos.getF(), listaAlunos.getG(), listaAlunos.getH(), listaAlunos.getI(), listaAlunos.getJ(), listaAlunos.getK(), listaAlunos.getL(), listaAlunos.getM(), listaAlunos.getN(), listaAlunos.getO(), listaAlunos.getP(), listaAlunos.getQ(), listaAlunos.getR(), listaAlunos.getS(), listaAlunos.getT(), listaAlunos.getU(), listaAlunos.getV(), listaAlunos.getW(), listaAlunos.getX(), listaAlunos.getY(), listaAlunos.getZ(), listaAlunos.getAa(), listaAlunos.getAb(), listaAlunos.getAc(), listaAlunos.getAd(), listaAlunos.getAe(), listaAlunos.getAf(), listaAlunos.getAg(), listaAlunos.getAh(), listaAlunos.getAi(), listaAlunos.getAj(), listaAlunos.getAk(), listaAlunos.getAl(), listaAlunos.getAm(), listaAlunos.getAn(), listaAlunos.getAo(), listaAlunos.getAp(), listaAlunos.getAq(), listaAlunos.getAr(), listaAlunos.getAs(), listaAlunos.getAt(), listaAlunos.getAu(), listaAlunos.getAv(), listaAlunos.getAw(), listaAlunos.getAx(), listaAlunos.getAy(), listaAlunos.getAz(), listaAlunos.getBa(), listaAlunos.getBb(), listaAlunos.getBc(), listaAlunos.getBd(), listaAlunos.getBe(), listaAlunos.getBf(), listaAlunos.getBg(), listaAlunos.getBh(), listaAlunos.getBi(), listaAlunos.getBj(), listaAlunos.getBk(), listaAlunos.getBl(), listaAlunos.getBm(), listaAlunos.getBn(), listaAlunos.getBo(), listaAlunos.getBp(), listaAlunos.getBq(), listaAlunos.getBr(), listaAlunos.getBs(), listaAlunos.getBt(), listaAlunos.getBu(), listaAlunos.getBv(), listaAlunos.getBw(), listaAlunos.getBx(), listaAlunos.getBy(), listaAlunos.getBz(), listaAlunos.getCa(), ConverteValores.convertDouble(listaAlunos.getCb()), listaAlunos.getCc(), ConverteValores.convertDouble(listaAlunos.getCd()), listaAlunos.getCe(), ConverteValores.convertDouble(listaAlunos.getCf()), listaAlunos.getCg(), listaAlunos.getCh(), listaAlunos.getCi(), listaAlunos.getCj(), listaAlunos.getCk(), listaAlunos.getCl() + " CutRev", listaAlunos.getCm(), listaAlunos.getCn(), listaAlunos.getCo(), listaAlunos.getCp(), listaAlunos.getCq(), listaAlunos.getCr(), listaAlunos.getCs(), listaAlunos.getCt(), listaAlunos.getCu(), listaAlunos.getCv(), listaAlunos.getCw(), listaAlunos.getCx(), listaAlunos.getCy(), listaAlunos.getCz(), listaAlunos.getDa(), listaAlunos.getDb(), listaAlunos.getDc(), listaAlunos.getDd(), listaAlunos.getDe(), listaAlunos.getDf(), listaAlunos.getDg(), listaAlunos.getDh(), listaAlunos.getDi(), listaAlunos.getDj(), listaAlunos.getDk(), listaAlunos.getDl(), listaAlunos.getDm(), listaAlunos.getDn(), listaAlunos.getDo_(), ConverteValores.convertDouble(listaAlunos.getDp()), listaAlunos.getDq(), ConverteValores.casaDec(listaAlunos.getDr()), ConverteValores.casaDec(listaAlunos.getDs()), listaAlunos.getDt(), listaAlunos.getDu(), listaAlunos.getDv(), listaAlunos.getDw(), listaAlunos.getDx(), ConverteValores.casaDec2(listaAlunos.getDy()), listaAlunos.getDz(), listaAlunos.getEa(), ConverteValores.casaDec2(listaAlunos.getEb()), listaAlunos.getEc(), ConverteValores.casaDec2(listaAlunos.getEd()), ConverteValores.casaDec2(listaAlunos.getEe()), ConverteValores.casaDec2(listaAlunos.getEf()), listaAlunos.getEg(), listaAlunos.getEh(), listaAlunos.getEi(), listaAlunos.getEj(), listaAlunos.getEk(), listaAlunos.getEl(), listaAlunos.getEm(), listaAlunos.getEn(), listaAlunos.getEo(), listaAlunos.getEp(), listaAlunos.getEq(), listaAlunos.getEr(), listaAlunos.getEs(), listaAlunos.getEt(), ConverteValores.casaDec2(listaAlunos.getEu()), listaAlunos.getEv(), listaAlunos.getEw(), listaAlunos.getEx(), listaAlunos.getEy(), listaAlunos.getEz(), listaAlunos.getFa(), listaAlunos.getFb(), listaAlunos.getFc(), listaAlunos.getFd(), listaAlunos.getFe(), listaAlunos.getFf(), listaAlunos.getFg(), listaAlunos.getFh(), listaAlunos.getFi(), listaAlunos.getFj(), listaAlunos.getFk(), listaAlunos.getFl(), listaAlunos.getFm(), listaAlunos.getFn(), listaAlunos.getFo(), listaAlunos.getFp(), listaAlunos.getFq(), listaAlunos.getFr(), listaAlunos.getFs(), listaAlunos.getFt(), listaAlunos.getFu(), listaAlunos.getFv(), listaAlunos.getFw(), listaAlunos.getFx(), listaAlunos.getFy(), listaAlunos.getFz(), listaAlunos.getGa(), listaAlunos.getGb(), listaAlunos.getGc(), listaAlunos.getGd(), listaAlunos.getGe(), listaAlunos.getGf(), listaAlunos.getGg(), listaAlunos.getGh(), "F" + listaAlunos.getGi(), listaAlunos.getGj(), listaAlunos.getGk(), listaAlunos.getGl(), listaAlunos.getGm(), listaAlunos.getGn(), listaAlunos.getGo(), listaAlunos.getGp(), listaAlunos.getGr(), listaAlunos.getGs(), listaAlunos.getGt(), listaAlunos.getGu(), listaAlunos.getGv(), listaAlunos.getGw(), listaAlunos.getGx(), listaAlunos.getGy(), listaAlunos.getGz(), listaAlunos.getHa(), listaAlunos.getHb(), listaAlunos.getHc(), listaAlunos.getHd(), listaAlunos.getHe(), listaAlunos.getHf(), listaAlunos.getHg(), listaAlunos.getHh(), listaAlunos.getHi(), listaAlunos.getHj(), listaAlunos.getHk(), listaAlunos.getHl(), listaAlunos.getHm(), listaAlunos.getHn(), listaAlunos.getHo(), listaAlunos.getHp(), listaAlunos.getHq(), listaAlunos.getHr(), listaAlunos.getHs(), listaAlunos.getHt(), listaAlunos.getHu(), listaAlunos.getHv(), listaAlunos.getHw(), listaAlunos.getHx(), listaAlunos.getHy(), listaAlunos.getHz(), listaAlunos.getIa(), listaAlunos.getIb(), listaAlunos.getIc(), listaAlunos.getId(), listaAlunos.getIe(), listaAlunos.getIf_(), listaAlunos.getIg(), listaAlunos.getIh(), listaAlunos.getIi(), listaAlunos.getIj(), listaAlunos.getIk(), listaAlunos.getIl(), listaAlunos.getIm(), listaAlunos.getIn(), listaAlunos.getIo(), listaAlunos.getIp(), listaAlunos.getIq(), listaAlunos.getIr(), listaAlunos.getIs(), listaAlunos.getIt(), listaAlunos.getIu(), listaAlunos.getIv(), listaAlunos.getIw(), listaAlunos.getIx(), listaAlunos.getIy(), listaAlunos.getIz(), listaAlunos.getJa(), listaAlunos.getJb(), listaAlunos.getJc(), listaAlunos.getJd(), listaAlunos.getJe(), listaAlunos.getJf(), listaAlunos.getJg(), listaAlunos.getJh(), listaAlunos.getJi(), listaAlunos.getJj(), listaAlunos.getJk(), listaAlunos.getJl(), listaAlunos.getJm(), listaAlunos.getJn(), listaAlunos.getJo(), listaAlunos.getJp(), listaAlunos.getJq(), listaAlunos.getJr(), listaAlunos.getJs(), listaAlunos.getJt(), listaAlunos.getJu(), listaAlunos.getJv(), listaAlunos.getJw(), listaAlunos.getJx(), listaAlunos.getJy(), listaAlunos.getJz()
                });
            } else {
                modelo.addRow(new Object[]{listaAlunos.getA(), listaAlunos.getB(), listaAlunos.getC(), listaAlunos.getD(), listaAlunos.getE(), listaAlunos.getF(), listaAlunos.getG(), listaAlunos.getH(), listaAlunos.getI(), listaAlunos.getJ(), listaAlunos.getK(), listaAlunos.getL(), listaAlunos.getM(), listaAlunos.getN(), listaAlunos.getO(), listaAlunos.getP(), listaAlunos.getQ(), listaAlunos.getR(), listaAlunos.getS(), listaAlunos.getT(), listaAlunos.getU(), listaAlunos.getV(), listaAlunos.getW(), listaAlunos.getX(), listaAlunos.getY(), listaAlunos.getZ(), listaAlunos.getAa(), listaAlunos.getAb(), listaAlunos.getAc(), listaAlunos.getAd(), listaAlunos.getAe(), listaAlunos.getAf(), listaAlunos.getAg(), listaAlunos.getAh(), listaAlunos.getAi(), listaAlunos.getAj(), listaAlunos.getAk(), listaAlunos.getAl(), listaAlunos.getAm(), listaAlunos.getAn(), listaAlunos.getAo(), listaAlunos.getAp(), listaAlunos.getAq(), listaAlunos.getAr(), listaAlunos.getAs(), listaAlunos.getAt(), listaAlunos.getAu(), listaAlunos.getAv(), listaAlunos.getAw(), listaAlunos.getAx(), listaAlunos.getAy(), listaAlunos.getAz(), listaAlunos.getBa(), listaAlunos.getBb(), listaAlunos.getBc(), listaAlunos.getBd(), listaAlunos.getBe(), listaAlunos.getBf(), listaAlunos.getBg(), listaAlunos.getBh(), listaAlunos.getBi(), listaAlunos.getBj(), listaAlunos.getBk(), listaAlunos.getBl(), listaAlunos.getBm(), listaAlunos.getBn(), listaAlunos.getBo(), listaAlunos.getBp(), listaAlunos.getBq(), listaAlunos.getBr(), listaAlunos.getBs(), listaAlunos.getBt(), listaAlunos.getBu(), listaAlunos.getBv(), listaAlunos.getBw(), listaAlunos.getBx(), listaAlunos.getBy(), listaAlunos.getBz(), listaAlunos.getCa(), ConverteValores.convertDouble(listaAlunos.getCb()), listaAlunos.getCc(), ConverteValores.convertDouble(listaAlunos.getCd()), listaAlunos.getCe(), ConverteValores.convertDouble(listaAlunos.getCf()), listaAlunos.getCg(), listaAlunos.getCh(), listaAlunos.getCi(), listaAlunos.getCj(), listaAlunos.getCk(), listaAlunos.getCl() + " CutRev", listaAlunos.getCm(), listaAlunos.getCn(), listaAlunos.getCo(), listaAlunos.getCp(), listaAlunos.getCq(), listaAlunos.getCr(), listaAlunos.getCs(), listaAlunos.getCt(), listaAlunos.getCu(), listaAlunos.getCv(), listaAlunos.getCw(), listaAlunos.getCx(), listaAlunos.getCy(), listaAlunos.getCz(), listaAlunos.getDa(), listaAlunos.getDb(), listaAlunos.getDc(), listaAlunos.getDd(), listaAlunos.getDe(), listaAlunos.getDf(), listaAlunos.getDg(), listaAlunos.getDh(), listaAlunos.getDi(), listaAlunos.getDj(), listaAlunos.getDk(), listaAlunos.getDl(), listaAlunos.getDm(), listaAlunos.getDn(), listaAlunos.getDo_(), ConverteValores.convertDouble(listaAlunos.getDp()), listaAlunos.getDq(), ConverteValores.casaDec(listaAlunos.getDr()), ConverteValores.casaDec(listaAlunos.getDs()), listaAlunos.getDt(), listaAlunos.getDu(), listaAlunos.getDv(), listaAlunos.getDw(), listaAlunos.getDx(), ConverteValores.casaDec2(listaAlunos.getDy()), listaAlunos.getDz(), listaAlunos.getEa(), ConverteValores.casaDec2(listaAlunos.getEb()), listaAlunos.getEc(), ConverteValores.casaDec2(listaAlunos.getEd()), ConverteValores.casaDec2(listaAlunos.getEe()), ConverteValores.casaDec2(listaAlunos.getEf()), listaAlunos.getEg(), listaAlunos.getEh(), listaAlunos.getEi(), listaAlunos.getEj(), listaAlunos.getEk(), listaAlunos.getEl(), listaAlunos.getEm(), listaAlunos.getEn(), listaAlunos.getEo(), listaAlunos.getEp(), listaAlunos.getEq(), listaAlunos.getEr(), listaAlunos.getEs(), listaAlunos.getEt(), ConverteValores.casaDec2(listaAlunos.getEu()), listaAlunos.getEv(), listaAlunos.getEw(), listaAlunos.getEx(), listaAlunos.getEy(), listaAlunos.getEz(), listaAlunos.getFa(), listaAlunos.getFb(), listaAlunos.getFc(), listaAlunos.getFd(), listaAlunos.getFe(), listaAlunos.getFf(), listaAlunos.getFg(), listaAlunos.getFh(), listaAlunos.getFi(), listaAlunos.getFj(), listaAlunos.getFk(), listaAlunos.getFl(), listaAlunos.getFm(), listaAlunos.getFn(), listaAlunos.getFo(), listaAlunos.getFp(), listaAlunos.getFq(), listaAlunos.getFr(), listaAlunos.getFs(), listaAlunos.getFt(), listaAlunos.getFu(), listaAlunos.getFv(), listaAlunos.getFw(), listaAlunos.getFx(), listaAlunos.getFy(), listaAlunos.getFz(), listaAlunos.getGa(), listaAlunos.getGb(), listaAlunos.getGc(), listaAlunos.getGd(), listaAlunos.getGe(), listaAlunos.getGf(), listaAlunos.getGg(), listaAlunos.getGh(), "F" + listaAlunos.getGi(), listaAlunos.getGj(), listaAlunos.getGk(), listaAlunos.getGl(), listaAlunos.getGm(), listaAlunos.getGn(), listaAlunos.getGo(), listaAlunos.getGp(), listaAlunos.getGr(), listaAlunos.getGs(), listaAlunos.getGt(), listaAlunos.getGu(), listaAlunos.getGv(), listaAlunos.getGw(), listaAlunos.getGx(), listaAlunos.getGy(), listaAlunos.getGz(), listaAlunos.getHa(), listaAlunos.getHb(), listaAlunos.getHc(), listaAlunos.getHd(), listaAlunos.getHe(), listaAlunos.getHf(), listaAlunos.getHg(), listaAlunos.getHh(), listaAlunos.getHi(), listaAlunos.getHj(), listaAlunos.getHk(), listaAlunos.getHl(), listaAlunos.getHm(), listaAlunos.getHn(), listaAlunos.getHo(), listaAlunos.getHp(), listaAlunos.getHq(), listaAlunos.getHr(), listaAlunos.getHs(), listaAlunos.getHt(), listaAlunos.getHu(), listaAlunos.getHv(), listaAlunos.getHw(), listaAlunos.getHx(), listaAlunos.getHy(), listaAlunos.getHz(), listaAlunos.getIa(), listaAlunos.getIb(), listaAlunos.getIc(), listaAlunos.getId(), listaAlunos.getIe(), listaAlunos.getIf_(), listaAlunos.getIg(), listaAlunos.getIh(), listaAlunos.getIi(), listaAlunos.getIj(), listaAlunos.getIk(), listaAlunos.getIl(), listaAlunos.getIm(), listaAlunos.getIn(), listaAlunos.getIo(), listaAlunos.getIp(), listaAlunos.getIq(), listaAlunos.getIr(), listaAlunos.getIs(), listaAlunos.getIt(), listaAlunos.getIu(), listaAlunos.getIv(), listaAlunos.getIw(), listaAlunos.getIx(), listaAlunos.getIy(), listaAlunos.getIz(), listaAlunos.getJa(), listaAlunos.getJb(), listaAlunos.getJc(), listaAlunos.getJd(), listaAlunos.getJe(), listaAlunos.getJf(), listaAlunos.getJg(), listaAlunos.getJh(), listaAlunos.getJi(), listaAlunos.getJj(), listaAlunos.getJk(), listaAlunos.getJl(), listaAlunos.getJm(), listaAlunos.getJn(), listaAlunos.getJo(), listaAlunos.getJp(), listaAlunos.getJq(), listaAlunos.getJr(), listaAlunos.getJs(), listaAlunos.getJt(), listaAlunos.getJu(), listaAlunos.getJv(), listaAlunos.getJw(), listaAlunos.getJx(), listaAlunos.getJy(), listaAlunos.getJz()
                });
            }
        });

    }

    /**
     *
     * @param jTable6
     * @param tabela
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public static void preencher_jtableGeral2(JTable jTable6, JTable tabela) throws IOException {

        Excel2.AbreExcel ab = new Excel2.AbreExcel();
        ab.setCaminho("C:/bancoDados/bancoMilling/BancoEspec/Construção e Medição Cut-Edge EO.xls");
        ab.buscar();

        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(300);

        //     con_produto.executeSQL("SELECT  SAP,descricao  from BD");
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        //     modelo.setNumRows(0);
        sorter = new TableRowSorter<>(modelo);
        tabela.setRowSorter(sorter);

        JTableHeader titulos = tabela.getTableHeader();
        titulos.setBackground(WHITE);
        titulos.setFont(new Font("Dialog", BOLD, 8));
        ab.listaAlunos.stream().forEach((listaAlunos) -> {
            if (tabela == jTable6) {

                modelo.addRow(new Object[]{listaAlunos.getA(), listaAlunos.getB(), listaAlunos.getC(), listaAlunos.getD(), listaAlunos.getE(), listaAlunos.getF(), listaAlunos.getG(), listaAlunos.getH(), listaAlunos.getI(), listaAlunos.getJ(), listaAlunos.getK(), listaAlunos.getL(), listaAlunos.getM(), listaAlunos.getN(), listaAlunos.getO(), listaAlunos.getP(), listaAlunos.getQ(), listaAlunos.getR(), listaAlunos.getS(), listaAlunos.getT(), listaAlunos.getU(), listaAlunos.getV(), listaAlunos.getW(), listaAlunos.getX(), listaAlunos.getY(), listaAlunos.getZ(), listaAlunos.getAa(), listaAlunos.getAb(), listaAlunos.getAc(), listaAlunos.getAd(), listaAlunos.getAe(), listaAlunos.getAf(), listaAlunos.getAg(), listaAlunos.getAh(), listaAlunos.getAi(), listaAlunos.getAj(), listaAlunos.getAk(), listaAlunos.getAl(), listaAlunos.getAm(), listaAlunos.getAn(), listaAlunos.getAo(), listaAlunos.getAp(), listaAlunos.getAq(), listaAlunos.getAr(), listaAlunos.getAs(), listaAlunos.getAt(), listaAlunos.getAu(), listaAlunos.getAv(), listaAlunos.getAw(), listaAlunos.getAx(), listaAlunos.getAy(), listaAlunos.getAz(), listaAlunos.getBa(), listaAlunos.getBb(), listaAlunos.getBc(), listaAlunos.getBd(), listaAlunos.getBe(), listaAlunos.getBf(), listaAlunos.getBg(), listaAlunos.getBh(), listaAlunos.getBi(), listaAlunos.getBj(), listaAlunos.getBk(), listaAlunos.getBl(), listaAlunos.getBm(), listaAlunos.getBn(), listaAlunos.getBo(), listaAlunos.getBp(), listaAlunos.getBq(), listaAlunos.getBr(), listaAlunos.getBs(), listaAlunos.getBt(), listaAlunos.getBu(), listaAlunos.getBv(), listaAlunos.getBw(), listaAlunos.getBx(), listaAlunos.getBy(), listaAlunos.getBz(), listaAlunos.getCa(), listaAlunos.getCb(), listaAlunos.getCc(), ConverteValores.convertDouble(listaAlunos.getCd()), listaAlunos.getCe(), ConverteValores.convertDouble(listaAlunos.getCf()), listaAlunos.getCg(), listaAlunos.getCh(), listaAlunos.getCi(), listaAlunos.getCj(), listaAlunos.getCk(), listaAlunos.getCl() + " CutEo", listaAlunos.getCm(), listaAlunos.getCn(), listaAlunos.getCo(), listaAlunos.getCp(), listaAlunos.getCq(), listaAlunos.getCr(), listaAlunos.getCs(), listaAlunos.getCt(), listaAlunos.getCu(), listaAlunos.getCv(), listaAlunos.getCw(), listaAlunos.getCx(), listaAlunos.getCy(), listaAlunos.getCz(), listaAlunos.getDa(), listaAlunos.getDb(), listaAlunos.getDc(), listaAlunos.getDd(), listaAlunos.getDe(), listaAlunos.getDf(), listaAlunos.getDg(), listaAlunos.getDh(), listaAlunos.getDi(), listaAlunos.getDj(), listaAlunos.getDk(), listaAlunos.getDl(), listaAlunos.getDm(), listaAlunos.getDn(), listaAlunos.getDo_(), listaAlunos.getDp(), listaAlunos.getDq(), ConverteValores.casaDec(listaAlunos.getDr()), ConverteValores.casaDec(listaAlunos.getDs()), listaAlunos.getDt(), listaAlunos.getDu(), listaAlunos.getDv(), listaAlunos.getDw(), listaAlunos.getDx(), ConverteValores.casaDec2(listaAlunos.getDy()), listaAlunos.getDz(), listaAlunos.getEa(), ConverteValores.casaDec2(listaAlunos.getEb()), listaAlunos.getEc(), ConverteValores.casaDec2(listaAlunos.getEd()), ConverteValores.casaDec2(listaAlunos.getEe()), ConverteValores.casaDec2(listaAlunos.getEf()), listaAlunos.getEg(), listaAlunos.getEh(), listaAlunos.getEi(), listaAlunos.getEj(), listaAlunos.getEk(), listaAlunos.getEl(), listaAlunos.getEm(), listaAlunos.getEn(), listaAlunos.getEo(), listaAlunos.getEp(), listaAlunos.getEq(), listaAlunos.getEr(), listaAlunos.getEs(), listaAlunos.getEt(), ConverteValores.casaDec2(listaAlunos.getEu()), listaAlunos.getEv(), listaAlunos.getEw(), listaAlunos.getEx(), listaAlunos.getEy(), listaAlunos.getEz(), listaAlunos.getFa(), listaAlunos.getFb(), listaAlunos.getFc(), listaAlunos.getFd(), listaAlunos.getFe(), listaAlunos.getFf(), listaAlunos.getFg(), listaAlunos.getFh(), listaAlunos.getFi(), listaAlunos.getFj(), listaAlunos.getFk(), listaAlunos.getFl(), listaAlunos.getFm(), listaAlunos.getFn(), listaAlunos.getFo(), listaAlunos.getFp(), listaAlunos.getFq(), listaAlunos.getFr(), listaAlunos.getFs(), listaAlunos.getFt(), listaAlunos.getFu(), listaAlunos.getFv(), listaAlunos.getFw(), listaAlunos.getFx(), listaAlunos.getFy(), listaAlunos.getFz(), listaAlunos.getGa(), listaAlunos.getGb(), listaAlunos.getGc(), listaAlunos.getGd(), listaAlunos.getGe(), listaAlunos.getGf(), listaAlunos.getGg(), listaAlunos.getGh(), "F" + listaAlunos.getGi(), listaAlunos.getGk(), listaAlunos.getGk(), listaAlunos.getGl(), listaAlunos.getGm(), listaAlunos.getGn(), listaAlunos.getGo(), listaAlunos.getGp(), listaAlunos.getGr(), listaAlunos.getGs(), listaAlunos.getGt(), listaAlunos.getGu(), listaAlunos.getGv(), listaAlunos.getGw(), listaAlunos.getGx(), listaAlunos.getGy(), listaAlunos.getGz()

                });
            } else {
                //    System.out.println("EO");
                modelo.addRow(new Object[]{listaAlunos.getA(), listaAlunos.getDb(), listaAlunos.getC(), listaAlunos.getD(), listaAlunos.getE(), listaAlunos.getF(), listaAlunos.getG(), listaAlunos.getH(), listaAlunos.getI(), listaAlunos.getJ(), listaAlunos.getK(), listaAlunos.getL(), listaAlunos.getM(), listaAlunos.getN(), listaAlunos.getO(), listaAlunos.getP(), listaAlunos.getQ(), listaAlunos.getR(), listaAlunos.getS(), listaAlunos.getT(), listaAlunos.getU(), listaAlunos.getV(), listaAlunos.getW(), listaAlunos.getX(), listaAlunos.getY(), listaAlunos.getZ(), listaAlunos.getAa(), listaAlunos.getAb(), listaAlunos.getAc(), listaAlunos.getAd(), listaAlunos.getAe(), listaAlunos.getAf(), listaAlunos.getAg(), listaAlunos.getAh(), listaAlunos.getAi(), listaAlunos.getAj(), listaAlunos.getAk(), listaAlunos.getAl(), listaAlunos.getAm(), listaAlunos.getAn(), listaAlunos.getAo(), listaAlunos.getAp(), listaAlunos.getAq(), listaAlunos.getAr(), listaAlunos.getAs(), listaAlunos.getAt(), listaAlunos.getAu(), listaAlunos.getAv(), listaAlunos.getAw(), listaAlunos.getAx(), listaAlunos.getAy(), listaAlunos.getAz(), listaAlunos.getBa(), listaAlunos.getBb(), listaAlunos.getBc(), listaAlunos.getBd(), listaAlunos.getBe(), listaAlunos.getBf(), listaAlunos.getBg(), listaAlunos.getBh(), listaAlunos.getBi(), listaAlunos.getBj(), listaAlunos.getBk(), listaAlunos.getBl(), listaAlunos.getBm(), listaAlunos.getBn(), listaAlunos.getBo(), listaAlunos.getBp(), listaAlunos.getBq(), listaAlunos.getBr(), listaAlunos.getBs(), listaAlunos.getBt(), listaAlunos.getBu(), listaAlunos.getBv(), listaAlunos.getBw(), listaAlunos.getBx(), listaAlunos.getBy(), listaAlunos.getBz(), listaAlunos.getCa(), listaAlunos.getCb(), listaAlunos.getCc(), ConverteValores.convertDouble(listaAlunos.getCd()), listaAlunos.getCe(), ConverteValores.convertDouble(listaAlunos.getCf()), listaAlunos.getCg(), listaAlunos.getCh(), listaAlunos.getCi(), listaAlunos.getCj(), listaAlunos.getCk(), listaAlunos.getCl() + " CutEo", listaAlunos.getCm(), listaAlunos.getCn(), listaAlunos.getCo(), listaAlunos.getCp(), listaAlunos.getCq(), listaAlunos.getCr(), listaAlunos.getCs(), listaAlunos.getCt(), listaAlunos.getCu(), listaAlunos.getCv(), listaAlunos.getCw(), listaAlunos.getCx(), listaAlunos.getCy(), listaAlunos.getCz(), listaAlunos.getDa(), listaAlunos.getDb(), listaAlunos.getDc(), listaAlunos.getDd(), listaAlunos.getDe(), listaAlunos.getDf(), listaAlunos.getDg(), listaAlunos.getDh(), listaAlunos.getDi(), listaAlunos.getDj(), listaAlunos.getDk(), listaAlunos.getDl(), listaAlunos.getDm(), listaAlunos.getDn(), listaAlunos.getDo_(), listaAlunos.getDp(), listaAlunos.getDq(), ConverteValores.casaDec(listaAlunos.getDr()), ConverteValores.casaDec(listaAlunos.getDs()), listaAlunos.getDt(), listaAlunos.getDu(), listaAlunos.getDv(), listaAlunos.getDw(), listaAlunos.getDx(), listaAlunos.getDy(), listaAlunos.getDz(), listaAlunos.getEa(), listaAlunos.getEb(), listaAlunos.getEc(), listaAlunos.getEd(), listaAlunos.getEe(), listaAlunos.getEf(), listaAlunos.getEg(), listaAlunos.getEh(), listaAlunos.getEi(), listaAlunos.getEj(), listaAlunos.getEk(), listaAlunos.getEl(), listaAlunos.getEm(), listaAlunos.getEn(), listaAlunos.getEo(), listaAlunos.getEp(), listaAlunos.getEq(), listaAlunos.getEr(), listaAlunos.getEs(), listaAlunos.getEt(), listaAlunos.getEu(), listaAlunos.getEv(), listaAlunos.getEw(), listaAlunos.getEx(), listaAlunos.getEy(), listaAlunos.getEz(), listaAlunos.getFa(), listaAlunos.getFb(), listaAlunos.getFc(), listaAlunos.getFd(), listaAlunos.getFe(), listaAlunos.getFf(), listaAlunos.getFg(), listaAlunos.getFh(), listaAlunos.getFi(), listaAlunos.getFj(), listaAlunos.getFk(), listaAlunos.getFl(), listaAlunos.getFm(), listaAlunos.getFn(), listaAlunos.getFo(), listaAlunos.getFp(), listaAlunos.getFq(), listaAlunos.getFr()
                });
            }
        });

    }

    /**
     *
     * @param jTable6
     * @param tabela
     * @throws IOException
     */
    @SuppressWarnings({"unchecked", "Convert2Diamond"})
    public static void preencher_jtableGeral3(JTable jTable6, JTable tabela) throws IOException {

        Excel2.AbreExcel ab = new Excel2.AbreExcel();
        ab.setCaminho("C:/bancoDados/bancoMilling/BancoEspec/Construção e Medição Poly-V EO.xls");
        ab.buscar();

        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(300);

        //     con_produto.executeSQL("SELECT  SAP,descricao  from BD");
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        //     modelo.setNumRows(0);
        sorter = new TableRowSorter<TableModel>(modelo);
        tabela.setRowSorter(sorter);

        JTableHeader titulos = tabela.getTableHeader();
        titulos.setBackground(WHITE);
        titulos.setFont(new Font("Dialog", BOLD, 8));
        ab.listaAlunos.stream().forEach((listaAlunos) -> {
            if (tabela == jTable6) {

                modelo.addRow(new Object[]{listaAlunos.getA()//0
                    , listaAlunos.getB()//1
                    , listaAlunos.getC()//2
                    , listaAlunos.getD()//3
                    , listaAlunos.getE()//4
                    , listaAlunos.getF()//5
                    , listaAlunos.getG()//6
                    , listaAlunos.getH()//7
                    , listaAlunos.getI()//8
                    , listaAlunos.getJ()//9
                    , listaAlunos.getK()//10
                    , listaAlunos.getL()//11
                    , listaAlunos.getM()//12
                    , listaAlunos.getN()//13
                    , listaAlunos.getO()//14
                    , listaAlunos.getP()//15
                    , listaAlunos.getQ()//16
                    , listaAlunos.getR()//17
                    , listaAlunos.getS()//18
                    , listaAlunos.getT()//19
                    , listaAlunos.getU()//20
                    , listaAlunos.getV()//21
                    , listaAlunos.getW()//22
                    , listaAlunos.getX()//23
                    , listaAlunos.getY()//24
                    , listaAlunos.getZ()//25
                    , listaAlunos.getAa()//26
                    , listaAlunos.getAb()//27
                    , listaAlunos.getAc()//28
                    , listaAlunos.getAd()//29
                    , listaAlunos.getAe()//30
                    , listaAlunos.getAf()//31
                    , listaAlunos.getAg()//32
                    , listaAlunos.getAh()//33
                    , listaAlunos.getAi()//34
                    , listaAlunos.getAj()//35
                    , listaAlunos.getAk()//36
                    , listaAlunos.getAl()//37
                    , listaAlunos.getAm()//38
                    , listaAlunos.getAn()//39
                    , listaAlunos.getAo()//40
                    , listaAlunos.getAp()//41
                    , listaAlunos.getAq()//42
                    , listaAlunos.getAr()//43
                    , listaAlunos.getAs()//44
                    , listaAlunos.getAt()//45
                    , listaAlunos.getAu()//46
                    , listaAlunos.getAv()//47
                    , listaAlunos.getAw()//50
                    , listaAlunos.getAx()//51
                    , listaAlunos.getAy()//52
                    , listaAlunos.getAz()//53
                    , listaAlunos.getBa()//54
                    , listaAlunos.getBb()//55
                    , listaAlunos.getBc()//56
                    , listaAlunos.getBd()//57
                    , listaAlunos.getBe()//58
                    , listaAlunos.getBf()//59
                    , listaAlunos.getBg()//60
                    , listaAlunos.getBh()//61
                    , listaAlunos.getBi()//62
                    , listaAlunos.getBj()//63
                    , listaAlunos.getBk()//64
                    , listaAlunos.getBl()//65
                    , listaAlunos.getBm()//66
                    , listaAlunos.getBn()//67
                    , listaAlunos.getBo()//68
                    , listaAlunos.getBp()//69
                    , listaAlunos.getBq()//70
                    , listaAlunos.getBr()//71
                    , listaAlunos.getBs()//72
                    , ""//73
                    , ""//74
                    , ""//75
                    , ""//76
                    , ""//77
                    , ""//78
                    , ""//79
                    , listaAlunos.getBt()//80
                    , listaAlunos.getBu()//81
                    , ""//82
                    , ConverteValores.convertDouble(listaAlunos.getBv())//83
                    , listaAlunos.getBw()//84
                    , ConverteValores.convertDouble(listaAlunos.getBx())//85
                    , listaAlunos.getBy()//86
                    , listaAlunos.getBz()//87
                    , listaAlunos.getCa()//88
                    , listaAlunos.getCb()//89
                    , listaAlunos.getCc()//90
                    , listaAlunos.getCd() + " PolyEo"//91
                    , listaAlunos.getCe()//92
                    , listaAlunos.getCf()//93
                    , listaAlunos.getCg()//94
                    , listaAlunos.getCh()//95
                    , listaAlunos.getCi()//96
                    , listaAlunos.getCj()//97
                    , listaAlunos.getCk()//98
                    , listaAlunos.getCl()//99
                    , listaAlunos.getCm()//100
                    , listaAlunos.getCn()//101
                    , listaAlunos.getCo()//102
                    , listaAlunos.getCp() //103
                    , listaAlunos.getCq()//104
                    , listaAlunos.getCr()//105
                    , listaAlunos.getCs()//106
                    , listaAlunos.getCt()//107
                    , listaAlunos.getCu()//108
                    , listaAlunos.getCv()//109
                    , listaAlunos.getCw()//110
                    , listaAlunos.getCx()//111
                    , listaAlunos.getCy()//112
                    , listaAlunos.getCz()//113
                    , listaAlunos.getDa()//114
                    , listaAlunos.getDb()//115
                    , listaAlunos.getDc()//116
                    , listaAlunos.getDd()//117
                    , listaAlunos.getDe()//118
                    , listaAlunos.getDf()//119
                    , listaAlunos.getDg()//120
                    , listaAlunos.getDh()//121
                    , listaAlunos.getDi()//122
                    , ConverteValores.casaDec(listaAlunos.getDj())//123
                    , ConverteValores.casaDec(listaAlunos.getDk())//124
                    , listaAlunos.getDl()//125
                    , listaAlunos.getDm()//126
                    , listaAlunos.getDn()//127
                    , listaAlunos.getDo_()//128
                    , listaAlunos.getDp()//129
                    , listaAlunos.getDq()//130
                    , listaAlunos.getDr()//131
                    , listaAlunos.getDs()//132
                    //  ,listaAlunos.getDt()
                    , ConverteValores.casaDec2(listaAlunos.getDu())//133
                    , listaAlunos.getDv()//134
                    , ConverteValores.casaDec2(listaAlunos.getDw())//135
                    , listaAlunos.getEe()//136
                    , ConverteValores.casaDec2(listaAlunos.getDx())//137
                    , ConverteValores.casaDec2(listaAlunos.getDy())//138
                    , listaAlunos.getDz()//139
                    , ""//140
                    , listaAlunos.getEa()//141
                    , listaAlunos.getEb()//142
                    , ""//143
                    , ""//144
                    , ""//145
                    , listaAlunos.getEc()//146
                    , listaAlunos.getEd()//147
                    , listaAlunos.getEf()//148
                    , listaAlunos.getEg()//149
                    , ""//150
                    , listaAlunos.getEh()//151
                    , ConverteValores.casaDec2(listaAlunos.getEi())//152
                    , listaAlunos.getEj()//153
                    , listaAlunos.getEk()//154
                    , listaAlunos.getEr()//155
                    , listaAlunos.getEl()//156
                    , listaAlunos.getEm() + " " + listaAlunos.getEn() + " " + listaAlunos.getEo()//157
                    , listaAlunos.getEq()//158
                    , listaAlunos.getEq()//159
                    , listaAlunos.getEs()//160
                    , listaAlunos.getEn()//161
                    , listaAlunos.getEo()//162
                    , listaAlunos.getEp() //163
                    , listaAlunos.getEt()//164
                    //       ,ConverteValores.casaDec2(listaAlunos.getEu())
                    //       ,listaAlunos.getEv()
                    //       ,listaAlunos.getEw()
                    //       ,listaAlunos.getEx()
                    //       ,listaAlunos.getEy()
                    , listaAlunos.getEz()//165
                    , listaAlunos.getFa()//166
                    , listaAlunos.getFb()//167
                    , listaAlunos.getFc()//168
                    , listaAlunos.getFd()//169
                    , listaAlunos.getFe()//170
                    , listaAlunos.getFf()//171
                    , listaAlunos.getFg()//172
                    , listaAlunos.getFh()//173
                    , listaAlunos.getFi()//174
                    , listaAlunos.getFj()//175
                    , listaAlunos.getFk()//176
                    , listaAlunos.getFl()//177
                    , listaAlunos.getFm()//178
                    , listaAlunos.getFn()//179
                    , listaAlunos.getFo()//180
                    , listaAlunos.getFp()//181
                    , listaAlunos.getFq() //182
                    , listaAlunos.getFr()//183
                    , listaAlunos.getFs()//184
                    , listaAlunos.getFt()//185
                    , listaAlunos.getFu()//186
                    , listaAlunos.getFv()//187
                    , listaAlunos.getFw()//188
                    , listaAlunos.getFx()//189
                    , listaAlunos.getFy()//190
                    , listaAlunos.getGd()//191
                    , listaAlunos.getGa()//192
                    , listaAlunos.getGd()//193
                    , listaAlunos.getGd()//194
                    , listaAlunos.getGd()//193
                    , listaAlunos.getGe()//196
                    , listaAlunos.getGf()//197
                    , listaAlunos.getGg()//198
                    , listaAlunos.getGh()//199
                    , listaAlunos.getGi()//200
                    , listaAlunos.getGj(), listaAlunos.getGk(), listaAlunos.getGl(), listaAlunos.getGm(), listaAlunos.getGn(), listaAlunos.getGo(), listaAlunos.getGp(), listaAlunos.getGq(), listaAlunos.getGr(), listaAlunos.getGs(), listaAlunos.getGt(), listaAlunos.getGu(), listaAlunos.getGv(), listaAlunos.getGw(), listaAlunos.getGx(), listaAlunos.getGy(), listaAlunos.getGz()

                });
            } else {
                modelo.addRow(new Object[]{listaAlunos.getA(), listaAlunos.getCt(), listaAlunos.getC(), listaAlunos.getD(), listaAlunos.getE(), listaAlunos.getF(), listaAlunos.getG(), listaAlunos.getH(), listaAlunos.getI(), listaAlunos.getJ(), listaAlunos.getK(), listaAlunos.getL(), listaAlunos.getM(), listaAlunos.getN(), listaAlunos.getO(), listaAlunos.getP(), listaAlunos.getQ(), listaAlunos.getR(), listaAlunos.getS(), listaAlunos.getT(), listaAlunos.getU(), listaAlunos.getV(), listaAlunos.getW(), listaAlunos.getX(), listaAlunos.getY(), listaAlunos.getZ(), listaAlunos.getAa(), listaAlunos.getAb(), listaAlunos.getAc(), listaAlunos.getAd(), listaAlunos.getAe(), listaAlunos.getAf(), listaAlunos.getAg(), listaAlunos.getAh(), listaAlunos.getAi(), listaAlunos.getAj(), listaAlunos.getAk(), listaAlunos.getAl(), listaAlunos.getAm(), listaAlunos.getAn(), listaAlunos.getAo(), listaAlunos.getAp(), listaAlunos.getAq(), listaAlunos.getAr(), listaAlunos.getAs(), listaAlunos.getAt(), listaAlunos.getAu(), listaAlunos.getAv(), listaAlunos.getAw(), listaAlunos.getAx(), listaAlunos.getAy(), listaAlunos.getAz(), listaAlunos.getBa(), listaAlunos.getBb(), listaAlunos.getBc(), listaAlunos.getBd(), listaAlunos.getBe(), listaAlunos.getBf(), listaAlunos.getBg(), listaAlunos.getBh(), listaAlunos.getBi(), listaAlunos.getBj(), listaAlunos.getBk(), listaAlunos.getBl(), listaAlunos.getBm(), listaAlunos.getBn(), listaAlunos.getBo(), listaAlunos.getBp(), listaAlunos.getBq(), listaAlunos.getBr(), listaAlunos.getBs(), "", "", "", "", "", "", "", listaAlunos.getBt(), listaAlunos.getBu(), "", ConverteValores.convertDouble(listaAlunos.getBv()), listaAlunos.getBw(), ConverteValores.convertDouble(listaAlunos.getBx()), listaAlunos.getBy(), listaAlunos.getBz(), listaAlunos.getCa(), listaAlunos.getCb(), listaAlunos.getCc(), listaAlunos.getCd() + " PolyEo", listaAlunos.getCe(), listaAlunos.getCf(), listaAlunos.getCg(), listaAlunos.getCh(), listaAlunos.getCi(), listaAlunos.getCj(), listaAlunos.getCk(), listaAlunos.getCl(), listaAlunos.getCm(), listaAlunos.getCn(), listaAlunos.getCo(), listaAlunos.getCp(), listaAlunos.getCq(), listaAlunos.getCr(), listaAlunos.getCs(), listaAlunos.getCt(), listaAlunos.getCu(), listaAlunos.getCv(), listaAlunos.getCw(), listaAlunos.getCx(), listaAlunos.getCy(), listaAlunos.getCz(), listaAlunos.getDa(), listaAlunos.getDb(), listaAlunos.getDc(), listaAlunos.getDd(), listaAlunos.getDe(), listaAlunos.getDf(), listaAlunos.getDg(), listaAlunos.getDh(), listaAlunos.getDi(), ConverteValores.casaDec(listaAlunos.getDj()), ConverteValores.casaDec(listaAlunos.getDk()), listaAlunos.getDl(), listaAlunos.getDm(), listaAlunos.getDn(), listaAlunos.getDo_(), listaAlunos.getDp(), listaAlunos.getDq(), listaAlunos.getDr(), listaAlunos.getDs() //  ,listaAlunos.getDt()
                    , listaAlunos.getDu(), listaAlunos.getDv(), listaAlunos.getDw(), listaAlunos.getEe(), listaAlunos.getDx(), listaAlunos.getDy(), listaAlunos.getDz(), "", listaAlunos.getEa(), listaAlunos.getEb(), "", "", "", listaAlunos.getEc(), listaAlunos.getEd(), listaAlunos.getEf(), listaAlunos.getEg(), "", listaAlunos.getEh(), listaAlunos.getEi(), listaAlunos.getEj(), listaAlunos.getEk(), listaAlunos.getEr(), listaAlunos.getEl(), listaAlunos.getEm(), listaAlunos.getEq(), listaAlunos.getEs(), listaAlunos.getEn(), listaAlunos.getEo(), listaAlunos.getEp(), listaAlunos.getEt(), listaAlunos.getEu(), listaAlunos.getEv(), listaAlunos.getEw(), listaAlunos.getEx(), listaAlunos.getEy(), listaAlunos.getEz(), listaAlunos.getFa(), listaAlunos.getFb(), listaAlunos.getFc(), listaAlunos.getFd(), listaAlunos.getFe(), listaAlunos.getFf(), listaAlunos.getFg(), listaAlunos.getFh(), listaAlunos.getFi(), listaAlunos.getFj(), listaAlunos.getFk(), listaAlunos.getFl(), listaAlunos.getFm(), listaAlunos.getFn(), listaAlunos.getFo(), listaAlunos.getGd()

                });
            }
        });

    }

    /**
     *
     * @param jTable6
     * @param tabela
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    public static void preencher_jtableGeral4(JTable jTable6, JTable tabela) throws IOException {

        Excel2.AbreExcel ab = new Excel2.AbreExcel();
        ab.setCaminho("C:/bancoDados/bancoMilling/BancoEspec/Construção e Medição Poly-V.xls");
        ab.buscar();

        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(300);

        //     con_produto.executeSQL("SELECT  SAP,descricao  from BD");
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        //     modelo.setNumRows(0);
        sorter = new TableRowSorter<>(modelo);
        tabela.setRowSorter(sorter);
        for (int i = 0; i < 166; i++) {
            tabela.getColumnModel().getColumn(i).setPreferredWidth(300);
        }
        JTableHeader titulos = tabela.getTableHeader();
        titulos.setBackground(WHITE);
        titulos.setFont(new Font("Dialog", BOLD, 8));
        ab.listaAlunos.stream().forEach((listaAlunos) -> {
            //   ConverteValores.casaDec2(sap)
            if (tabela == jTable6) {
                modelo.addRow(new Object[]{listaAlunos.getA(), listaAlunos.getB(), listaAlunos.getC(), listaAlunos.getD(), listaAlunos.getE(), listaAlunos.getF(), listaAlunos.getG(), listaAlunos.getH(), listaAlunos.getI(), listaAlunos.getJ(), listaAlunos.getK(), listaAlunos.getL(), listaAlunos.getM(), listaAlunos.getN(), listaAlunos.getO(), listaAlunos.getP(), listaAlunos.getQ(), listaAlunos.getR(), listaAlunos.getS(), listaAlunos.getT(), listaAlunos.getU(), listaAlunos.getV(), listaAlunos.getW(), listaAlunos.getX(), listaAlunos.getY(), listaAlunos.getZ(), listaAlunos.getAa(), listaAlunos.getAb(), listaAlunos.getAc(), listaAlunos.getAd(), listaAlunos.getAe(), listaAlunos.getAf(), listaAlunos.getAg(), listaAlunos.getAh(), listaAlunos.getAi(), listaAlunos.getAj(), listaAlunos.getAk(), listaAlunos.getAl(), listaAlunos.getAm(), listaAlunos.getAn(), listaAlunos.getAo(), listaAlunos.getAp(), listaAlunos.getAq(), listaAlunos.getAr(), listaAlunos.getAs(), listaAlunos.getAt(), listaAlunos.getAu(), listaAlunos.getAv(), listaAlunos.getAw(), listaAlunos.getAx(), listaAlunos.getAy(), listaAlunos.getAz(), listaAlunos.getBa(), listaAlunos.getBb(), listaAlunos.getBc(), listaAlunos.getBd(), listaAlunos.getBe(), listaAlunos.getBf(), listaAlunos.getBg(), listaAlunos.getBh(), listaAlunos.getBi(), listaAlunos.getBj(), listaAlunos.getBk(), listaAlunos.getBl(), listaAlunos.getBm(), listaAlunos.getBn(), listaAlunos.getBo(), listaAlunos.getBp(), listaAlunos.getBq(), listaAlunos.getBr(), listaAlunos.getBs(), "", "", "", "", "", "", "", listaAlunos.getBt(), listaAlunos.getBu(), "", ConverteValores.convertDouble(listaAlunos.getBv()), listaAlunos.getBx(), ConverteValores.convertDouble(listaAlunos.getBw()), listaAlunos.getBy(), listaAlunos.getBz(), listaAlunos.getCa(), listaAlunos.getCb(), listaAlunos.getCc(), listaAlunos.getCd() + " PolyRev" //,listaAlunos.getCd()
                    , listaAlunos.getCe(), listaAlunos.getCf(), listaAlunos.getCg(), listaAlunos.getCh(), listaAlunos.getCi(), listaAlunos.getCj(), listaAlunos.getCk(), listaAlunos.getCl(), listaAlunos.getCm(), listaAlunos.getCn(), listaAlunos.getCo(), listaAlunos.getCp(), listaAlunos.getCq(), listaAlunos.getCr(), listaAlunos.getCs(), listaAlunos.getCt(), listaAlunos.getCu(), listaAlunos.getCv(), listaAlunos.getCw(), listaAlunos.getCx(), listaAlunos.getCy(), listaAlunos.getCz(), listaAlunos.getDa(), listaAlunos.getDb(), listaAlunos.getDc(), listaAlunos.getDd(), listaAlunos.getDe(), listaAlunos.getDf(), listaAlunos.getDg(), listaAlunos.getDh(), listaAlunos.getDi(), ConverteValores.casaDec(listaAlunos.getDj()), ConverteValores.casaDec(listaAlunos.getDk()), listaAlunos.getDl(), listaAlunos.getDm(), listaAlunos.getDn(), listaAlunos.getDo_(), listaAlunos.getDp(), listaAlunos.getDq(), listaAlunos.getDr(), listaAlunos.getDs() //  ,listaAlunos.getDt()
                    , ConverteValores.casaDec2(listaAlunos.getDu()), listaAlunos.getDv(), ConverteValores.casaDec2(listaAlunos.getDw()) //  ,listaAlunos.getEe()
                    , ConverteValores.casaDec2(listaAlunos.getDx()), ConverteValores.casaDec2(listaAlunos.getDy()), listaAlunos.getDz(), listaAlunos.getEa(), listaAlunos.getEb(), "", "" //    ,listaAlunos.getEc()
                    , listaAlunos.getEd(), listaAlunos.getEf(), listaAlunos.getEg() //  ,listaAlunos.getEh()
                    , ConverteValores.casaDec2(listaAlunos.getEh()), listaAlunos.getEi(), ConverteValores.casaDec2(listaAlunos.getEj()), ConverteValores.casaDec2(listaAlunos.getEk()), ConverteValores.casaDec2(listaAlunos.getEl()), listaAlunos.getEm(), ConverteValores.casaDec2(listaAlunos.getEn()), listaAlunos.getEo(), listaAlunos.getEp(), "", listaAlunos.getEq(), listaAlunos.getEr() + " " + listaAlunos.getEs() + " " + listaAlunos.getEt(), listaAlunos.getEv(), listaAlunos.getEs(), listaAlunos.getEt(), listaAlunos.getEu(), listaAlunos.getEw(), listaAlunos.getEx() //     ,listaAlunos.getEy()
                    //      ,listaAlunos.getEz()
                    //      ,listaAlunos.getFa()
                    //    ,listaAlunos.getFb()
                    //     ,listaAlunos.getFc()
                    //      ,listaAlunos.getFd()
                    //       ,listaAlunos.getFe()
                    //       ,listaAlunos.getFf()
                    //       ,listaAlunos.getFg()
                    , listaAlunos.getFh(), listaAlunos.getFi(), listaAlunos.getFj(), listaAlunos.getFk(), listaAlunos.getFl(), listaAlunos.getFm(), listaAlunos.getFn(), listaAlunos.getFo(), listaAlunos.getFp(), listaAlunos.getFq(), listaAlunos.getFr(), listaAlunos.getFs(), listaAlunos.getFt(), listaAlunos.getFu(), listaAlunos.getFv(), listaAlunos.getFw(), listaAlunos.getFx(), listaAlunos.getFy(), listaAlunos.getFz(), listaAlunos.getGa(), listaAlunos.getGb(), listaAlunos.getGc(), listaAlunos.getGd(), listaAlunos.getGe(), listaAlunos.getGf(), listaAlunos.getGg(), listaAlunos.getGh(), listaAlunos.getGi(), "P" + listaAlunos.getGj(), listaAlunos.getGk(), listaAlunos.getGl(), listaAlunos.getGm(), listaAlunos.getGn(), listaAlunos.getGo(), listaAlunos.getGp(), listaAlunos.getGq(), listaAlunos.getGr(), listaAlunos.getGs(), listaAlunos.getGt(), listaAlunos.getGu(), listaAlunos.getGv(), listaAlunos.getGw(), listaAlunos.getGx(), listaAlunos.getGy(), listaAlunos.getGz()

                });
            } else {
                modelo.addRow(new Object[]{listaAlunos.getA(), listaAlunos.getCt(), listaAlunos.getC(), listaAlunos.getD(), listaAlunos.getE(), listaAlunos.getF(), listaAlunos.getG(), listaAlunos.getH(), listaAlunos.getI(), listaAlunos.getJ(), listaAlunos.getK(), listaAlunos.getL(), listaAlunos.getM(), listaAlunos.getN(), listaAlunos.getO(), listaAlunos.getP(), listaAlunos.getQ(), listaAlunos.getR(), listaAlunos.getS(), listaAlunos.getT(), listaAlunos.getU(), listaAlunos.getV(), listaAlunos.getW(), listaAlunos.getX(), listaAlunos.getY(), listaAlunos.getZ(), listaAlunos.getAa(), listaAlunos.getAb(), listaAlunos.getAc(), listaAlunos.getAd(), listaAlunos.getAe(), listaAlunos.getAf(), listaAlunos.getAg(), listaAlunos.getAh(), listaAlunos.getAi(), listaAlunos.getAj(), listaAlunos.getAk(), listaAlunos.getAl(), listaAlunos.getAm(), listaAlunos.getAn(), listaAlunos.getAo(), listaAlunos.getAp(), listaAlunos.getAq(), listaAlunos.getAr(), listaAlunos.getAs(), listaAlunos.getAt(), listaAlunos.getAu(), listaAlunos.getAv(), listaAlunos.getAw(), listaAlunos.getAx(), listaAlunos.getAy(), listaAlunos.getAz(), listaAlunos.getBa(), listaAlunos.getBb(), listaAlunos.getBc(), listaAlunos.getBd(), listaAlunos.getBe(), listaAlunos.getBf(), listaAlunos.getBg(), listaAlunos.getBh(), listaAlunos.getBi(), listaAlunos.getBj(), listaAlunos.getBk(), listaAlunos.getBl(), listaAlunos.getBm(), listaAlunos.getBn(), listaAlunos.getBo(), listaAlunos.getBp(), listaAlunos.getBq(), listaAlunos.getBr(), listaAlunos.getBs(), "", "", "", "", "", "", "", listaAlunos.getBt(), listaAlunos.getBu(), "", ConverteValores.convertDouble(listaAlunos.getBv()), listaAlunos.getBx(), ConverteValores.convertDouble(listaAlunos.getBw()), listaAlunos.getBy(), listaAlunos.getBz(), listaAlunos.getCa(), listaAlunos.getCb(), listaAlunos.getCc(), listaAlunos.getCd() + " PolyRev" //,listaAlunos.getCd()
                    , listaAlunos.getCe(), listaAlunos.getCf(), listaAlunos.getCg(), listaAlunos.getCh(), listaAlunos.getCi(), listaAlunos.getCj(), listaAlunos.getCk(), listaAlunos.getCl(), listaAlunos.getCm(), listaAlunos.getCn(), listaAlunos.getCo(), listaAlunos.getCp(), listaAlunos.getCq(), listaAlunos.getCr(), listaAlunos.getCs(), listaAlunos.getCt(), listaAlunos.getCu(), listaAlunos.getCv(), listaAlunos.getCw(), listaAlunos.getCx(), listaAlunos.getCy(), listaAlunos.getCz(), listaAlunos.getDa(), listaAlunos.getDb(), listaAlunos.getDc(), listaAlunos.getDd(), listaAlunos.getDe(), listaAlunos.getDf(), listaAlunos.getDg(), listaAlunos.getDh(), listaAlunos.getDi(), ConverteValores.casaDec(listaAlunos.getDj()), ConverteValores.casaDec(listaAlunos.getDk()), listaAlunos.getDl(), listaAlunos.getDm(), listaAlunos.getDn(), listaAlunos.getDo_(), listaAlunos.getDp(), listaAlunos.getDq(), listaAlunos.getDr(), listaAlunos.getDs() //  ,listaAlunos.getDt()
                    , listaAlunos.getDu(), listaAlunos.getDv(), listaAlunos.getDw() //  ,listaAlunos.getEe()
                    , listaAlunos.getDx(), listaAlunos.getDy(), listaAlunos.getDz(), listaAlunos.getEa(), listaAlunos.getEb(), "", "" //    ,listaAlunos.getEc()
                    , listaAlunos.getEd(), listaAlunos.getEf(), listaAlunos.getEg(), listaAlunos.getEh(), listaAlunos.getEi(), listaAlunos.getEj(), listaAlunos.getEk(), listaAlunos.getEl(), listaAlunos.getEm(), listaAlunos.getEn(), listaAlunos.getEo(), listaAlunos.getEp(), "", listaAlunos.getEq(), listaAlunos.getEr(), listaAlunos.getEv(), listaAlunos.getEs(), listaAlunos.getEt(), listaAlunos.getEu(), listaAlunos.getEw(), listaAlunos.getEx(), listaAlunos.getEy(), listaAlunos.getEz(), listaAlunos.getFa(), listaAlunos.getFb(), listaAlunos.getFc(), listaAlunos.getFd(), listaAlunos.getFe(), listaAlunos.getFf(), listaAlunos.getFg(), listaAlunos.getFh(), listaAlunos.getFi(), listaAlunos.getFj(), listaAlunos.getFk(), listaAlunos.getFl(), listaAlunos.getFm(), listaAlunos.getFn(), listaAlunos.getFo(), listaAlunos.getFp()

                });
            }
        });

    }
}
