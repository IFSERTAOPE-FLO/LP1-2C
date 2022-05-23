package Aula5;

public class Vetores {
    public static void main(String[] args) {

        //Instanciar objeto
        ContaCorrente conta1 = new ContaCorrente(123, 10000);
        ContaCorrente conta2 = new ContaCorrente(456, 5000);
        ContaCorrente conta3 = new ContaCorrente(789, 2000);

        // Criando um array de Contas correntes
        ContaCorrente[] contas = new ContaCorrente[3];
        contas[0] = conta1;
        contas[1] = conta2;
        contas[2] = conta3;
        // Utilizando for (Quando precisar acessar o índice
        for(int i = 0; i<contas.length; i++){
            System.out.println("conta "+ i +": "
                    + contas[i].getNumero());
        }
        for (ContaCorrente con : contas) {
            System.out.println("conta: "
                    + con.getNumero());
        }

    }
}
