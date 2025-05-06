import java.util.Scanner;

public class Pratica18 {
    //Escreva um programa que calcule o consumo energético de um eletrodoméstico. O usuário deve entrar com a potência do eletrodoméstico (em watts), o tempo de uso diário (em horas) e o número de dias de uso. O sistema deve calcular o consumo total em quilowatt-hora (kWh) e o custo, considerando o valor do kWh.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é a potência do eletrodoméstico (em watts)?");
        double potencia = teclado.nextDouble();

        System.out.println("Qual é o tempo de uso diário (em horas)?");
        double tempoUsoDiario = teclado.nextDouble();

        System.out.println("Qual é o número de dias de uso?");
        double diasUso = teclado.nextDouble();

        double tempoTotal = tempoUsoDiario * diasUso;
        double potenciakWh = potencia / 1000;
        double consumoTotal = potenciakWh * tempoTotal;
        double valorkWh = 0.75;
        double custoTotal = consumoTotal * valorkWh;

        System.out.printf("O consumo total em kWh é: %.2f kWh \n", consumoTotal);
        System.out.printf("O custo total é: %.2f reais \n", custoTotal);

        teclado.close();
    }
}
