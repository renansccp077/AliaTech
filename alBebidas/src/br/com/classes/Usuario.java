/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class Usuario {
    private String nomeUser;
    private String senha;

    public Usuario(String nomeUser, String senha) {
        this.nomeUser = nomeUser;
        this.senha = senha;
    }

    public Usuario() {
    }
    
    

    public String getNomeUser() {
        return nomeUser;
    }

    public String getSenha() {
        return senha;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validarUsuario() {
        
        return validaNomeUser()||validaSenha();
    }
    
    public boolean validaNomeUser(){
        
        if(nomeUser.length()<4 || nomeUser.length()>20){
            JOptionPane.showMessageDialog(null, "Digite um nome de usuario entre 4 e 20 caracteres!");
            return false;
        }
        
        if(Pattern.compile("[^a-zA-Z ]").matcher(nomeUser).find()){
            JOptionPane.showMessageDialog(null, "Digite um nome de usuario contendo apenas letras, se!");
            return false;
        }
        
        return true;
    }
    
    public boolean validaSenha(){
        
        if(senha.length()<8){
            JOptionPane.showMessageDialog(null, "Digite uma senha com no mínimo 8 caracteres!");
            return false;
        }
        
        if(!Pattern.compile("((?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&*]).{8,100})").matcher(senha).matches()){
            JOptionPane.showMessageDialog(null, "Digite uma senha contendo letras, numeros e caracteres especiais!");
            return false;
        }
        return true;
    }
  
}
