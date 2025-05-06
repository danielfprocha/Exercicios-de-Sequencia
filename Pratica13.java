import java.util.Scanner;

public class Pratica13 {
    //Escreva um programa que solicite duas coordenadas geográficas (latitude e longitude) e calcule a distância geodésica entre elas em quilômetros.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a latitude do primeiro ponto: ");
        double lat1 = teclado.nextDouble();

        System.out.println("Digite a longitude do primeiro ponto: ");
        double lon1 = teclado.nextDouble();

        System.out.println("Digite a latitude do segundo ponto: ");
        double lat2 = teclado.nextDouble();

        System.out.println("Digite a longitude do segundo ponto: ");
        double lon2 = teclado.nextDouble();

        double distancia;
        distancia = Math.sqrt(Math.pow(lat2 - lat1, 2) + Math.pow(lon2 - lon1, 2)); 

        System.out.printf("A distancia entre os dois pontos é de: %.2f km", distancia);

        teclado.close();
    }
}
