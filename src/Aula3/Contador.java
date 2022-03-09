package Aula3;
//A classe Contador possui um único atributo: valorAtual
//A classe provê métodos para:
//- Atribuir um valor ao contador
//- Incrementar o contador
//- Obter o atual valor do contador

public class Contador {
    private int valorAtual;

    public void atribuirValor(int valor){
        valorAtual = valor;
    }
    public void incrementarContador(){
        valorAtual++;
    }
    public int obterValorAtual(){
        return valorAtual;
    }
}
