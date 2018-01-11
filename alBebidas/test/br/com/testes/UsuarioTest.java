/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testes;

import br.com.classes.Usuario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author francisco
 */
public class UsuarioTest {
    
    Usuario u;
    
    @Before
    public void setUp() {
        u = new Usuario();
    }
    
         // Casos de Teste
    
    @Test
    public void testeNomeUsuarioVazioInvalido(){
        u.setNomeUser("");
        assertFalse("",u.validaNomeUser());
    }
    
    @Test
    public void testeNomeUsuarioMenorQue4Invalido(){
        u.setNomeUser("Ump");
        assertFalse("",u.validaNomeUser());
    }
    
    @Test
    public void testeNomeUsuarioMaiorQue20Invalido(){
        u.setNomeUser("Renan de Sousa Rego Ferreira");
        assertFalse("",u.validaNomeUser());
    }
    
    @Test
    public void testeNomeUsuarioValido(){
        u.setNomeUser("Renan de Sousa Rego");
        assertTrue("",u.validaNomeUser());
    }
    
    @Test
    public void testeSenhaVazia(){
        u.setSenha("");
        assertFalse("",u.validaSenha());
    }
    
    @Test
    public void testeSenhaMenorQue8Invalida(){
        u.setSenha("123$g");
        assertFalse("",u.validaSenha());
    }
    
    @Test
    public void testeSenhaSemCaracteresEspeciais(){
        u.setSenha("123456gT");
        assertFalse("",u.validaSenha());
    }
    
     @Test
    public void testeSenhaSemLetras(){
        u.setSenha("123456$%");
        assertFalse("",u.validaSenha());
    }
    
     @Test
    public void testeSenhaValida(){
        u.setSenha("123456$g");
        assertTrue("",u.validaSenha());
    }
    
}
