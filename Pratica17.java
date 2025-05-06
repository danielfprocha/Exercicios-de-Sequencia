import java.util.Scanner;


public class Pratica17 {
    //Escreva um programa que calcule o salário de uma pessoa jurídica na modalidade MEI. O usuário deve entrar com o valor da hora trabalhada e a quantidade de horas trabalhadas no mês. O sistema deve calcular o valor total bruto, os impostos e o valor líquido recebido. Considere que o imposto sobre o serviço é de 6% sobre o valor bruto.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quanto você recebe por hora trabalhada?");
        double valorHora = teclado.nextDouble();

        System.out.println("Qual é a quantidade de horas que você trabalha no mês?");
        double horasTrabalhadas = teclado.nextDouble();


        double totalBruto = valorHora * horasTrabalhadas;
        double imposto = totalBruto * 0.06;
        double totalLiquido = totalBruto - imposto;

        System.out.printf("O valor total bruto é: R$ %.2f  \n", totalBruto ); 
        System.out.printf("O valor do imposto é: R$ %.2f  \n", imposto);
        System.out.printf("O valor total líquido é: R$ %.2f  \n", totalLiquido);

        

        teclado.close();
    }

    
}
