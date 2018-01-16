/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.frames;

import br.com.DAO.ProdutoDAO;
import br.com.classes.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Renan
 */
public class InternalBuscaProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternalBuscaProduto
     */
    public InternalBuscaProduto() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tabelaMostraProduto.getModel();
        tabelaMostraProduto.setRowSorter(new TableRowSorter(modelo));
        mostraProdutos();
        
    }
    public void mostraProdutos(){
        DefaultTableModel modelo = (DefaultTableModel) tabelaMostraProduto.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pd = new ProdutoDAO();
        
        

        for(Produto p: pd.read()){
            
            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getNomeProduto(),
                p.getPrecoCompra(),
                p.getPrecoVenda(),
                p.getQtdEstoque()
            });
        }
    }
    
    public void carregaTabelaBusca(String nome){
        DefaultTableModel modelo = (DefaultTableModel) tabelaMostraProduto.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pd = new ProdutoDAO();

        for(Produto p: pd.readForNome(nome)){
            
            modelo.addRow(new Object[]{
                p.getCodProduto(),
                p.getNomeProduto(),
                p.getPrecoCompra(),
                p.getPrecoVenda(),
                p.getQtdEstoque()
            
                
            });
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        botaoBuscaProduto = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        campoNomeProdutoBusca = new javax.swing.JTextField();
        botaoAlterarRegistro = new javax.swing.JButton();
        botaoApagarRegistro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        vcompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vvenda = new javax.swing.JTextField();
        cod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qtd = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaMostraProduto = new javax.swing.JTable();

        setClosable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar produto"));

        botaoBuscaProduto.setText("Buscar produto");
        botaoBuscaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscaProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Produto:");

        campoNomeProdutoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeProdutoBuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeProdutoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoBuscaProduto)
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoNomeProdutoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscaProduto))
                .addContainerGap())
        );

        botaoAlterarRegistro.setText("Alterar registro do produto");
        botaoAlterarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarRegistroActionPerformed(evt);
            }
        });

        botaoApagarRegistro.setText("Excluir registro do produto");
        botaoApagarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarRegistroActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Produto"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Cód. Produto:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Preço de venda:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Valor de compra: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Qtd. Estoque:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtd)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vcompra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(vvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(qtd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaMostraProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Produto", "Nome do Produto", "Preço de Compra", "Preço de Venda", "Qtd. em Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaMostraProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMostraProdutoMouseClicked(evt);
            }
        });
        tabelaMostraProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaMostraProdutoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaMostraProduto);
        if (tabelaMostraProduto.getColumnModel().getColumnCount() > 0) {
            tabelaMostraProduto.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(botaoAlterarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoApagarRegistro)
                        .addGap(105, 105, 105))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAlterarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoApagarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscaProdutoActionPerformed
        // TODO add your handling code here:
        carregaTabelaBusca(campoNomeProdutoBusca.getText());
    }//GEN-LAST:event_botaoBuscaProdutoActionPerformed

    private void campoNomeProdutoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeProdutoBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeProdutoBuscaActionPerformed

    private void tabelaMostraProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMostraProdutoMouseClicked
        // TODO add your handling code here:
        int indiceLinha = tabelaMostraProduto.getSelectedRow();
        
        cod.setText(tabelaMostraProduto.getValueAt(indiceLinha,0).toString());
        nome.setText(tabelaMostraProduto.getValueAt(indiceLinha,1).toString());
        vcompra.setText(tabelaMostraProduto.getValueAt(indiceLinha,2).toString());
        vvenda.setText(tabelaMostraProduto.getValueAt(indiceLinha,3).toString());
        qtd.setText(tabelaMostraProduto.getValueAt(indiceLinha,4).toString());
        
    }//GEN-LAST:event_tabelaMostraProdutoMouseClicked

    private void tabelaMostraProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaMostraProdutoKeyReleased
        // TODO add your handling code here:
        int indiceLinha = tabelaMostraProduto.getSelectedRow();
        
        cod.setText(tabelaMostraProduto.getValueAt(indiceLinha,0).toString());
        nome.setText(tabelaMostraProduto.getValueAt(indiceLinha,1).toString());
        vcompra.setText(tabelaMostraProduto.getValueAt(indiceLinha,2).toString());
        vvenda.setText(tabelaMostraProduto.getValueAt(indiceLinha,3).toString());
        qtd.setText(tabelaMostraProduto.getValueAt(indiceLinha,4).toString());
    }//GEN-LAST:event_tabelaMostraProdutoKeyReleased

    private void botaoAlterarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarRegistroActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os dados do registro?",
        title, JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION){
            Produto produto = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            produto.setCodProduto(Integer.parseInt(cod.getText()));
            produto.setNomeProduto(nome.getText());
            produto.setPrecoCompra(Float.parseFloat(vcompra.getText()));
            produto.setPrecoVenda(Float.parseFloat(vvenda.getText()));
            produto.setQtdEstoque(Integer.parseInt(qtd.getText()));

            if(produto.validarProduto() == true){
                dao.update(produto);
            }
        }
        
    }//GEN-LAST:event_botaoAlterarRegistroActionPerformed

    private void botaoApagarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarRegistroActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar os dados do registro?",
        title, JOptionPane.YES_NO_OPTION);
        
        if(resposta == JOptionPane.YES_OPTION){
            Produto produto = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            produto.setCodProduto(Integer.parseInt(cod.getText()));
            produto.setNomeProduto(nome.getText());
            produto.setPrecoCompra(Float.parseFloat(vcompra.getText()));
            produto.setPrecoVenda(Float.parseFloat(vvenda.getText()));
            produto.setQtdEstoque(Integer.parseInt(qtd.getText()));

            if(produto.validarProduto()){
                dao.delete(produto);
            }
        }
    }//GEN-LAST:event_botaoApagarRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarRegistro;
    private javax.swing.JButton botaoApagarRegistro;
    private javax.swing.JToggleButton botaoBuscaProduto;
    private javax.swing.JTextField campoNomeProdutoBusca;
    private javax.swing.JTextField cod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField qtd;
    private javax.swing.JTable tabelaMostraProduto;
    private javax.swing.JTextField vcompra;
    private javax.swing.JTextField vvenda;
    // End of variables declaration//GEN-END:variables
}
