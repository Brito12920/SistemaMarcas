/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CutRev;

import ExcelZpl.AbreExcelZPL;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author v103760
 */
public class Marca1 {
   private String marca1,marca3,marca7,marca15,marca17,marca19,marca21,marca23,marca25,marca27,marca29,marca31,marca33,marca35,marca37,marca39;

    private String  AlinhamenedoEsq,
                    EspacamentoLinha,
                    Logo,
                    colunaLogo,
                    AlturaLogo,
                    colunaDescricao,
                    alturadescricao,
                    LarguraDescricao,
                    TamanhoDescricao,                   
                    text1,
                    text2,
                    text3,
                    text4,
                    text5,
                    text6,
                    text7,
                    text8,
                    text9,
                    text10,
                    colunaText1,
                    colunaText2,
                    colunaText3,
                    colunaText4,       
                    colunaText5,
                    colunaText6,
                    colunaText7,
                    colunaText8,
                    colunaText9,
                    colunaText10,
                    alturaText1,
                    alturaText2,
                    alturaText3,
                    alturaText4,
                    alturaText5,
                    alturaText6,
                    alturaText7,
                    alturaText8,
                    alturaText9,
                    alturaText10,
                    LarguraText1,
                    LarguraText2,
                    LarguraText3,
                    LarguraText4,
                    LarguraText5,
                    LarguraText6,
                    LarguraText7,
                    LarguraText8,
                    LarguraText9,
                    LarguraText10,
                    TamanhoText1,
                    TamanhoText2,
                    TamanhoText3,
                    TamanhoText4,
                    TamanhoText5,
                    TamanhoText6,
                    TamanhoText7,
                    TamanhoText8,
                    TamanhoText9,
                    TamanhoText10,
                    DoisDColuna1,
                    DoisDColuna2,
                    doisDAltura1,
                    doisDAltura2,
                    colunaMadeIn,
                    alturaMadeIn,
                    colunaBrazil,
                    alturaBrazil,
                    LarguraMadeIn,
                    TamMadeIn;
   
   
   
    public String getMarca3() {
        return marca3;
    }

    public String getMarca7() {
        return marca7;
    }
   private int col,col2d1,col2d2,colMaideBrasil,codBarras;
    
    private BuscaConfig bus = new BuscaConfig();
     
    AbreExcelZPL ab = new AbreExcelZPL();
  public void modelo1(int quant,String desc,String ean13,String marca){
    
  
           
    
    
   marca1 = "^XA^PMY\n" +
           "^MMT\n" +
           "^PW1750\n" +
           "^LL0108\n" +
           "^LS0\n" +
           "\n" +
           "^FO0,10^GFA,04992,04992,00052,:Z64:\n" +
           "eJztljFy5CAQRVEpYDP2BhxF19pMuBxs6CP4KFa211C2KZlVZRXt/o00Aw12TeRIbY+MR3weXzSNjLniiiuu+PlwO19G+rYPLep/CsZMFFnNLUuBOJ4oTvwHl4Qbm+HfkdYsGQndiZhmeTjL3TkGiv7Q7BiRzBy564FzJCPwt9xcwMqcFZw1c7gVpNeh8eBYfNvjeHAGUpwZHBmTGfHUPJd+7I2z3jRRNOgfu36s4oC7YcJ8dfJp/XjlZxACumG8vevHKw6e2AYhj+dk7u36TMoP5hpFQ9xOXT+z4jjax22kxLLAS9X4SZIpy1T6wfONeGAzOPgEM2FJojT9LhrjSo7nOf5xfJmEE0ST+HbWgDNiyqUfzzd+W0mahTmL4nCT25sZSg4Pb34hoVnDnNXlwQdJi5PDSVz68UlgktSW5tjxM8iUSk4SGEZbkeL25JR+oCn8YMLC4dEsTVvHTx6+5OwHbADnbXOn5vDD6Ny18DMLZz84ftd+ZLpLzn86Neng8NNx9Jr0+tw0kl7rnZNXgZ+ZI+2ny9lKPy/80/iB9uA0fphj6e8jfu7Pjf08Z03qzE378engDPTvAT/1+jzR/y/XR2kyh/PN3DV3P2PDqfIt0Htv/+h8ozKvzfzey7eo8q3aP2H6eGT/YJ+6c59i/p39o/ZpXQ9C1tT7Z9D1oK47KD2Nn6bu1PVNSk+1Pr36VtfRhiP1TddRqdfjWa/DSM3+aev1WJ0LOCZ0vu2i+fr8CUb76Z0/hspzDnPX+bbjmP7mPA1ZU+2fznnqy3M755L205zb5/tBMoeB1k/zfmDL95Ccf9oP5l9xzvedNXNcZ32a95281PJeZWUbtX6wh2vOFVdcccUVPxufaK12yg==:5AF6\n" +
           "\n" +
           "\n" +
           "^FT412,82^A0N,65,76^FH\\^FD"+desc+"^FS\n" +
           "\n" +
           "^FO650,82^BXN,5,200,,,,\n" +
           "^FD2121212121212^FS\n" +
           "^FO750,82^BXN,5,200,,,,\n" +
           "^FD2121212121212^FS\n" +
           "\n" +
           "\n" +
          "^FT800,57^A0N,27,31^FH\\^FDMADE IN^FS\n" +
          "^FT800,90^A0N,27,31^FH\\^FDBRAZIL^FS\n" +
           "^PQ"+quant+",0,0,Y^XZ ";
    
}

public void modelo7(int quant,String desc,String ean13,String marca){
    
      try {
    buscar(marca);  
  
    col2d1=970;
    col2d2=1060;
    colMaideBrasil= 1172;
    
    col = desc.length();
    
    switch(col){
       
        case 15:
           col2d1=970;
           col2d2=1060;
           colMaideBrasil= 1172;
        break;
        case 16:
           col2d1+=30;
           col2d2+=30;
           colMaideBrasil+=30;
        break;
        case 17:
           col2d1+=60;
           col2d2+=60;
           colMaideBrasil+=60; 
        break;
        case 18:
           col2d1+=90;
           col2d2+=90;
           colMaideBrasil+=90;
        break;
        case 19:
           col2d1+=120;
           col2d2+=120;
           colMaideBrasil+=120;
        break;
        case 20:
           col2d1+=150;
           col2d2+=150;
           colMaideBrasil+=150;
        break;
        case 21:
           col2d1+=180;
           col2d2+=180;
           colMaideBrasil+=180;
        break;
        default:
           col2d1=970;
           col2d2=1060;
           colMaideBrasil= 1172; 
           
    }
    
      
           ab.buscar("Rev7");
            marca7 = ""+ab.getB()+"";
           } catch (IOException ex) {
           Logger.getLogger(Marca1.class.getName()).log(Level.SEVERE, null, ex);
       }
  
    }   
    public String getMarca() {
        return marca7;
    }  

   public void modelo3(int quant,String desc,String ean13){
    
   
    col2d1=970;
    col2d2=1060;
    colMaideBrasil= 1157;
    
    col = desc.length();
    
    switch(col){
       
        case 15:
           col2d1=970;
           col2d2=1060;
           colMaideBrasil= 1157;
        break;
        case 16:
           col2d1+=30;
           col2d2+=30;
           colMaideBrasil+=30;
        break;
        case 17:
           col2d1+=60;
           col2d2+=60;
           colMaideBrasil+=60; 
        break;
        case 18:
           col2d1+=90;
           col2d2+=90;
           colMaideBrasil+=90;
        break;
        case 19:
           col2d1+=120;
           col2d2+=120;
           colMaideBrasil+=120;
        break;
        case 20:
           col2d1+=150;
           col2d2+=150;
           colMaideBrasil+=150;
        break;
        case 21:
           col2d1+=180;
           col2d2+=180;
           colMaideBrasil+=180;
        break;
        default:
           col2d1=970;
           col2d2=1060;
           colMaideBrasil= 1157; 
           
    }
    
    
   marca3 = "^XA^PMY\n" +
            "^MMT\n" +
            "^PW1735\n" +
            "^LL0108\n" +
            "^LS0\n" +
            "^FO320,0^GFA,09216,09216,00048,:Z64:\n" +
            "eJztlMGt2zAMhmn4AT56BC1SPOfQoXoIbG3SVQR0EXUD9eaDEPYnJSdOHCUZgB8QxIk/UCIlksgwDMMwDMMwDGPgODBnR9QlxsPEnJrykqjnOEL7hv+v6XcXBF7hR8QP8Nervxz8Ca8y0fjo93/hr/BjFfE9hJuPMHg1cnCn0+kMPxKyOONH3YT4nkhCIbZL1HGA72HRL/wZJNT5tulQ/LnhD+qvh2Q3P6rv2GNB0cYgSx/9Le2IWnr4YlFSf6au6YPq/5Czgu+x+a59WHUZlhRFcx/5JVepHdLOUtRP/P5D3+FiSElEmyTrF37P8HPxy7lj8/LwjMlTj9iT+L7433f+gM9WOKy54J/NHzmJNqvPqLEw7ny85Oqv6kfUHsXs5frt/PP1YNRH7EV8t/Md832SUQ+GEHvcfF9CZLmhzj8potcGUz+VXOWKZnlyzXJqg/HOT/VGv6Db+chsfOeXdbz2nPhe7/Yrvn6qP6uPxOY3voyHEr+2e3MX23jQ9oU2tP0X7Z5vVrwfD9d2F389+tJCNbUhPRkPw8N4kPEjlygX/348rMfxIL7b+WE3HqgxHr6Krw0QUEtP04UwYWUy/1aft/v8iPpUfZnMWsy+6VNpmCXv/Kx+Sy/LZILyh/mis/atbxiGYRiGYRiGYRiGYSj/AU0VRG0=:8C20\n" +
            "^FO0,32^GFA,05120,05120,00040,:Z64:\n" +
            "eJztlD9r20AYxt/LHyvIIXIgbUMcqjV4CBlLHKoU8gU6ZC50TIfS2RSd4qHd0rFb3ASKkY3rUVgmlQk0Q6FfIQkdCplUujjk4rfvnSVLTqHJ1KV6ML6T/PDod8+dBZApU6ZMmf6JZlLze0+HI+uPe9g2wMPU9edLrsZJb9w3OQDQk0sNMRhOxLhPQwAruVx33ZocZ3PNVJZ8hAvwIrllIyqw5XSe8qH6xLrqgvJtsBSfJn0dgK98tCqiW5aTMTpT/m7TOLoz4XLISX8z7StFfMWxVU0UoKCJghQwgMIC2O9YAcbWmz+CAZQPvby/55UPj6Doad2K43vGEfHdX09IxDQG1o+BgafC/IVgC03YPRQmTeFlst6leq4VzB20WHOinjtowM4qa7pnJV76BC345o7Wa/XN475xiUxMCu2aBtPB/dDmr5Ejm4+2ilRul6te3vNZd9LTvIrTLTqdYrvMzyqc+ivXRtsRWo4wQlvlhbYjzN7ApDGwAxsKVhj7dmolp6nXdhzJ1y7t1vVeXW9Tf0uBCzN6a5QX2GxgyCCZZ1UpT1AeBzNAWDRHC67wK6eTr5Ud4jMka7Hn5YkPikEHZgw/9mGADBWfJvlOhHkucfn0M+Kj3W9HPpc3oKFLyIhv6YPiMy6Ij/Db8XHpDfMivjeI54rPpgdJ/LUoz+c++BGfRnw+niu+juSjAtf+4FP9nVxvPxEq3pR88Dj2uUED3Li/GvEBq+ty1BWfvnIjL+YTwCQf9aj4zMWEb6y/LjDJV+0O+bT3qf0QSX/HMs8Y5km+V1Pp/Z2rrcb9ufRPof52m3OB3NvnN8/LkM+uIuul+NiX5PwV6fyN+uN+w1F8UX9vU+f5JEz6CxBlvNVDW/HFy4VSPffxjArjruqPXzRUf9wd7u+j2GcKhmAJO8RTNIUVmkLDfUm438ef86TIl+/ACj2clrOHlrD6hqfhHh3c8l4fvyOJD33yfZCbgq3NhSmpzemAvremN5engO6SorwJN4BZuF0MQ9i4gw98D/q3u9T7NLiLT3eTl8jf9ADxdpOUdae4TJkyZcqUKdN/ot8msMC5:FCBC\n" +
            "\n" +
            "^FT"+colMaideBrasil+",71^A0N,25,26^FH\\^FDMADE IN^FS\n" +
            "^FT"+colMaideBrasil+",102^A0N,25,26^FH\\^FDBRAZIL^FS\n" +
            "^FT717,107^A0N,37,40^FH\\^FDAUTO V^FS\n" +
            "^FT717,50^A0N,37,40^FH\\^FDAUTO V^FS\n" +
            "^FT874,102^A0N,58,55^FH\\^FD"+desc+"^FS\n" +
            "^PQ"+desc+",0,1,Y^XZ";
    } 

    public void modelo15(int quant,String desc,String ean13){
    
   
    col2d1=750;
    col2d2=850;
    colMaideBrasil= 980;
    codBarras=1140;
    
    col = desc.length();
    
    switch(col){
       
        case 4:
           col2d1=750;
           col2d2=850;
           colMaideBrasil= 980;
           codBarras=1140;
        break;
        case 5:
           col2d1+=30;
           col2d2+=30;
           colMaideBrasil+=30;
           codBarras+=30;
        break;
        case 6:
           col2d1+=60;
           col2d2+=60;
           colMaideBrasil+=60; 
           codBarras+=60;
        break;
        case 7:
           col2d1+=90;
           col2d2+=90;
           colMaideBrasil+=90;
           codBarras+=90;
        break;
        case 8:
           col2d1+=120;
           col2d2+=120;
           colMaideBrasil+=120;
           codBarras+=120;
        break;
        case 9:
           col2d1+=150;
           col2d2+=150;
           colMaideBrasil+=150;
           codBarras+=150;
        break;
        case 10:
           col2d1+=180;
           col2d2+=180;
           colMaideBrasil+=180;
           codBarras+=180;
        break;
        default:
           col2d1=750;
           col2d2=850;
           colMaideBrasil= 980;
           codBarras=1140;
           
    }
    
    
   marca15 = "^XA^PMY\n" +
             "^MMT\n" +
             "^PW1750\n" +
             "^LL0108\n" +
             "^LS0\n" +
             "\n" +
             "^FO328,20^GFA,00256,00256,00008,:Z64:\n" +
             "eJxjYCAZMP6D0OzHD4BpPoYHYFqCoQBMG/8zANPJ/"
           + "yUgNLMMmD7MzINKs0Ppf1D6Pw9WdclwGmKeMfMGMG0BtQ9mP/"
           + "v9BhT3EQUAYjUU6w==:12CB\n" +
             "^FO328,75^GFA,00256,00256,00008,:Z64:\n" +
             "eJxjYCAZMP6D0OzHD4BpPoYHYFqCoQBMG/8zANPJ/"
           + "yUgNLMMmD7MzINKs0Ppf1D6Pw9WdclwGmKeMfMGMG0BtQ9mP/"
           + "v9BhT3EQUAYjUU6w==:12CB\n" +
             "\n" +
             "^FT63,105^A0N,42,47^FH\\^FDTORQUE-^FS\n" +
             "^FT260,105^A0N,42,40^FH\\^FDFLEX^FS\n" +
             "\n" +
             "^FT63,50^A0N,42,47^FH\\^FDTORQUE-^FS\n" +
             "^FT260,50^A0N,42,40^FH\\^FDFLEX^FS\n" +
             "\n" +
             "^FO"+col2d1+",20^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FO"+col2d2+",40^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FT406,105^A0N,62,68^FH\\^FD"+desc+"^FS\n" +
             "^FT"+colMaideBrasil+",71^A0N,25,26^FH\\^FDMADE IN^FS\n" +
             "^FT"+colMaideBrasil+",102^A0N,25,26^FH\\^FDBRAZIL^FS\n" +
             "^FO1100,00\n" +
             "^GB480,20,200^FS\n" +
             "^FR\n" +
             "^FO"+codBarras+",00^BY4,^BEN,300,N,N^FD"+ean13+"^FS\n" +
             "^FS\n" +
             "^PQ"+quant+",0,1,Y^XZ";
    }  
    
    
    public void modelo17(int quant,String desc,String ean13){
    
   
    col2d1=770;
    col2d2=870;
    colMaideBrasil= 980;
    codBarras=1140;
    
    col = desc.length();
    
    switch(col){
       
        case 4:
          col2d1=770;
          col2d2=870;
          colMaideBrasil= 980;
          codBarras=1140;
        break;
        case 5:
           col2d1+=30;
           col2d2+=30;
           colMaideBrasil+=30;
           codBarras+=30;
        break;
        case 6:
           col2d1+=60;
           col2d2+=60;
           colMaideBrasil+=60; 
           codBarras+=60;
        break;
        case 7:
           col2d1+=90;
           col2d2+=90;
           colMaideBrasil+=90;
           codBarras+=90;
        break;
        case 8:
           col2d1+=120;
           col2d2+=120;
           colMaideBrasil+=120;
           codBarras+=120;
        break;
        case 9:
           col2d1+=150;
           col2d2+=150;
           colMaideBrasil+=150;
           codBarras+=150;
        break;
        case 10:
           col2d1+=180;
           col2d2+=180;
           colMaideBrasil+=180;
           codBarras+=180;
        break;
        default:
           col2d1=770;
           col2d2=870;
           colMaideBrasil= 980;
           codBarras=1140;
           
    }
    
    
   marca17 = "^XA^PMY\n" +
             "^MMT\n" +
             "^PW1750\n" +
             "^LL0108\n" +
             "^LS0\n" +
             "\n" +
             "^FO328,20^GFA,00256,00256,00008,:Z64:\n" +
             "eJxjYCAZMP6D0OzHD4BpPoYHYFqCoQBMG/8zANPJ/yUgNLMMmD7MzINKs0Ppf1D6Pw9WdclwGmKeMfMGMG0BtQ9mP/v9BhT3EQUAYjUU6w==:12CB\n" +
             "^FO328,75^GFA,00256,00256,00008,:Z64:\n" +
             "eJxjYCAZMP6D0OzHD4BpPoYHYFqCoQBMG/8zANPJ/yUgNLMMmD7MzINKs0Ppf1D6Pw9WdclwGmKeMfMGMG0BtQ9mP/v9BhT3EQUAYjUU6w==:12CB\n" +
             "\n" +
             "^FT63,105^A0N,42,47^FH\\^FDTORQUE-^FS\n" +
             "^FT260,105^A0N,42,40^FH\\^FDFLEX^FS\n" +
             "^FT390,105^A0N,42,40^FH\\^FDCLASSIC^FS\n" +
             "\n" +
             "^FT63,50^A0N,42,47^FH\\^FDTORQUE-^FS\n" +
             "^FT260,50^A0N,42,40^FH\\^FDFLEX^FS\n" +
             "^FT390,50^A0N,42,40^FH\\^FDCLASSIC^FS\n" +
             "^FO"+col2d1+",20^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FO"+col2d2+",40^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FT"+colunaDescricao+","+alturadescricao+"^A0N,62,68^FH\\^FD"+desc+"^FS\n" +
             "^FT"+colMaideBrasil+",71^A0N,25,26^FH\\^FDMADE IN^FS\n" +
             "^FT"+colMaideBrasil+",102^A0N,25,26^FH\\^FDBRAZIL^FS\n" +
             "^FO1100,00\n" +
             "^GB480,20,200^FS\n" +
             "^FR\n" +
             "^FO"+ codBarras+",00^BY4,^BEN,300,N,N^FD"+ean13+"^FS\n" +
             "^FS\n" +
             "^PQ23,0,1,Y^XZ\n" +
             "";
    }    
    public void modelo19(int quant,String desc,String ean13){
    
   
    col2d1=750;
    col2d2=850;
    colMaideBrasil= 980;
    codBarras=1140;
    
    col = desc.length();
    
    switch(col){
       
        case 7:
          col2d1=750;
          col2d2=850;
          colMaideBrasil= 980;
          codBarras=1140;
        break;
        case 8:
           col2d1+=30;
           col2d2+=30;
           colMaideBrasil+=30;
           codBarras+=30;
        break;
        case 9:
           col2d1+=60;
           col2d2+=60;
           colMaideBrasil+=60; 
           codBarras+=60;
        break;
        case 10:
           col2d1+=90;
           col2d2+=90;
           colMaideBrasil+=90;
           codBarras+=90;
        break;
        case 11:
           col2d1+=120;
           col2d2+=120;
           colMaideBrasil+=120;
           codBarras+=120;
        break;
        case 12:
           col2d1+=150;
           col2d2+=150;
           colMaideBrasil+=150;
           codBarras+=150;
        break;
        case 13:
           col2d1+=180;
           col2d2+=180;
           colMaideBrasil+=180;
           codBarras+=180;
        break;
        default:
           col2d1=750;
           col2d2=850;
           colMaideBrasil= 980;
           codBarras=1140;
           
    }
    
    
   marca19 = "^XA^PMY\n" +
             "^MMT\n" +
             "^PW1750\n" +
             "^LL0108\n" +
             "^LS0\n" +
             "\n" +
             "^FO338,20^GFA,00256,00256,00008,:Z64:\n" +
             "eJxjYCAZMP6D0OzHD4BpPoYHYFqCoQBMG/8zANPJ/yUgNLMMmD7MzINKs0Ppf1D6Pw9WdclwGmKeMfMGMG0BtQ9mP/v9BhT3EQUAYjUU6w==:12CB\n" +
             "^FO338,75^GFA,00256,00256,00008,:Z64:\n" +
             "eJxjYCAZMP6D0OzHD4BpPoYHYFqCoQBMG/8zANPJ/yUgNLMMmD7MzINKs0Ppf1D6Pw9WdclwGmKeMfMGMG0BtQ9mP/v9BhT3EQUAYjUU6w==:12CB\n" +
             "\n" +
             "^FT63,105^A0N,42,47^FH\\^FDTORQUE-^FS\n" +
             "^FT260,105^A0N,42,40^FH\\^FDTEAM^FS\n" +
             "\n" +
             "^FT63,50^A0N,42,47^FH\\^FDTORQUE-^FS\n" +
             "^FT260,50^A0N,42,40^FH\\^FDTEAM^FS\n" +
             "\n" +
             "^FO"+col2d1+",20^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FO"+col2d2+",40^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FT476,105^A0N,62,68^FH\\^FD"+desc+"^FS\n" +
             "^FT"+colMaideBrasil+",71^A0N,25,26^FH\\^FDMADE IN^FS\n" +
             "^FT"+colMaideBrasil+",102^A0N,25,26^FH\\^FDBRAZIL^FS\n" +
             "^FO1100,00\n" +
             "^GB480,20,200^FS\n" +
             "^FR\n" +
             "^FO"+codBarras+",00^BY4,^BEN,300,N,N^FD"+ean13+"^FS\n" +
             "^FS\n" +
             "^PQ23,0,1,Y^XZ\n" +
             "";
    } 
   public void modelo21(int quant,String desc,String ean13){
    
   
           col2d1=450;
           col2d2=550;
           colMaideBrasil= 680;
           codBarras=940;
    
    col = desc.length();
    
    switch(col){
       
        case 9:
           col2d1=450;
           col2d2=550;
           colMaideBrasil= 680;
           codBarras=940;
        break;
        case 10:
           col2d1+=30;
           col2d2+=30;
           colMaideBrasil+=30;
           codBarras+=30;
        break;
        case 11:
           col2d1+=60;
           col2d2+=60;
           colMaideBrasil+=60; 
           codBarras+=60;
        break;
        case 12:
           col2d1+=90;
           col2d2+=90;
           colMaideBrasil+=90;
           codBarras+=90;
        break;
        case 13:
           col2d1+=120;
           col2d2+=120;
           colMaideBrasil+=120;
           codBarras+=120;
        break;
        case 14:
           col2d1+=150;
           col2d2+=150;
           colMaideBrasil+=150;
           codBarras+=150;
        break;
        case 15:
           col2d1+=210;
           col2d2+=210;
           colMaideBrasil+=210;
           codBarras+=210;
        break;
          case 16:
           col2d1+=240;
           col2d2+=240;
           colMaideBrasil+=240;
           codBarras+=240;
        break;
        case 17:
           col2d1+=270;
           col2d2+=270;
           colMaideBrasil+=270;
           codBarras+=270;
        break;
        case 18:
           col2d1+=300;
           col2d2+=300;
           colMaideBrasil+=300;
           codBarras+=300;
        break;
        case 19:
           col2d1+=330;
           col2d2+=330;
           colMaideBrasil+=330;
           codBarras+=330;
        break;
        case 20:
           col2d1+=360;
           col2d2+=360;
           colMaideBrasil+=360;
           codBarras+=360;
        break;
        default:
           col2d1=450;
           col2d2=550;
           colMaideBrasil= 680;
           codBarras=940;
           
    }
    
    
   marca21 = "^XA^PMY\n" +
             "^MMT\n" +
             "^PW1750\n" +
             "^LL0108\n" +
             "^LS0\n" +
             "\n" +
             "^FO"+col2d1+",20^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FO"+col2d2+",40^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FT100,105^A0N,62,68^FH\\^FD"+desc+"^FS\n" +
             "^FT"+colMaideBrasil+",71^A0N,25,26^FH\\^FDMADE IN^FS\n" +
             "^FT"+colMaideBrasil+",102^A0N,25,26^FH\\^FDBRAZIL^FS\n" +
             "^FO900,00\n" +
             "^GB480,20,200^FS\n" +
             "^FR\n" +
             "^FO940,00^BY4,^BEN,300,N,N^FD"+ean13+"^FS\n" +
             "^FS\n" +
             "^PQ23,0,1,Y^XZ";
    }  
  public void modelo23(int quant,String desc,String ean13){
    
   
           col2d1=450;
           col2d2=550;
           colMaideBrasil= 680;
           codBarras=940;
    
    col = desc.length();
    
    switch(col){
       
        case 9:
           col2d1=450;
           col2d2=550;
           colMaideBrasil= 680;
           codBarras=940;
        break;
        case 10:
           col2d1+=30;
           col2d2+=30;
           colMaideBrasil+=30;
           codBarras+=30;
        break;
        case 11:
           col2d1+=60;
           col2d2+=60;
           colMaideBrasil+=60; 
           codBarras+=60;
        break;
        case 12:
           col2d1+=90;
           col2d2+=90;
           colMaideBrasil+=90;
           codBarras+=90;
        break;
        case 13:
           col2d1+=120;
           col2d2+=120;
           colMaideBrasil+=120;
           codBarras+=120;
        break;
        case 14:
           col2d1+=150;
           col2d2+=150;
           colMaideBrasil+=150;
           codBarras+=150;
        break;
        case 15:
           col2d1+=210;
           col2d2+=210;
           colMaideBrasil+=210;
           codBarras+=210;
        break;
          case 16:
           col2d1+=240;
           col2d2+=240;
           colMaideBrasil+=240;
           codBarras+=240;
        break;
        case 17:
           col2d1+=270;
           col2d2+=270;
           colMaideBrasil+=270;
           codBarras+=270;
        break;
        case 18:
           col2d1+=300;
           col2d2+=300;
           colMaideBrasil+=300;
           codBarras+=300;
        break;
        case 19:
           col2d1+=330;
           col2d2+=330;
           colMaideBrasil+=330;
           codBarras+=330;
        break;
        case 20:
           col2d1+=360;
           col2d2+=360;
           colMaideBrasil+=360;
           codBarras+=360;
        break;
        default:
           col2d1=450;
           col2d2=550;
           colMaideBrasil= 680;
           codBarras=940;
           
    }
    
    
   marca23 = "^XA^PMY\n" +
             "^MMT\n" +
             "^PW1750\n" +
             "^LL0108\n" +
             "^LS0\n" +
             "\n" +
             "^FO"+col2d1+",20^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FO"+col2d2+",40^BXN,5,200,,,,\n" +
             "^FD"+ean13+"^FS\n" +
             "^FT100,105^A0N,62,68^FH\\^FD"+desc+"^FS\n" +
             "^FT"+colMaideBrasil+",71^A0N,25,26^FH\\^FDMADE IN^FS\n" +
             "^FT"+colMaideBrasil+",102^A0N,25,26^FH\\^FDBRAZIL^FS\n" +
             "^FO900,00\n" +
             "^GB480,20,200^FS\n" +
             "^FR\n" +
             "^FO940,00^BY4,^BEN,300,N,N^FD"+ean13+"^FS\n" +
             "^FS\n" +
             "^PQ23,0,1,Y^XZ";
    }   
  
  public void buscar(String marca){
                    bus.buscaMarca(marca);
                    AlinhamenedoEsq=bus.getAlinhamenedoEsq();
                    EspacamentoLinha=bus.getEspacamentoLinha();
                    Logo=bus.getLogo();
                    colunaLogo=bus.getColunaLogo();
                    AlturaLogo=bus.getAlturaLogo();
                    colunaDescricao=bus.getColunaDescricao();
                    alturadescricao=bus.getAlturadescricao();
                    LarguraDescricao=bus.getLarguraDescricao();
                    TamanhoDescricao=bus.getTamanhoDescricao();
                    text1=bus.getText1();
                    text2=bus.getText2();
                    text3=bus.getText3();
                    text4=bus.getText4();
                    text5=bus.getText5();
                    text6=bus.getText6();
                    text7=bus.getText7();
                    text8=bus.getText8();
                    text9=bus.getText9();
                    text10=bus.getText10();
                    colunaText1=bus.getColunaText1();
                    colunaText2=bus.getColunaText2();
                    colunaText3=bus.getColunaText3();
                    colunaText4=bus.getColunaText4();
                    colunaText5=bus.getColunaText5();
                    colunaText6=bus.getColunaText6();
                    colunaText7=bus.getColunaText7();
                    colunaText8=bus.getColunaText8();
                    colunaText9=bus.getColunaText9();
                    colunaText10=bus.getColunaText10();
                    alturaText1=bus.getAlturaText1();
                    alturaText2=bus.getAlturaText2();
                    alturaText3=bus.getAlturaText3();
                    alturaText4=bus.getAlturaText4();
                    alturaText5=bus.getAlturaText5();
                    alturaText6=bus.getAlturaText6();
                    alturaText7=bus.getAlturaText7();
                    alturaText8=bus.getAlturaText8();
                    alturaText9=bus.getAlturaText9();
                    alturaText10=bus.getAlturaText10();
                    LarguraText1=bus.getLarguraText1();
                    LarguraText2=bus.getLarguraText2();
                    LarguraText3=bus.getLarguraText3();
                    LarguraText4=bus.getLarguraText4();
                    LarguraText5=bus.getLarguraText5();
                    LarguraText6=bus.getLarguraText6();
                    LarguraText7=bus.getLarguraText7();
                    LarguraText8=bus.getLarguraText8();
                    LarguraText9=bus.getLarguraText9();
                    LarguraText10=bus.getLarguraText10();
                    TamanhoText1=bus.getTamanhoText1();
                    TamanhoText2=bus.getTamanhoText2();
                    TamanhoText3=bus.getTamanhoText3();
                    TamanhoText4=bus.getTamanhoText4();
                    TamanhoText5=bus.getTamanhoText5();
                    TamanhoText6=bus.getTamanhoText6();
                    TamanhoText7=bus.getTamanhoText7();
                    TamanhoText8=bus.getTamanhoText8();
                    TamanhoText9=bus.getTamanhoText9();
                    TamanhoText10=bus.getTamanhoText10();
                    DoisDColuna1=bus.getDoisDColuna1();
                    DoisDColuna2=bus.getDoisDColuna2();
                    doisDAltura1=bus.getDoisDAltura1();
                    doisDAltura2=bus.getDoisDAltura2();
                    colunaMadeIn=bus.getColunaMadeIn();
                    alturaMadeIn=bus.getAlturaMadeIn();
                    colunaBrazil=bus.getColunaBrazil();
                    alturaBrazil=bus.getAlturaBrazil();
                    LarguraMadeIn=bus.getLarguraMadeIn();
                    TamMadeIn=bus.getTamMadeIn();
    
  }

    public String getMarca15() {
        return marca15;
    }

    public String getMarca17() {
        return marca17;
    }

    public String getMarca19() {
        return marca19;
    }

    public String getMarca21() {
        return marca21;
    }

    public String getMarca23() {
        return marca23;
    }

    public String getMarca25() {
        return marca25;
    }

    public String getMarca27() {
        return marca27;
    }

    public String getMarca29() {
        return marca29;
    }

    public String getMarca31() {
        return marca31;
    }

    public String getMarca33() {
        return marca33;
    }

    public String getMarca35() {
        return marca35;
    }

    public String getMarca37() {
        return marca37;
    }

    public String getMarca39() {
        return marca39;
    }

    public String getAlinhamenedoEsq() {
        return AlinhamenedoEsq;
    }

    public String getEspacamentoLinha() {
        return EspacamentoLinha;
    }

    public String getLogo() {
        return Logo;
    }

    public String getColunaLogo() {
        return colunaLogo;
    }

    public String getAlturaLogo() {
        return AlturaLogo;
    }

    public String getColunaDescricao() {
        return colunaDescricao;
    }

    public String getAlturadescricao() {
        return alturadescricao;
    }

    public String getLarguraDescricao() {
        return LarguraDescricao;
    }

    public String getTamanhoDescricao() {
        return TamanhoDescricao;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public String getText3() {
        return text3;
    }

    public String getText4() {
        return text4;
    }

    public String getText5() {
        return text5;
    }

    public String getText6() {
        return text6;
    }

    public String getText7() {
        return text7;
    }

    public String getText8() {
        return text8;
    }

    public String getText9() {
        return text9;
    }

    public String getText10() {
        return text10;
    }

    public String getColunaText1() {
        return colunaText1;
    }

    public String getColunaText2() {
        return colunaText2;
    }

    public String getColunaText3() {
        return colunaText3;
    }

    public String getColunaText4() {
        return colunaText4;
    }

    public String getColunaText5() {
        return colunaText5;
    }

    public String getColunaText6() {
        return colunaText6;
    }

    public String getColunaText7() {
        return colunaText7;
    }

    public String getColunaText8() {
        return colunaText8;
    }

    public String getColunaText9() {
        return colunaText9;
    }

    public String getColunaText10() {
        return colunaText10;
    }

    public String getAlturaText1() {
        return alturaText1;
    }

    public String getAlturaText2() {
        return alturaText2;
    }

    public String getAlturaText3() {
        return alturaText3;
    }

    public String getAlturaText4() {
        return alturaText4;
    }

    public String getAlturaText5() {
        return alturaText5;
    }

    public String getAlturaText6() {
        return alturaText6;
    }

    public String getAlturaText7() {
        return alturaText7;
    }

    public String getAlturaText8() {
        return alturaText8;
    }

    public String getAlturaText9() {
        return alturaText9;
    }

    public String getAlturaText10() {
        return alturaText10;
    }

    public String getLarguraText1() {
        return LarguraText1;
    }

    public String getLarguraText2() {
        return LarguraText2;
    }

    public String getLarguraText3() {
        return LarguraText3;
    }

    public String getLarguraText4() {
        return LarguraText4;
    }

    public String getLarguraText5() {
        return LarguraText5;
    }

    public String getLarguraText6() {
        return LarguraText6;
    }

    public String getLarguraText7() {
        return LarguraText7;
    }

    public String getLarguraText8() {
        return LarguraText8;
    }

    public String getLarguraText9() {
        return LarguraText9;
    }

    public String getLarguraText10() {
        return LarguraText10;
    }

    public String getTamanhoText1() {
        return TamanhoText1;
    }

    public String getTamanhoText2() {
        return TamanhoText2;
    }

    public String getTamanhoText3() {
        return TamanhoText3;
    }

    public String getTamanhoText4() {
        return TamanhoText4;
    }

    public String getTamanhoText5() {
        return TamanhoText5;
    }

    public String getTamanhoText6() {
        return TamanhoText6;
    }

    public String getTamanhoText7() {
        return TamanhoText7;
    }

    public String getTamanhoText8() {
        return TamanhoText8;
    }

    public String getTamanhoText9() {
        return TamanhoText9;
    }

    public String getTamanhoText10() {
        return TamanhoText10;
    }

    public String getDoisDColuna1() {
        return DoisDColuna1;
    }

    public String getDoisDColuna2() {
        return DoisDColuna2;
    }

    public String getDoisDAltura1() {
        return doisDAltura1;
    }

    public String getDoisDAltura2() {
        return doisDAltura2;
    }

    public String getColunaMadeIn() {
        return colunaMadeIn;
    }

    public String getAlturaMadeIn() {
        return alturaMadeIn;
    }

    public String getColunaBrazil() {
        return colunaBrazil;
    }

    public String getAlturaBrazil() {
        return alturaBrazil;
    }

    public String getLarguraMadeIn() {
        return LarguraMadeIn;
    }

    public String getTamMadeIn() {
        return TamMadeIn;
    }

    public int getCol() {
        return col;
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

    public int getCodBarras() {
        return codBarras;
    }

    public BuscaConfig getBus() {
        return bus;
    }

    public String getMarca1() {
        return marca1;
    }
}
