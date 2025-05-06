import java.util.Scanner;

public class Pratica09 {
    //Escreva um programa que solicite a altura e o peso de uma pessoa e, em seguida, calcule e imprima o Índice de Massa Corporal (IMC) dessa pessoa.
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Qual é a sua altura, em metros?");
        double altura = teclado.nextDouble();

        System.out.println("Qual é o seu peso, em kg?");
        double peso = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Olá, " + nome + "! Seu IMC é " + imc + ".");

     teclado.close();

    }
}       
