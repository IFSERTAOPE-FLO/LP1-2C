package Atendimento;

public class ContaCorrente {
    //Atributos
    private int agencia;
    private int conta;
    private double saldo;

    //Métodos
    public void depositar(double valor){
        saldo += valor;
        //Mesma coisa de "saldo = saldo + valor"
    }
    public void sacar(double valor){
        saldo -= valor;
        //Mesma coisa de "saldo = saldo - valor"
    }
    public double obterSaldo(){
        return saldo;
    }
}
