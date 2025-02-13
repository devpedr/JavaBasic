package listajavacondicionais.Java08;


import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Decrescente {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.printf("DIGITE O PRIMEIRO VALOR INTEIRO: ");
        int valor01 = sc.nextInt();
        lista.add(valor01);
        System.out.printf("DIGITE O SEGUNDO VALOR INTEIRO: ");
        int valor02 = sc.nextInt();
        lista.add(valor02);
        System.out.printf("DIGITE O TERCEIRO VALOR INTEIRO: ");
        int valor03 = sc.nextInt();
        lista.add(valor03);

        Collections.sort(lista, Collections.reverseOrder());// Ordenando o array em descrecente


        System.out.println("Os valores digitados em ordem decrescente são: "+ lista);

    }

}
