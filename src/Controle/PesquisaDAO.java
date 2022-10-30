package Controle;

import Connection.ModuloConexao;
import Model.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Deyvid
 */
public class PesquisaDAO {

    Connection conexao = null;
    PreparedStatement pstmt = null;
    ResultSet rs;

    Clientes obj = new Clientes();

    public boolean PesquisarTela(Clientes obj) throws SQLException {

        int cod = obj.getDad_id();
        //ModuloConexao conexao = new ModuloConexao();
        conexao = ModuloConexao.conector();

        String sql = "SELECT * FROM cadastrocrud.dados WHERE id = ?";
        pstmt = conexao.prepareStatement(sql);
        pstmt.setInt(1, cod);

        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            obj.setDad_nome(rs.getString("nome"));
            obj.setDad_data(rs.getDate("data"));
            obj.setDad_email(rs.getString("email"));
            obj.setDad_celular(rs.getString("celular"));
            obj.setDad_whatsapp(rs.getString("whatsapp"));
            obj.setDad_cpf(rs.getString("cpf"));
            obj.setDad_rg(rs.getString("rg"));
            obj.setDad_sexo(rs.getString("sexo"));
            obj.setDad_situacao(rs.getString("situacao"));
            obj.setDad_endereco(rs.getString("endereco"));
        }

        return true;
    }

}
