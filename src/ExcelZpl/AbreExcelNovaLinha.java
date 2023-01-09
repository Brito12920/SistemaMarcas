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
   
  public class AbreExcelNovaLinha {

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
public List<BancoExcel2> listaAlunos = new ArrayList<BancoExcel2>();

         
         
         
         private static final String fileName = "C:/bancoDados/NOVA LINHA.xls";

    public static String getV() {
        return V;
    }

    public static void setV(String aV) {
        V = aV;
    }

    public static String getAV() {
        return AV;
    }

    public static void setAV(String aAV) {
        AV = aAV;
    }

    public static String getBV() {
        return BV;
    }

    public static void setBV(String aBV) {
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
public  void buscar(String sap) throws IOException{
      
   
              System.out.println("entrou");
                   try (FileInputStream arquivo = new FileInputStream(new File(
                           AbreExcelNovaLinha.fileName))) {
                       HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
                       
                       HSSFSheet sheetAlunos = workbook.getSheetAt(0); //primeira planilha
                       
                       Iterator<Row> rowIterator = sheetAlunos.iterator();
                       
                       while (rowIterator.hasNext()) {                         //ler a linhas
                           Row row = rowIterator.next();
                           Iterator<Cell> cellIterator = row.cellIterator();
                           
                           BancoExcel2 dados = new BancoExcel2();
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
                           
                       }
                   }
                       }
               } catch (FileNotFoundException e) {
                      System.out.println("Arquivo Excel não encontrado!");
               }
   
               if (listaAlunos.isEmpty()) {
                      System.out.println("Nenhum Ativo encontrado!");
               } else {
                 for (BancoExcel2 dados : listaAlunos) {
 
                     try{
                              
                             if (dados.getA().equals(sap)) {

                     

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
    //    break;
                             }else{
                              
                             }
                            }catch(NullPointerException e){
                            //    System.out.println(e);
                            }
                      }  
}

}   
   
        
  }