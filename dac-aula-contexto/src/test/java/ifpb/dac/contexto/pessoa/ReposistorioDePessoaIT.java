/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.dac.contexto.pessoa;

import java.io.FileInputStream;
import java.util.List;
import org.dbunit.DBTestCase;
import static org.dbunit.PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL;
import static org.dbunit.PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS;
import static org.dbunit.PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD;
import static org.dbunit.PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;

/**
 *
 * @author Anderson Souza
 */
public class ReposistorioDePessoaIT extends DBTestCase {
    
    public ReposistorioDePessoaIT(String name) {
        super(name);
        System.setProperty(DBUNIT_DRIVER_CLASS, "com.mysql.jdbc.Driver");
        System.setProperty(DBUNIT_USERNAME, "root");
        System.setProperty(DBUNIT_PASSWORD, "root");
        System.setProperty(DBUNIT_CONNECTION_URL, "jdbc:mysql://locahost:3306/dac_aula_exemplo");
    }

    @Override
    protected IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSet(new FileInputStream(("data.xml")));
    }
        
    @Override
    protected DatabaseOperation getSetUpOperation() throws Exception {
        return DatabaseOperation.CLEAN_INSERT;
    }
    
    @Test
   public void testSalvar(Pessoa pessoa) {
       
    }

   @Test
    public void testTodos() {
    }

    /* Usado para analisar o contexto de persistência */
    @Test
    public void testExcluir(Pessoa pessoa) {
        
    }   
}