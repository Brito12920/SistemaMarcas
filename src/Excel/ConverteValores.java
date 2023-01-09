/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excel;


import static java.lang.Double.parseDouble;
import static java.lang.Math.round;
import java.text.DecimalFormat;

/**
 *
 * @author v103760
 */
public class ConverteValores {
   static DecimalFormat df = new DecimalFormat("#0.00");
   static DecimalFormat df2 = new DecimalFormat("#0.000");    
     public static String convertDouble(String val){
   try{ 
   double circ = parseDouble(val);   
   Long L = round(circ);
   int i = L.intValue();
   int valor = i; 

   VariaveisMilling.setValorRetorn(""+valor);
    }catch(NumberFormatException | NullPointerException e){
             VariaveisMilling.setValorRetorn(val);
               }
   return VariaveisMilling.getValorRetorn();
 }  

    /**
     *
     * @param val
     * @return
     */
    public static String casaDec(String val){
     try{ 
   double circ = parseDouble(val);   
   
    VariaveisMilling.setValorRetorn(""+df.format(circ));
    }catch(NumberFormatException | NullPointerException e){
             VariaveisMilling.setValorRetorn(val);
               }
   return VariaveisMilling.getValorRetorn(); 
 } 
  public static String casaDec2(String val){
     try{ 
   double circ = parseDouble(val);   
   
  VariaveisMilling.setValorRetorn(""+df2.format(circ));
    }catch(NumberFormatException | NullPointerException e){
             VariaveisMilling.setValorRetorn(val);
               }
   return VariaveisMilling.getValorRetorn(); 
 } 
}
