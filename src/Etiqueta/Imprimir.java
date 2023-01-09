/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Etiqueta;

/**
 *
 * @author Valdenir Brito
 */
import java.io.FileOutputStream;

import java.io.PrintStream;

public class Imprimir {

public static void main(String[] args) {

FileOutputStream fos = null;

PrintStream ps = null;
 PrintLabel prnLabel = new PrintLabel();
try{ 
fos = new FileOutputStream("USB002:");
} catch (Exception ex) {
}
try {
ps = new PrintStream(fos);
} catch (Exception exception) {
} 
 ps.println(prnLabel.printLabel("TESTE", "TESTE", "TESTE", "TESTE")); 

}
}
