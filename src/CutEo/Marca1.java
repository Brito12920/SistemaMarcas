/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CutEo;

/**
 *
 * @author v103760
 */
public class Marca1 {
   private String marca;
   private int col,colRecebida;
public void modelo(int quant,String desc){
    
    col=952;
    colRecebida = desc.length();
    
    switch(colRecebida){
       
        case 15:
           col=952; 
        break;
        case 16:
           col=982; 
        break;
        case 17:
           col=1012; 
        break;
        case 18:
           col=1042; 
        break;
        case 19:
           col=1072; 
        break;
        case 20:
           col=1102; 
        break;
        case 21:
           col=1132; 
        break;
        default:
            col=952; 
           
    }
    
    
   marca = "^XA^PMY\n" +
   "^MMT\n" +
   "^PW1600\n" +
   "^LT00\n" +
   "^LL430\n" +
   "^LS0\n" +
   "\n" +
   "^FO0,10^GFA,04992,04992,00052,:Z64:\n" +
   "eJztljFy5CAQRVEpYDP2BhxF19pMuBxs6CP4KFa211C2KZlVZRXt/o00Aw12TeRIbY+MR3weXzSNjLniiiuu+PlwO19G+rYPLep/CsZMFFnNLUuBOJ4oTvwHl4Qbm+HfkdYsGQndiZhmeTjL3TkGiv7Q7BiRzBy564FzJCPwt9xcwMqcFZw1c7gVpNeh8eBYfNvjeHAGUpwZHBmTGfHUPJd+7I2z3jRRNOgfu36s4oC7YcJ8dfJp/XjlZxACumG8vevHKw6e2AYhj+dk7u36TMoP5hpFQ9xOXT+z4jjax22kxLLAS9X4SZIpy1T6wfONeGAzOPgEM2FJojT9LhrjSo7nOf5xfJmEE0ST+HbWgDNiyqUfzzd+W0mahTmL4nCT25sZSg4Pb34hoVnDnNXlwQdJi5PDSVz68UlgktSW5tjxM8iUSk4SGEZbkeL25JR+oCn8YMLC4dEsTVvHTx6+5OwHbADnbXOn5vDD6Ny18DMLZz84ftd+ZLpLzn86Neng8NNx9Jr0+tw0kl7rnZNXgZ+ZI+2ny9lKPy/80/iB9uA0fphj6e8jfu7Pjf08Z03qzE378engDPTvAT/1+jzR/y/XR2kyh/PN3DV3P2PDqfIt0Htv/+h8ozKvzfzey7eo8q3aP2H6eGT/YJ+6c59i/p39o/ZpXQ9C1tT7Z9D1oK47KD2Nn6bu1PVNSk+1Pr36VtfRhiP1TddRqdfjWa/DSM3+aev1WJ0LOCZ0vu2i+fr8CUb76Z0/hspzDnPX+bbjmP7mPA1ZU+2fznnqy3M755L205zb5/tBMoeB1k/zfmDL95Ccf9oP5l9xzvedNXNcZ32a95281PJeZWUbtX6wh2vOFVdcccUVPxufaK12yg==:5AF6\n" +
   "\n" +
   "\n" +
   "^FO0,95^GFA,04992,04992,00052,:Z64:\n" +
   "eJztljFy5CAQRVEpYDP2BhxF19pMuBxs6CP4KFa211C2KZlVZRXt/o00Aw12TeRIbY+MR3weXzSNjLniiiuu+PlwO19G+rYPLep/CsZMFFnNLUuBOJ4oTvwHl4Qbm+HfkdYsGQndiZhmeTjL3TkGiv7Q7BiRzBy564FzJCPwt9xcwMqcFZw1c7gVpNeh8eBYfNvjeHAGUpwZHBmTGfHUPJd+7I2z3jRRNOgfu36s4oC7YcJ8dfJp/XjlZxACumG8vevHKw6e2AYhj+dk7u36TMoP5hpFQ9xOXT+z4jjax22kxLLAS9X4SZIpy1T6wfONeGAzOPgEM2FJojT9LhrjSo7nOf5xfJmEE0ST+HbWgDNiyqUfzzd+W0mahTmL4nCT25sZSg4Pb34hoVnDnNXlwQdJi5PDSVz68UlgktSW5tjxM8iUSk4SGEZbkeL25JR+oCn8YMLC4dEsTVvHTx6+5OwHbADnbXOn5vDD6Ny18DMLZz84ftd+ZLpLzn86Neng8NNx9Jr0+tw0kl7rnZNXgZ+ZI+2ny9lKPy/80/iB9uA0fphj6e8jfu7Pjf08Z03qzE378engDPTvAT/1+jzR/y/XR2kyh/PN3DV3P2PDqfIt0Htv/+h8ozKvzfzey7eo8q3aP2H6eGT/YJ+6c59i/p39o/ZpXQ9C1tT7Z9D1oK47KD2Nn6bu1PVNSk+1Pr36VtfRhiP1TddRqdfjWa/DSM3+aev1WJ0LOCZ0vu2i+fr8CUb76Z0/hspzDnPX+bbjmP7mPA1ZU+2fznnqy3M755L205zb5/tBMoeB1k/zfmDL95Ccf9oP5l9xzvedNXNcZ32a95281PJeZWUbtX6wh2vOFVdcccUVPxufaK12yg==:5AF6\n" +
   "\n" +
   "\n" +
   "^FO0,180^GFA,04992,04992,00052,:Z64:\n" +
   "eJztljFy5CAQRVEpYDP2BhxF19pMuBxs6CP4KFa211C2KZlVZRXt/o00Aw12TeRIbY+MR3weXzSNjLniiiuu+PlwO19G+rYPLep/CsZMFFnNLUuBOJ4oTvwHl4Qbm+HfkdYsGQndiZhmeTjL3TkGiv7Q7BiRzBy564FzJCPwt9xcwMqcFZw1c7gVpNeh8eBYfNvjeHAGUpwZHBmTGfHUPJd+7I2z3jRRNOgfu36s4oC7YcJ8dfJp/XjlZxACumG8vevHKw6e2AYhj+dk7u36TMoP5hpFQ9xOXT+z4jjax22kxLLAS9X4SZIpy1T6wfONeGAzOPgEM2FJojT9LhrjSo7nOf5xfJmEE0ST+HbWgDNiyqUfzzd+W0mahTmL4nCT25sZSg4Pb34hoVnDnNXlwQdJi5PDSVz68UlgktSW5tjxM8iUSk4SGEZbkeL25JR+oCn8YMLC4dEsTVvHTx6+5OwHbADnbXOn5vDD6Ny18DMLZz84ftd+ZLpLzn86Neng8NNx9Jr0+tw0kl7rnZNXgZ+ZI+2ny9lKPy/80/iB9uA0fphj6e8jfu7Pjf08Z03qzE378engDPTvAT/1+jzR/y/XR2kyh/PN3DV3P2PDqfIt0Htv/+h8ozKvzfzey7eo8q3aP2H6eGT/YJ+6c59i/p39o/ZpXQ9C1tT7Z9D1oK47KD2Nn6bu1PVNSk+1Pr36VtfRhiP1TddRqdfjWa/DSM3+aev1WJ0LOCZ0vu2i+fr8CUb76Z0/hspzDnPX+bbjmP7mPA1ZU+2fznnqy3M755L205zb5/tBMoeB1k/zfmDL95Ccf9oP5l9xzvedNXNcZ32a95281PJeZWUbtX6wh2vOFVdcccUVPxufaK12yg==:5AF6\n" +
   "\n" +
   "\n" +
   "^FO0,265^GFA,04992,04992,00052,:Z64:\n" +
   "eJztljFy5CAQRVEpYDP2BhxF19pMuBxs6CP4KFa211C2KZlVZRXt/o00Aw12TeRIbY+MR3weXzSNjLniiiuu+PlwO19G+rYPLep/CsZMFFnNLUuBOJ4oTvwHl4Qbm+HfkdYsGQndiZhmeTjL3TkGiv7Q7BiRzBy564FzJCPwt9xcwMqcFZw1c7gVpNeh8eBYfNvjeHAGUpwZHBmTGfHUPJd+7I2z3jRRNOgfu36s4oC7YcJ8dfJp/XjlZxACumG8vevHKw6e2AYhj+dk7u36TMoP5hpFQ9xOXT+z4jjax22kxLLAS9X4SZIpy1T6wfONeGAzOPgEM2FJojT9LhrjSo7nOf5xfJmEE0ST+HbWgDNiyqUfzzd+W0mahTmL4nCT25sZSg4Pb34hoVnDnNXlwQdJi5PDSVz68UlgktSW5tjxM8iUSk4SGEZbkeL25JR+oCn8YMLC4dEsTVvHTx6+5OwHbADnbXOn5vDD6Ny18DMLZz84ftd+ZLpLzn86Neng8NNx9Jr0+tw0kl7rnZNXgZ+ZI+2ny9lKPy/80/iB9uA0fphj6e8jfu7Pjf08Z03qzE378engDPTvAT/1+jzR/y/XR2kyh/PN3DV3P2PDqfIt0Htv/+h8ozKvzfzey7eo8q3aP2H6eGT/YJ+6c59i/p39o/ZpXQ9C1tT7Z9D1oK47KD2Nn6bu1PVNSk+1Pr36VtfRhiP1TddRqdfjWa/DSM3+aev1WJ0LOCZ0vu2i+fr8CUb76Z0/hspzDnPX+bbjmP7mPA1ZU+2fznnqy3M755L205zb5/tBMoeB1k/zfmDL95Ccf9oP5l9xzvedNXNcZ32a95281PJeZWUbtX6wh2vOFVdcccUVPxufaK12yg==:5AF6\n" +
   "\n" +
   "\n" +
   "^FO0,345^GFA,04992,04992,00052,:Z64:\n" +
   "eJztljFy5CAQRVEpYDP2BhxF19pMuBxs6CP4KFa211C2KZlVZRXt/o00Aw12TeRIbY+MR3weXzSNjLniiiuu+PlwO19G+rYPLep/CsZMFFnNLUuBOJ4oTvwHl4Qbm+HfkdYsGQndiZhmeTjL3TkGiv7Q7BiRzBy564FzJCPwt9xcwMqcFZw1c7gVpNeh8eBYfNvjeHAGUpwZHBmTGfHUPJd+7I2z3jRRNOgfu36s4oC7YcJ8dfJp/XjlZxACumG8vevHKw6e2AYhj+dk7u36TMoP5hpFQ9xOXT+z4jjax22kxLLAS9X4SZIpy1T6wfONeGAzOPgEM2FJojT9LhrjSo7nOf5xfJmEE0ST+HbWgDNiyqUfzzd+W0mahTmL4nCT25sZSg4Pb34hoVnDnNXlwQdJi5PDSVz68UlgktSW5tjxM8iUSk4SGEZbkeL25JR+oCn8YMLC4dEsTVvHTx6+5OwHbADnbXOn5vDD6Ny18DMLZz84ftd+ZLpLzn86Neng8NNx9Jr0+tw0kl7rnZNXgZ+ZI+2ny9lKPy/80/iB9uA0fphj6e8jfu7Pjf08Z03qzE378engDPTvAT/1+jzR/y/XR2kyh/PN3DV3P2PDqfIt0Htv/+h8ozKvzfzey7eo8q3aP2H6eGT/YJ+6c59i/p39o/ZpXQ9C1tT7Z9D1oK47KD2Nn6bu1PVNSk+1Pr36VtfRhiP1TddRqdfjWa/DSM3+aev1WJ0LOCZ0vu2i+fr8CUb76Z0/hspzDnPX+bbjmP7mPA1ZU+2fznnqy3M755L205zb5/tBMoeB1k/zfmDL95Ccf9oP5l9xzvedNXNcZ32a95281PJeZWUbtX6wh2vOFVdcccUVPxufaK12yg==:5AF6\n" +
   "\n" +
   "\n" +
   "\n" +
   "^FT412,82^A0N,65,76^FH\\^FD"+desc+"^FS\n" +
   "^FT412,167^A0N,65,76^FH\\^FD"+desc+"^FS\n" +
   "^FT412,252^A0N,65,76^FH\\^FD"+desc+"^FS\n" +
   "^FT412,337^A0N,65,76^FH\\^FD"+desc+"^FS\n" +
   "^FT412,422^A0N,65,76^FH\\^FD"+desc+"^FS\n" +
   "\n" +
   
   "\n" +
   "^FT"+col+",142^A0N,27,31^FH\\^FDMADE IN^FS\n" +
   "^FT"+col+",175^A0N,27,31^FH\\^FDBRAZIL^FS\n" +
   "\n" +
   "^FT"+col+",227^A0N,27,31^FH\\^FDMADE IN^FS\n" +
   "^FT"+col+",260^A0N,27,31^FH\\^FDBRAZIL^FS\n" +
   "\n" +
   "^FT"+col+",312^A0N,27,31^FH\\^FDMADE IN^FS\n" +
   "^FT"+col+",345^A0N,27,31^FH\\^FDBRAZIL^FS\n" +
   "\n" +
   "^FT"+col+",397^A0N,27,31^FH\\^FDMADE IN^FS\n" +
   "^FT"+col+",430^A0N,27,31^FH\\^FDBRAZIL^FS\n" +
   "\n" +
   "^PQ"+quant+",0,0,Y^XZ"
   + " ";
    
}    

    public String getMarca() {
        return marca;
    }
    
}
