package listajavaestruturarepetição.Java02;

import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class AlturaPessoas {
    public static void main(String[]args){
        double altura = 0;
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        for (int i= 0; i<=15; i++){
            System.out.printf("Digite a sua altura em metros: ");
            altura = sc.nextDouble();
            list.add(altura);
        }
        double max = Collections.max(list);
        double min = Collections.min(list);
        System.out.println("O aluno de maior altura tem: "+ max +" metros");
        System.out.println("O aluno de menor altura tem: "+ min +" metros");
    }
}
