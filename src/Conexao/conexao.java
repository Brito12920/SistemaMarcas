package Conexao;
import static java.lang.Class.forName;
import java.sql.*;
import static java.sql.DriverManager.getConnection;
import static java.sql.ResultSet.CONCUR_READ_ONLY;
import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;
import static javax.swing.JOptionPane.showMessageDialog;


public class conexao
{
       
    final private String driver =  "net.ucanaccess.jdbc.UcanaccessDriver";
  //  final private String driver =  "sun.jdbc.odbc.JdbcOdbcDriver";
        //       "sun.jdbc.odbc.JdbcOdbcDriver";
        
       
        // voces verão ainda como efetuar conexão com diversos bancos
      //  final private String url = "jdbc:odbc:cutedge";
       final private String url = "jdbc:ucanaccess://c:/bancoDados/configuracao.accdb";
      
        
        // final private String url ="jdbc:odbc:DRIVER={Microsoft Access Driver(*.mdb, *.accdb)};DBQ=c:/monitoramento/bancoDedados/monitoramento.accdb";
       final private String usuario = "";
        final private String senha = "";
        private Connection conexao;
        public Statement statement;
        public ResultSet resultset;
        
       public boolean conecta()
       {
            boolean result = true;
            try 
            {
                forName(driver);
                conexao = getConnection(url, usuario, senha);
            //   JOptionPane.showMessageDialog(null,"conectou");
            }
            catch(ClassNotFoundException Driver) 
            {
             //  JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
               result = false;
            }
            catch(SQLException Fonte) 
            {
                showMessageDialog(null,"Deu erro na conexão "+
                        "com a fonte de dados: "+Fonte);
                result = false;
            }
            return result; 
       }
       
       public void desconecta()
       {
            boolean result = true;
            try 
            {
                conexao.close();
          //      JOptionPane.showMessageDialog(null,"banco fechado");
            }
            catch(SQLException fecha) 
            {
                showMessageDialog(null,"Não foi possivel "+
                        "fechar o banco de dados: "+fecha);
                result = false;
            }

       }
       
       public void executeSQL(String sql)
       {
            try 
            {
                statement = conexao.createStatement(TYPE_SCROLL_SENSITIVE, CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            }
            catch(SQLException sqlex) 
            {
              showMessageDialog(null,"Não foi possível "+
                     "executar o comando sql,"+sqlex+", o sql passado foi "+sql);
            }

       }
       


}
       