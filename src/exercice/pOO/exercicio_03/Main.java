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
        System.out.print("FINAL GRADE: " + String.format("%.2f",students.somarNota()));

        if (students.somarNota() >= 60 ) {
            System.out.println("\nPASS");
        }
        else {
            System.out.println("\nFAILED");
            System.out.printf("MISSING: " + String.format("%.2f",students.missingPoints()) + " POINTS");
        }
        sc.close();

    }
}
