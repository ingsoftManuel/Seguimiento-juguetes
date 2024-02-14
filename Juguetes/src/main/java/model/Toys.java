package model;

public class Toys {
    public String name;
    private int amount;
    public double price;

    public Category toyCategory;

    public Toys(String name, int amount, double price, Category toyCategory) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.toyCategory = toyCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getToyCategory() {
        return toyCategory;
    }

    public void setToyCategory(Category toyCategory) {
        this.toyCategory = toyCategory;
    }
}
