package src.exercice.pOO.exercicio_14;

import src.exercice.pOO.exercicio_14.entites.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("QUANTOS ALUNOS SERAO DIGITADOS= ");
        int n = sc.nextInt();
        sc.nextLine();

        Aluno[] vetAluno = new Aluno[n];

        double media = 0.0;
        for (int i = 0; i < n; i++) {

            System.out.println("Nota do " + (i + 1) + "º aluno");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Primeiro semestre: ");
            double primeiro = sc.nextDouble();

            System.out.print("Segundo semestre: ");
            double segundo = sc.nextDouble();
            vetAluno[i] = new Aluno(name, primeiro, segundo);

            sc.nextLine();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < n; i++) {
            if (vetAluno[i].getMedia() >= 6.0) {

                System.out.println(vetAluno[i].getName());
            }
        }
    }


    }

