/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

/**
 *
 * @author v103760
 */
public class TamanhoStr {
   
private int col2d1;
private int col2d2;
private int colMaideBrasil;
private int colBarras;
private int coluna1d;
private  int coluna2d; ;
private  int colunaMade;
private  int colunaBarras;

public void VerTamanho(String descricao,String coluna2d1,String coluna2d2,String colunaMadeBrasil,String valorString,String barraString){
 
 try{
     try{
 int tamanho = descricao.length();
 int valorMin = Integer.parseInt(valorString);
     
  coluna1d = Integer.parseInt(coluna2d1);
  coluna2d = Integer.parseInt(coluna2d2);
  colunaMade = Integer.parseInt(colunaMadeBrasil);
  colunaBarras = Integer.parseInt(barraString);
    
            switch(tamanho){
            
               case 2:
                              
               if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }      
                caso2(2);                      
                
                break;     
               case 3:
                
               if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;  
                 colunaBarras += total2;
               }      
               caso3(3)  ; 
               break;
               case 4:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;  
                 colunaBarras += total2;
               }      
               caso4(4) ;
               break;
               case 5:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d = total2;
                 coluna2d = total2;
                 colunaMade = total2; 
                 colunaBarras += total2;
               }       
               caso5(5)  ; 
               break;
               case 6:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }          
               caso6(6)  ;   
               break;
               case 7:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }         
               caso7(7)  ;   
               break;
               case 8:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }         
               caso8(8)  ;   
               break;
               case 9:
                 if(valorMin < tamanho){
                 int total = tamanho - valorMin;
                 int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }         
              caso9(9)  ;  
               break;
               case 10:
                  if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso10(10)  ;   
               break;
               case 11:
                 if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso11(11)  ;   
               break;
               case 12:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso12(12)  ;   
               break;
               
                case 13:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso13(13)  ;   
               break;
                case 14:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso14(14)  ;   
               break;
                case 15:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso15(15)  ;   
               break;
                case 16:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso16(16)  ;   
               break;
                case 17:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso17(17)  ;   
               break;
                case 18:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso18(18)  ;   
               break;
               
                case 19:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso19(19)  ;   
               break;
               
                case 20:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso20(20)  ;   
               break;
               
                case 21:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso21(21)  ;   
               break;
               
                case 22:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso22(22)  ;   
               break;
               
                case 23:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso23(23)  ;   
               break;
               
                case 24:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso24(24)  ;   
               break;
               
                case 25:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso25(25)  ;   
               break;
               
                case 26:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso26(26)  ;   
               break;
               
                case 27:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso27(27)  ;   
               break;
               
                case 29:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;  
                 colunaBarras += total2;
               }       
               caso29(29)  ;   
               break;
               
                case 30:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;  
                 colunaBarras += total2;
               }       
               caso30(30)  ;   
               break;
               
               case 31:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;
                 colunaBarras += total2;
               }       
               caso31(31)  ;   
               break;
               
               case 32:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
              
               caso32(32)  ;   
               break;
              
               case 33:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso33(33)  ;   
               break;
               
                case 34:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso34(34)  ;   
               break;
               
               case 35:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso35(35)  ;   
               break;   
              
                case 36:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso36(36)  ;   
               break;
               
                case 37:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso37(37)  ;   
               break;
               
                case 38:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso38(38)  ;   
               break;
               
                case 39:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2; 
                 colunaBarras += total2;
               }       
               caso39(39)  ;   
               break;
               
                case 40:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;  
                 colunaBarras += total2;
               }       
               caso40(40)  ;   
               break;
               
                case 41:
                if(valorMin < tamanho){
                int total = tamanho - valorMin;
                int total2 = total*30;
                      
                 coluna1d += total2;
                 coluna2d += total2;
                 colunaMade += total2;  
                 colunaBarras += total2;
               }       
               caso41(41)  ;   
               break;
               
           }
        }catch(NullPointerException e){
         
     }
         }catch(NumberFormatException  e){
     
 }  
 
     
 
}

    public int getCol2d1() {
        return col2d1;
    }

    public int getCol2d2() {
        return col2d2;
    }

    public int getColMaideBrasil() {
        return colMaideBrasil;
    }
    
  public void caso2(int tamanho){
   
     switch(tamanho){
               
               case 2:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 3:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30; 
               colBarras+=30;
               break;
               case 4:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;  
              
               break;
               case 5:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;
               
               break;
               case 6:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;
              
               break;
               case 7:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150; 
               
               break;
               case 8:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180; 
               
               break;
               case 9:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;  
               
               break;
               case 10:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;  
              
               break;
               case 11:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270; 
              
               break;
               case 12:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300; 
               
               break;
               
    } 
 }  
 public void caso3(int tamanho){
   
     switch(tamanho){
               
               case 3:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 4:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;  
               colBarras+=30;
               break;
               case 5:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   
               colBarras+=60;
               break;
               case 6:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90; 
              
               break;
               case 7:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120; 
              
               break;
               case 8:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;  
               
               break;
               case 9:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180; 
              
               break;
               case 10:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;
              
               break;
               case 11:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;   
              
               break;
               case 12:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;  
               
               break;
               case 13:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300; 
              
               break;
               
           }    
 }
 public void caso4(int tamanho){
   
     switch(tamanho){
               
               case 4:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 5:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30; 
               colBarras+=30;
               break;
               case 6:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 7:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 8:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 9:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 10:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 11:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 12:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 13:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 14:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
 }
 public void caso5(int tamanho){
   
     switch(tamanho){
               
               case 5:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 6:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 7:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 8:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 9:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 10:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 11:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 12:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 13:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 14:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 15:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
 }
public void caso6(int tamanho){
   
     switch(tamanho){
               
               case 6:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 7:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 8:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 9:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 10:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 11:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 12:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 13:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 14:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 15:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 16:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           }  
}
public void caso7(int tamanho){
   
     switch(tamanho){
               
               case 7:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 8:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 9:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 10:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 11:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 12:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 13:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 14:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 15:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 16:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 17:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso8(int tamanho){
   
     switch(tamanho){
               
               case 8:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 9:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;                  
               break;
               case 10:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 11:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 12:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 13:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 14:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 15:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 16:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 17:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 18:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso9(int tamanho){
   
     switch(tamanho){
               
               case 9:
               col2d1=coluna1d;
               col2d2=coluna2d;
               colMaideBrasil=colunaMade;
               colBarras=colunaBarras;
               break;     
               case 10:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;       
               break;
               case 11:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 12:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 13:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 14:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 15:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 16:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 17:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 18:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 19:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso10(int tamanho){
   
     switch(tamanho){
               
               case 10:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 11:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;   
               break;
               case 12:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 13:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 14:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 15:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 16:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 17:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 18:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 19:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 20:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso11(int tamanho){
   
     switch(tamanho){
               
               case 11:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 12:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;       
               break;
               case 13:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 14:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 15:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 16:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 17:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 18:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 19:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 20:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 21:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso12(int tamanho){
   
     switch(tamanho){
               
               case 12:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 13:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 14:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 15:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 16:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 17:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 18:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 19:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 20:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 21:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 22:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso13(int tamanho){
   
     switch(tamanho){
               
               case 13:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 14:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 15:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 16:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 17:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 18:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 19:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 20:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 21:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 22:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 23:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso14(int tamanho){
   
     switch(tamanho){
               
               case 14:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 15:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   
               colBarras+=30;    
               break;
               case 16:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 17:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 18:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 19:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 20:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 21:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 22:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 23:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 24:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso15(int tamanho){
   
     switch(tamanho){
               
               case 15:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 16:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;  
               colBarras+=30;    
               break;
               case 17:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 18:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 19:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 20:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 21:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 22:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 23:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 24:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 25:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso16(int tamanho){
   
     switch(tamanho){
               
               case 16:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 17:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 18:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;  
               break;
               case 19:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 20:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 21:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 22:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 23:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 24:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 25:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 26:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso17(int tamanho){
   
     switch(tamanho){
               
               case 17:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 18:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 19:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;   
               break;
               case 20:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 21:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 22:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 23:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 24:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 25:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 26:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 27:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso18(int tamanho){
   
     switch(tamanho){
               
               case 18:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 19:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 20:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 21:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 22:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 23:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 24:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 25:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 26:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 27:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 28:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
}
public void caso19(int tamanho){
   
     switch(tamanho){
               
               case 19:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 20:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 21:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 22:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 23:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 24:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 25:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 26:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 27:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 28:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 29:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso20(int tamanho){
   
     switch(tamanho){
               
              case 20:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 21:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 22:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 23:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 24:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 25:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 26:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 27:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 28:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 29:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 30:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso21(int tamanho){
   
     switch(tamanho){
               
               case 21:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 22:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 23:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 24:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 25:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 26:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 27:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 28:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 29:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 30:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 31:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso22(int tamanho){
   
     switch(tamanho){
               
               case 22:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 21:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 23:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 24:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 25:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 26:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 27:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 28:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 29:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 30:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 31:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso23(int tamanho){
   
     switch(tamanho){
               
               case 23:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 24:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;   colBarras+=30;    
               break;
               case 25:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 26:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 27:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 28:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 29:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 30:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 31:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 32:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 33:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso24(int tamanho){
   
     switch(tamanho){
               
               case 24:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 25:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 26:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 27:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 28:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 29:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 30:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 31:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 32:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 33:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 34:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso25(int tamanho){
   
     switch(tamanho){
               
               case 25:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 26:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 27:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 28:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 29:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 30:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 31:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 32:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 33:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 34:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 35:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso26(int tamanho){
   
     switch(tamanho){
               
               case 26:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 27:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 28:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 29:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 30:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 31:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 32:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 33:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 34:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 35:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 36:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso27(int tamanho){
   
     switch(tamanho){
               
               case 27:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 28:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 29:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 30:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 31:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 32:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 33:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 34:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 35:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 36:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 37:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso28(int tamanho){
   
     switch(tamanho){
               
               case 28:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 29:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 30:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 31:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 32:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 33:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 34:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 35:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 36:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 37:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 38:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso29(int tamanho){
   
     switch(tamanho){
               
               case 29:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 30:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 31:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 32:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 33:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 34:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 35:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 36:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 37:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 38:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 39:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso30(int tamanho){
   
     switch(tamanho){
               
               case 30:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 31:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 32:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 33:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 34:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 35:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 36:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 37:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 38:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 39:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 40:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso31(int tamanho){
   
     switch(tamanho){
               
               case 31:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 32:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 33:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 34:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 35:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 36:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 37:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 38:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 39:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 40:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 41:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso32(int tamanho){
   
     switch(tamanho){
               
               case 32:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 33:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 34:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 35:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 36:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 37:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 38:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 39:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 40:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 41:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 42:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso33(int tamanho){
   
     switch(tamanho){
               
               case 33:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 34:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 35:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 36:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 37:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 38:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 39:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 40:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 41:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 42:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 43:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso34(int tamanho){
   
     switch(tamanho){
               
               case 34:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 35:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 36:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 37:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 38:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 39:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 40:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 41:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 42:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 43:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 44:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso35(int tamanho){
   
     switch(tamanho){
               
               case 35:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 36:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 37:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 38:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 39:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 40:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 41:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 42:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 43:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 44:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 45:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso36(int tamanho){
   
     switch(tamanho){
               
               case 36:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 37:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 38:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 39:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 40:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 41:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 42:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 43:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 44:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 45:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 46:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso37(int tamanho){
   
     switch(tamanho){
               
               case 37:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 38:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 39:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 40:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 41:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 42:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 43:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 44:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 45:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 46:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 47:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso38(int tamanho){
   
     switch(tamanho){
               
               case 38:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 39:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 40:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 41:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 42:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 43:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 44:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 45:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 46:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 47:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 48:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso39(int tamanho){
   
     switch(tamanho){
               
               case 39:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 40:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 41:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 42:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 43:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 44:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 45:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 46:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 47:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 48:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 49:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso40(int tamanho){
   
     switch(tamanho){
               
               case 40:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 41:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 42:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 43:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 44:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 45:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 46:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 47:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 48:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 49:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 50:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 
public void caso41(int tamanho){
   
     switch(tamanho){
               
               case 41:
                 col2d1=coluna1d;
                 col2d2=coluna2d;
                 colMaideBrasil=colunaMade;
                 colBarras=colunaBarras;
               break;     
               case 42:
               col2d1+=30;
               col2d2+=30;
               colMaideBrasil+=30;    
               break;
               case 43:
               col2d1+=60;
               col2d2+=60;
               colMaideBrasil+=60;   colBarras+=60;    
               break;
               case 44:
               col2d1+=90;
               col2d2+=90;
               colMaideBrasil+=90;   colBarras+=90;    
               break;
               case 45:
               col2d1+=120;
               col2d2+=120;
               colMaideBrasil+=120;   colBarras+=120;    
               break;
               case 46:
               col2d1+=150;
               col2d2+=150;
               colMaideBrasil+=150;   colBarras+=150;    
               break;
               case 47:
               col2d1+=180;
               col2d2+=180;
               colMaideBrasil+=180;   colBarras+=180;    
               break;
               case 48:
               col2d1+=210;
               col2d2+=210;
               colMaideBrasil+=210;   colBarras+=210;    
               break;
               case 49:
               col2d1+=240;
               col2d2+=240;
               colMaideBrasil+=240;   colBarras+=240;    
               break;
               case 50:
               col2d1+=270;
               col2d2+=270;
               colMaideBrasil+=270;   colBarras+=270;    
               break;
               case 51:
               col2d1+=300;
               col2d2+=300;
               colMaideBrasil+=300;   colBarras+=300;    
               break;
               
           } 
} 

    public int getColBarras() {
        return colBarras;
    }
}

