package src.exercice.listaJavaCondicionais.Java11;
import java.util.Scanner;
public class CondicaoPagamento {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double desconto = 0;
        double preco = 0;
        System.out.printf("QUAL O VALOR DO PRODUTO: R$");
        double produto = sc.nextDouble();
        System.out.println("--------------------------------------------------------");
        System.out.println("FORMAS DE PAGAMENTO:\n" +
                "[1] Dinheiro ou Cheque, recebe 10%% de desconto\n"+
                "[2] Cartão de Crédito, recebe 15%% de desconto\n"+
                "[3] Em duas vezes, preço normal do produto\n"+
                "[4] Em duas vezes, preço do produto mais 10%% de juros");
        System.out.printf("= ");
        int pagamento = sc.nextInt();
        System.out.println("--------------------------------------------------------");

        if (pagamento == 1){
            desconto = (produto*10)/100;
            preco = produto - desconto;
            System.out.printf("O VALOR A SER PAGO = R$%.2f\n", preco);
        }
        else if (pagamento == 2){
            desconto = (produto*15)/100;
            preco = produto - desconto;
            System.out.printf("VALOR A SER PAGO = R$%.2f\n",preco);
        }
        else if (pagamento == 3){
            System.out.printf("VALOR A SER PAGO = R$%.2f\n",produto);
        }
        else if (pagamento == 4){
            desconto = (produto*10)/100;
            preco = produto + desconto;
            System.out.printf("VALOR A SER PAGO = R$%.2f\n",preco);
        }
        System.out.println("--------------------------------------------------------");

    }
}
