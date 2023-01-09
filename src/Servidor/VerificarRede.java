/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidor;

import Variaveis.VariaveisMilling;
import static java.net.InetAddress.getByName;

/**
 *
 * @author v103760
 */
public class VerificarRede {
    public static void PingServidor(){
    //verificação do servidos
     String  hostStatus;
       String host = "VHDB001";

        try {
         //   System.out.println((InetAddress.getByName(host).isReachable(10000)) ? "Host On" : "Host Off");
            
            hostStatus = ((getByName(host).isReachable(10000)) ? "On-line" : "Off-line");
           
                         
          
            if(hostStatus.contains("On-line")){
                
                VariaveisMilling.setRede(true);
            }else{
                VariaveisMilling.setRede(false);
                
            }
            
        } catch (Exception e) {
        //    System.out.println("Erro ao verificar o host " + host);
        }
}
}
