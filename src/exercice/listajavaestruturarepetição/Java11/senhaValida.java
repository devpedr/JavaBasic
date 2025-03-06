package src.exercice.listajavaestruturarepetição.Java11;
import java.util.Scanner;
public class senhaValida {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 0;

        while (senha != 2002) {
            System.out.printf("Digite seu senha: ");
            senha = sc.nextInt();

            if (senha != 2002) {
                System.out.println("Senha Inválida");
            }
        }
            System.out.println("Acesso Permitido");
            sc.close();

        }
    }
