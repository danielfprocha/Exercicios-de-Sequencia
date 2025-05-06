import java.util.Scanner;

public class Pratica15 {
    //Escreva um programa que solicite as dimensões de um quarto (largura, comprimento e altura) e a área das portas e janelas. Em seguida, calcule a quantidade de tinta necessária para pintar as paredes do quarto, sabendo que cada litro de tinta pinta 10 metros quadrados.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o comprimento do seu quarto, em metros: ");
        double comprimento = teclado.nextDouble();

        System.out.println("Digite a largura do seu quarto, em metros: ");
        double largura = teclado.nextDouble();

        System.out.println("Digite a altura do seu quarto, em metros: ");
        double altura = teclado.nextDouble();

        System.out.println("Digite a área total das janelas, em metros quadrados: ");
        double areaJanelas = teclado.nextDouble();

        System.out.println("Digite a área total das portas, em metros quadrados: ");
        double areaPortas = teclado.nextDouble();

        double areaParede = (comprimento * altura);
        double areaParede2 = (largura * altura);
        double areaTotal = ((areaParede * 2) + (areaParede2 * 2)) - (areaJanelas + areaPortas); 
        double litrosTinta = areaTotal / 10; 

        System.out.printf("A quantidade necessária de tinta para pintar o quarto é de %.2f litros.", litrosTinta);

        teclado.close();
    }
}
