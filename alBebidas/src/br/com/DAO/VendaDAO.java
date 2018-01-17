/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.classes.Venda;
import br.com.connection.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
public class VendaDAO {

    int cod = 0;

    public void create(List<Venda> v) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        for (int i = 0; i < v.size(); i++) {
            try {
                stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Venda (idVenda, DataVenda, quantidade, valorTotal, nomeproduto,precounitario) VALUES (?,?,?,?,?,?)");
                stmt.setInt(1, cod);
                stmt.setDate(2, v.get(i).getData());
                stmt.setInt(3, v.get(i).getQuantidade());
                stmt.setFloat(4, v.get(i).getValorTotal());
                stmt.setString(5, v.get(i).getNomeproduto());
                stmt.setFloat(6, v.get(i).getPrecoUnitario());

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: " + ex);
            } finally {
                ConnectionFactory.closeConnection(con, stmt);
            }

        }

        cod++;

    }
}
