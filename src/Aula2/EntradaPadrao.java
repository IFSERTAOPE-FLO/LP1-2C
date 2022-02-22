package Aula2;

import java.util.Scanner;

public class EntradaPadrao {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine(); // Receber uma string
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt(); // Receber um inteiro
        System.out.println("Digite seu salario: ");
        salario = leitor.nextDouble(); // Receber um double

        System.out.println("Nome: " + nome + "\nIdade: " + idade
                + "\nSalario: " + salario);

    }
}
