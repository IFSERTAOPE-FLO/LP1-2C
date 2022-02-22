package Aula2;

public class Operadores2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = a + b;
        int d = c / 5;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        int e = 0;
        e++;
        System.out.println("e: " + e);
        // ++e é igual a 'e = e + 1 "antes" da operação f = 5 + e'
        int f = 5 + ++e;
        // e++ é igual a 'e = e + 1 "depois" da operação f = 5 + e'
        System.out.println("f: " + f);
        System.out.println("e: " + e);

        // Operadores lógicos
        // && é o AND
        if(a == b && c > d){
            System.out.println("Funcionou! Entrou no if usando AND");
        }
        // || é o OR
        if(a == b || c > d){
            System.out.println("Funcionou! Entrou no if usando OR");
        }
        // ! é o NOT
        if(!(a == b)){
            System.out.println("Funcionou! Entrou no if usando NOT");
        }
    }
}