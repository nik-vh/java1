package ru.geekbrains.ru;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public String getFullName () {
        return this.fullName;
    }
    public void setFullName (String fullName) {
        this.fullName = fullName;
    }

    public String getPosition () {
        return this.position;
    }
    public void setPosition (String position) {
        this.position = position;
    }

    public String getEmail () {
        return this.email;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    public String getPhone () {
        return this.phone;
    }
    public void setPhone (String phone) {
        this.phone = phone;
    }

    public int getSalary () {
        return this.salary;
    }
    public void setSalary (int salary) {
        this.salary = salary;
    }

    public int getAge () {
        return this.age;
    }
    public void setAge (int age) {
        this.age = age;
    }

    public  Employee() {
        this.fullName = "unknown";
        this.position = "unknown";
        this.email = "unknown";
        this.phone = "unknown";
        this.salary = 0;
        this.age = 0;
    }

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printAll() {
        System.out.println("Имя сотрудника: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}