/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JorgeLPR
 */
public class TestDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConexionDefault conectar = new ConexionDefault();
        //ConexionPool conectar = new ConexionPool();
        //conectar.dataSource.getConnection();
        conectar.openConnection();
        
    }
    
}
