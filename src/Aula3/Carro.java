package Aula3;

public class Carro {
    //Atributos
    public double velocidade;
    public String marca;
    public String modelo;

    //Métodos
    public void acelerar(double intensidade){
        System.out.println("Acelerando");
    }
    public void frear(double intensidade){
        System.out.println("Freando");
    }
    public String obterMarca(){
        return marca;
    }
    public void obterVelocidade(){
        System.out.println("Velocidade: "+velocidade);
    }
}
