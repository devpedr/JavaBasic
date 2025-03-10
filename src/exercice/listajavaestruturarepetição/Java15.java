package src.exercice.listajavaestruturarepetição;
import java.util.Scanner;

public class Java15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.printf("DIGITE UMA VALOR: ");
        double n = sc.nextInt();
        double peso1 = 3;
        double peso2= 0;
        double peso3 = 0;

        for (int i = 1; i <= n; i++) {
            double valor = sc.nextDouble();
            if (i == 1) {
                peso1 = valor * 2;
            }else if (i == 2) {
                peso2 = valor * 3;
            }else if (i == 3) {
                peso3 = valor * 5;
            }

        }
        double total = (peso1 + peso2 + peso3)/ 10;
        System.out.printf("%.1f",total);

    }
}
