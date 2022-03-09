package Aula3;

//Capacete retrátil
//6 frases
//Dispara Laser
//Braço articulado para golpes
//Abre as asas

public class Buzz {
    //Atributos
    private boolean asas;

    //Métodos
    public void abreAsas(){
        if (asas == true){
            asas = false;
        }else{
            asas = true;
        }
    }
    public String frases(int frase){
        switch (frase){
            case 1:
                return "Ao infinito e além!";
            case 2:
                return "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
            case 3:
                return "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
            case 4:
                return "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
            case 5:
                return "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
            case 6:
                return "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";

        }
        return "";
    }
    //Continuem...
}
