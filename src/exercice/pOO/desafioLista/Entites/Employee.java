package src.exercice.pOO.desafioLista.Entites;

public class Employee {
    private String name;
    private double salary;
    private Integer id;

    public Employee(){}

    public Employee(Integer id,String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void increaseSalary(double percentage){
        salary += salary * percentage / 100.0;
    }

    public String toString(){
        return id +", "+
                name+
                ", "+
                salary;
    }

}
