package src.exercice.pOO.exercicio_03;

import src.exercice.pOO.exercicio_03.entites.Students;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Students students = new Students();

        System.out.print("DIGITE NOME DO ALUNO: ");
        students.name = sc.nextLine();
        System.out.print("DIGITE A PRIMEIRA NOTA: ");
        students.first = sc.nextDouble();
        System.out.print("DIGITE A SEGUNDA NOTA: ");
        students.second = sc.nextDouble();
        System.out.print("DIGITE A TERCEIRA NOTA: ");
        students.three = sc.nextDouble();
        System.out.print(students);

        if (students.somarNota() >= 60 ) {
            System.out.println("\nPASS");
        }
        else {
            System.out.println("\nFAILED");
            double missing = 60 - students.somarNota();
            System.out.printf("MISSING: " + String.format("%.2f",missing) + " POINTS");
        }
        sc.close();

    }
}
