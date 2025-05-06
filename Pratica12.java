import java.util.Scanner;

public class Pratica12 {
    //Escreva um programa que solicite o tempo gasto em uma viagem e a distância percorrida. Em seguida, calcule e imprima a velocidade média da viagem.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double tempo, distancia, velocidade;

        System.out.println("Digite o tempo gasto em horas: ");
        tempo = teclado.nextDouble();

        System.out.println("Digite a distancia percorrida em km: ");
        distancia = teclado.nextDouble();

        velocidade = distancia / tempo;

        System.out.printf("A velocidade média foi de: %.2f km/h", velocidade); 

        teclado.close();
    }
}