package it.s2l3;

import java.util.Arrays;
import java.util.List;

public class Product {
    private long id;
    private String name;
    private Category category;
    private double price;

    public Product(long id, String name, Category category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    static List<Product> prodotti = Arrays.asList(
            new Product(1, "Libro 1", Category.BOOKS, 10.0),
            new Product(2, "Libro 2", Category.BOOKS, 20.0),
            new Product(3, "Vestito 1", Category.CLOTHES, 30.0),
            new Product(4, "Electronic 1", Category.ELECTRONICS, 50.0),
            new Product(5, "Cibo 1", Category.FOOD, 17.0),
            new Product(6, "Bambino 12", Category.BABY, 27.0),
            new Product(7, "Ragazzo 13", Category.BOYS, 37.0),
            new Product(7, "Ragazzo 120", Category.BOYS, 200.0),
            new Product(8, "Telefono aspirapolvere", Category.ELECTRONICS, 47.0),
            new Product(9, "Libro 15", Category.BOOKS, 150.0),
            new Product(10, "Libro 16", Category.BOOKS, 200.0),
            new Product(6, "Bimboragno 15", Category.BABY, 35.0)
            );
}
