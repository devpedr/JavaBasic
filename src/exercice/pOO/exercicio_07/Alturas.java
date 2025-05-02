//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

package src.exercice.pOO.exercicio_07;

import src.exercice.pOO.exercicio_07.entites.Pessoa;

import java.util.Scanner;
import java.util.Locale;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0.0;
        int nmenores = 0;


        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] vet = new Pessoa[n];


        for (int i = 0; i < n; i++) {

            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Name: ");
            String name = sc.nextLine();


            System.out.print("Years: ");
            int years = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine();

            vet[i] = new Pessoa(name, years, height);

        }
        for (int i = 0; i < n; i++) {
            soma += vet[i].getHeight();
        }
        double media = soma / vet.length;
        System.out.printf("\nAltura média: %.2f", media);

        for (int i = 0; i < n; i++) {
            if (vet[i].getYears() < 16) {
                nmenores++;

            }
        }
        double perceTot = nmenores * 100 / n;
        System.out.printf("\nPorcetagem de pessoas com menos de 16 anos: %.2f%%\n", perceTot);
        System.out.print("Pessoas: ");

        for (int i = 0; i < n; i++) {
            if (vet[i].getYears() < 16) {
                System.out.print(vet[i].getName()+" ");
            }

        }
        sc.close();

    }
}
