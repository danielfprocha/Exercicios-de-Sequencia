import java.util.Scanner;

public class Pratica02 {
    //Escreva um programa que imprima a mensagem "Olá, [nome]!", onde [nome] é o nome do usuário.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Olá, " + nome + "!");

        teclado.close();
    }
}
