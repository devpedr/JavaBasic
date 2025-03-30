package src.exercice.pOO.application71.calculatorV1.util;

public class Calculator {
    public final double PI = 3.14159; // Declaracão de membro estatico

    public double circumference(double radius) { // Criacão da funcão circuference com argumento radius
        return 2 * PI * radius;
    }
    public double volume(double radius) { // Criacão da funcão volume com argumento radius
        return 4.0 * PI * Math.pow(radius,3) / 3.0;
    }
}
// Primeira versão do exemplo, mostra que ao criar um metodo com funcões não estáticas, será necessario a instanciacão da classe main