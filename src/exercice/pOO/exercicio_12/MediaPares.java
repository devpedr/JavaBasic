package src.exercice.pOO.exercicio_12;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS ELEMENTOS VAI TER O VETOR: ");
        int n = sc.nextInt();
        double[] vet = new double[n];
        double med = 0;
        int qtdMed = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("DIGITE UM NÚMERO: ");
            vet[i] = sc.nextDouble();
            if (vet[i] % 2 == 0) {
                med += vet[i];
                qtdMed++;
            }
        }
        double media = med / qtdMed;
        if (vet.length % 2==0) {
            System.out.print("\nMEDIA DOS PARES: " + media);
        }else
            System.out.println("\nNENHUM NUMERO PAR");

        sc.close();

    }
}
