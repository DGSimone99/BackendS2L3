package it.s2l3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static it.s2l3.Order.orders;
import static it.s2l3.Order.ordersType;

public class Main {
    public static void main(String[] args) {
        Product.prodotti.stream().
                filter(prodotto -> prodotto.getCategory().equals(Category.BOOKS))
                .filter(prodotto -> prodotto.getPrice() > 100)
                .forEach(prodotto -> System.out.println(prodotto.getName()));


        ordersType(Category.BABY);

        System.out.println("Ai seguenti prodotti:");

        Product.prodotti.stream().
                filter(prodotto -> prodotto.getCategory().equals(Category.BOYS))
                .forEach(prodotto -> {
                    System.out.println(prodotto.getName());
                    System.out.println( "Prezzo: " + prodotto.getPrice());
                });

        System.out.println("Verrà applicato lo sconto del 10%");

        Product.prodotti.stream().
                filter(prodotto -> prodotto.getCategory().equals(Category.BOYS))
                .forEach(prodotto -> {
                    prodotto.setPrice(prodotto.getPrice() * 0.9);
                    System.out.println(prodotto.getName());
                    System.out.println( "Prezzo: " + prodotto.getPrice());
                });

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");

        orders.stream().filter(ordine -> ordine.getCustomer().getTier() == 2)
                .filter(ordine -> ordine.getDeliveryDate().isAfter(LocalDate.of(2021, 02, 01)) && ordine.getDeliveryDate().isBefore(LocalDate.of(2021, 04, 01)))
                .forEach(ordine -> {
                    ordine.getProducts().forEach(prodotto -> {
                        System.out.println("Nome: " + prodotto.getName());
                        System.out.println("Prezzo: " + prodotto.getPrice());
                    });
                });
    };
}
