package src.exercice.Pesquisa;

import java.util.*;
public class SomaNumeros {

    private List<Integer> listNumber;

    public SomaNumeros() {
        this.listNumber = new ArrayList<>();
    }

    public void adicionaNumero(int listNumber) {
        this.listNumber.add(listNumber);
    }

    public int calculaSoma() {
        int soma = 0;
        if (!listNumber.isEmpty()) {
            for (Integer number : listNumber) {
                soma += number;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listNumber.isEmpty()) {
            for(Integer number : listNumber){
                if(number >= maiorNumero){
                    maiorNumero = number;
                }

            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listNumber.isEmpty()) {
            for(Integer number : listNumber){
                if(number <= menorNumero){
                    menorNumero = number;
                }
            }
        }
        return  menorNumero;
    }
    public void exibirNumeros() {
        System.out.println("Todos os números presente na lista é = " + listNumber);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionaNumero(1);
        somaNumeros.adicionaNumero(4);
        somaNumeros.adicionaNumero(5);
        somaNumeros.adicionaNumero(6);
        somaNumeros.adicionaNumero(7);

        somaNumeros.calculaSoma();
        System.out.println("A soma de todos os números da lista é = " + somaNumeros.calculaSoma());

        somaNumeros.encontrarMaiorNumero();
        System.out.println("O maior número da lista é = " + somaNumeros.encontrarMaiorNumero());

        somaNumeros.encontrarMenorNumero();
        System.out.println("O menor número da lista é = " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }
}
