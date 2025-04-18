package src.exercice.pOO.exercicio_04;
import src.exercice.pOO.exercicio_04.entites.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: " );
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit(y/n)? ");
        char option = sc.next().charAt(0);

        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account  = new Account(number, holder, initialDeposit);
        }
        else {
            account  = new Account(number, holder);
        }

        System.out.println("\nAccount data: \n" + account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data: \n" + account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data: \n" + account);

        sc.close();

    }
}
