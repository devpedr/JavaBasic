package src.exercice.listajavabasico.Java01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Idade {

    public static void main (String[] args) {
        String hoje = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonthValue();
        int day = LocalDate.now().getDayOfMonth();

        Scanner sc = new Scanner(System.in);


        System.out.printf("Qual é o dia do seu nascimento: ");
        int dia = sc.nextInt();
        System.out.printf("Qual é o mês do seu nascimento: ");
        int mes = sc.nextInt();
        System.out.printf("Qual é o ano do seu nascimento: ");
        int ano = sc.nextInt();

        int valorAno = year - ano;
        int valorMes = month - mes;
        int valorDay = day - dia;

        if (dia<0){
            valorMes--;
            dia +=30;
        }
        if (mes<0){
            valorMes--;
            mes+=12;
        }
        int totalDays = (valorAno * 365) + (valorMes * 30) + valorDay;
        System.out.println("A idade expressa em dias desde "+dia+"/"+mes+"/"+ano+" é:"+totalDays+" dias");

    }


}
