/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;
import java.util.List;
/**
 *
 * @author Haneen
 */


public class Order {
    private int id;
    private String date;
    private boolean isPaid;
    private Person person;
    private List<Product> products;

    public Order(int id, String date, boolean isPaid, Person person, List<Product> products) {
        this.id = id;
        this.date = date;
        this.isPaid = isPaid;
        this.person = person;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public Person getPerson() {
        return person;
    }

    public List<Product> getProducts() {
        return products;
    }
}