/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.classes.Cliente;
import br.com.connection.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
public class ClienteDAO {

    public void create(Cliente c) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO cliente (NomeCliente, Cpf, Telefone, Endereco) VALUES (?,?,?,?)";
        try {
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, c.getNomeCliente());
            stmt.setString(2, c.getCpfCliente());
            stmt.setString(3, c.getTelefoneCliente());
            stmt.setString(4, c.getEnderecoCliente());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void atualiza (Cliente c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "UPDATE cliente SET NomeCliente = ?, Cpf = ?, Telefone = ?, Endereco = ? WHERE Cpf = ?";
        try {
            stmt = (PreparedStatement) con.prepareStatement(sql);
            stmt.setString(1, c.getNomeCliente());
            stmt.setString(2, c.getCpfCliente());
            stmt.setString(3, c.getTelefoneCliente());
            stmt.setString(4, c.getEnderecoCliente());
            stmt.setString(5, c.getCpfCliente());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar, tente novamente." + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
