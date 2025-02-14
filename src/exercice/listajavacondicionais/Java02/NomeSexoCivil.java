package src.exercice.listajavacondicionais.Java02;

import java.util.Scanner;

public class NomeSexoCivil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = 0;

        System.out.printf("Digite seu Nome: ");
        String nome = sc.nextLine();
        System.out.printf("Digite seu Sexo [M ou F]: ");
        String sexo = sc.nextLine();
        System.out.printf("Digite seu Estado Civil: ");
        String estadoCivil = sc.nextLine();

        String sexoMaiusculo = sexo.toUpperCase();
        String estadoCivilMaiusculo = estadoCivil.toUpperCase();


        if (sexoMaiusculo.equals("F") && estadoCivilMaiusculo.equals("CASADA")) {
            System.out.printf("Quanto tempo de casada em anos: ");
            years = sc.nextInt();
        }
        System.out.println(nome + " você é do sexo " + sexoMaiusculo + " e é " + estadoCivilMaiusculo + " a " + years + " ano(s)");

    }
}
