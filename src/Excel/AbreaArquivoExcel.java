package Excel;
   
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
import static javax.swing.JOptionPane.showMessageDialog;
   
/**
 *
 * @author v103760
 */
public class AbreaArquivoExcel {

private static String A;
private static String B;
private static String C;
private static String D;
private static String E;
private static String F;
private static String G;
private static String H;
private static String I;
private static String J;
private static String K;
private static String L;
private static String M;
private static String N;
private static String O;
private static String P;
private static String Q;
private static String R;
private static String S;
private static String T;
private static String U;
private static String V;
private static String W;
private static String X;
private static String Y;
private static String Z;
private static String AA;
private static String AB;
private static String AC;
private static String AD;
private static String AE;
private static String AF;
private static String AG;
private static String AH;
private static String AI;
private static String AJ;
private static String AK;
private static String AL;
private static String AM;
private static String AN;
private static String AO;
private static String AP;
private static String AQ;
private static String AR;
private static String AS;
private static String AT;
private static String AU;
private static String AV;
private static String AW;
private static String AX;
private static String AY;
private static String AZ;
private static String BA;
private static String BB;
private static String BC;
private static String BD;
private static String BE;
private static String BF;
private static String BG;
private static String BH;
private static String BI;
private static String BJ;
private static String BK;
private static String BL;
private static String BM;
private static String BN;
private static String BO;
private static String BP;
private static String BQ;
private static String BR;
private static String BS;
private static String BT;
private static String BU;
private static String BV;
private static String BW;
private static String BX;
private static String BY;
private static String BZ;
private static String CA;
private static String CB;
private static String CC;
private static String CD;
private static String CE;
private static String CF;
private static String CG;
private static String CH;
private static String CI;
private static String CJ;
private static String CK;
private static String CL;
private static String CM;
private static String CN;
private static String CO;
private static String CP;
private static String CQ;
private static String CR;
private static String CS;
private static String CT;
private static String CU;
private static String CV;
private static String CW;
private static String CX;
private static String CY;
private static String CZ;
private static String DA;
private static String DB;
private static String DC;
private static String DD;
private static String DE;
private static String DF;
private static String DG;
private static String DH;
private static String DI;
private static String DJ;
private static String DK;
private static String DL;
private static String DM;
private static String DN;
private static String DO;
private static String DP;
private static String DQ;
private static String DR;
private static String DS;
private static String DT;
private static String DU;
private static String DV;
private static String DW;
private static String DX;
private static String DY;
private static String DZ;
private static String EA;
private static String EB;
private static String EC;
private static String ED;
private static String EE;
private static String EF;
private static String EG;
private static String EH;
private static String EI;
private static String EJ;
private static String EK;
private static String EL;
private static String EM;
private static String EN;
private static String EO;
private static String EP;
private static String EQ;
private static String ER;
private static String ES;
private static String ET;
private static String EU;
private static String EV;
private static String EW;
private static String EX;
private static String EY;
private static String EZ;
private static String FA;
private static String FB;
private static String FC;
private static String FD;
private static String FE;
private static String FF;
private static String FG;
private static String FH;
private static String FI;
private static String FJ;
private static String FK;
private static String FL;
private static String FM;
private static String FN;
private static String FO;
private static String FP;
private static String FQ;
private static String FR;
private static String FS;
private static String FT;
private static String FU;
private static String FV;
private static String FW;
private static String FX;
private static String FY;
private static String FZ;
private static String GA;
private static String GB;
private static String GC;
private static String GD;
private static String GE;
private static String GF;
private static String GG;
private static String GH;
private static String GI;
private static String GJ;
private static String GK;
private static String GL;
private static String GM;
private static String GN;
private static String GO;
private static String GP;
private static String GQ;
private static String GR;
private static String GS;
private static String GT;
private static String GU;
private static String GV;
private static String GW;
private static String GX;
private static String GY;
private static String GZ;
private static String HA;
private static String HB;
private static String HC;
private static String HD;
private static String HE;
private static String HF;
private static String HG;
private static String HH;
private static String HI;
private static String HJ;
private static String HK;
private static String HL;
private static String HM;
private static String HN;
private static String HO;
private static String HP;
private static String HQ;
private static String HR;
private static String HS;
private static String HT;
private static String HU;
private static String HV;
private static String HW;
private static String HX;
private static String HY;
private static String HZ;
private static String IA;
private static String IB;
private static String IC;
private static String ID;
private static String IE;
private static String IF;
private static String IG;
private static String IH;
private static String II;
private static String IJ;
private static String IK;
private static String IL;
private static String IM;
private static String IN;
private static String IO;
private static String IP;
private static String IQ;
private static String IR;
private static String IS;
private static String IT;
private static String IU;
private static String IV;
private static String IW;
private static String IX;
private static String IY;
private static String IZ;
private static String JA;
private static String JB;
private static String JC;
private static String JD;
private static String JE;
private static String JF;
private static String JG;
private static String JH;
private static String JI;
private static String JJ;
private static String JK;
private static String JL;
private static String JM;
private static String JN;
private static String JO;
private static String JP;
private static String JQ;
private static String JR;
private static String JS;
private static String JT;
private static String JU;
private static String JV;
private static String JW;
private static String JX;
private static String JY;
private static String JZ; 
  public static List<BancoExcel> listaAlunos = new ArrayList<>(); 
    public static String getEA() {
        return EA;
    }

    public static void setEA(String aEA) {
        EA = aEA;
    }

    public static String getEB() {
        return EB;
    }

    public static void setEB(String aEB) {
        EB = aEB;
    }

    public static String getEC() {
        return EC;
    }

    public static void setEC(String aEC) {
        EC = aEC;
    }

    public static String getED() {
        return ED;
    }

    public static void setED(String aED) {
        ED = aED;
    }

    public static String getEE() {
        return EE;
    }

    public static void setEE(String aEE) {
        EE = aEE;
    }

    public static String getEF() {
        return EF;
    }

    public static void setEF(String aEF) {
        EF = aEF;
    }

    public static String getEG() {
        return EG;
    }

    public static void setEG(String aEG) {
        EG = aEG;
    }

    public static String getEH() {
        return EH;
    }

    public static void setEH(String aEH) {
        EH = aEH;
    }

    public static String getEI() {
        return EI;
    }

    public static void setEI(String aEI) {
        EI = aEI;
    }

    public static String getEJ() {
        return EJ;
    }

    public static void setEJ(String aEJ) {
        EJ = aEJ;
    }

    public static String getEK() {
        return EK;
    }

    public static void setEK(String aEK) {
        EK = aEK;
    }

    public static String getEL() {
        return EL;
    }

    public static void setEL(String aEL) {
        EL = aEL;
    }

    public static String getEM() {
        return EM;
    }

    public static void setEM(String aEM) {
        EM = aEM;
    }

    public static String getEN() {
        return EN;
    }

    public static void setEN(String aEN) {
        EN = aEN;
    }

    public static String getEO() {
        return EO;
    }

    public static void setEO(String aEO) {
        EO = aEO;
    }

    public static String getEP() {
        return EP;
    }

    public static void setEP(String aEP) {
        EP = aEP;
    }

    public static String getEQ() {
        return EQ;
    }

    public static void setEQ(String aEQ) {
        EQ = aEQ;
    }

    public static String getER() {
        return ER;
    }

    public static void setER(String aER) {
        ER = aER;
    }

    public static String getES() {
        return ES;
    }

    public static void setES(String aES) {
        ES = aES;
    }

    public static String getET() {
        return ET;
    }

    public static void setET(String aET) {
        ET = aET;
    }

    public static String getEU() {
        return EU;
    }

    public static void setEU(String aEU) {
        EU = aEU;
    }

    public static String getEV() {
        return EV;
    }

    public static void setEV(String aEV) {
        EV = aEV;
    }

    public static String getEW() {
        return EW;
    }

    public static void setEW(String aEW) {
        EW = aEW;
    }

    public static String getEX() {
        return EX;
    }

    public static void setEX(String aEX) {
        EX = aEX;
    }

    public static String getEY() {
        return EY;
    }

    public static void setEY(String aEY) {
        EY = aEY;
    }

    public static String getEZ() {
        return EZ;
    }

    public static void setEZ(String aEZ) {
        EZ = aEZ;
    }

    public static String getFA() {
        return FA;
    }

    public static void setFA(String aFA) {
        FA = aFA;
    }

    public static String getFB() {
        return FB;
    }

    public static void setFB(String aFB) {
        FB = aFB;
    }

    public static String getFC() {
        return FC;
    }

    public static void setFC(String aFC) {
        FC = aFC;
    }

    public static String getFD() {
        return FD;
    }

    public static void setFD(String aFD) {
        FD = aFD;
    }

    public static String getFE() {
        return FE;
    }

    public static void setFE(String aFE) {
        FE = aFE;
    }

    public static String getFF() {
        return FF;
    }

    public static void setFF(String aFF) {
        FF = aFF;
    }

    public static String getFG() {
        return FG;
    }

    public static void setFG(String aFG) {
        FG = aFG;
    }

    public static String getFH() {
        return FH;
    }

    public static void setFH(String aFH) {
        FH = aFH;
    }

    public static String getFI() {
        return FI;
    }

    public static void setFI(String aFI) {
        FI = aFI;
    }

    public static String getFJ() {
        return FJ;
    }

    public static void setFJ(String aFJ) {
        FJ = aFJ;
    }

    public static String getFK() {
        return FK;
    }

    public static void setFK(String aFK) {
        FK = aFK;
    }

    public static String getFL() {
        return FL;
    }

    public static void setFL(String aFL) {
        FL = aFL;
    }

    public static String getFM() {
        return FM;
    }

    public static void setFM(String aFM) {
        FM = aFM;
    }

    public static String getFN() {
        return FN;
    }

    public static void setFN(String aFN) {
        FN = aFN;
    }

    public static String getFO() {
        return FO;
    }

    public static void setFO(String aFO) {
        FO = aFO;
    }

    public static String getFP() {
        return FP;
    }

    public static void setFP(String aFP) {
        FP = aFP;
    }

    public static String getFQ() {
        return FQ;
    }

    public static void setFQ(String aFQ) {
        FQ = aFQ;
    }

    public static String getFR() {
        return FR;
    }

    public static void setFR(String aFR) {
        FR = aFR;
    }

    public static String getFS() {
        return FS;
    }

    public static void setFS(String aFS) {
        FS = aFS;
    }

    public static String getFT() {
        return FT;
    }

    public static void setFT(String aFT) {
        FT = aFT;
    }

    public static String getFU() {
        return FU;
    }

    public static void setFU(String aFU) {
        FU = aFU;
    }

    public static String getFV() {
        return FV;
    }

    public static void setFV(String aFV) {
        FV = aFV;
    }

    public static String getFW() {
        return FW;
    }

    public static void setFW(String aFW) {
        FW = aFW;
    }

    public static String getFX() {
        return FX;
    }

    public static void setFX(String aFX) {
        FX = aFX;
    }

    public static String getFY() {
        return FY;
    }

    public static void setFY(String aFY) {
        FY = aFY;
    }

    public static String getFZ() {
        return FZ;
    }

    public static void setFZ(String aFZ) {
        FZ = aFZ;
    }

    public static String getGA() {
        return GA;
    }

    public static void setGA(String aGA) {
        GA = aGA;
    }

    public static String getGB() {
        return GB;
    }

    public static void setGB(String aGB) {
        GB = aGB;
    }

    public static String getGC() {
        return GC;
    }

    public static void setGC(String aGC) {
        GC = aGC;
    }

    public static String getGD() {
        return GD;
    }

    public static void setGD(String aGD) {
        GD = aGD;
    }

    public static String getGE() {
        return GE;
    }

    public static void setGE(String aGE) {
        GE = aGE;
    }

    public static String getGF() {
        return GF;
    }

    public static void setGF(String aGF) {
        GF = aGF;
    }

    public static String getGG() {
        return GG;
    }

    public static void setGG(String aGG) {
        GG = aGG;
    }

    public static String getGH() {
        return GH;
    }

    public static void setGH(String aGH) {
        GH = aGH;
    }

    public static String getGI() {
        return GI;
    }

    public static void setGI(String aGI) {
        GI = aGI;
    }

    public static String getGJ() {
        return GJ;
    }

    public static void setGJ(String aGJ) {
        GJ = aGJ;
    }

    public static String getGK() {
        return GK;
    }

    public static void setGK(String aGK) {
        GK = aGK;
    }

    public static String getGL() {
        return GL;
    }

    public static void setGL(String aGL) {
        GL = aGL;
    }

    public static String getGM() {
        return GM;
    }

    public static void setGM(String aGM) {
        GM = aGM;
    }

    public static String getGN() {
        return GN;
    }

    public static void setGN(String aGN) {
        GN = aGN;
    }

    public static String getGO() {
        return GO;
    }

    public static void setGO(String aGO) {
        GO = aGO;
    }

    public static String getGP() {
        return GP;
    }

    public static void setGP(String aGP) {
        GP = aGP;
    }

    public static String getGQ() {
        return GQ;
    }

    public static void setGQ(String aGQ) {
        GQ = aGQ;
    }

    public static String getGR() {
        return GR;
    }

    public static void setGR(String aGR) {
        GR = aGR;
    }

    public static String getGS() {
        return GS;
    }

    public static void setGS(String aGS) {
        GS = aGS;
    }

    public static String getGT() {
        return GT;
    }

    public static void setGT(String aGT) {
        GT = aGT;
    }

    public static String getGU() {
        return GU;
    }

    public static void setGU(String aGU) {
        GU = aGU;
    }

    public static String getGV() {
        return GV;
    }

    public static void setGV(String aGV) {
        GV = aGV;
    }

    public static String getGW() {
        return GW;
    }

    public static void setGW(String aGW) {
        GW = aGW;
    }

    public static String getGX() {
        return GX;
    }

    public static void setGX(String aGX) {
        GX = aGX;
    }

    public static String getGY() {
        return GY;
    }

    public static void setGY(String aGY) {
        GY = aGY;
    }

    public static String getGZ() {
        return GZ;
    }

    public static void setGZ(String aGZ) {
        GZ = aGZ;
    }

    public static String getHA() {
        return HA;
    }

    public static void setHA(String aHA) {
        HA = aHA;
    }

    public static String getHB() {
        return HB;
    }

    public static void setHB(String aHB) {
        HB = aHB;
    }

    public static String getHC() {
        return HC;
    }

    public static void setHC(String aHC) {
        HC = aHC;
    }

    public static String getHD() {
        return HD;
    }

    public static void setHD(String aHD) {
        HD = aHD;
    }

    public static String getHE() {
        return HE;
    }

    public static void setHE(String aHE) {
        HE = aHE;
    }

    public static String getHF() {
        return HF;
    }

    public static void setHF(String aHF) {
        HF = aHF;
    }

    public static String getHG() {
        return HG;
    }

    public static void setHG(String aHG) {
        HG = aHG;
    }

    public static String getHH() {
        return HH;
    }

    public static void setHH(String aHH) {
        HH = aHH;
    }

    public static String getHI() {
        return HI;
    }

    public static void setHI(String aHI) {
        HI = aHI;
    }

    public static String getHJ() {
        return HJ;
    }

    public static void setHJ(String aHJ) {
        HJ = aHJ;
    }

    public static String getHK() {
        return HK;
    }

    public static void setHK(String aHK) {
        HK = aHK;
    }

    public static String getHL() {
        return HL;
    }

    public static void setHL(String aHL) {
        HL = aHL;
    }

    public static String getHM() {
        return HM;
    }

    public static void setHM(String aHM) {
        HM = aHM;
    }

    public static String getHN() {
        return HN;
    }

    public static void setHN(String aHN) {
        HN = aHN;
    }

    public static String getHO() {
        return HO;
    }

    public static void setHO(String aHO) {
        HO = aHO;
    }

    public static String getHP() {
        return HP;
    }

    public static void setHP(String aHP) {
        HP = aHP;
    }

    public static String getHQ() {
        return HQ;
    }

    public static void setHQ(String aHQ) {
        HQ = aHQ;
    }

    public static String getHR() {
        return HR;
    }

    public static void setHR(String aHR) {
        HR = aHR;
    }

    public static String getHS() {
        return HS;
    }

    public static void setHS(String aHS) {
        HS = aHS;
    }

    public static String getHT() {
        return HT;
    }

    public static void setHT(String aHT) {
        HT = aHT;
    }

    public static String getHU() {
        return HU;
    }

    public static void setHU(String aHU) {
        HU = aHU;
    }

    public static String getHV() {
        return HV;
    }

    public static void setHV(String aHV) {
        HV = aHV;
    }

    public static String getHW() {
        return HW;
    }

    public static void setHW(String aHW) {
        HW = aHW;
    }

    public static String getHX() {
        return HX;
    }

    public static void setHX(String aHX) {
        HX = aHX;
    }

    public static String getHY() {
        return HY;
    }

    public static void setHY(String aHY) {
        HY = aHY;
    }

    public static String getHZ() {
        return HZ;
    }

    public static void setHZ(String aHZ) {
        HZ = aHZ;
    }

    public static String getIA() {
        return IA;
    }

    public static void setIA(String aIA) {
        IA = aIA;
    }

    public static String getIB() {
        return IB;
    }

    public static void setIB(String aIB) {
        IB = aIB;
    }

    public static String getIC() {
        return IC;
    }

    public static void setIC(String aIC) {
        IC = aIC;
    }

    public static String getID() {
        return ID;
    }

    public static void setID(String aID) {
        ID = aID;
    }

    public static String getIE() {
        return IE;
    }

    public static void setIE(String aIE) {
        IE = aIE;
    }

    public static String getIF() {
        return IF;
    }

    public static void setIF(String aIF) {
        IF = aIF;
    }

    public static String getIG() {
        return IG;
    }

    public static void setIG(String aIG) {
        IG = aIG;
    }

    public static String getIH() {
        return IH;
    }

    public static void setIH(String aIH) {
        IH = aIH;
    }

    public static String getII() {
        return II;
    }

    public static void setII(String aII) {
        II = aII;
    }

    public static String getIJ() {
        return IJ;
    }

    public static void setIJ(String aIJ) {
        IJ = aIJ;
    }

    public static String getIK() {
        return IK;
    }

    public static void setIK(String aIK) {
        IK = aIK;
    }

    public static String getIL() {
        return IL;
    }

    public static void setIL(String aIL) {
        IL = aIL;
    }

    public static String getIM() {
        return IM;
    }

    public static void setIM(String aIM) {
        IM = aIM;
    }

    public static String getIN() {
        return IN;
    }

    public static void setIN(String aIN) {
        IN = aIN;
    }

    public static String getIO() {
        return IO;
    }

    public static void setIO(String aIO) {
        IO = aIO;
    }

    public static String getIP() {
        return IP;
    }

    public static void setIP(String aIP) {
        IP = aIP;
    }

    public static String getIQ() {
        return IQ;
    }

    public static void setIQ(String aIQ) {
        IQ = aIQ;
    }

    public static String getIR() {
        return IR;
    }

    public static void setIR(String aIR) {
        IR = aIR;
    }

    public static String getIS() {
        return IS;
    }

    public static void setIS(String aIS) {
        IS = aIS;
    }

    public static String getIT() {
        return IT;
    }

    public static void setIT(String aIT) {
        IT = aIT;
    }

    public static String getIU() {
        return IU;
    }

    public static void setIU(String aIU) {
        IU = aIU;
    }

    public static String getIV() {
        return IV;
    }

    public static void setIV(String aIV) {
        IV = aIV;
    }

    public static String getIW() {
        return IW;
    }

    public static void setIW(String aIW) {
        IW = aIW;
    }

    public static String getIX() {
        return IX;
    }

    public static void setIX(String aIX) {
        IX = aIX;
    }

    public static String getIY() {
        return IY;
    }

    public static void setIY(String aIY) {
        IY = aIY;
    }

    public static String getIZ() {
        return IZ;
    }

    public static void setIZ(String aIZ) {
        IZ = aIZ;
    }

    public static String getJA() {
        return JA;
    }

    public static void setJA(String aJA) {
        JA = aJA;
    }

    public static String getJB() {
        return JB;
    }

    public static void setJB(String aJB) {
        JB = aJB;
    }

    public static String getJC() {
        return JC;
    }

    public static void setJC(String aJC) {
        JC = aJC;
    }

    public static String getJD() {
        return JD;
    }

    public static void setJD(String aJD) {
        JD = aJD;
    }

    public static String getJE() {
        return JE;
    }

    public static void setJE(String aJE) {
        JE = aJE;
    }

    public static String getJF() {
        return JF;
    }

    public static void setJF(String aJF) {
        JF = aJF;
    }

    public static String getJG() {
        return JG;
    }

    public static void setJG(String aJG) {
        JG = aJG;
    }

    public static String getJH() {
        return JH;
    }

    public static void setJH(String aJH) {
        JH = aJH;
    }

    public static String getJI() {
        return JI;
    }

    public static void setJI(String aJI) {
        JI = aJI;
    }

    public static String getJJ() {
        return JJ;
    }

    public static void setJJ(String aJJ) {
        JJ = aJJ;
    }

    public static String getJK() {
        return JK;
    }

    public static void setJK(String aJK) {
        JK = aJK;
    }

    public static String getJL() {
        return JL;
    }

    public static void setJL(String aJL) {
        JL = aJL;
    }

    public static String getJM() {
        return JM;
    }

    public static void setJM(String aJM) {
        JM = aJM;
    }

    public static String getJN() {
        return JN;
    }

    public static void setJN(String aJN) {
        JN = aJN;
    }

    public static String getJO() {
        return JO;
    }

    public static void setJO(String aJO) {
        JO = aJO;
    }

    public static String getJP() {
        return JP;
    }

    public static void setJP(String aJP) {
        JP = aJP;
    }

    public static String getJQ() {
        return JQ;
    }

    public static void setJQ(String aJQ) {
        JQ = aJQ;
    }

    public static String getJR() {
        return JR;
    }

    public static void setJR(String aJR) {
        JR = aJR;
    }

    public static String getJS() {
        return JS;
    }

    public static void setJS(String aJS) {
        JS = aJS;
    }

    public static String getJT() {
        return JT;
    }

    public static void setJT(String aJT) {
        JT = aJT;
    }

    public static String getJU() {
        return JU;
    }

    public static void setJU(String aJU) {
        JU = aJU;
    }

    public static String getJV() {
        return JV;
    }

    public static void setJV(String aJV) {
        JV = aJV;
    }

    public static String getJW() {
        return JW;
    }

    public static void setJW(String aJW) {
        JW = aJW;
    }

    public static String getJX() {
        return JX;
    }

    public static void setJX(String aJX) {
        JX = aJX;
    }

    public static String getJY() {
        return JY;
    }

    public static void setJY(String aJY) {
        JY = aJY;
    }

    public static String getJZ() {
        return JZ;
    }

    public static void setJZ(String aJZ) {
        JZ = aJZ;
    }

    /**
     * @return the produtos
     */
    

 public String getFileName() {
        return fileName;
    }

    public  void setFileName(String aFileName) {
        fileName = aFileName;
    }
public List<BancoExcel> listExcel = new ArrayList<BancoExcel>();
    public static String getDC() {
        return DC;
    }

    public static void setDC(String aDC) {
        DC = aDC;
    }

    public static String getDD() {
        return DD;
    }

    public static void setDD(String aDD) {
        DD = aDD;
    }

    public static String getDE() {
        return DE;
    }

    public static void setDE(String aDE) {
        DE = aDE;
    }

    public static String getDF() {
        return DF;
    }

    public static void setDF(String aDF) {
        DF = aDF;
    }

    public static String getDG() {
        return DG;
    }

    public static void setDG(String aDG) {
        DG = aDG;
    }

    public static String getDH() {
        return DH;
    }

    public static void setDH(String aDH) {
        DH = aDH;
    }

    public static String getDI() {
        return DI;
    }

    public static void setDI(String aDI) {
        DI = aDI;
    }

    public static String getDJ() {
        return DJ;
    }

    public static void setDJ(String aDJ) {
        DJ = aDJ;
    }

    public static String getDK() {
        return DK;
    }

    public static void setDK(String aDK) {
        DK = aDK;
    }

    public static String getDL() {
        return DL;
    }

    public static void setDL(String aDL) {
        DL = aDL;
    }

    public static String getDM() {
        return DM;
    }

    public static void setDM(String aDM) {
        DM = aDM;
    }

    public static String getDN() {
        return DN;
    }

    public static void setDN(String aDN) {
        DN = aDN;
    }

    public static String getDO() {
        return DO;
    }

    public static void setDO(String aDO) {
        DO = aDO;
    }

    public static String getDP() {
        return DP;
    }

    public static void setDP(String aDP) {
        DP = aDP;
    }

    public static String getDQ() {
        return DQ;
    }

    public static void setDQ(String aDQ) {
        DQ = aDQ;
    }

    public static String getDR() {
        return DR;
    }

    public static void setDR(String aDR) {
        DR = aDR;
    }

    public static String getDS() {
        return DS;
    }

    public static void setDS(String aDS) {
        DS = aDS;
    }

    public static String getDT() {
        return DT;
    }

    public static void setDT(String aDT) {
        DT = aDT;
    }

    public static String getDU() {
        return DU;
    }

    public static void setDU(String aDU) {
        DU = aDU;
    }

    public static String getDV() {
        return DV;
    }

    public static void setDV(String aDV) {
        DV = aDV;
    }

    public static String getDW() {
        return DW;
    }

    public static void setDW(String aDW) {
        DW = aDW;
    }

    public static String getDX() {
        return DX;
    }

    public static void setDX(String aDX) {
        DX = aDX;
    }

    public static String getDY() {
        return DY;
    }

    public static void setDY(String aDY) {
        DY = aDY;
    }

    public static String getDZ() {
        return DZ;
    }

    public static void setDZ(String aDZ) {
        DZ = aDZ;
    }



    public String getCN() {
        return CN;
    }

    public void setCN(String CN) {
        AbreaArquivoExcel.CN = CN;
    }

    public String getCO() {
        return CO;
    }

    public void setCO(String CO) {
        AbreaArquivoExcel.CO = CO;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        AbreaArquivoExcel.CP = CP;
    }

    public String getCQ() {
        return CQ;
    }

    public void setCQ(String CQ) {
        AbreaArquivoExcel.CQ = CQ;
    }

    public String getCR() {
        return CR;
    }

    public void setCR(String CR) {
        AbreaArquivoExcel.CR = CR;
    }

    public String getCS() {
        return CS;
    }

    public void setCS(String CS) {
        AbreaArquivoExcel.CS = CS;
    }

    public String getCT() {
        return CT;
    }

    public void setCT(String CT) {
        AbreaArquivoExcel.CT = CT;
    }

    public String getCU() {
        return CU;
    }

    public void setCU(String CU) {
        AbreaArquivoExcel.CU = CU;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        AbreaArquivoExcel.CV = CV;
    }

    public String getCW() {
        return CW;
    }

    public void setCW(String CW) {
        AbreaArquivoExcel.CW = CW;
    }

    public String getCX() {
        return CX;
    }

    public void setCX(String CX) {
        AbreaArquivoExcel.CX = CX;
    }

    public String getCY() {
        return CY;
    }

    public void setCY(String CY) {
        AbreaArquivoExcel.CY = CY;
    }

    public String getCZ() {
        return CZ;
    }

    public void setCZ(String CZ) {
        AbreaArquivoExcel.CZ = CZ;
    }

    public String getDA() {
        return DA;
    }

    public void setDA(String DA) {
        AbreaArquivoExcel.DA = DA;
    }

    public String getDB() {
        return DB;
    }

    public void setDB(String DB) {
        AbreaArquivoExcel.DB = DB;
    }

   
         
         
         
  private String fileName; 

    public String getV() {
        return V;
    }

    public void setV(String aV) {
        V = aV;
    }

    public String getAV() {
        return AV;
    }

    public  void setAV(String aAV) {
        AV = aAV;
    }

    public  String getBV() {
        return BV;
    }

    public void setBV(String aBV) {
        BV = aBV;
    }

    public  String getA() {
        return A;
    }

    public  void setA(String aA) {
        A = aA;
    }

    public  String getB() {
        return B;
    }

    public  void setB(String aB) {
        B = aB;
    }

    public  String getC() {
        return C;
    }

    public  void setC(String aC) {
        C = aC;
    }

    public  String getD() {
        return D;
    }

    public  void setD(String aD) {
        D = aD;
    }

    public  String getE() {
        return E;
    }

    public  void setE(String aE) {
        E = aE;
    }

    public  String getF() {
        return F;
    }

    public  void setF(String aF) {
        F = aF;
    }

    public  String getG() {
        return G;
    }

    public  void setG(String aG) {
        G = aG;
    }

    public  String getH() {
        return H;
    }

    public  void setH(String aH) {
        H = aH;
    }

    public  String getI() {
        return I;
    }

    public  void setI(String aI) {
        I = aI;
    }

    public  String getJ() {
        return J;
    }

    public  void setJ(String aJ) {
        J = aJ;
    }

    public  String getK() {
        return K;
    }

    public  void setK(String aK) {
        K = aK;
    }

    public  String getL() {
        return L;
    }

    public  void setL(String aL) {
        L = aL;
    }

    public  String getM() {
        return M;
    }

    public  void setM(String aM) {
        M = aM;
    }

    public  String getN() {
        return N;
    }

    public  void setN(String aN) {
        N = aN;
    }

    public  String getO() {
        return O;
    }

    public  void setO(String aO) {
        O = aO;
    }

    public  String getP() {
        return P;
    }

    public  void setP(String aP) {
        P = aP;
    }

    public  String getQ() {
        return Q;
    }

    public  void setQ(String aQ) {
        Q = aQ;
    }

    public  String getR() {
        return R;
    }

    public  void setR(String aR) {
        R = aR;
    }

    public  String getS() {
        return S;
    }

    public  void setS(String aS) {
        S = aS;
    }

    public  String getT() {
        return T;
    }

    public  void setT(String aT) {
        T = aT;
    }

    public  String getU() {
        return U;
    }

    public  void setU(String aU) {
        U = aU;
    }

    public  String getW() {
        return W;
    }

    public  void setW(String aW) {
        W = aW;
    }

    public  String getX() {
        return X;
    }

    public  void setX(String aX) {
        X = aX;
    }

    public  String getY() {
        return Y;
    }

    public  void setY(String aY) {
        Y = aY;
    }

    public  String getZ() {
        return Z;
    }

    public  void setZ(String aZ) {
        Z = aZ;
    }

    public  String getAA() {
        return AA;
    }

    public  void setAA(String aAA) {
        AA = aAA;
    }

    public  String getAB() {
        return AB;
    }

    public  void setAB(String aAB) {
        AB = aAB;
    }

    public  String getAC() {
        return AC;
    }

    public  void setAC(String aAC) {
        AC = aAC;
    }

    public  String getAD() {
        return AD;
    }

    public  void setAD(String aAD) {
        AD = aAD;
    }

    public  String getAE() {
        return AE;
    }

    public  void setAE(String aAE) {
        AE = aAE;
    }

    public  String getAF() {
        return AF;
    }

    public  void setAF(String aAF) {
        AF = aAF;
    }

    public  String getAG() {
        return AG;
    }

    public  void setAG(String aAG) {
        AG = aAG;
    }

    public  String getAH() {
        return AH;
    }

    public  void setAH(String aAH) {
        AH = aAH;
    }

    public  String getAI() {
        return AI;
    }

    public  void setAI(String aAI) {
        AI = aAI;
    }

    public  String getAJ() {
        return AJ;
    }

    public  void setAJ(String aAJ) {
        AJ = aAJ;
    }

    public  String getAK() {
        return AK;
    }

    public  void setAK(String aAK) {
        AK = aAK;
    }

    public  String getAL() {
        return AL;
    }

    public  void setAL(String aAL) {
        AL = aAL;
    }

    public  String getAM() {
        return AM;
    }

    public  void setAM(String aAM) {
        AM = aAM;
    }

    public  String getAN() {
        return AN;
    }

    public  void setAN(String aAN) {
        AN = aAN;
    }

    public  String getAO() {
        return AO;
    }

    public  void setAO(String aAO) {
        AO = aAO;
    }

    public  String getAP() {
        return AP;
    }

    public  void setAP(String aAP) {
        AP = aAP;
    }

    public  String getAQ() {
        return AQ;
    }

    public  void setAQ(String aAQ) {
        AQ = aAQ;
    }

    public  String getAR() {
        return AR;
    }

    public  void setAR(String aAR) {
        AR = aAR;
    }

    public  String getAS() {
        return AS;
    }

    public  void setAS(String aAS) {
        AS = aAS;
    }

    public  String getAT() {
        return AT;
    }

    public  void setAT(String aAT) {
        AT = aAT;
    }

    public  String getAU() {
        return AU;
    }

    public  void setAU(String aAU) {
        AU = aAU;
    }

    public  String getAW() {
        return AW;
    }

    public  void setAW(String aAW) {
        AW = aAW;
    }

    public  String getAX() {
        return AX;
    }

    public  void setAX(String aAX) {
        AX = aAX;
    }

    public  String getAY() {
        return AY;
    }

    public  void setAY(String aAY) {
        AY = aAY;
    }

    public  String getAZ() {
        return AZ;
    }

    public  void setAZ(String aAZ) {
        AZ = aAZ;
    }

    public  String getBA() {
        return BA;
    }

    public  void setBA(String aBA) {
        BA = aBA;
    }

    public  String getBB() {
        return BB;
    }

    public  void setBB(String aBB) {
        BB = aBB;
    }

    public  String getBC() {
        return BC;
    }

    public  void setBC(String aBC) {
        BC = aBC;
    }

    public  String getBD() {
        return BD;
    }

    public  void setBD(String aBD) {
        BD = aBD;
    }

    public  String getBE() {
        return BE;
    }

    public  void setBE(String aBE) {
        BE = aBE;
    }

    public  String getBF() {
        return BF;
    }

    public  void setBF(String aBF) {
        BF = aBF;
    }

    public  String getBG() {
        return BG;
    }

    public  void setBG(String aBG) {
        BG = aBG;
    }

    public  String getBH() {
        return BH;
    }

    public  void setBH(String aBH) {
        BH = aBH;
    }

    public  String getBI() {
        return BI;
    }

    public  void setBI(String aBI) {
        BI = aBI;
    }

    public  String getBJ() {
        return BJ;
    }

    public  void setBJ(String aBJ) {
        BJ = aBJ;
    }

    public  String getBK() {
        return BK;
    }

    public  void setBK(String aBK) {
        BK = aBK;
    }

    public  String getBL() {
        return BL;
    }

    public  void setBL(String aBL) {
        BL = aBL;
    }

    public  String getBM() {
        return BM;
    }

    public  void setBM(String aBM) {
        BM = aBM;
    }

    public  String getBN() {
        return BN;
    }

    public  void setBN(String aBN) {
        BN = aBN;
    }

    public  String getBO() {
        return BO;
    }

    public  void setBO(String aBO) {
        BO = aBO;
    }

    public  String getBP() {
        return BP;
    }

    public  void setBP(String aBP) {
        BP = aBP;
    }

    public  String getBQ() {
        return BQ;
    }

    public  void setBQ(String aBQ) {
        BQ = aBQ;
    }

    public  String getBR() {
        return BR;
    }

    public  void setBR(String aBR) {
        BR = aBR;
    }

    public  String getBS() {
        return BS;
    }

    public  void setBS(String aBS) {
        BS = aBS;
    }

    public  String getBT() {
        return BT;
    }

    public  void setBT(String aBT) {
        BT = aBT;
    }

    public  String getBU() {
        return BU;
    }

    public  void setBU(String aBU) {
        BU = aBU;
    }

    public  String getBW() {
        return BW;
    }

    public  void setBW(String aBW) {
        BW = aBW;
    }

    public  String getBX() {
        return BX;
    }

    public  void setBX(String aBX) {
        BX = aBX;
    }

    public  String getBY() {
        return BY;
    }

    public  void setBY(String aBY) {
        BY = aBY;
    }

    public  String getBZ() {
        return BZ;
    }

    public  void setBZ(String aBZ) {
        BZ = aBZ;
    }

    public  String getCA() {
        return CA;
    }

    public  void setCA(String aCA) {
        CA = aCA;
    }

    public  String getCB() {
        return CB;
    }

    public  void setCB(String aCB) {
        CB = aCB;
    }

    public  String getCC() {
        return CC;
    }

    public  void setCC(String aCC) {
        CC = aCC;
    }

    public  String getCD() {
        return CD;
    }

    public  void setCD(String aCD) {
        CD = aCD;
    }

    public  String getCE() {
        return CE;
    }

    public  void setCE(String aCE) {
        CE = aCE;
    }

    public  String getCF() {
        return CF;
    }

    public  void setCF(String aCF) {
        CF = aCF;
    }

    public  String getCG() {
        return CG;
    }

    public  void setCG(String aCG) {
        CG = aCG;
    }

    public  String getCH() {
        return CH;
    }

    public  void setCH(String aCH) {
        CH = aCH;
    }

    public  String getCI() {
        return CI;
    }

    public  void setCI(String aCI) {
        CI = aCI;
    }

    public  String getCJ() {
        return CJ;
    }

    public  void setCJ(String aCJ) {
        CJ = aCJ;
    }

    public  String getCK() {
        return CK;
    }

    public  void setCK(String aCK) {
        CK = aCK;
    }

    public  String getCL() {
        return CL;
    }

    public  void setCL(String aCL) {
        CL = aCL;
    }

    public  String getCM() {
        return CM;
    }

    public  void setCM(String aCM) {
        CM = aCM;
    }

    

   

   
   
         public void main(String[] args) throws IOException {
          //   buscar();
         }
public  void buscar(String plan) throws IOException{
    
                 
              
                   try (FileInputStream arquivo = new FileInputStream(new File(
                       AbreaArquivoExcel.this.getFileName()))) {
                      
                       HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
                       
                       HSSFSheet sheetAlunos = workbook.getSheet(plan); //primeira planilha
                       
                       Iterator<Row> rowIterator = sheetAlunos.iterator();
                       
                       while (rowIterator.hasNext()) {                         //ler a linhas
                           Row row = rowIterator.next();
                           Iterator<Cell> cellIterator = row.cellIterator();
                           
                            Excel.BancoExcel dados = new Excel.BancoExcel();
                            listaAlunos.add(dados);
                           
                           while (cellIterator.hasNext()) {                     //ler a células
                               Cell cell = cellIterator.next();
                               switch (cell.getColumnIndex()) {
                                   case 0:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setA(cell.getStringCellValue()); //coluna 0 pega valor 
                                   
                                      
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
                                       dados.setC(cell.getStringCellValue()); //coluna 2 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                   case 3:
                                         try{ 
                                       cell.setCellType (1);    
                                       dados.setD(cell.getStringCellValue()); //coluna 3 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                case 4:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setE(cell.getStringCellValue()); //coluna 4 pega valor 
                                      
                                      
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
       //****************************************************************************************************************************                                  
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
             //****************************************************************************************************************************                                  
                                
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
             //****************************************************************************************************************************                                  
                                
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
       //****************************************************************************************************************************                                  
                                      
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
                          //****************************************************************************************************************************                                  

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
                          //****************************************************************************************************************************       
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
                          //****************************************************************************************************************************             
                                      
                              case 182:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 183:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGb(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 184:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 185:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 186:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 187:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 188:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 189:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 190:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 191:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 192:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 193:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 194:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 195:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 196:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 197:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 198:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 199:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 200:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 201:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 202:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 203:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 204:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 205:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 206:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 207:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setGz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                          //****************************************************************************************************************************       
                                         case 208:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 209:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHb(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 210:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 211:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 212:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 213:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 214:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 215:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 216:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 217:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 218:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 219:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 220:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 221:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 222:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 223:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 224:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 225:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 226:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 227:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 228:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 229:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 230:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 231:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 232:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 233:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setHz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                          //**************************************************************************************************************************** 
                                         case 234:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 235:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIb(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 236:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 237:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setId(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 238:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 239:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIf_(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 240:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 241:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 242:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 243:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 244:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 245:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 246:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 247:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 248:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 249:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 250:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 251:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 252:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 253:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 254:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 255:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 256:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 257:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 258:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 259:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setIz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                          //****************************************************************************************************************************       
                                         case 260:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJa(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 261:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJb(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                  case 262:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJc(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                    case 263:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJd(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 264:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJe(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 265:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJf(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 266:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJg(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                     case 267:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJh(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 268:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJi(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 269:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJj(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 270:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJk(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 271:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJl(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 272:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJm(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 273:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJn(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 274:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJo(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 275:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJp(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 276:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJq(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 277:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJr(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 278:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJs(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 279:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJt(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 280:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJu(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 281:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJv(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 282:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJw(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;  
                                      case 283:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJx(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 284:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJy(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                                       case 285:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setJz(cell.getStringCellValue()); //coluna 1 pega valor 
                                      
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;   
                          //****************************************************************************************************************************       
                       }
                   }
                       }
               } catch (FileNotFoundException e) {
                      System.out.println("Arquivo Excel não encontrado!");
                       showMessageDialog(null,"Arquivo Excel não encontrado");
               }
   
               if (listExcel.isEmpty()) {
                      System.out.println("Nenhum Ativo encontrado!");
               } else {
                 for (BancoExcel dados : listExcel) {
                                             
                         
                         A = dados.getA();
                         B = dados.getB();
                         C = dados.getC();
                         D = dados.getD();
                         E = dados.getE();
                         F = dados.getF();
                         G = dados.getG();
                         H = dados.getH();
                         I = dados.getI();
                         J = dados.getJ();
                         K = dados.getK();
                         L = dados.getL();
                         M = dados.getM();
                         N = dados.getN();
                         O = dados.getO();
                         P = dados.getP();
                         Q = dados.getQ();
                         R = dados.getR();
                         S = dados.getS();
                         T = dados.getT();
                         U = dados.getU();
                         V = dados.getV();
                         W = dados.getW();
                         X = dados.getX();
                         Y = dados.getY();
                         Z = dados.getZ();
                         AA = dados.getAa();
                         AB = dados.getAb();
                         AC = dados.getAc();
                         AD = dados.getAd();
                         AE = dados.getAe();
                         AF = dados.getAf();
                         AG = dados.getAg();
                         AH = dados.getAh();
                         AI = dados.getAi();
                         AJ = dados.getAj();
                         AK = dados.getAk();
                         AL = dados.getAl();
                         AM = dados.getAm();
                         AN = dados.getAn();
                         AO = dados.getAo();
                         AP = dados.getAp();
                         AQ = dados.getAq();
                         AR = dados.getAr();
                         AS = dados.getAs();
                         AT = dados.getAt();
                         AU = dados.getAu();
                         AV = dados.getAv();
                         AW = dados.getAw();
                         AX = dados.getAx();
                         AY = dados.getAy();
                         AZ = dados.getAz();
                         BA = dados.getBa();
                         BB = dados.getBb();
                         BC = dados.getBc();
                         BD = dados.getBd();
                         BE = dados.getBe();
                         BF = dados.getBf();
                         BG = dados.getBg();
                         BH = dados.getBh();
                         BI = dados.getBi();
                         BJ = dados.getBj();
                         BK = dados.getBk();
                         BL = dados.getBl();
                         BM = dados.getBm();
                         BN = dados.getBn();
                         BO = dados.getBo();
                         BP = dados.getBp();
                         BQ = dados.getBq();
                         BR = dados.getBr();
                         BS = dados.getBs();
                         BT = dados.getBt();
                         BU = dados.getBu();
                         BV = dados.getBv();
                         BW = dados.getBw();
                         BX = dados.getBx();
                         BY = dados.getBy();
                         BZ = dados.getBz();
                         CA = dados.getCa();
                         CB = dados.getCb();
                         CC = dados.getCc();
                         CD = dados.getCd();
                         CE = dados.getCe();
                         CF = dados.getCf();
                         CG = dados.getCg();
                         CH = dados.getCh();
                         CI = dados.getCi();
                         CJ = dados.getCj();
                         CK = dados.getCk();
                         CL = dados.getCl();
                         CM = dados.getCm();
                         CN = dados.getCn();
                         CO = dados.getCo();
                         CP = dados.getCp();
                         CQ = dados.getCq();
                         CR = dados.getCr();
                         CS = dados.getCs();
                         CT = dados.getCt();
                         CU = dados.getCu();
                         CV = dados.getCv();
                         CW = dados.getCw();
                         CX = dados.getCx();
                         CY = dados.getCy();
                         CZ = dados.getCz();
                         DA = dados.getDa();
                         DB = dados.getDb();
                         DC = dados.getDc();
                         DD = dados.getDd();
                         DE = dados.getDe();
                         DF = dados.getDf();
                         DG = dados.getDg();
                         DH = dados.getDh();
                         DI = dados.getDi();
                         DJ = dados.getDj();
                         DK = dados.getDk();
                         DL = dados.getDl();
                         DM = dados.getDm();
                         DN = dados.getDn();
                         DO = dados.getDo_();
                         DP = dados.getDp();
                         DQ = dados.getDq();
                         DR = dados.getDr();
                         DS = dados.getDs();
                         DT = dados.getDt();
                         DU = dados.getDu();
                         DV = dados.getDv();
                         DW = dados.getDw();
                         DX = dados.getDx();
                         DY = dados.getDy();
                         DZ = dados.getDz();
                         EA = dados.getEa();
                         EB = dados.getEb();
                         EC =dados.getEc();
                         ED =dados.getEd();
                         EE =dados.getEe();
                         EF=dados.getEf();
                         EG=dados.getEg();
                         EH=dados.getEh();
                         EI=dados.getEi();
                         EJ=dados.getEj();
                         EK=dados.getEk();
                         EL=dados.getEl();
                         EM=dados.getEm();
                         EN=dados.getEn();
                         EO=dados.getEo();
                         EP=dados.getEp();
                         EQ=dados.getEq();
                         ER=dados.getEr();
                         ES=dados.getEs();
                         ET=dados.getEt();
                         EU=dados.getEu();
                         EV=dados.getEv();
                         EW=dados.getEw();
                         EX=dados.getEx();
                         EY=dados.getEy();
                         EZ=dados.getEz();
                         FA=dados.getFa();
                         FB=dados.getFb();
                         FC=dados.getFc();
                         FD=dados.getFd();
                         FE=dados.getFe();
                         FF=dados.getFf();
                         FG=dados.getFg();
                         FH=dados.getFh();
                         FI=dados.getFi();
                         FJ=dados.getFj();
                         FK=dados.getFk();
                         FL=dados.getFl();
                         FM=dados.getFm();
                         FN=dados.getFn();
                         FO=dados.getFo();
                         FP=dados.getFp();
                         FQ=dados.getFq();
                         FR=dados.getFr();
                         FS=dados.getFs();
                         FT=dados.getFt();
                         FU=dados.getFu();
                         FV=dados.getFv();
                         FW=dados.getFw();
                         FX=dados.getFx();
                         FY=dados.getFy();
                         FZ=dados.getFz();
                         GA=dados.getGa();
                         GB=dados.getGb();
                         GC=dados.getGc();
                         GD=dados.getGd();
                         GE=dados.getGe();
                         GF=dados.getGf();
                         GG=dados.getGg();
                         GH=dados.getGh();
                         GI=dados.getGi();
                         GJ=dados.getGj();
                         GK=dados.getGk();
                         GL=dados.getGl();
                         GM=dados.getGm();
                         GN=dados.getGn();
                         GO=dados.getGo();
                         GP=dados.getGp();
                         GQ=dados.getGq();
                         GR=dados.getGr();
                         GS=dados.getGs();
                         GT=dados.getGt();
                         GU=dados.getGu();
                         GV=dados.getGv();
                         GW=dados.getGw();
                         GX=dados.getGx();
                         GY=dados.getGy();
                         GZ=dados.getGz();
                         HA=dados.getHa();
                         HB=dados.getHb();
                         HC=dados.getHc();
                         HD=dados.getHd();
                         HE=dados.getHe();
                         HF=dados.getHf();
                         HG=dados.getHg();
                         HH=dados.getHh();
                         HI=dados.getHi();
                         HJ=dados.getHj();
                         HK=dados.getHk();
                         HL=dados.getHl();
                         HM=dados.getHm();
                         HN=dados.getHn();
                         HO=dados.getHo();
                         HP=dados.getHp();
                         HQ=dados.getHq();
                         HR=dados.getHr();
                         HS=dados.getHs();
                         HT=dados.getHt();
                         HU=dados.getHu();
                         HV=dados.getHv();
                         HW=dados.getHw();
                         HX=dados.getHx();
                         HY=dados.getHy();
                         HZ=dados.getHz();
                         IA=dados.getIa();
                         IB=dados.getIb();
                         IC=dados.getIc();
                         ID=dados.getId();
                         IE=dados.getIe();
                         IF=dados.getIf_();
                         IG=dados.getIg();
                         IH=dados.getIh();
                         II=dados.getIi();
                         IJ=dados.getIj();
                         IK=dados.getIk();
                         IL=dados.getIl();
                         IM=dados.getIm();
                         IN=dados.getIn();
                         IO=dados.getIo();
                         IP=dados.getIp();
                         IQ=dados.getIq();
                         IR=dados.getIr();
                         IS=dados.getIs();
                         IT=dados.getIt();
                         IU=dados.getIu();
                         IV=dados.getIv();
                         IW=dados.getIw();
                         IX=dados.getIx();
                         IY=dados.getIy();
                         IZ=dados.getIz();
                         JA=dados.getJa();
                         JB=dados.getJb();
                         JC=dados.getJc();
                         JD=dados.getJd();
                         JE=dados.getJe();
                         JF=dados.getJf();
                         JG=dados.getJg();
                         JH=dados.getJh();
                         JI=dados.getJi();
                         JJ=dados.getJj();
                         JK=dados.getJk();
                         JL=dados.getJl();
                         JM=dados.getJm();
                         JN=dados.getJn();
                         JO=dados.getJo();
                         JP=dados.getJp();
                         JQ=dados.getJq();
                         JR=dados.getJr();
                         JS=dados.getJs();
                         JT=dados.getJt();
                         JU=dados.getJu();
                         JV=dados.getJv();
                         JW=dados.getJw();
                         JX=dados.getJx();
                         JY=dados.getJy();
                         JZ=dados.getJz();
                         
                       
               }
               }
}
   
   
 
  }