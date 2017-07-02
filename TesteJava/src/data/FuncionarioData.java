/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import modell.Funcionario;

public class AlunoData{
    
    public static void incluir(Aluno a) throws Exception{
        PessoaData.incluir(a); // inclui primeiro na tabela de pessoas
        a.setId(PessoaData.pesquisar(a.getNome())); // pega o id dele e coloca no objeto a
        // preparando a insercao na tabela de alunos
        PreparedStatement ps3 = Conexao.getConexao().prepareStatement(
                "insert TBAluno values ( ?, ? )");
        ps3.setInt(1, a.getId());
        ps3.setString(2, a.getCurso());
        ps3.executeUpdate(); // executa a insercao na tabela de alunos
    }
public class FuncionarioData {
    
    public static incluir(Funcionario f) throws Exception{
        
    }
}
    
}
