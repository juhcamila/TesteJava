/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.security.Timestamp;

/**
 *
 * @author MAQLABiii
 */
public class Funcionario extends Pessoa{
 private String funcao;
 private String observacao;

    public Funcionario() {
        super();
    }

    public Funcionario(String funcao, String observacao, int id, String nome, String cpf, String rg, String nasc) {
        super(id, nome, cpf, rg, nasc);
        this.funcao = funcao;
        this.observacao = observacao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
 
}
