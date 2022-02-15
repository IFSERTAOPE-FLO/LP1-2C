package Hello;

public class ContaPrincipal {
    public static void main(String args[]){
        Conta contaItalo = new Conta();
        contaItalo.agencia = 1234;
        contaItalo.numero = 56789;
        contaItalo.saldo = 1000;

        Conta contaBreno = new Conta();
        contaBreno.agencia = 1234;
        contaBreno.numero = 56789;
        contaBreno.saldo = 1000;

        System.out.println("O Ítalo possui " + contaItalo.saldo + " reais.");
        contaItalo.sacar(450);
        System.out.println("O Ítalo possui " + contaItalo.saldo + " reais.");
        contaItalo.depositar(260);
        System.out.println("O Ítalo possui " + contaItalo.saldo + " reais.");


    }
}
