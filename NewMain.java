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
 * @author Haneen
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        Company company = new Company();

        // Add Products
        Product product1 = new Product(1, "Laptop", 1500.0f);
        Product product2 = new Product(2, "Smartphone", 800.0f);
        company.addProduct(product1);
        company.addProduct(product2);

        // Add Persons
        Client client1 = new Client(1, "Haneen", "123456789", "Female", "haneen@example.com");
        Employee employee1 = new Employee(2, "Malak", "987654321", "Female", 5000.0f, "9am-5pm");
        company.addPerson(client1);
        company.addPerson(employee1);

        // Create Orders
        List<Product> orderProducts = new ArrayList<>();
        orderProducts.add(product1);
        orderProducts.add(product2);
        Order order1 = new Order(1, "2023-07-29", true, client1, orderProducts);
        company.addOrder(order1);

        // Test methods
        company.printPersonInfo(1);
        company.printProductDetails(1);
        company.printOrderDetails(1);
        company.printPersonOrders(1);

        company.removeProduct(1);
        company.removePerson(1);
        company.removeOrder(1);
    }
}
    
    

