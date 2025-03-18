package src.exercice.listaJavaCondicionais.Java16;
import java.util.Scanner;
public class contaPagar {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.printf("Digite o código da mercadoria: ");
        int codigo = sc.nextInt();
        System.out.printf("Digite a quantidade que deseja: ");
        int quantidade = sc.nextInt();


        double preco = 0;

        if (codigo == 1){
            preco = 4;
        }
        else if (codigo == 2){
            preco = 4.50;
        }
        else if (codigo == 3){
            preco = 5.00;
        }
        else if (codigo == 4){
            preco = 2.00;
        }
        else if (codigo == 5){
            preco = 1.50;
        }
        double valor = preco * quantidade;
        System.out.println("Total: " + valor);
    }
}
