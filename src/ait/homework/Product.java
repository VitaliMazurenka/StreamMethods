package ait.homework;

public class Product {
    private String name;
    private double rate;
    private double price;
    private String category;

    public Product(String name, double rate, double price, String category) {
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product (" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", price=" + price +
                ", category='" + category + '\'' +
                ')';
    }
}
