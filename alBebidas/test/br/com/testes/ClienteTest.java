/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testes;

import br.com.classes.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renan
 */
public class ClienteTest {
    Cliente c;
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new Cliente();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNomeCliente method, of class Cliente.
     */
    @Test
    public void testClienteNomeVazio() {
        c.setNomeCliente("");
        assertFalse("Deveria retornar falso", c.validaNomeClient());
    }
    
    @Test
    public void testClienteNomeComNumeros(){
       c.setNomeCliente("oi123");
       assertFalse("Deveria retornar falso", c.validaNomeClient());
    }

    @Test
    public void testClienteNomeMenorQue4(){
       c.setNomeCliente("oi");
       assertFalse("Deveria retornar falso", c.validaNomeClient());
    }
    
    @Test
    public void testClienteNomeMaiorque50(){
       c.setNomeCliente("oioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioioi");
       assertFalse("Deveria retornar falso", c.validaNomeClient());
    }
    
    @Test
    public void testCPFinvalido(){
       c.setNomeCliente("123");
       assertFalse("Deveria retornar falso", c.validaCPFCliente());
    }
    
}
