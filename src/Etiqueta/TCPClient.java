/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Etiqueta;

/**
 *
 * @author Valdenir Brito
 */
import java.io.*;
import java.net.*;
class TCPClient
{
     public static void main (String argv[]) throws Exception
 {
           // The line below illustrates the default port 6101 for mobile printers 9100 is the default port number
    // for desktop and tabletop printers
    Socket clientSocket=new Socket("172.28.128.1",6101);

    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream() );
           //The data being sent in the lines below illustrate CPCL  one can change the data for the corresponding 
           //language being used (ZPL, EPL)   
  
    outToServer.writeBytes("! 0 200 200 203 1" + 'n' + "CENTER" + 'n');
           outToServer.writeBytes("TEXT 0 3 10 50 JAVA TEST" + 'n' + "PRINT" + 'n');

 

    clientSocket.close();
 }
}