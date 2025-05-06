import java.util.Scanner;

public class Pratica03 {
    //Escreva um programa que leia, em sequencia, dois nomes, coloque-os em duas variáveis e, logo depois imprima-os na tela, no seguinte formato:
    //"Nome1: {nome1}"
    //"Nome2: {nome2}"
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       System.out.println("Diga um nome: ");
         String nome1 = teclado.nextLine();

        System.out.println("Diga outro nome: ");
         String nome2 = teclado.nextLine();

        System.out.println("Nome1: " + nome1);
        System.out.println("Nome2: " + nome2);

        teclado.close();
    


    }
    
}
