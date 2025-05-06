import java.util.Scanner;

public class Pratica14 {
    //Escreva um programa que solicite um valor em reais (R$) e a cotação atual do dólar (US$). Em seguida, calcule e imprima o valor convertido em dólares.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do produto em reais: ");
        double valorReal = teclado.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = teclado.nextDouble();

        double valorDolar = valorReal / cotacaoDolar;

        System.out.printf("O valor do produto em dólares e: %.2f", valorDolar);


        teclado.close();
    }
}
