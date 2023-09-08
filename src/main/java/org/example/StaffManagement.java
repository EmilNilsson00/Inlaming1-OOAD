package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class StaffManagement {
    public ArrayList<Staff> staff = new ArrayList<>();

    public void addEmployee(String name, String gender, int id, String employment, LocalDate startDate, int salary){



        Employee newEmployee = new Employee(name, gender, id, employment, startDate, salary);
        staff.add(newEmployee);
        System.out.println("Employee added!");

    }
    public void addTrainee(String name, String gender, int id, String employment, LocalDate startDate, LocalDate endDate) {
        Trainee newTrainee = new Trainee(name, gender, id, employment, startDate, endDate);
        staff.add(newTrainee);
        System.out.println("Trainee added!");
    }

    public void displayStaff() {
        for (Staff staffs : staff) {
            System.out.println(staffs);
            System.out.println("---------------");
        }
    }
    public void updateEmployeeSalary(int id, int newSalary) {
        for (Staff staffMember : staff) {
            if (staffMember instanceof Employee && staffMember.getId() == id) {
                Employee employee = (Employee) staffMember;
                employee.setSalary(newSalary);
                System.out.println("Employee salary updated!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
