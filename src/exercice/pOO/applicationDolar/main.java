package src.exercice.pOO.applicationDolar;

import src.exercice.pOO.applicationDolar.entites.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price = ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollar will be bought = ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(dollarPrice, amount);
        System.out.printf("Amount to be paid in reias = %.2f%n",result);

        sc.close();
    }
}


