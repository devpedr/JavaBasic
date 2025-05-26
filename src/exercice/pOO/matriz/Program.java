/*Fazer um programa para ler dois numeros inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo numeros
* inteiros, podendo haver repetiçoes. em seguida, ler um numero inteiro X que pertence á matriz.
* Para cada ocorrencia de X, mostrar os valores á esquerda, acima, á direita e abaixo de X, quando
* houver.*/

package src.exercice.pOO.matriz;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da linha da matriz: ");
        int m = sc.nextInt();
        System.out.print("Digite o tamanho da coluna da matriz: ");
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                mat[l][c] = sc.nextInt();
            }
        }
        System.out.print("Posição do número desejado: ");
        int x = sc.nextInt();
        System.out.println("------------------------------");
        for (int l = 0; l < mat.length; l++) {
            for (int c = 0; c < mat[l].length; c++) {
                if (mat[l][c] == x) {
                    System.out.println("Position: " + l + "," + c);

                if (c > 0){
                    System.out.println("Left: "+mat[l][c-1]);

                }
                if (c < mat[l].length-1) {
                    System.out.println("Rigth: " + mat[l][c+1]);
                }
                if (l > 0){
                    System.out.println("Up: "+mat[l-1][c]);
                    }
                if (l < mat.length-1){
                    System.out.println("Down: "+mat[l+1][c]);
                }


                    }
                }
            }
        }
}


