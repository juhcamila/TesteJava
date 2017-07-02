package model;

import java.security.Timestamp;

/**
 *
 * @author juh_c
 */
public class Pessoa {
   private int id;
   private String nome;
   private String cpf;
   private String rg;
   private Timestamp nasc;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, String cpf, String rg, Timestamp nasc) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.nasc = nasc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Timestamp getNasc() {
        return nasc;
    }

    public void setNasc(Timestamp nasc) {
        this.nasc = nasc;
    }
   
   
}
