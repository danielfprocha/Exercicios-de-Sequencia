import java.util.Scanner;

public class Pratica19 {
    //A empresa ACME Ltda, pensando no bem-estar de seus funcionários, deseja ajudá-los a se hidratarem melhor. Para isso, você foi contratado para desenvolver um aplicativo em que calcule a quantidade ideal de água que cada funcionário deve ingerir diariamente.
    //O programa deve solicitar o nome do funcionário, o peso atual em kg e a quantidade de água já ingerida no dia em litros. Com essas informações, o programa calculará a quantidade ideal de água a ser ingerida, baseando-se na fórmula de 35 ml de água por quilo por dia, e informará quanto ainda falta para atingir essa meta.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = teclado.nextLine();

        System.out.println("Qual é o seu peso, em kg?");
        double peso = teclado.nextDouble();

        System.out.println("Qual é a quantidade de água que você já bebeu hoje, em litros?");
        double aguaIngerida = teclado.nextDouble();

        double quantidadeAguaIdeal = peso * 0.035;
        double quantidadeAguaFaltando = quantidadeAguaIdeal - aguaIngerida;

        System.out.printf("Nome: %s \n", nome);
        System.out.printf("Peso: %.2f kg \n", peso);
        System.out.printf("Quantidade de água ingerida: %.2f litros \n", aguaIngerida);
        System.out.printf("Quantidade ideal de água a ser ingerida diariamente: %.2f litros \n", quantidadeAguaIdeal);
        if (aguaIngerida < quantidadeAguaIdeal) {
            System.out.printf("Você ainda precisa beber %.2f litros de água hoje para bater sua meta diária. \n", quantidadeAguaFaltando);
        } else {
            System.out.println("Parabéns! Você já bebeu a quantidade ideal de água hoje!");
        }

        teclado.close();
    }
}