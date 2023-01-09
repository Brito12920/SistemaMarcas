/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArquivoTexto;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vmbrito
 */
public class ReadTexto {
    
    
    public static String lerArquivo(String arquivo) throws FileNotFoundException, IOException{
      
        try{
        FileInputStream stream = new FileInputStream(""+arquivo+".txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
                
        return linha;
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Não existe parametros para este logo");
        }
        
        return "";
    }
    
    
    public static String lerZpl(String arquivo) throws FileNotFoundException, IOException{
     Path path = Paths.get(""+arquivo+".txt");

        List<String> linhasArquivo = Files.readAllLines(path);
        for (String linha : linhasArquivo) {
            System.out.println( linha );
        }
        String linha = null;
        
        return linha;
    }
}
