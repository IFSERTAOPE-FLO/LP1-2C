package Aula8;

public class Designer extends Funcionario {
    private String softwareEdicao;

    public Designer(String nome, String cpf, double salario, String softwareEdicao) {
        super(nome, cpf, salario);
        this.softwareEdicao = softwareEdicao;
    }

    public String getSoftwareEdicao() {
        return softwareEdicao;
    }

    public void setSoftwareEdicao(String softwareEdicao) {
        this.softwareEdicao = softwareEdicao;
    }
}
