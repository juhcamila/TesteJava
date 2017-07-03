/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MAQLABiii
 */
public class Conexao {
    private static Connection con;
    
  public static Connection getConexao() throws Exception {
        
        String url = "jdbc:jtds:sqlserver://MAQLABIII-PC:1433/TesteJava";
        String user  = "ju";
        String pass = "123";
        String driver  = "net.sourceforge.jtds.jdbc.Driver";
        
        Class.forName(driver);
        con = DriverManager.getConnection(url, user, pass);
        return con;
    }
    
    public void fechaConexao() throws SQLException{
        con.close();
    }
    
    
}
