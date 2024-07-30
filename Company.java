/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 *
 * @author Haneen
 */

public class Company {
    private List<Person> persons;
    private List<Product> products;
    private List<Order> orders;

    public Company() {
        persons = new ArrayList<>();
        products = new ArrayList<>();
        orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void removePerson(int id) {
        persons.removeIf(person -> person.getId() == id);
    }

    public void removeOrder(int id) {
        orders.removeIf(order -> order.getId() == id);
    }

    public void printPersonInfo(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                System.out.println("Person Info: " + person.getName() + ", " + person.getPhone() + ", " + person.getGender());
                person.printExtraInfo();
            }
        }
    }

    public void printProductDetails(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println("Product Details: " + product.getName() + ", Price: " + product.getPrice());
            }
        }
    }

    public void printOrderDetails(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                System.out.println("Order Details: ID: " + order.getId() + ", Date: " + order.getDate() + ", Is Paid: " + order.isPaid());
                System.out.println("Person Info: " + order.getPerson().getName() + ", " + order.getPerson().getPhone());
                for (Product product : order.getProducts()) {
                    System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
                }
            }
        }
    }

    public void printPersonOrders(int id) {
        for (Order order : orders) {
            if (order.getPerson().getId() == id) {
                printOrderDetails(order.getId());
            }
        }
    }
}