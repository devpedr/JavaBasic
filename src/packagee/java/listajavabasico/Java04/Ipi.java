package listajavabasico.Java04;
import java.util.Scanner;
public class Ipi {
    public static void main(String[] argrs) {

        Scanner sc = new Scanner(System.in);
        double valorProduto1 = 0;
        double valorProduto2 = 0;

        int quantidadeProduto1= 0;
        int quantidadeProduto2 = 0;

        System.out.printf("Digite o codigo da peça: ");
        int codigo = sc.nextInt();

        while (codigo != 0) {

            if (codigo == 0001) {
                System.out.printf("Digite o valor do produto: ");
                valorProduto1 = sc.nextDouble();

                System.out.printf("Digite a quantidade do produto: ");
                quantidadeProduto1 = sc.nextInt();

                System.out.printf("Digite o codigo da peça: ");
                codigo = sc.nextInt();
            }

            if (codigo == 0002) {
                System.out.printf("Digite o valor do produto: ");
                valorProduto2 = sc.nextDouble();

                System.out.printf("Digite a quantidade do produto: ");
                quantidadeProduto2 = sc.nextInt();

                System.out.printf("Digite o codigo da peça: ");
                codigo = sc.nextInt();
            }

            else{
                System.out.println("CÓDIGO INVALIDO!!");
                System.out.printf("Digite um código válido: ");
                codigo = sc.nextInt();
            }
        }
        System.out.printf("Digite a porcentagem do imposto: ");
        double porIpi = sc.nextDouble();
        double soma = (valorProduto1 * quantidadeProduto1 + valorProduto2 * quantidadeProduto2) * (porIpi / 100 + 1);
        System.out.println(soma);
    }
}