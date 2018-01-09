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
public class Usuario {
    private String nomeUser;
    private String senha;
    private String endUser;

    public Usuario() {
    }

    public Usuario(String nomeUser, String senha, String endUser) {
        this.nomeUser = nomeUser;
        this.senha = senha;
        this.endUser = endUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndUser() {
        return endUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndUser(String endUser) {
        this.endUser = endUser;
    }
    
    
}
