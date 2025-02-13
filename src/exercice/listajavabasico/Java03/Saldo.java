package src.exercice.listajavabasico.Java03;
import java.util.Scanner;

public class Saldo {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o saldo para ter uma reajuste de 1%%:R$ ");
        double saldo = sc.nextDouble();

        double reaju = saldo * 0.01;
        double somaSaldo = saldo + reaju;
        System.out.printf("O reajuste foi de R$%.2f e o saldo é de R$%.2f",reaju,somaSaldo);


    }
}
