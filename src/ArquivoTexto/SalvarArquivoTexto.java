/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArquivoTexto;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author vmbrito
 */
public class SalvarArquivoTexto {
    
    
  public static void salvar(String parametros, String arquivo) throws FileNotFoundException, IOException{
          //Fluxo de saida de um arquivo
        OutputStream os = new FileOutputStream(""+arquivo+".txt"); // nome do arquivo que será escrito
        Writer wr = new OutputStreamWriter(os); // criação de um escritor
        BufferedWriter br = new BufferedWriter(wr); // adiciono a um escritor de buffer
        
        br.write(parametros);
         br.close();
    }
    
}
