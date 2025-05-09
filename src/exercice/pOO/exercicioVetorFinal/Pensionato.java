/*A dona de um pensinato possui 10 quartos para alugar para estudantes, sendo esses quartos identificados pelos número 0 a 9
* Fazer um programa que inicie com todos os 10 quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos(N pode ser de 1 a 10)
* Em seguida, registre o aluguel dos N estudantes, bem como qual dos quartos ele escolheru(de 0 a 9).
* Suponha que seja escolhido um quarto vago. ao final, seu programa deve imprimir um relátorio de todas ocupações do pensionato, por ordem de quarto.*/

package src.exercice.pOO.exercicioVetorFinal;

import src.exercice.pOO.exercicioVetorFinal.entites.CadastroPensionato;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("HOW MANY ROOMS WILL BE RENTED: ");
        int n = sc.nextInt();
        sc.nextLine();
        CadastroPensionato[]vetPensionato = new CadastroPensionato[10];


        for (int i = 1;i<=n;i++){
            System.out.println("Rent #"+ i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            // verifica se o quarto esta ocupado
            if (room<= 9) {
                if (vetPensionato[room] == null) { // variavel room define a posição na memoria que e escolhida pelo usuario
                    vetPensionato[room] = new CadastroPensionato(name, email);
                } else {
                    System.out.println("Room already occupied! Try another room.");
                    --i;
                }
            }
            else{
                System.out.println("We don't have that room "+room+"!! choose from 0 to 9.");
                --i;
            }
        }
        System.out.println("\nBusy rooms:");

        for (int i = 0;i<vetPensionato.length;i++){
            if (vetPensionato[i]!=null){
                System.out.println(i+": "+vetPensionato[i]);
            }
        }
        sc.close();

    }

}
