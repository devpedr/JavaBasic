/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero)*/

package src.exercice.pOO.exercicio_09;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de números a ser digitados: ");
        int n = sc.nextInt();
        double []vet=new double[n];

        double maior = vet[0];
        int posiMaior = 0;

        for (int i=0;i<vet.length;i++){
            System.out.print("Digite os números reais: ");
            vet[i]= sc.nextDouble();
            if (vet[i] > maior){
                maior = vet[i];
                posiMaior=i;
            }

        }
        System.out.print("MAIOR VALOR = "+maior);
        System.out.println("\nPOSICAO DO MAIOR VALOR= " +posiMaior);

    }
}
