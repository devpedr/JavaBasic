package src.exercice.construtores;

import src.exercice.construtores.produtoEstoqueV1_1.entites.Program;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Program prg = new Program(name, price, quantity);

        System.out.println("\nProduct data: " + prg);

        System.out.print("Enter the number of products to be added in stock: ");
        prg.AddProducts(sc.nextInt());
        System.out.println("\nUpdate data: " + prg);

        System.out.print("Enter the number of products to be removed in stock: ");
        prg.RemoveProducts(sc.nextInt());
        System.out.println("\nUpdate data: " + prg);

        sc.close();


    }
}
