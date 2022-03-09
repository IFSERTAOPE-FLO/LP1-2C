package Aula3;

public class ContadorMain {
    public static void main(String[] args) {
        Contador cont = new Contador();
        cont.atribuirValor(10);
        System.out.println(cont.obterValorAtual());
        cont.incrementarContador();
        System.out.println(cont.obterValorAtual());
    }
}
