/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

/**
 *
 * @author Renan
 */
public class Cliente {
    private String nomeCliente;
    private int cpfCliente;
    private String enderecoCliente;

    public Cliente(String nomeCliente, int cpfCliente, String enderecoCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
    }

    public Cliente() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    
    
}
