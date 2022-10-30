package Controle;

import Connection.ModuloConexao;
import Model.Clientes;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ExcluirDAO {

    Connection conexao = null;
    PreparedStatement pstmt = null;
    ResultSet rs;
    int registros;

    Clientes obj = new Clientes();

    public boolean Excluir(int cod) throws SQLException {
        conexao = ModuloConexao.conector();
        int registros;

        PreparedStatement pstmt = conexao.prepareStatement(
                "DELETE FROM cadastrocrud.dados WHERE id = ? ");
        pstmt.setInt(1, cod);
        registros = pstmt.executeUpdate();

        if (registros == 1) {
            return true;
        } else {
            return false;
        }

    }

}
