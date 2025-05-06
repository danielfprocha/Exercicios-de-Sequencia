import java.util.Scanner;

public class Pratica06 {
    //Escreva um programa que leia, em sequência, dois pares de números e, logo depois, imprima a soma de cada par no seguinte formato:
    //"Soma1: {soma1}"
    //"Soma2: {soma2}"
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = teclado.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma dos números é: " + soma + ".");

     teclado.close();

    }
}       