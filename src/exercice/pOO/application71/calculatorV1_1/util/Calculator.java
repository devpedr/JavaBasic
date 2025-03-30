package src.exercice.pOO.application71.calculatorV1_1.util;

public class Calculator {
    public static final double PI = 3.14159; // Declaracão de membro estatico

    public static double circumference(double radius) { // Criacão da funcão circuference com argumento radius
        return 2 * PI * radius;
    }
    public static double volume(double radius) { // Criacão da funcão volume com argumento radius
        return 4.0 * PI * Math.pow(radius,3) / 3.0;
    }
}
// Segunda versão do exemplo, mostra que ao criar um metodo com funcões estáticas, não será necessario a instanciacão da classe main