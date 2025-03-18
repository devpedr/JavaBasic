package src.exercice.listaJavaEstruturaRepetição.Java10;
import java.util.Scanner;

public class Permutacao {
    public static void main(String[]args){
        Scanner entry= new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int num0 = entry.nextInt();
        System.out.printf("Digite o segundo número: ");
        int num1 = entry.nextInt();
        int fat= num0;

        for (int i = 1; i < fat; i++) {
            num0 *= i;
        }

        if (num1 == num0)
            System.out.println("O número " + num1 + " é permutação de " + fat);
        else
            System.out.println("O número " + num1 + " é permutação de " + fat);

    }

}
