package src.exercice.pOO.Exercicio_01;

import src.exercice.pOO.Exercicio_01.entites.rectangle;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        rectangle r = new rectangle();
        System.out.println("Enter rectangle width and height: ");
        r.width = sc.nextDouble();
        r.height = sc.nextDouble();

        System.out.println(r);

    }
}
