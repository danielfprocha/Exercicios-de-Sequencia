import java.util.Scanner;

public class Pratica11 {
    //Escreva um programa que solicite uma temperatura em graus Celsius e calcule o correspondente em Fahrenheit.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = teclado.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;   

        System.out.printf("A temperatura em Fahrenheit é: %.2f\n", fahrenheit);

        teclado.close();
    }
}