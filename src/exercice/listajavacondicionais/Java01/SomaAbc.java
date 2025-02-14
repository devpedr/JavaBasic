package src.exercice.listajavacondicionais.Java01;

import java.util.Scanner;

public class SomaAbc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("DIGITE O VALOR DE A: ");
        double a = sc.nextDouble();
        System.out.printf("DIGITE O VALOR DE B: ");
        double b = sc.nextDouble();
        System.out.printf("DIGITE O VALOR DE C: ");
        double c = sc.nextDouble();

        double soma = a + b;

        if (soma > c) {
            System.out.println("A SOMA DE A + B É MAIOR QUE C !!!");
        } else {
            System.out.println("A SOMA DE A + B É MENOR QUE C !!!");
        }
    }
}
