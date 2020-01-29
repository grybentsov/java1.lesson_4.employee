package ru.geekbrains.lesson_4;

public class Employee {
    private String name;
    private String position;
    private String phoneNumber;
    protected int salary;
    private static final int CURRENT_YEAR = 2020;
    private int birthYear;
    private int idNumber;  // for task 8***
    static int counter = 1; // for task 8***

    public Employee (String name, String position, String phoneNumber, int salary, int birthYear){
        this.birthYear = birthYear;
        this.name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Employee(int age) {
        this.birthYear = CURRENT_YEAR - age;
    }
// For Task 8*** -----------
    public int employeeIdNumber(){
        idNumber = counter++;
        return idNumber;
    }
// ---------------------
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getAge(){
        return CURRENT_YEAR - birthYear;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPosition(String pos){
        pos = position;
    }
    public String getPosition(){
        return position;
    }

    public void setPhoneNumber(String phoneNum){
        phoneNum = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public void info(){
        System.out.printf("Employee name: %s, position: %s\n", getName(), getPosition());
    }
    public void fullInfo(){
        System.out.printf("Employee name: %s, position: %s, phone number: %s, salary: %d, age: %d\n", getName(), getPosition(), getPhoneNumber(), getSalary(), getAge());
    }
    // For Task 8*** --------------
    public void showIdNumber(){
        System.out.printf("Employee name: %s, id number: %d\n", getName(), employeeIdNumber());
    }
    // ---------------------
  }
