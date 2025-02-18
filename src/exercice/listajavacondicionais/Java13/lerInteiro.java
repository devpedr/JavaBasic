package src.exercice.listajavacondicionais.Java13;
import java.util.Scanner;

public class lerInteiro {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Digite um valor para saber se é negativo ou não:");
        int valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("NEGATIVO");
        }
        else
            System.out.println("NÃO NEGATIVO");

    }
}
