
package Etiqueta;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Valdenir Brito
 */
public class TestLabelPrinter {

    /**
     * @param args
     */
    public static void printLabel(String label, String company, String docDate)  {
        try {
            FileOutputStream os = new FileOutputStream("\\\\192.168.42.57\\zd");
            PrintStream ps = new PrintStream(os); 
            String commands = "^XA" +
                              "^LH30,30" +
                              "^F020,10^AD^FDZEBRA^FS" + 
                              "F020,60^B3^FDAAA001^FS" + 
                              "^XZ";     

            ps.println(commands);
            ps.print("\f");
            ps.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        printLabel("label 12345", "Company name", "2013-05-10 12:45");
        System.out.println("Successful..");
    }
}