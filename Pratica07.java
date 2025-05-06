import java.util.Scanner;

public class Pratica07 {
        //Escreva um programa que leia seis nomes e seis idades correspondentes, armazene-os em variáveis e, em seguida, calcule a soma e a média das idades. Por fim, imprima todos os nomes com suas respectivas idades, a soma total e a média das idades.
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

        System.out.println("Diga o nome da primeira pessoa: ");
                String nome1 = teclado.nextLine();

        System.out.println("Diga a idade de " + nome1 + ": ");
                int idade1 = teclado.nextInt();
                teclado.nextLine();

        System.out.println("Diga o nome da segunda pessoa: ");
                String nome2 = teclado.nextLine();

        System.out.println("Diga a idade de " + nome2 + ": ");
                int idade2 = teclado.nextInt();
                teclado.nextLine();

        System.out.println("Diga o nome da terceira pessoa: ");
                String nome3 = teclado.nextLine();

        System.out.println("Diga a idade de " + nome3 + ": ");
                int idade3 = teclado.nextInt();
                teclado.nextLine();

        System.out.println("Diga o nome da quarta pessoa: ");
                String nome4 = teclado.nextLine();

        System.out.println("Diga a idade de " + nome4 + ": ");
                int idade4 = teclado.nextInt();
                teclado.nextLine();

        System.out.println("Diga o nome da quinta pessoa: ");
                String nome5 = teclado.nextLine();

        System.out.println("Diga a idade de " + nome5 + ": ");
                int idade5 = teclado.nextInt();
                teclado.nextLine();

        System.out.println("Diga o nome da sexta pessoa: ");
                String nome6 = teclado.nextLine();

        System.out.println("Diga a idade de " + nome6 + ": ");  
                int idade6 = teclado.nextInt();
                teclado.nextLine();

        int soma = idade1 + idade2 + idade3 + idade4 + idade5 + idade6;
        int media = soma / 6;

        System.out.println("Nome1: " + nome1 + ", Idade1: " + idade1);
        System.out.println("Nome2: " + nome2 + ", Idade2: " + idade2);
        System.out.println("Nome3: " + nome3 + ", Idade3: " + idade3);
        System.out.println("Nome4: " + nome4 + ", Idade4: " + idade4);
        System.out.println("Nome5: " + nome5 + ", Idade5: " + idade5);
        System.out.println("Nome6: " + nome6 + ", Idade6: " + idade6);
        System.out.println("A soma das idades é: " + soma);
        System.out.println("A média das idades é: " + media);



     teclado.close();

    }
}       