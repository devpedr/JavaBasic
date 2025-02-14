package src.exercice.listajavabasico.Java09;

import java.util.Locale;
import java.util.Scanner;

public class areaPi {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor do raio de um circulo: ");

        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * (Math.pow(raio,2));

        System.out.println(pi);

        System.out.printf("Valor da area = %.4f", area);
    }
}
