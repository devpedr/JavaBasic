package listajavacondicionais.Java10;
import java.util.Scanner;
public class Imc {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o sua altura: ");
        double altura = sc.nextDouble();
        System.out.printf("Digite o sua peso: ");
        double peso = sc.nextDouble();
        double imc = peso/(altura*altura);

        if ( imc < 18.5){
            System.out.printf("Seu IMC é = %.2f \n",imc);
            System.out.println("VOCÊ ESTÁ ABAIXO DO PESO!!");
        }
        else if (imc >= 18.5 && imc < 25) {
            System.out.printf("Seu IMC é = %.2f \n",imc);
            System.out.println("VOCÊ ESTÁ COM PESO NORMAL!!");
        }
        else if (imc >= 25 && imc < 30) {
            System.out.printf("Seu IMC é = %.2f \n",imc);
            System.out.println("VOCÊ ESTÁ ACIMA DO PESO!!");
        }
        else if (imc >= 30) {
            System.out.printf("Seu IMC é = %.2f \n",imc);
            System.out.println("VOCÊ ESTÁ OBESO!!");
        }
    }
}
