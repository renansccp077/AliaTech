/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class Produto {
    private String nomeProduto;
    private int CodProduto;
    private float precoCompra;
    private float precoVenda;
    private int qtdEstoque;

    public Produto() {
    }
    
    public Produto(String nomeProduto, int CodProduto, float precoCompra, float precoVenda, int qtdEstoque) {
        this.nomeProduto = nomeProduto;
        this.CodProduto = CodProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getCodProduto() {
        return CodProduto;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setCodProduto(int CodProduto) {
        this.CodProduto = CodProduto;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public boolean validarProduto(){
        return validaNomeProduto() && validaPrecoCompra() && validaPrecoVenda() && validaQtdProduto();
    }
    
    public boolean validaNomeProduto(){
        if(nomeProduto.length()<4 || nomeProduto.length()>20){
            JOptionPane.showMessageDialog(null, "O nome do produto deve conter entre 4 e 20 caracteres!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }         
        return true;
    }
    
    public boolean validaPrecoCompra(){
        if(precoCompra <= 0){
            JOptionPane.showMessageDialog(null, "O preço de compra deve ser maior que 0!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validaPrecoVenda(){
        if(precoVenda <= 0 || precoVenda <= precoCompra){
            JOptionPane.showMessageDialog(null, "O preço de venda deve ser maior que o preço de compra!", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validaQtdProduto(){
        if(qtdEstoque < 0){
            JOptionPane.showMessageDialog(null, "A quantidade de produtos deve ser maior ou igual à 0", "Erro:", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
