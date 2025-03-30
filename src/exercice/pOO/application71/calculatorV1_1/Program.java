package src.exercice.pOO.application71.calculatorV1_1;

import src.exercice.pOO.application71.calculatorV1_1.util.Calculator;
import java.util.Locale;
import java.util.Scanner;



public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius); // Criação de uma funcão chamada 'circunference', que recebe como argumento o valor de 'radius'
        double v = Calculator.volume(radius);// Criação de uma funcão chamada 'volume', que recebe como argumento o valor de 'radius'

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI Value: %.2f%n",Calculator.PI);
        sc.close();
    }

}
