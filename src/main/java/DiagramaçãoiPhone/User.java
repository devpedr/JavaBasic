package src.main.java.DiagramaçãoiPhone;

import iPhone.Iphone;
import java.util.Scanner;

public class User {
    public User() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Iphone iphone = new Iphone();
        System.out.println("[1] Escutar música\n[2] Fazer Ligação\n[3] Navegar na iPhone.Internet");
        System.out.printf("Select an option: ");
        int option = scan.nextInt();
        switch (option) {
            case 1 -> iphone.ReprodutorMusical();
            case 2 -> iphone.AparelhoTelefonico();
            case 3 -> iphone.NavegadorInternet();
            default -> System.out.println("DIGITE NÚMERO DE 1 A 3");
        }

    }
}