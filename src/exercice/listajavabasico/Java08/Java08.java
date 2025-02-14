package src.exercice.listajavabasico.Java08;

import java.util.Scanner;

public class Java08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.printf("Digite o primeiro valor: ");
        int a = sc.nextInt();
        System.out.printf("Digite o segundo valor: ");
        int b = sc.nextInt();
        int soma = a + b;

        System.out.println("O valor da soma de "+ a + " + " + b + " = " + soma);
    }
}
