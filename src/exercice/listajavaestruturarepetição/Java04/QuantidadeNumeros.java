package src.exercice.listajavaestruturarepetição.Java04;
import java.util.Scanner;
import java.util.ArrayList;

public class QuantidadeNumeros {
    public static void main(String[] args) {
        double num = 1 , soma = 0, somaTotal = 0, media = 0, mediaTotal = 0;
        int contPar = 0, contImpar = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listaTotal = new ArrayList<>();
        ArrayList<Double> numerosPares = new ArrayList<>();
        ArrayList<Double> numerosImpares = new ArrayList<>();

        while (num !=0) {
            System.out.printf("Digite um numero: ");
            num = sc.nextInt();

            if (num == 0){
                listaTotal.remove(num);
                break;
            }
            if (num % 2 == 0) {
                contPar++;
                numerosPares.add(num);
                listaTotal.add(num);
            }
            if (num % 2 == 1) {
                contImpar++;
                numerosImpares.add(num);
                listaTotal.add(num);
            }
            if (num <0){
                System.out.printf("NÚMERO INCORRETO!!\nDIGITE UM NÚMERO POSITIVO: ");
                num = sc.nextInt();
            }
        }
        for (double n : numerosPares) {
            soma+=n;
            media = soma/ numerosPares.size();
        }
        for (double i : listaTotal) {
            somaTotal+=i;
            mediaTotal = somaTotal/ listaTotal.size();
        }

        System.out.println("Foi digitado "+numerosPares.size()+" pares");
        System.out.println("Foi digitado "+numerosImpares.size()+" impares");
        System.out.println("A média dos números pares é igual a " + media);
        System.out.println("A média total dos números é igual a " + mediaTotal);
    }
}