/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

/**
 *
 * @author Haneen
 */
public class Person {
    protected int id;
    protected String name;
    protected String phone;
    protected String gender;

    public Person(int id, String name, String phone, String gender) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public void printExtraInfo() {
        // Implementation in subclasses
        // complete impelementaion here
    }
}

class Client extends Person {
    private String email;

    public Client(int id, String name, String phone, String gender, String email) {
        super(id, name, phone, gender);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void printExtraInfo() {

        // add extra information here where basic information public class !??
        System.out.println("Client Email: " + email);
    }
}

class Employee extends Person {
    private float salary;
    private String workingTime;

    public Employee(int id, String name, String phone, String gender, float salary, String workingTime) {
        super(id, name, phone, gender);
        this.salary = salary;
        this.workingTime = workingTime;
    }

    public float getSalary() {
        return salary;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    @Override
    public void printExtraInfo() {
                // add extra information here where basic information public class !??
        System.out.println("Employee Salary: " + salary + ", Working Time: " + workingTime);
    }
}
