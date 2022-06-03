package Aula9;

import java.util.Calendar;

public class Cliente {
    private int cpf;
    private String nome;
    private String fone;
    private Calendar dataCriacao;

    public Cliente(int cpf, String nome, String fone) {
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;
        this.dataCriacao = Calendar.getInstance();
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
