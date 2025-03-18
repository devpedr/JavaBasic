package src.exercice.listaJavaEstruturaRepetição.Java07;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);
        System.out.printf("QUAL TABUADA VOCẼ DESEJA [1 a 10]: ");
        int tabuada = sc.nextInt();

        if (tabuada >= 1 && tabuada <= 10){

            System.out.println("A tabuada de "+tabuada+" é igual á :");

            for (int i = 0; i <= 10;i++){
                int mult = tabuada * i;
                System.out.println(tabuada+" X "+i+" = "+mult);
            }
        }
            else {
            System.out.printf("\nESSE PROGRAMA NÃO ACEITA TABUADA DE "+tabuada+"\n");
        }
    }
}
