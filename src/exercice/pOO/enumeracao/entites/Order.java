package src.exercice.pOO.enumeracao.entites;

import src.exercice.pOO.enumeracao.enun.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");


    private Client client;//Associação de classe
    private List<OrderItem> itens = new ArrayList<>(); //Associação de classe


    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;

    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public Double total() {
        double total = 0;
        for (OrderItem o : itens) {
            total += o.subTotal();
        }
        return total;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY:\n");
        sb.append("Order moment: " + moment.format(dtf));
        sb.append("\nOrder Status: " + status);
        sb.append("\nClient: " + client);
        sb.append("\nOrder items: ");
        for (OrderItem item : itens) {
            sb.append(item+"\n");
        }
        sb.append("Total price: $"+String.format("%.2f",total()));
        return sb.toString();
    }
}
