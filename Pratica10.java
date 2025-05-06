import java.util.Scanner;

public class Pratica10 {
    //Escreva um programa que solicite dois valores de quilometragem em uma estrada e calcule a distância em quilômetros entre um ponto e outro. Importante: não utilize nenhum comando de decisão como IF ou CASE, e os valores podem ser fornecidos em qualquer ordem, seja o maior primeiro e o menor depois, ou vice-versa.
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira quilometragem: ");
        double km1 = teclado.nextDouble();

        System.out.println("Digite a segunda quilometragem: ");
        double km2 = teclado.nextDouble();

        double distancia = Math.abs(km2 - km1);

        System.out.println("A distância entre os dois pontos é de: " + distancia + " km.");

     teclado.close();

    }
}       