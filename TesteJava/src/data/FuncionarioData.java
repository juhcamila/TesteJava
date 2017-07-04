/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import modell.Funcionario;


    
 
public class FuncionarioData {
    
    public static boolean incluir(Funcionario f) throws Exception{
       
        PessoaData.incluir(f);//inclui primeiro na tabela de pessoas
        f.setId(PessoaData.pesquisar(f.getNome()));
        
        PreparedStatement ps3 = Conexao.getConexao().prepareStatement(
        " insert Funcionario values (?,?,?)");
        
        ps3.setInt( 1, f.getId());
        ps3.setString(2, f.getFuncao());
        ps3.setString(3, f.getObservacao());
        ps3.executeUpdate();
        
        return 0< ps3.executeUpdate();
    }
}
    
