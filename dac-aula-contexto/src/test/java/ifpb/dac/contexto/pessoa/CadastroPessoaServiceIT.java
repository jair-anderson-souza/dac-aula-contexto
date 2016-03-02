/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.contexto.pessoa;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Anderson Souza
 */
public class CadastroPessoaServiceIT {
    @Mock
    private ReposistorioDePessoa repository;
    private Pessoa p1; 
    private Pessoa p2;
    
    public CadastroPessoaServiceIT() {
        p1 = new Pessoa("Anderson");
        p2 = new Pessoa("Job");
    }

    @BeforeClass
    public static void setUpClass() {
        
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        repository = mock(ReposistorioDePessoa.class);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class CadastroPessoaService.
     */
    @Test
    public void testSalvar() {
        when(repository.salvar(p1)).thenReturn(true);
        
        boolean t = repository.salvar(p1);
        
        assertTrue(t);
        t = repository.salvar(p2);
        assertFalse(t);
        
    }

    /**
     * Test of todos method, of class CadastroPessoaService.
     */
    @Test
    public void testTodos() {
        when(repository.todos()).thenReturn(null);
        Object expected = repository.todos();
        assertNull(expected);
           
        
    }

    /**
     * Test of excluir method, of class CadastroPessoaService.
     */
    @Test
    public void testExcluir() {
        when(repository.excluir(p1)).thenReturn(true);
        
        boolean t= repository.excluir(p1);
        assertTrue(t);
        
        t = repository.excluir(p2);
        assertFalse(t);
        
        
    }

}
