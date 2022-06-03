package Aula9;

public class Principal {
    public static void main(String[] args) {
        Cliente fulano = new Cliente(12345, "Fulano", "7598989898");

        System.out.println(fulano.getDataCriacao().getTime());
    }
}
