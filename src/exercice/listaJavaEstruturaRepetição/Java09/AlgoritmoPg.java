package src.exercice.listaJavaEstruturaRepetição.Java09;
import java.util.Scanner;
public class AlgoritmoPg {

    public static void main(String[]args){
        double pg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("DIGITE UM VALOR INICIAL: ");
        int value = sc.nextInt();

        System.out.printf("DIGITE UMA RAZÃO: ");
        double razao = sc.nextInt();

        System.out.printf("Sequência dos 10 primeiros termos de uma P.G com valor inicial "+value+" e razão %.0f",razao);
        System.out.printf(" é igual a: ");
        for (int i = 1; i <= 10;i++){

            double expoente = i - 1;
            pg = value* Math.pow(razao,expoente);
            System.out.printf("%.0f ",pg);
        }


    }
}
