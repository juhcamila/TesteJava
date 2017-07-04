/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import modell.Pessoa;

public class PessoaData {
   public static boolean incluir(Pessoa p) throws Exception{
      PreparedStatement ps0 = Conexao.getConexao().prepareStatement(
      "insert Pessoa values(?,?,?,?,?)");
      
      ps0.setString(1, p.getNome());
      ps0.setString(2, p.getRg());
      ps0.setString(3, p.getCpf());
      ps0.setString(4, p.getNasc());
      ps0.setString(5, p.getEndereco());
      ps0.executeUpdate();
      return 0< ps0.executeUpdate();
       
   }
   
   public static int pesquisar(String nome) throws Exception{
        int id = 0;
     
        PreparedStatement ps2 = Conexao.getConexao().prepareStatement(
                "select IDPessoa from Pessoa where nome = ?");
        ps2.setString(1,nome);
        ResultSet rs2 = ps2.executeQuery();
        
        if(rs2.next()){
            id = rs2.getInt(1);
        }
        
        return id;
    }
}