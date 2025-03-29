package src.exercice.pOO.exercicio_03.entites;

public class Students {
    public String name;
    public double first;
    public double second;
    public double three;

    public double somarNota(){
        return first + second + three;
    }
    public String toString() {

        return "FINAL GRADE: " + String.format("%.2f",somarNota());
    }
}

