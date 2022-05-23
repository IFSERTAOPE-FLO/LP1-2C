package Dinamica040522;

public class Cliente {

    private int codigo;
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = "";
    }

    public Cliente(int codigo) {
        this.codigo = codigo;
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}