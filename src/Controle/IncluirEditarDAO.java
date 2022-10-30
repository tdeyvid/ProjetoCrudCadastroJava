package Controle;

import Connection.ModuloConexao;
import Model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author Deyvid
 */
public class IncluirEditarDAO {

    Connection conexao = null;
    PreparedStatement pstmt = null;
    ResultSet rs;
    int registros;

    Clientes obj = new Clientes();
    //static JComboBox c1;
   
    public int Incluir(Clientes obj) throws SQLException {
        conexao = ModuloConexao.conector();

        String sql = "INSERT INTO cadastrocrud.dados"
                + "(nome,data,email,celular,whatsapp,cpf,rg, sexo,situacao,endereco)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";

        pstmt = conexao.prepareStatement(sql);
        pstmt.setString(1, obj.getDad_nome().trim());
        pstmt.setDate(2, obj.getDad_data());
        pstmt.setString(3, obj.getDad_email().trim());
        pstmt.setString(4, obj.getDad_celular().trim());
        pstmt.setString(5, obj.getDad_whatsapp());
        pstmt.setString(6, obj.getDad_cpf().trim());
        pstmt.setString(7, obj.getDad_rg().trim());
        
        //String sexo[] = { "Maculino", "Feminino", "Outros" };
        //c1 = new JComboBox(sexo);
        pstmt.setString(8, obj.getDad_sexo());
        
        pstmt.setString(9, obj.getDad_situacao());
        pstmt.setString(10, obj.getDad_endereco().trim());

        registros = pstmt.executeUpdate();

        PreparedStatement pstmtAux = conexao.prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;

        if ((registros == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;
        } else {
            return codigo;
        }

    }//FIM DO INCLUIR

   
    public boolean Editar(Clientes obj) throws SQLException {
        conexao = ModuloConexao.conector();
        int registros;
        
       String[] sexo = new String []{"Masculino","Feminino","Outros"};

        PreparedStatement pstmt = conexao.prepareStatement(
                "UPDATE cadastrocrud.dados SET nome= ?,data= ?,"
                + "email=?,celular= ?,whatsapp= ?, cpf= ?,rg= ?,"
                + "sexo= ?,situacao= ?,endereco= ? WHERE id = ? ");

        pstmt.setString(1, obj.getDad_nome().trim());
        pstmt.setDate(2, obj.getDad_data());
        pstmt.setString(3, obj.getDad_email().trim());
        pstmt.setString(4, obj.getDad_celular().trim());
        pstmt.setString(5, obj.getDad_whatsapp());
        pstmt.setString(6, obj.getDad_cpf().trim());
        pstmt.setString(7, obj.getDad_rg().trim());
        pstmt.setString(8, obj.getDad_sexo().trim());
        pstmt.setString(9, obj.getDad_situacao());
        pstmt.setString(10, obj.getDad_endereco().trim());
        pstmt.setInt(11, obj.getDad_id());

        registros = pstmt.executeUpdate();

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }//FIM DO EDITAR
    

}
