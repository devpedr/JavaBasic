package src.exercice.listajavabasico.Java06;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int num = sc.nextInt();

        int ante = num - 1;
        int suce = num + 1;

        System.out.printf("Antecessor: " + ante + " Numeral: " + num + " Sucessor: " + suce);
    }
}
