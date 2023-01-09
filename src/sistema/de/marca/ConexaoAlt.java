package sistema.de.marca;
import static java.lang.System.out;
import java.sql.*;
import static java.lang.Class.forName;
import javax.swing.JOptionPane;

public class ConexaoAlt {

    /* DATOS PARA LA CONEXION */
  
    @SuppressWarnings("PublicField")
    private String bd = "CTPTGMON";
    @SuppressWarnings("PublicField")
    private String login = "ctptgmon";
    @SuppressWarnings("PublicField")
    private final String host = "VHDB001\\SQLEXPRESS";
    private final String portNumber = "1433";
    private String password = "Paulo2022";
    @SuppressWarnings("PublicField")
    private String url ="jdbc:sqlserver://"+host+":" +portNumber + ";databaseName=" +bd;
    private String curso,codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
  
  private Connection conn = null;

  /* Constructor de clase: Se conecta a la base de datos
  */
   public ConexaoAlt(){
      try{
         //obt/enemos el driver de para mysql
         //Class.forName("com.mysql.jdbc.Driver");
            forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         //obtenemos la conexión
         conn = DriverManager.getConnection(url,login,password);
         if (conn!=null){
           System.out.println("OK base de datos "+bd+" listo");
         }
      }catch(SQLException | ClassNotFoundException e){
            out.println("erro"+e);
      }
    }

    public Connection getConnection()
    {
        return this.conn;
    }
/* Realiza una consulta a la base de datos, retorna un Object[][] con los
 * datos de la tabla personutoi
 */
    

/* Ejecuta la actualizacion de la tabla persona dado los valores de actualizacion
 * y el ID del registro a afectar
 */
    public boolean update(String valores, String id)
    {
        boolean res = false;        
        String q = " UPDATE confereMarca SET " + valores + " WHERE codigo= " + id;
        try (PreparedStatement pstm = conn.prepareStatement(q)) {
            pstm.execute();
         }catch(SQLException e){            
            out.println(e);
        }
        res=true;
        return res;
    }
    public boolean update2(String campo,String valores, String id)
    {
        boolean res = false;        
        String q = " UPDATE confereMarca SET "+campo+" = '"+valores+"'  WHERE codigo= " + id;
        try (PreparedStatement pstm = conn.prepareStatement(q)) {
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Campo "+campo+" alterado com sucesso!!");
         }catch(SQLException e){            
            out.println(e);
             JOptionPane.showMessageDialog(null,"Não foi possivel alterar "+e);
        }
        res=true;
        return res;
    }
    public boolean update3(String valores, String rev)
    {
        System.out.println("Entrou");
        boolean res = false;        
        String q = " UPDATE confereMarca SET estatus = '"+valores+"'  WHERE codigo= " + rev;
        try (PreparedStatement pstm = conn.prepareStatement(q)) {
            pstm.execute();
        //    JOptionPane.showMessageDialog(null,"Campo revisao alterado com sucesso!!");
         }catch(SQLException e){            
            out.println(e);
          //   JOptionPane.showMessageDialog(null,"Não foi possivel alterar "+e);
        }
        res=true;
        return res;
    }

    public String getBd() {
        return bd;
    }

    public void setBd(String bd) {
        this.bd = bd;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

}
