package ru.geekbrains.lesson_4;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov Ivan Ivanovich", "director", "+7 123 520 32 25", 50000, 1969);
        Employee emp2 = new Employee("Petrov Petr Petrovich", "engineer", "+7 568 456 45 78", 32000, 1972);
        Employee emp3 = new Employee("Sidorov Ignat Kirillovich", "mechanic", "+7 987 654 32 10", 27000, 1990);
        emp1.info();
        emp2.info();
        emp3.info();

        Employee emp4 = new Employee("Kosenko Sergey Ivanovich", "technician", "+7 564 963 00 33", 15000, 1981);
        Employee emp5 = new Employee("Burov Viktor Borisovich", "locksmith", "+7 321 897 77 10", 12000, 1974);

        Employee [] employeeArray = {emp1, emp2, emp3, emp4, emp5};
        for (int i = 0; i < employeeArray.length; i++){
            if (employeeArray[i].getAge() > 40){
                employeeArray[i].fullInfo();
            }
        }
        salaryIncrease(employeeArray);
        meanAverage(employeeArray);

    // For Task 8***
        for (int i = 0; i < employeeArray.length; i++){
            employeeArray[i].showIdNumber();
        }
    }

    // Task 6*
    static void salaryIncrease(Employee [] employeeArray){
        for (int i = 0; i < employeeArray.length; i++){
            if (employeeArray[i].getAge() > 45){
                employeeArray[i].salary = employeeArray[i].salary + 5000;
                System.out.printf("Employee name: %s, age %d, new salary %d\n", employeeArray[i].getName(), employeeArray[i].getAge(), employeeArray[i].salary);
            }
        }
    }

    // Task 7*
    static void meanAverage(Employee [] employeeArray){
        int sumAges = 0;
        int sumSalaries = 0;
        for (int i = 0; i < employeeArray.length; i++){
            sumAges += employeeArray[i].getAge();
            sumSalaries += employeeArray[i].getSalary();
        }
        float meanAge = (sumAges *1f) / employeeArray.length;
        float averageSalary = (sumSalaries * 1f) / employeeArray.length;
        System.out.printf("Arithmetic mean age = %.2f, arithmetic average salary = %.2f\n", meanAge, averageSalary);
    }

}
