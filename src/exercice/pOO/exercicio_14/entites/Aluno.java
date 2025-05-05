/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */

package src.exercice.pOO.exercicio_14.entites;

public class Aluno {

    private String name;
    private double primeiro;
    private double segundo;


    public Aluno(String name, double primeiro, double segundo){
        this.name = name;
        this.primeiro = primeiro;
        this.segundo =segundo;
    }
    public double getMedia(){
        return (primeiro + segundo) / 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(double primeiro) {
        this.primeiro = primeiro;
    }

    public double getSegundo() {
        return segundo;
    }

    public void setSegundo(double segundo) {
        this.segundo = segundo;
    }
}
