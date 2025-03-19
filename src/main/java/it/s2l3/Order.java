package it.s2l3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static it.s2l3.Customer.*;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List <Product> products;
    private Customer customer;

    public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List <Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }



    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public long getId() {
        return id;
    }

    static LocalDate dataCasuale = LocalDate.now().plusDays((long) (Math.random() * 365 * 5));

    static List<Product> ordineBaby =
            Product.prodotti.stream().
                    filter(prodotto -> prodotto.getCategory().equals(Category.BABY)).collect(java.util.stream.Collectors.toList());

    static List<Product> ordineLibri =
            Product.prodotti.stream().
                    filter(prodotto -> prodotto.getCategory().equals(Category.BOOKS)).collect(java.util.stream.Collectors.toList());

    static List<Product> ordineVestiti =
            Product.prodotti.stream().
                    filter(prodotto -> prodotto.getCategory().equals(Category.CLOTHES)).collect(java.util.stream.Collectors.toList());

    static List<Product> ordineElettronica =
            Product.prodotti.stream().
                    filter(prodotto -> prodotto.getCategory().equals(Category.ELECTRONICS)).collect(java.util.stream.Collectors.toList());

    static List<Order> orders = Arrays.asList(
            new Order(2, "Shipping", dataCasuale, dataCasuale, ordineBaby, randomCustomer0),
            new Order(3, "Shipping", LocalDate.of(2021, 02, 03),  LocalDate.of(2021, 02, 03), ordineLibri, randomCustomer1),
            new Order(4, "Shipping",  LocalDate.of(2021, 03, 03),  LocalDate.of(2021, 04, 03), ordineVestiti, randomCustomer2),
            new Order(5, "Shipping", LocalDate.of(2021, 03, 03), LocalDate.of(2021, 03, 03), ordineElettronica, randomCustomer3)
            );

    public static void ordersType( Category category) {
        orders.stream().filter(ordine -> ordine.getProducts().stream().anyMatch(tipo -> tipo.getCategory().equals(category))).forEach(order -> {
            System.out.println("I seguenti ordini contenevano la categoria " + category + " :");
            System.out.println("Cliente: " + order.getCustomer().getName());
            System.out.println("Ordine: ");
            order.getProducts().forEach(prodtto -> System.out.println(
                    prodtto.getName()
            ));
        });
    }
}
