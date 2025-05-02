/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
 */

package src.exercice.pOO.exercicio_08;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números a ser digitados: ");
        int n = sc.nextInt();
        int[]vet= new int[n];

        for(int i = 0; i<n;i++){
            System.out.print("Digite números inteiros: ");
            vet [i] = sc.nextInt();
            }
        System.out.println("Números pares: ");

        int qtdPar= 0;
        for (int i = 0; i<n;i++){
            if (vet[i]%2==0){
                qtdPar++;
                System.out.print(vet[i]+" ");

            }
        }
        System.out.println("\nQuantidade de números pares: "+qtdPar);

        sc.close();
    }

}

