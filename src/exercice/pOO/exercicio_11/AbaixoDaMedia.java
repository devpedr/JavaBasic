/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

package src.exercice.pOO.exercicio_11;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS ELEMENTOS VAI TER O VETOR: ");
        int n = sc.nextInt();
        double []vet= new double[n];

        double med=0;
        for (int i = 0;i<n;i++){
            System.out.print("DIGITE UM NÚMERO: ");
            vet[i]= sc.nextDouble();

            med += vet[i];
        }
        double media = med/n;
        System.out.printf("MEDIA DO VETOR = %.3f ",media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA:");


        for (int i = 0;i<n;i++){
            if (vet[i]< media){
                System.out.println(vet[i]);
            }

        }

    }
}
