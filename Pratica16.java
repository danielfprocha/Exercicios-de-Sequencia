import java.util.Scanner;

public class Pratica16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número com três algarismos: ");
        int numero = teclado.nextInt();

        if (numero < 100 | numero > 999) {
            System.out.println("Número inválido. Por favor, digite um número com três algarismos.");
            teclado.close();
            return;
        }

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int numeroInvertido = unidade * 100 + dezena * 10 + centena;
        System.out.printf("Número invertido: %d\n", numeroInvertido);

        teclado.close();
    }
}