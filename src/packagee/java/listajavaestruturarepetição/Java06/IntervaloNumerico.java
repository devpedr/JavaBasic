package listajavaestruturarepetição.IntervalosNumerico;
import java.util.Scanner;

public class IntervaloNumerico {
    public static void main(String[] args) {
        int num = 1;
        Scanner sc = new Scanner(System.in);

        while (num > 0) {
            System.out.printf("Descubra o intervalo númerico [-1 PARA SAIR]: ");
            num = sc.nextInt();

            if (num >= 0 && num <= 25) {
                System.out.println("O número está no intervalo de [0 - 25]\n");
            }
            if (num > 26 && num <= 50) {
                System.out.println("O número está no intervalo de [26 - 50]\n");
            }
            if (num > 51 && num <= 75) {
                System.out.println("O número está no intervalo de [51 - 75]\n");
            }
            if (num > 76 && num <= 100) {
                System.out.println("O número está no intervalo de [76 - 100]\n");
            }
            if (num < 0) {
                System.out.println("\nVOCÊ FECHOU O PROGRAMA!!!");
                sc.close();
            }

        }
    }
}