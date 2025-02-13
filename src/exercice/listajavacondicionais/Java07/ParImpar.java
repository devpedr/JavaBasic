package src.exercice.listajavacondicionais.Java07;
import java.util.Scanner;
public class ParImpar {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    System.out.printf("DIGITE UM NÚMERO: ");
    int num = sc.nextInt();
    int soma= 0;

    if (num % 2 == 0){
        soma = num + 5;
        System.out.println("A SOMA DE "+num+" + 5 É IGUAL A: "+soma);
    }
    else {
        soma = num + 8;
        System.out.println("A SOMA DE "+num+" + 8 É IGUAL A: "+soma);
    }

    }
}
