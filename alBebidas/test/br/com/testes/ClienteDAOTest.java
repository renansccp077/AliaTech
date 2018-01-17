/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testes;

import br.com.DAO.ClienteDAO;
import br.com.classes.Cliente;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author francisco
 */
public class ClienteDAOTest {
    Cliente c;
    ClienteDAO dao;
    @Before
    public void setUp() {
        c = new Cliente();
        dao = new ClienteDAO();
    }
    
    
    
}
