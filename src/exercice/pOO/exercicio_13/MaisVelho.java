package src.exercice.pOO.exercicio_13;

import src.exercice.pOO.exercicio_13.entites.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar = ");
        int n = sc.nextInt();
        sc.nextLine();


        Pessoa[] vet = new Pessoa[n];
        int maior = 0;
        String idadeMaior = ".";

        for (int i = 0;i<n;i++){
            System.out.println("Dados da "+(i+1)+"a pessoa: ");
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int years = sc.nextInt();

            vet[i] = new Pessoa(name,years);
            if(years > maior){
                maior = years;
                idadeMaior = name;
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+ idadeMaior);
        sc.close();
    }
}
