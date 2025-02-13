package src.exercice.listajavacondicionais.Java12;
import java.util.Scanner;
public class MediaNota {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("MÉDIA DE NOTAS EM ESCALA DE 0 A 100");

        System.out.println("--------------------------------------------------------");
        System.out.printf("Digite a primeira nota: ");
        double nota01 = sc.nextDouble();
        System.out.printf("Digite a segunda nota: ");
        double nota02 = sc.nextDouble();
        System.out.printf("Digite a terceira nota: ");
        double nota03 = sc.nextDouble();
        System.out.printf("Digite a nota dos exercicios: ");
        double me = sc.nextDouble();
        double ma = (nota01+ nota02*2 + nota03*3 + me)/7;
        System.out.println("--------------------------------------------------------");

        if (ma >= 90){
            System.out.println("Nota A");
            System.out.println("APROVADO!!");
        }
        else if (ma >= 75 && ma <= 90){
            System.out.println("Nota B");
            System.out.println("APROVADO!!");
        }
        else if (ma >= 60 && ma <= 75){
            System.out.println("Nota C");
            System.out.println("APROVADO NA MÉDIA!!");
        }
        else if (ma >= 40 && ma <= 60){
            System.out.println("Nota D");
            System.out.println("REPROVADO!!");
        }
        else if (ma <= 40){
            System.out.println("Nota E");
            System.out.println("REPROVADO");
        }

    }
}
