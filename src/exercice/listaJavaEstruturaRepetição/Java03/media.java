package src.exercice.listaJavaEstruturaRepetição.Java03;
import java.util.Scanner;
import java.util.ArrayList;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        double num = 1;
        int cont = 0;
        int soma = 0;
        double media = 0;
        int posi=0;
        int nega=0;


            while (num != 0) {
                System.out.printf("Digite valores negativos ou positivos: ");
                num = sc.nextDouble();
                cont++;
                if (num == 0){
                    break;
                }
                if (num > 0){

                    posi ++;
                }
                if (num < 0){

                    nega ++;
                }
                list.add(num);

            }
            for (double n : list){
                soma+=n;
                media = soma/n;
            }

            double perceNega = (nega * 100)/list.size();
            double perceposi = (posi * 100)/list.size();
            System.out.println("A média Aritmética desses valores "+list+" é = "+media);
            System.out.println("Existem "+posi+" valores positivos");
            System.out.println("Existem "+nega+" valores negativos");
            System.out.println("O percentual dos números negativos é = "+perceNega);
            System.out.println("O percentual dos números positivos é = "+perceposi);

        }
    }
