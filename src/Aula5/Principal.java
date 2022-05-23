package Aula5;

public class Principal {
    public static void main(String[] args) {
        Cliente[] clientes = new Cliente[4];

        Cliente aluno1 = new Cliente(1234, "Witalo", "75123456");
        Cliente aluno2 = new Cliente(9876, "Maria", "98765432");
        Cliente aluno3 = new Cliente(45678, "Joao", "75123456");
        Cliente aluno4 = new Cliente(98760, "Luciana", "98765432");

        clientes[0] = aluno1;
        clientes[1] = aluno2;
        clientes[2] = aluno3;
        clientes[3] = aluno4;

        for (Cliente cli: clientes) {
            System.out.println("Nome: " + cli.getNome());
        }
    }
}
