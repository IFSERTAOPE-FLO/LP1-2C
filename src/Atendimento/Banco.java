package Atendimento;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(100);
        System.out.println(conta.obterSaldo());
        conta.depositar(150);
        System.out.println(conta.obterSaldo());
        System.out.println(conta.sacar(75));
        System.out.println(conta.obterSaldo());
        System.out.println(conta.sacar(180));
        System.out.println(conta.obterSaldo());
    }
}
