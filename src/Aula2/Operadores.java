package Aula2;

public class Operadores {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.println(a); // Resultado: 0
        a++; // a = a + 1
        System.out.println(a); // Resultado: 1
        a++; // a = a + 1
        System.out.println(a); // Resultado: 2
        a--; // a = a - 1
        System.out.println(a); // Resultado: 1
        a++;

        if(a == b){
            System.out.println("O valor de 'a' é igual a 'b'");
            // bla bla bla
        }else{
            System.out.println("O valor de 'a' é diferente de 'b'");
        }
    }
}
