
package modozpl;

/**
 *
 * @author vmbrito
 */
public class LogoSincron5{
    
 
  public String gerarLogo(String marca,String parLinha1,String parLinha2){
      
      Parametros param = (valor) -> {
          return valor ;
      };
      
      String replace = marca.replace("+linha1+", param.parametro(parLinha1));
      String replace2 = replace.replace("+linha2+", param.parametro(parLinha2)); 
      
      
      return replace2;
  }
    
  
    public String gerarMarca(String marca,
            String pw,
            String LL,
            String linha1,
            String linha2,
            int coluna,
            int quantLinha,
            int valorColuna
    ) {
        String corpoMarca = null;
        StringBuilder sb = new StringBuilder();
        String rodape = "^PQ" + quantLinha + ",0,1,Y\n"
                + "^XZ";
        Parametros param = (valor) -> {
            return valor;
        };
        String comeco = "^XA^PMY\n"
                + "^MMT\n"
                + "^PW"
                + "" + param.parametro(pw) + "\n"
                + "^LL"
                + "" + param.parametro(LL) + "\n"
                + "^LS0";

        sb.append(comeco).append("\n");

        int valor = 0;
        for (int i = 0; i < coluna; i++) {
            corpoMarca = this.gerarLogo(marca, "" + valor, linha2);
            sb.append(corpoMarca).append("\n");
            valor += valorColuna;
        }

        sb.append(rodape).append("\n");

        return sb.toString();
    }

}
