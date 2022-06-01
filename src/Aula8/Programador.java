package Aula8;

public class Programador extends Funcionario {
    private String linguagem;

    public Programador(String nome, String cpf, double salario, String linguagem) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
