package src.exercice.listajavabasico.Java05;
import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        double salarioMin = 788; //valor do salario minimo pedido no exercicio

        System.out.printf("Qual é o valor do seu sálario:R$");
        double salario = sc.nextDouble();

        double quantSalario = salario / salarioMin;

        if (salarioMin > salario){
            System.out.println("Seu sálario é menor que o sálario minimo!!");
        }
        else{
            System.out.printf("Você recebe %.1f sálario minimo",quantSalario); // quantSalario irá substituir "%.1f%n" formatado

        }
    }
}
