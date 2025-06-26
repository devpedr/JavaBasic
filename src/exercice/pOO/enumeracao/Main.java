package src.exercice.pOO.enumeracao;

import src.exercice.pOO.enumeracao.entites.Client;
import src.exercice.pOO.enumeracao.entites.Order;
import src.exercice.pOO.enumeracao.entites.OrderItem;
import src.exercice.pOO.enumeracao.entites.Product;
import src.exercice.pOO.enumeracao.enun.OrderStatus;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter Cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYY): ");
        LocalDate birthDate = LocalDate.parse(sc.next(),dtf);
        Client client = new Client(name, email,birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next().toUpperCase();
        Order order = new Order(LocalDateTime.now(),OrderStatus.valueOf(status),client);
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i= 0;i<n;i++){
            System.out.println("Enter #"+(1+i)+" item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Double price = productPrice;
            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(quantity,price,product);
            order.addItem(orderItem);
        }
        System.out.println(order);
        sc.close();




    }
}
