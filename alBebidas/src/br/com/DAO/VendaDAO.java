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
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
public class VendaDAO {
    public void create(Venda v) {
       Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Venda (DataVenda, quantidade, valorTotal, Usuario_NomeUsuario, Produto_idProduto, Cliente_Cpf) VALUES (?,?,?,?,?,?)");
            stmt.setDate(1, v.getData());
            stmt.setInt(2, v.getQuantidade());
            stmt.setFloat(3, v.getValorTotal());
            stmt.setString(4, v.getNomeUsuario());  
            stmt.setInt(5, v.getIdProduto());
            stmt.setString(6, v.getCpfCliente());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
