package Aula3;
//-Pense em um contexto e realize o processo de
// abstração para coletar as informações essenciais
//-Implemente em Java esse objeto, além de uma outra
// classe de onde serão invocados alguns métodos do
// objeto modelado

public class Batedeira {
    //Atributos
    public String marca;
    public String cor;
    private int velocidade;
    private boolean ligado;

    //Métodos
    public void ligar(){
        ligado = true;
        trocarVelocidade(1);
    }
    public void desligar(){
        ligado = false;
    }
    public void trocarVelocidade(int novaVelocidade){
        velocidade = novaVelocidade;
    }
    public boolean estaLigado(){
        return ligado;
    }
    public int obterVelocidade(){
        return velocidade;
    }
}
