package src.exercice.listaJavaCondicionais.Java14;

import java.util.Scanner;

public class multiplos {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("NÚMEROS MÚTIPLOS");
        System.out.printf("Digite um valor inteiro: ");
        int valor01 = sc.nextInt();
        System.out.printf("Digite um valor inteiro: ");
        int valor02 = sc.nextInt();
        if (valor01 % valor02 == 0 || valor02 % valor01== 0) {
            System.out.println("SÃO MULTIPLOS");
        }
        else {
            System.out.println("NÃO MULTIPLOS");
        }

    }
}
