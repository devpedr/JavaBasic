package src.exercice.listaJavaBasico.Java10;

import java.util.Scanner;

public class quatroInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.printf("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.printf("Digite o valor de C: ");
        int c = sc.nextInt();
        System.out.printf("Digite o valor de D: ");
        int d = sc.nextInt();
        int diferenca = a * b - c * d;
        System.out.println("O valor da diferança é = " + diferenca);

    }
}
