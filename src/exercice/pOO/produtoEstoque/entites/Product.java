package src.exercice.pOO.produtoEstoque.entites;

public class Product {
    public String name;
    public double price;
    public int quantiy;

    public double TotalValueInStock (){
        return price * quantiy;
    }
    public void AddProducts(int quantiy){
        this.quantiy += quantiy;
    }
    public void RemoveProducts(int quantiy){
        this.quantiy -= quantiy;
    }
    public String toString(){
        return "Product data: " + name + ", " + "$" + String.format("%.2f", price) + ", " + quantiy + " units, Total: $" + String.format("%.2f",TotalValueInStock());
    }
}
