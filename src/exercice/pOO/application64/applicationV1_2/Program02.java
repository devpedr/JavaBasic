/*Criando uma classe com três atributos para representar melhor o triângulo
* Classe criada em: ..entites/Triangle.java*/

package src.exercice.pOO.application64.applicationV1_2;
import java.util.Locale;
import java.util.Scanner;

import src.exercice.pOO.application64.applicationV1_2.entites.Triangle02;

public class Program02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Triangle02 x, y; // Criação das variáves x e y do tipo triangle(classe criada com características dentro)
        x = new Triangle02(); // criação do objeto com as características de triangle
        y = new Triangle02(); // criação do objeto com as características de triangle

        System.out.println("Enter the measures triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double  areaX = x.area(); // Puxando o metodo de area da class Triangle
        double  areaY = y.area(); // Puxando o metodo de area da class Triangle

        System.out.printf("The area of the triangle is: %.4f", areaX);
        System.out.printf("\nThe area of the triangle is: %.4f", areaY);

        if (areaX > areaY) {
            System.out.println("\nLarger area: X");
        }else {
            System.out.println("\nLarger area: Y");
        }

        sc.close();
    }
}
