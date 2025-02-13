package listajavacondicionais.Java03;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("DIGITE UM NÚMERO PARA SABER SE ELE É PAR OU ÍMPAR: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O número "+num+" é par!!");
        }
        else{
            System.out.println("o número "+num+" é impar!!");
        }


    }
}
