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
    public String sacar(double valor){
        if(saldo >= valor) {
            //Mesma coisa de "saldo = saldo - valor"
            saldo -= valor;
            return "Saque efetuado";
        }else{
            return "Saldo indisponível";
        }
    }
    public double obterSaldo(){
        return saldo;
    }
}
