/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.contexto.pessoa;

import ifpb.dac.contexto.pessoa.dbunit.DBUnitHelper;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Anderson Souza
 */
public class ReposistorioDePessoaIT {

    @Before
    public void before(){
        DBUnitHelper helper = new DBUnitHelper();
        helper.cleanInsert("/data.xml");
    } 
    
    @Test
    public void find(){
        ReposistorioDePessoa repo = new ReposistorioDePessoa();
        Pessoa p = repo.find(4);
        assertNull(p);
        
    }
    
 
}