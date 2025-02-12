package listajavacondicionais.Java06;
import java.util.Scanner;
public class Booleanos {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("DIGITE VALOR VERDADEIRO (true) OU FALSO (false): ");
        boolean valor0 = sc.nextBoolean();
        System.out.printf("DIGITE VALOR VERDADEIRO (true) OU FALSO (false): ");
        boolean valor01 = sc.nextBoolean();

        if(valor0 && valor01) {
            System.out.println("Os valores são verdadeiros!!");
        }
        else if(!valor0 && !valor01) { //"!" antes da variavel siginifica negação
            System.out.println("Os valores são falsos!!");
        }
        else {
            System.out.println("Os valores são diferentes!!");
        }
    }
}
