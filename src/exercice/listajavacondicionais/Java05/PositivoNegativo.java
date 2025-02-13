package src.exercice.listajavacondicionais.Java05;
import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("DIGITE UM NÚMERO POSITIVO OU NEGATIVO: ");
        int num = sc.nextInt();
        if(num>0){
            int mult = num * 2;
            System.out.println("Seu número é positivo e o dobro dele é: "+mult);
        }
        else{
            int mult = num * 3;
            System.out.println("Seu número é negativo e o triplo dele é: "+mult);
        }
    }
}
