package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StaffManagement {
    public ArrayList<Staff> staff = new ArrayList<>();

    public void addEmployee(String name, String gender, int id, LocalDate startDate, int salary) {
        Employee newEmployee = new Employee(name, gender, id, "employee", startDate, salary);
        staff.add(newEmployee);
        System.out.println("Employee added!");

    }

    public void addTrainee(String name, String gender, int id, LocalDate startDate, LocalDate endDate, String wittyWords) {
        Trainee newTrainee = new Trainee(name, gender, id, "trainee", startDate, endDate, wittyWords);
        staff.add(newTrainee);
        System.out.println("Trainee added!");
    }

     public void displayStaff() {
        for (Staff staffs : staff) {
            System.out.println(staffs);
            System.out.println("---------------");
        }
    }
    public void displayEmployees() {
        for (Staff staffMember : staff) {
            if (staffMember instanceof Employee) {
                System.out.println(staffMember);
                System.out.println("---------------");
            }
        }
    }

    public void displayTrainees() {
        for (Staff staffMember : staff) {
            if (staffMember instanceof Trainee) {
                System.out.println(staffMember);
                System.out.println("---------------");
            }
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

    public double calculateAverageMaleEmployeeSalary() {
        int maleEmployeeCount = 0;
        int totalSalary = 0;

        for (Staff staffMember : staff) {
            if (staffMember instanceof Employee && staffMember.getGender().equalsIgnoreCase("Male")) {
                Employee employee = (Employee) staffMember;
                maleEmployeeCount++;
                totalSalary += employee.getSalary();
            }
        }

        if (maleEmployeeCount == 0) {
            System.out.println("No male employees found.");
            return 0.0;
        } else {
            double averageSalary = (double) totalSalary / maleEmployeeCount;
            System.out.println("Average salary of male employees: " + averageSalary);
            return averageSalary;
        }

    }
    public double calculateAverageFemaleEmployeeSalary() {
        int femaleEmployeeCount = 0;
        int totalSalary = 0;

        for (Staff staffMember : staff) {
            if (staffMember instanceof Employee && staffMember.getGender().equalsIgnoreCase("Female")) {
                Employee employee = (Employee) staffMember;
                femaleEmployeeCount++;
                totalSalary += employee.getSalary();
            }
        }

        if (femaleEmployeeCount == 0) {
            System.out.println("No female employees found.");
            return 0.0;
        } else {
            double averageSalary = (double) totalSalary / femaleEmployeeCount;
            System.out.println("Average salary of female employees: " + averageSalary);
            return averageSalary;
        }
    }
    public void displayStaffByEmploymentDate() {
         List<Staff> sortedStaff = staff.stream()
                 .sorted(Comparator.comparing(Staff::getStartDate)).toList();

        for (Staff staffMember : sortedStaff) {
            System.out.println(staffMember);
            System.out.println("---------------");
        }
    }
}
