package src.exercice.construtores.produtoEstoqueV1_1.entites;

public class Program {
    public String name;
    public double price;
    public int quantity;

    public Program(String name, double price, int quantity) {
        this.name = name; // "this.name" refere ao atributo "name" na classe Program
        this.price = price; // "this.price" refere ao atributo "name" na classe Program
        this.quantity = quantity; // "this.quantity" refere ao atributo "name" na classe Program
    }

    public double TotalValueInStock(){
        return quantity * price;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                +", $"
                + String.format("%.2f",price)
                +", "
                + quantity
                +" units, "
                + "Total: $"
                + String.format("%.2f",TotalValueInStock());
    }
}
