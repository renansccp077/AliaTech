/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.classes;

import java.util.InputMismatchException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class Cliente {

    private String nomeCliente;
    private String cpfCliente;
    private String enderecoCliente;
    private String telefoneCliente;

    public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente, String telefoneCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
    }

    public Cliente() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public boolean validarCliente() {

        return false;
    }

    public boolean validaNomeClient() {
        if (nomeCliente.length() < 4 || nomeCliente.length() > 50) {
            JOptionPane.showMessageDialog(null, "O nome do cliente deve ter entre 4 e 50 caracteres");
            return false;
        }
        if (Pattern.compile("[^a-zA-Z ]").matcher(nomeCliente).find()) {
            JOptionPane.showMessageDialog(null, "O nome do cliente deve ter apenas letras");
            return false;
        }
        return true;
    }

    public boolean validaCPFCliente() {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpfCliente.equals("00000000000") || cpfCliente.equals("11111111111")
                || cpfCliente.equals("22222222222") || cpfCliente.equals("33333333333")
                || cpfCliente.equals("44444444444") || cpfCliente.equals("55555555555")
                || cpfCliente.equals("66666666666") || cpfCliente.equals("77777777777")
                || cpfCliente.equals("88888888888") || cpfCliente.equals("99999999999")
                || (cpfCliente.length() != 11)) {
            JOptionPane.showMessageDialog(null, "Digite um CPF válido!");
            return (false);
            
        }

        char dig10, dig11;
        int sm, i, r, num, peso;
        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0         
                // (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (cpfCliente.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpfCliente.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpfCliente.charAt(9)) && (dig11 == cpfCliente.charAt(10))) {
                return (true);
            } else {
                JOptionPane.showMessageDialog(null, "Digite um CPF válido!");
                return (false);
            }
        } catch (InputMismatchException erro) {
            JOptionPane.showMessageDialog(null, "Digite um CPF válido!");
            return (false);
            
        }
    }
    
    public boolean validaTelefoneCliente() {
        return telefoneCliente.matches(".((10)|([1-9][1-9]).)\\s9?[6-9][0-9]{3}-[0-9]{4}") ||
               telefoneCliente.matches(".((10)|([1-9][1-9]).)\\s[2-5][0-9]{3}-[0-9]{4}");
    }
}
