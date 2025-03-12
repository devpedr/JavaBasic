package src.exercice.listajavaestruturarepetição.Java16;

import java.util.Scanner;

public class divisaoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("DIGITE A QUANTIDADE DE NÚMEROS: ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.printf("DIGITE O PRIMEIRO VALOR: ");
            int x = sc.nextInt();
            System.out.printf("DIGITE O SEGUNDO VALOR: ");
            int y = sc.nextInt();

            if ( y == 0){
                System.out.println("------------------------------");
                System.out.println("DIVISÃO IMPOSSIVEL!!");
                System.out.println("------------------------------");
            }
            else {
                double x1;
                x1 = x;
                double y1;
                y1 = y;
                double divisao = x1 / y1;
                System.out.println("------------------------------");
                System.out.println(divisao);
                System.out.println("------------------------------");
            }
        }

    }
}
