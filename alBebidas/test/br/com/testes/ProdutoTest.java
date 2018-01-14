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
    
    @Before
    public void setUp() {
        p = new Produto();
    }
    

    @Test
    public void testProdutoVazio() {
        p.setNomeProduto("");
        assertFalse("Deveria retornar falso", p.validaNomeProduto());
    }
    
  }