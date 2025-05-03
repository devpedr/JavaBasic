/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

package src.exercice.pOO.exercicio_10;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS VALORES VAI SER CADA VETOR = ");
        int n = sc.nextInt();
        int []vetA= new int[n];
        int []vetB= new int[n];
        int []vetC= new int[n];

        System.out.println("DIGITE OS VALORES DO VETOR A:");
        for (int i = 0;i<n;i++){
            vetA[i] = sc.nextInt();
        }

        System.out.println("DIGITE OS VALORES DO VETOR B:");
        for (int i = 0;i<n;i++){
            vetB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0;i<n;i++){
            vetC[i] = vetA[i]+vetB[i];
            System.out.println(vetC[i]);
        }

    }
}
