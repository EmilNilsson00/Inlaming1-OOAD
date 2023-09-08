package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StaffManagement staffManagement = new StaffManagement();
        staffManagement.addEmployee("Magdalena Andersson", "Female", 1, "Employee", LocalDate.now(), 35000);
        staffManagement.addTrainee("Johnny Oil", "Male", 2, "Trainee", LocalDate.now(), LocalDate.of(2023, 12, 12));


        staffManagement.displayStaff();

        System.out.print("Enter id: ");
        int idChange = Integer.parseInt(scanner.nextLine());
        System.out.print("new salary: ");
        int salaryChange = Integer.parseInt(scanner.nextLine());
        staffManagement.updateEmployeeSalary(idChange, salaryChange);
        staffManagement.displayStaff();


        new MenuStructure ("hej välkommen", new ArrayList<>(List.of("1.hej","2.hej")));


    }
}