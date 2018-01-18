/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.classes.Produto;
import br.com.classes.Venda;
import br.com.connection.ConnectionFactory;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author francisco
 */
public class VendaDAO {


    public void create(List<Venda> v) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            for (int i = 0; i < v.size(); i++) {

                stmt = (PreparedStatement) con.prepareStatement("INSERT INTO Venda (quantidade, valorTotal, NomeProduto,precounitario) VALUES (?,?,?,?)");
                
 
                stmt.setInt(1, v.get(i).getQuantidade());
                stmt.setFloat(2, v.get(i).getValorTotal());
                stmt.setString(3, v.get(i).getNomeproduto());
                stmt.setFloat(4, v.get(i).getPrecoUnitario());

                stmt.executeUpdate();

                

            }
            
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

        

    }
    
    public List<Venda> read(int cod){
          Connection con = ConnectionFactory.getConnection();
          PreparedStatement stmt = null;
          ResultSet rs = null;
          
          List<Venda> vendas = new ArrayList();
          try {
              stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM venda Where id = ?");
              stmt.setInt(1, cod);
              rs = stmt.executeQuery();
              
              while (rs.next()) {
                 Venda v = new Venda();
                 
                 v.setNomeproduto(rs.getString("nomeproduto"));
                 v.setPrecoUnitario(rs.getFloat("precounitario"));
                 v.setQuantidade(rs.getInt("quantidade"));
                 v.setValorTotal(rs.getInt("valorTotal"));
                 vendas.add(v);
                  
              }
              
          } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Erro ao carregar dados.");
          }finally{
              ConnectionFactory.closeConnection(con, stmt, rs);
          }
          
          return vendas;
      }
}
