/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testes;

import br.com.classes.Produto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ronildo Ferreira
 */
public class ProdutoTest {
    
    Produto p;
    public ProdutoTest() {
    
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        p = new Produto();
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of getNomeCliente method, of class Cliente.
     */

    @Test
    public void testProdutoVazio() {
        p.setNomeProduto("");
        assertFalse("Deveria retornar falso", p.validaNomeProduto());
    }
    
   @Test
    public void testCodProdutoVazio() {
        p.setCodProduto(1);
        assertFalse("Deveria retornar falso", p.validaCodProduto());
    }
    
    
   @Test
    public void testCodProdutoComLetras() {
        p.setCodProduto("oioioi");
        assertFalse("Deveria retornar falso", p.validaCodProduto());
    }
    
    
   @Test
    public void testCodProdutoComNomesEletras() {
        p.setCodProduto("oioioi1234");
        assertFalse("Deveria retornar falso", p.validaCodProduto());
    }
    
    
   @Test
    public void testCodProdutoSimbolosEspeciais() {
        p.setCodProduto("*!&%¨$#@^");
        assertFalse("Deveria retornar falso", p.validaCodProduto());
    }
}