import java.util.Scanner;

public class Pratica08 {
    //Escreva um programa que solicite o nome de uma cidade, a distância desde a sua casa até a cidade, quantos quilômetros por litro seu carro faz e o valor do litro de gasolina. Em seguida, calcule o custo da viagem em combustível e imprima o resultado.
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de uma cidade: ");
        String cidade = teclado.nextLine();

        
        System.out.println("Digite a distância entre a sua casa e a cidade, em km: ");
        int distancia = teclado.nextInt();
        
        System.out.println("Digite quantos km/L seu carro faz: ");
        double consumo = teclado.nextDouble();

        System.out.println("Digite o preço do litro de gasolina: ");
        double preco = teclado.nextDouble();

        double litros = distancia / consumo;
        double custo = litros * preco;

        System.out.println("Para ir da sua casa até " + cidade + " você gastará " + custo + " reais.");

    



     teclado.close();

    }
}       