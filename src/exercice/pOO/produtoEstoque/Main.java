package src.exercice.pOO.produtoEstoque;
import src.exercice.pOO.produtoEstoque.entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name : ");
        product.name = sc.nextLine();
        System.out.print("Price : ");
        product.price = sc.nextDouble();
        System.out.print("Quantity : ");
        product.quantiy = sc.nextInt();
        System.out.println(product);//toString

        System.out.print("\nEnter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);
        System.out.println("Update data : " + product);// troString

        System.out.print("\nEnter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);
        System.out.print("Update data : " + product);//toString

        sc.close();



    }
}
