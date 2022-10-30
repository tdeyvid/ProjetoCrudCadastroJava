package Report;

import Connection.ModuloConexao;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 * @author Deyvid
 */
public class GeraRelatorio {
    
    private String relatorio;
    private String arg;
    private String  ativo = "1";
    private String inativo = "0";
    
    Connection conexao = null;
    Statement pstmt = null;
    ResultSet rs;
    
    
    public void ficha(String relatorio, String arg) throws JRException, Exception {
   
        conexao = ModuloConexao.conector();

        this.arg = arg;
        this.relatorio = relatorio;
        
        
       conexao = ModuloConexao.conector();
        
        Statement stm = conexao.createStatement();
        String query = "SELECT * FROM cadastrocrud.dados WHERE id='"+ arg +"'";
        
	ResultSet rs = stm.executeQuery(query);
        
       //implementação da interface JRDataSource para DataSource ResultSet
       JRResultSetDataSource jrRS = new JRResultSetDataSource( rs );
       
       //executa o relatório
       Map parameters = new HashMap();
       JasperPrint jp = JasperFillManager.fillReport( relatorio,parameters,jrRS );
        
        //exibe o resultado
	JasperViewer.viewReport(jp, false);
 
    }
    
    public void listagem(String relatorio, String arg) throws JRException, Exception {
   
        conexao = ModuloConexao.conector();

        this.arg = arg;
        this.relatorio = relatorio;
        this.ativo = ativo;
        this.inativo = inativo;
        
       conexao = ModuloConexao.conector();
        
        Statement stm = conexao.createStatement();
        String query = "SELECT * FROM cadastrocrud.dados WHERE situacao="+arg+" ORDER BY nome";
        
        
        //ativo = 1  - inativo =  0
       //SELECT * FROM cadastrocrud.dados WHERE situacao="ativo" order by nome
       //SELECT * FROM cadastrocrud.dados WHERE situacao="inativo" order by nome
       //SELECT * FROM cadastrocrud.dados WHERE situacao="ativo" or situacao ="inativo" order by nome;
       
	ResultSet rs = stm.executeQuery(query);
        
       //implementação da interface JRDataSource para DataSource ResultSet
       JRResultSetDataSource jrRS = new JRResultSetDataSource( rs );
       
       //executa o relatório
       Map parameters = new HashMap();
       JasperPrint jp = JasperFillManager.fillReport( relatorio,parameters,jrRS );
        
        //exibe o resultado
	JasperViewer.viewReport(jp, false);
 
    }



}
