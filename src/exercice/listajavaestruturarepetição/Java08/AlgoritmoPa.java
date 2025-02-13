package src.exercice.listajavaestruturarepetição.Java08;
import java.util.Scanner;
public class AlgoritmoPa {
    public static void main (String[]args){
        int pa = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("DIGITE UM VALOR INICIAL: ");
        int value = sc.nextInt();

        System.out.printf("DIGITE UMA RAZÃO: ");
        int razao = sc.nextInt();

        System.out.printf("Sequência dos 10 primeiros termos de uma P.A com valor inicial "+value+" e razão "+razao);
        System.out.printf(" é igual a: ");
        for(int i = 1; i <=10;i++){
            pa = value+(i-1)*razao;
            System.out.printf(" "+pa);
        }



    }
}
