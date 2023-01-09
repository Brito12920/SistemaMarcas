package Config;  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
   
  import org.apache.poi.hssf.usermodel.HSSFSheet;
  import org.apache.poi.hssf.usermodel.HSSFWorkbook;
  import org.apache.poi.ss.usermodel.Cell;
  import org.apache.poi.ss.usermodel.Row;
   
  public class EditaExcelPorta {
   
         private static final String fileName = "C:/BancoDados/zplMarcas.xls";
         
                 
      public void alteracaoExcel(String Porta){
         try {
                      FileInputStream file = new FileInputStream(new File(
                                    EditaExcelPorta.fileName));
   
                      HSSFWorkbook workbook = new HSSFWorkbook(file);
                      HSSFSheet sheetAlunos = workbook.getSheetAt(1);
   
                      for (int i = 0; i < sheetAlunos.getPhysicalNumberOfRows(); i++) {
   
                             Row row = sheetAlunos.getRow(i);
                             Cell cellPorta = row.getCell(0);    //Celula para o filtro
                             Cell cellValorPorta = row.getCell(1);    //Celula coluna 2 d 1
                               //Celula coluna 2 d 1
                             
                             try{
                             cellPorta.setCellType (1);  
                            
                             if (cellPorta.getStringCellValue().equals("1")) {
                                   
                                 cellValorPorta.setCellValue(Porta);        //comando para alterar celula
                               
                            } 
                             }catch(NullPointerException e){
                                 
                             }}
                      file.close();
   
                      FileOutputStream outFile = new FileOutputStream(new File(EditaExcelPorta.fileName));
                      workbook.write(outFile);
                      outFile.close();
                      System.out.println("Arquivo Excel editado com sucesso!");
   
               } catch (FileNotFoundException e) {
                      e.printStackTrace();
                      System.out.println("Arquivo Excel não encontrado!");
               } catch (IOException e) {
                      e.printStackTrace();
                      System.out.println("Erro na edição do arquivo!");
               }
     
      }   
  }