//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

package src.exercice.pOO.exercicio_06;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double soma = 0.0;
        double[] vet = new double[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");

        for (int i = 0; i < n; i++){
            System.out.print(" " + vet[i]);
            soma+=vet[i];
        }
        System.out.print("\nSOMA = ");
        System.out.printf("%.2f",soma);

        double media = soma / n;
        System.out.print("\nMEDIA = ");
        System.out.printf("%.2f", media);

        sc.close();

    }
}
