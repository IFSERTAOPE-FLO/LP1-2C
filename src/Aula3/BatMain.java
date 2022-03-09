package Aula3;

public class BatMain {
    public static void main(String[] args) {
        Batedeira batedeira = new Batedeira();
        batedeira.marca = "Arno";
        batedeira.cor = "vermelha";
        batedeira.ligar();
        System.out.println(batedeira.estaLigado());
        System.out.println(batedeira.obterVelocidade());
        batedeira.trocarVelocidade(3);
        System.out.println(batedeira.obterVelocidade());
        batedeira.desligar();
        System.out.println(batedeira.estaLigado());

    }
}
