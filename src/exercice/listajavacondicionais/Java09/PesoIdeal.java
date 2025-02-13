package src.exercice.listajavacondicionais.Java09;
import java.util.Scanner;
public class PesoIdeal {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.printf("DIGITE  A SUA ALTURA: ");
        double altura = sc.nextDouble();
        System.out.printf("QUAL É O SEU SEXO [F] OU [M]: ");
        String sexo = sc.next();

        String uppercaseSexo = sexo.toUpperCase();
        double peso = 0;

        if(uppercaseSexo.equals("M")){
            peso = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal = %.1f",peso);
        }
        else if(uppercaseSexo.equals("F")){
            peso = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal = %.1f ",peso);
        }

    }
}
