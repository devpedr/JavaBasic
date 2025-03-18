package src.exercice.listaJavaEstruturaRepetição.Java13;

import java.util.Scanner;

public class postoCombu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("CODIGO DO TIPO DE COMBUSTIVEL: ");
        int produto = sc.nextInt();
        int quantiAlcool = 0;
        int quantiGasolina = 0;
        int quantiDiesel = 0;

        while (produto != 4) {

            if (produto == 1) {
            quantiAlcool += 1;

            } else if (produto == 2) {
            quantiGasolina += 1;

            } else if (produto == 3) {
            quantiDiesel += 1;
            } else if (produto == 0 || produto > 4) {
                System.out.println("\nERRO DE CODIGO!!\n");
            }
            System.out.printf("CODIGO DO TIPO DE COMBUSTIVEL: ");
            produto = sc.nextInt();
        }
        System.out.println("\nMUITO OBRIGADO!!");
        System.out.printf("Alcool: " + quantiAlcool +"\nGasolina: " + quantiGasolina + "\nDiesel: " + quantiDiesel);
        sc.close();
        }
    }
