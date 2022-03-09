package Aula3;

public class Principal {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.velocidade = 10;
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.acelerar(10);
        fusca.frear(10);
        System.out.println(fusca.obterMarca());
        fusca.obterVelocidade();
    }

}
