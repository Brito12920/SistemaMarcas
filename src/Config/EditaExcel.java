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
   
  public class EditaExcel {
   
         private static final String fileName = "C:/BancoDados/zplMarcas.xls";
         
                 
      public void alteracaoExcel(String marca,String zpl,String quant,String cod2d1,String cod2d2,String madeBrazil){
         try {
                      FileInputStream file = new FileInputStream(new File(
                                    EditaExcel.fileName));
   
                      HSSFWorkbook workbook = new HSSFWorkbook(file);
                      HSSFSheet sheetAlunos = workbook.getSheetAt(0);
   
                      for (int i = 0; i < sheetAlunos.getPhysicalNumberOfRows(); i++) {
   
                             Row row = sheetAlunos.getRow(i);
                             Cell cellMarca = row.getCell(0);    //Celula para o filtro
                             Cell cellCodigoZpl = row.getCell(1);    //Celula coluna 2 d 1
                             Cell cellQuant = row.getCell(2);    //Celula quantida de strings a ser alterada
                             Cell cellColuna2d1 = row.getCell(3);    //Celula coluna 2 d 1
                             Cell cellColuna2d2 = row.getCell(4);    //Celula coluna 2 d 2
                             Cell cellColunaMadeIn = row.getCell(5);    //Celula coluna 2 d 1
                             
                             try{
                             cellMarca.setCellType (1);  
                             System.out.println(cellMarca.getStringCellValue());
                             if (cellMarca.getStringCellValue().equals(marca)) {
                                   
                                 cellCodigoZpl.setCellValue(zpl);        //comando para alterar celula
                                 cellQuant.setCellValue(quant);
                                 cellColuna2d1.setCellValue(cod2d1);
                                 cellColuna2d2.setCellValue(cod2d2);
                                 cellColunaMadeIn.setCellValue(madeBrazil);
                            } 
                             }catch(NullPointerException e){
                                 
                             }}
                      file.close();
   
                      FileOutputStream outFile = new FileOutputStream(new File(EditaExcel.fileName));
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