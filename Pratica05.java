import java.util.Scanner;

public class Pratica05 {
   //Escreva um programa que leia, em sequência, um nome e uma idade, e depois outro nome e outra idade, coloque-os em quatro variáveis e, logo depois, imprima-os na tela no seguinte formato:
   //"Nome1: {nome1}, Idade1: {idade1}"
   //"Nome2: {nome2}, Idade2: {idade2}"
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

    System.out.println("Diga um nome: ");
       String nome1 = teclado.nextLine();

    System.out.println("Diga a idade de " + nome1 + ": ");
       int idade1 = teclado.nextInt();
       teclado.nextLine();

    System.out.println("Diga outro nome: ");
       String nome2 = teclado.nextLine();

    System.out.println("Diga a idade de " + nome2 + ": ");
       int idade2 = teclado.nextInt();

       System.out.println("Nome1: " + nome1 + ", Idade2: " + idade1); 
       System.out.println("Nome2: " + nome2 + ", Idade2: " + idade2);


     

     teclado.close();

    }
}       