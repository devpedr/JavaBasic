package src.exercice.listajavacondicionais.Java15;
import java.util.Scanner;
public class horaJogo {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Hora inicial do jogo: ");
        int hora01 = sc.nextInt();
        System.out.printf("Hora final do jogo: ");
        int hora02 = sc.nextInt();

        int somaHoras;
        if (hora01 < hora02) {
            somaHoras = (hora02 - hora01);
        }
        else somaHoras = 24 - hora01 + hora02;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", somaHoras);
    }

}
