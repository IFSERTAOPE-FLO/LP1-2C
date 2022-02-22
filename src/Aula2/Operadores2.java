package Aula2;

public class Operadores2 {

    public static void main(String[] args) {
        int a = 0;
        int b = 10;
        int c = a + b;
        int d = c / 5;
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
    }
}
