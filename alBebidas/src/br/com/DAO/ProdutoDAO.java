/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.classes.Produto;
import br.com.connection.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
public class ProdutoDAO {
    public void create(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Produto (NomeProduto, PrecoVenda, PrecoCompra, QtdEstoque) VALUES (?,?,?,?)");
            stmt.setString(1, p.getNomeProduto());
            stmt.setFloat(2, p.getPrecoVenda());
            stmt.setFloat(3, p.getPrecoCompra());
            stmt.setInt(4, p.getQtdEstoque());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
 
   
    
    public void update(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("UPDATE Produto SET NomeProduto = ?, PrecoVenda = ?, PrecoCompra = ?, QtdEstoque = ? WHERE NomeProduto = ?");
            stmt.setString(1, p.getNomeProduto());
            stmt.setFloat(2, p.getPrecoVenda());
            stmt.setFloat(3, p.getPrecoCompra());
            stmt.setInt(4, p.getQtdEstoque());
            stmt.setString(5, p.getNomeProduto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
  }
    
     public void delete(Produto p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM Produto WHERE NomeProduto = ?");
            stmt.setString(1, p.getNomeProduto());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Item Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Fazer Exclusão: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
     
      public List<Produto> busca(String nome){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
          ResultSet rs = null;
          List<Produto> produtos = new ArrayList<>();
          
          //Produto p = new Produto();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM Produto WHERE NomeProduto LIKE ?");
            stmt.setString(1, "%"+nome+"%");   
            rs = stmt.executeQuery();
                        
            while (rs.next()) {
                Produto p = new Produto();
                
                p.setCodProduto(rs.getInt("idproduto"));
                p.setNomeProduto(rs.getString("nomeproduto"));
                p.setPrecoCompra(rs.getFloat("precocompra"));
                p.setPrecoVenda(rs.getFloat("precovenda"));
                p.setQtdEstoque(rs.getInt("qtdestoque"));
                
            }
            
            
            //JOptionPane.showMessageDialog(null, "Item Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de busca: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        return produtos;
    }
}
