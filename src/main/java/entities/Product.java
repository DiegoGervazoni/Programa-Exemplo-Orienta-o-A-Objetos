package entities;

public class Product {

    public String name; //Atributo
    public double price; //Atributo
    public int quantity; //Atributo

    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueStock(){ //Método
        return price * quantity;
    }

    public void addProducts(int quantity){ //Método
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){ //Método
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueStock());
    }
}
