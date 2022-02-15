package Hello;

public class Conta {
    int numero;
    int agencia;
    double saldo;

    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }
}