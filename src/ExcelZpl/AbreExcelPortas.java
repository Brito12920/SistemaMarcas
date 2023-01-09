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
   
  public class AbreExcelPortas {

private static String A;
private static String B;
private static String C;
private static String D;
private static String E;
private static String F;


    public  String getA() {
        return A;
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

    public void setE(String aE) {
        E = aE;
    }

    public  String getF() {
        return F;
    }

    public  void setF(String aF) {
        F = aF;
    }

    public void setA(String aA) {
        A = aA;
    }

    public String getB() {
        return B;
    }

    public  void setB(String aB) {
        B = aB;
    }

    public  String getC() {
        return C;
    }

    public void setC(String aC) {
        C = aC;
    }

private List<BancoExcel2> listaAlunos = new ArrayList<BancoExcel2>();

         
         
         
         private static final String fileName = "C:/bancoDados/bancoOpenSide/zplMarcas.xls";

    

    

   

   
   
         public void main(String[] args) throws IOException {
          //   buscar();
         }
public  void buscar() throws IOException{
      
   
              System.out.println("entrou");
                   try (FileInputStream arquivo = new FileInputStream(new File(
                           AbreExcelPortas.fileName))) {
                       HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
                       
                       HSSFSheet sheetAlunos = workbook.getSheet("Portas"); //primeira planilha
                       
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
                                   //    System.out.println(dados.getA());
                                      
                                       }catch(IllegalStateException e){
                                           
                                       }
                                      break;
                                  case 1:
                                       try{ 
                                       cell.setCellType (1);    
                                       dados.setB(cell.getStringCellValue()); //coluna 1 pega valor 
                                       
                                   //     System.out.println(dados.getB());
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
                          if (dados.getA().equals("1")|| dados.getA().contains("1")) {
                              
A = dados.getA();
B = dados.getB();
C = dados.getC();
D = dados.getD();
E = dados.getE();
F = dados.getF();
                        
                                   break;
                             }else{
                              
                             }
                            }catch(NullPointerException e){
                                
                            }
                      }  
               }
         
}

    public List<BancoExcel2> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<BancoExcel2> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

   
   
        
  }