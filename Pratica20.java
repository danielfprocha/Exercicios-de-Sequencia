import java.util.Scanner;

public class Pratica20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é o preço por litro do álcool?");
        double precoAlcool = teclado.nextDouble();

        System.out.println("Qual é o preço por litro da gasolina?");
        double precoGasolina = teclado.nextDouble();

        if (precoAlcool <= precoGasolina * 0.7) {
            System.out.println("Abasteça com álcool.");
        } else {
            System.out.println("Abasteça com gasolina.");
        }

        teclado.close();
    }
}
