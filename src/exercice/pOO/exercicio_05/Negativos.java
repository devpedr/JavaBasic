//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

package src.exercice.pOO.exercicio_05;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int [] vetInt = new int[n];

        for (int i = 0; i<n; i++){
            System.out.print("Digite um número: ");
            vetInt[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i<n; i ++){
            if (vetInt[i] < 0){
                System.out.printf("%d\n",vetInt[i]);
            }
        }

        sc.close();


    }
}
