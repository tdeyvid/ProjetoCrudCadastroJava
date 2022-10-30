
package Connection;

import static Connection.ModuloConexao.conector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class ModuloConexao {
    public static Connection conector;
    public static Connection conector (){
        
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver"; // chama o driver
        
        //Informação do banco
        String url ="jdbc:mysql://localhost:3306/cadastrocrud?characterEnconding=utf-8";
        String user = "user";
        String password = "123";
        
        //Estabelecendo conexão com o banco
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
            //JOptionPane.showMessageDialog(null,"Conexaão com o banco OK");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
            return null;
            
        }
 
    }
    
    // Metodos publicos:
    public Connection getConexao()
    {
        return conector;
    }

    

    
  
}
 
