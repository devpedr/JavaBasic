package src.exercice.pOO.applicationV1_2.entites;

public class Triangle02 { // Classe pode conter membros e nesse exercicio so contém atributos (dados/campos)
    public double a;
    public double b;
    public double c;

    public double area(){ /*Criação do metodo do cálculo de area, onde estava se repetindo duas vezes no código*/
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
}

/* public class Triangle02 { // Triangle é o nome da classe
    public double a;
    public double b;         // Atributos da classe. O prefixo "public" india que o atributo ou metodo
    public double c;            pode ser usado em outros arquivos

    public double area(){                                      // A criação do metodo necessita do prefixo public o tipo do metodo(int, double, String..)
        double p = (a+b+c)/2;                                    nome do metodo, e entre () deve conter os parâmetros, caso não tenha na classe, nesse exemplo
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));                   já temos os atributos (a, b e c).

    }
}*/