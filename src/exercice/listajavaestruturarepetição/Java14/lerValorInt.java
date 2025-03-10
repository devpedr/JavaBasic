package src.exercice.listajavaestruturarepetição.Java14;

import java.util.Scanner;

public class lerValorInt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("ESCREVA UM VALOR INTEIRO: ");
        int x = sc.nextInt();
        System.out.println("Os valores impares são:");
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}