package src.exercice.listaJavaCondicionais.Java04;
import java.util.Scanner;
public class Abc {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.printf("DIGITE UM VALOR PARA A: ");
        int a = sc.nextInt();
        System.out.printf("DIGITE UM VALOR PARA B: ");
        int b = sc.nextInt();

        int c= 0;


        if(a==b){
            int somar = a +b;
            c = somar;
            System.out.println("A soma de A e B = "+c);
        }
        else{
            int multiplicar = a * b;
            c = multiplicar;
            System.out.println("A multiplicação de A e B = "+c);
        }



    }
}
