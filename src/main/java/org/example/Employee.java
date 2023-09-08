package org.example;

import java.time.LocalDate;

public class Employee extends Staff {

    private int salary;


    public Employee(String name, String gender, int id, String employment, LocalDate startDate, int salary) {
        super(name, gender, id, employment, startDate);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalary: " + salary;
    }

    public void setSalary(int newSalary) {
         this.salary = newSalary;
    }
}
