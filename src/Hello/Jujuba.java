package Hello;

public class Jujuba {
    public static void main(String args[]){
        System.out.println("Hello World");

        //HelloWorld objeto = new HelloWorld();
        //System.out.println(objeto.mensagem());

        Carro fusca = new Carro();
        System.out.println(fusca.getVelocidade());
        fusca.acelera();
        System.out.println(fusca.getVelocidade());

    }
}