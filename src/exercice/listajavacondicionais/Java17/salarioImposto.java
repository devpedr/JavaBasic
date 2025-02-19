package src.exercice.listajavacondicionais.Java17;
import java.util.Locale;
import java.util.Scanner;

public class salarioImposto {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("DIGITE SEU SÁLRIO: R$");
        double salario = sc.nextDouble();

        double imposto = 0;

        if (salario <= 2000) {
            System.out.println("Isento");
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
        else if (salario <= 4500.00) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
        else if (salario > 4500.00) {
            imposto = (salario - 4500.00) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }
    }


}
