package Controle;

import Connection.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Deyvid
 */
public class ConsultaDAO {

    static Connection conexao = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs;
    int registros;

    public  static  ResultSet carregaTela() throws SQLException {

        //ModuloConexao conexao = new ModuloConexao();
        conexao = ModuloConexao.conector();

        String sql ="SELECT id,nome,data,email,celular,whatsapp, cpf,rg, sexo,situacao,endereco FROM cadastrocrud.dados";
        pstmt = conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        return rs;

    }//FIM METODO CARREGA TELA SEM ARGUMENTO.

    public static ResultSet carregaTela(String tipo, String arg) throws SQLException {

        String argumento = tipo + " " + "like '" + arg + "%'";

        ModuloConexao conexao = new ModuloConexao();
        //conexao = ModuloConexao.conector();

        PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                "SELECT id,nome,data,email,celular,whatsapp, cpf,rg, sexo,situacao,"
                + "endereco FROM cadastrocrud.dados; WHERE" + argumento + "");
        

        ResultSet rs = pstmt.executeQuery();

        return rs;

    }//COM ARGUMENTO.

    

    public static ResultSet carregaTabela() throws SQLException {
        
        ModuloConexao conexao = new ModuloConexao();
        //conexao = ModuloConexao.conector();

        PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                "SELECT id,nome,data,email,celular,whatsapp, cpf,rg, sexo,situacao,endereco FROM cadastrocrud.dados");
       
        ResultSet rs = pstmt.executeQuery();

        return rs;

    }//FIM METODO CARREGA TABELA SEM ARGUMENTO.

    public static ResultSet carregaTabela(String tipo, String arg) throws SQLException {

        String argumento = tipo + " " + "like '" + arg + "%'";

        //ModuloConexao conexao = new ModuloConexao();
        conexao = ModuloConexao.conector();

        String sql =
                "SELECT id,nome,data,email,celular,whatsapp, cpf,rg, sexo,situacao,"
                + "endereco FROM cadastrocrud.dados WHERE" + argumento + "";
        pstmt = conexao.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();

        return rs;


    }//COM ARGUMENTO.

}
