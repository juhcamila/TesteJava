/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MAQLABiii
 */
public class Conexao {
  private Connection conexao;  
  
  public Conexao() throws Exception{
      String url="jdbc:jtds:sqlserver://MAQLABIII-PC:1433/TesteJava";
      Class.forName("net.sourceforge.jtds.jtbc.Driver");
      conexao = DriverManager.getConnection(url, "teste", "123");
      
  }
  
  public Connection getConexao(){
      return conexao;
  }
}
