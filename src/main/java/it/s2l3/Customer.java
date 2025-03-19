package it.s2l3;

public class Customer {
    private long id;
    private String name;
    private Integer tier;

    public Customer(long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getTier() {
        return tier;
    }

    public static Customer randomCustomer0 = new Customer(1, "Luca", 1);
    public static Customer randomCustomer1 = new Customer(2, "Marco", 2);
    public static Customer randomCustomer2 = new Customer(3, "Giulia", 3);
    public static Customer randomCustomer3 = new Customer(4, "Francesca", 2);
}
