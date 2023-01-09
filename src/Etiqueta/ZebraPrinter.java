/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Etiqueta;

/**
 *
 * @author Valdenir Brito
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
 
 
public class ZebraPrinter {
 
    public static void main(String[] args) throws UnknownHostException, IOException {
 
        // used variables
        Socket clientSocket;
        DataOutputStream outToServer;
 
        // open connection
        clientSocket = new Socket("172.28.128.1", 9100);
 
        // open data output stream
        outToServer = new DataOutputStream(clientSocket.getOutputStream());
 
        // send data to printer
   //     outToServer.writeBytes(FileUtils.readFileToString(new File("/home/felix/label.zpl"), "UTF-8"));
 
        // close data stream and socket
        outToServer.close();
        clientSocket.close();
 
    }
 
}
