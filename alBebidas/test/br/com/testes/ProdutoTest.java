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
    
    @Before
    public void setUp() {
        p = new Produto();
    }
    
    @Test
    public void testNomeProdutoVazio() {
        p.setNomeProduto("");
        assertFalse("Deveria retornar falso", p.validaNomeProduto());
    }
    
    @Test
    public void testNomeProdutoMenorQue4() {
        p.setNomeProduto("cer");
        assertFalse("Deveria retornar falso", p.validaNomeProduto());
    }
    
    @Test
    public void testNomeProdutoMaiorQue20() {
        p.setNomeProduto("cerveja kaiser 600ml ");
        assertFalse("Deveria retornar falso", p.validaNomeProduto());
    }
    
    @Test
    public void testNomeProdutoValidoLetrasNumerosCaracEspeciais() {
        p.setNomeProduto("kaiser 300ml(#)");
        assertTrue("Deveria retornar true", p.validaNomeProduto());
    }
    
    @Test
    public void testPrecoDeCompraIgualA0() {
        p.setPrecoCompra(0);
        assertFalse("Deveria retornar falso", p.validaPrecoCompra());
    }
    
    @Test
    public void testPrecoDeCompraValido() {
        p.setPrecoCompra(1);
        assertTrue("Deveria retornar true", p.validaPrecoCompra());
    }
    
    @Test
    public void testPrecoDeVendaMenorQuePrecoDeCompra(){
        p.setPrecoCompra(10);
        p.setPrecoVenda(9);
        assertFalse("Deveria retornar falso", p.validaPrecoVenda());
    }
    
    @Test
    public void testPrecoDeVendaMaiorQuePrecoDeCompra(){
        p.setPrecoCompra(9);
        p.setPrecoVenda(10);
        assertTrue("Deveria retornar true", p.validaPrecoVenda());
    }    
    
     @Test
    public void testPrecoDeVendaMenorQue1(){
        p.setPrecoVenda(0);
        assertFalse("Deveria retornar false", p.validaPrecoVenda());
    }   
    
    @Test
    public void testQuantidadeMenorQue0(){
        p.setQtdEstoque(-1);
        assertFalse("Deveria retornar false", p.validaQtdProduto());
    } 
    
    @Test
    public void testQuantidadeMaiorIgual0(){
        p.setQtdEstoque(0);
        assertTrue("Deveria retornar false", p.validaQtdProduto());
    }   
  }