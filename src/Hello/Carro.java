package Hello;

public class Carro {

    private int velocidade = 0;

    public void acelera(){
        velocidade++;
        // Mesma coisa: velocidade = velocidade + 1
    }
    public int getVelocidade(){
        return velocidade;
    }

}
