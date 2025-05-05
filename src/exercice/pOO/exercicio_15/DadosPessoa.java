/*Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */

package src.exercice.pOO.exercicio_15;

import src.exercice.pOO.exercicio_15.entites.Dados;

import java.util.Locale;
import java.util.Scanner;


public class DadosPessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTAS PESSOAS SERA DIGITADAS: ");
        int n = sc.nextInt();

        double maior = 0;
        double menor = 0;
        double media = 0;
        double mediaTot= 0;
        int qtdMulhers = 0;
        int qtdHomens = 0;

        Dados[]vetDados = new Dados[n];
        for (int i=0;i<n;i++){
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            System.out.print("Gênero [M/F]: ");
            sc.nextLine(); // consume newline
            char genero = sc.nextLine().charAt(0);
            vetDados[i] = new Dados(altura,genero);

            if(vetDados[i].getGenero() == 'f' || vetDados[i].getGenero() == 'F') {
                qtdMulhers++;
                media += vetDados[i].getAltura();

            }
            else if (vetDados[i].getGenero() == 'm' || vetDados[i].getGenero() == 'M') {
                qtdHomens ++;
            }
            if(vetDados[i].getAltura() > maior){
                maior = vetDados[i].getAltura();
                menor = vetDados[i].getAltura();
            }
            else if (vetDados[i].getAltura()<menor) {
                menor = vetDados[i].getAltura();

            }
            mediaTot = media / qtdMulhers;
        }

        System.out.print("\nMenor altura: "+ menor);
        System.out.print("\nMaior altura: "+ maior);
        System.out.printf("\nMedia das alturas das mulheres: %.2f ",mediaTot);
        System.out.print("\nQuantidade de homens: "+ qtdHomens);

        sc.close();

    }
}
