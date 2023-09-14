package org.example;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StaffManagement staffManagement = new StaffManagement();
        MenuStructure mainMenu = new MenuStructure("Hej & välkommen", new ArrayList<>(List.of("1.Display Staff", "2.Add Staff", "3.Edit Staff", "4.Display average salary", "5.Exit the program")));

        staffManagement.addEmployee("Magdalena Andersson", "Female", 1, LocalDate.now(), 35000);

        staffManagement.addTrainee("Johnny Oil", "Male", 2, LocalDate.now(), LocalDate.of(2023, 12, 12), "");
        while (true) {
            System.out.println(mainMenu.getDescription());

            for (int i = 0; i < mainMenu.getOptions().toArray().length; i++) {
                System.out.println(mainMenu.getOptions().toArray()[i]);
            }
            System.out.println("Enter menu option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Total amount of staff: " + staffManagement.staff.toArray().length + "\n---------------");
                    staffManagement.displayStaffByEmploymentDate();
                    break;
                case 2:
                    System.out.println("Choose number for what employment the new staff shall have\n1.Employee\n2.Trainee");

                    int staffChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (staffChoice) {
                        case 1:
                            System.out.println("Enter name of the new employee: ");
                            String employeeName = scanner.nextLine();
                            System.out.println("Enter gender of the new employee: ");
                            String employeeGender = scanner.nextLine();
                            System.out.println("Enter id of the new employee: ");
                            int employeeId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter start date of the new employee (YYYY-MM-DD): ");
                            LocalDate employeeStartDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);
                            System.out.println("Enter salary of the new employee: ");
                            int employeeSalary = scanner.nextInt();
                            scanner.nextLine();
                            staffManagement.addEmployee(employeeName, employeeGender, employeeId, employeeStartDate, employeeSalary);
                            break;
                        case 2:
                            System.out.println("Enter name of the new trainee: ");
                            String traineeName = scanner.nextLine();
                            System.out.println("Enter gender of the new trainee: ");
                            String traineeGender = scanner.nextLine();
                            System.out.println("Enter id of the new trainee: ");
                            int traineeId = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Enter start date of trainee (YYYY-MM-DD): ");
                            LocalDate traineeStartDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);
                            System.out.println("Enter end date of trainee(YYYY-MM-DD): ");
                            LocalDate traineeEndDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);
                            System.out.println("Some nice words about the trainee: ");
                            String traineeWittyWords = scanner.nextLine();
                            staffManagement.addTrainee(traineeName, traineeGender, traineeId, traineeStartDate, traineeEndDate, traineeWittyWords);
                            break;
                    } break;
                case 3:
                    staffManagement.displayEmployees();
                    staffManagement.displayTrainees();
                    System.out.print("Enter id: ");
                    int idChange = Integer.parseInt(scanner.nextLine());
                    System.out.print("new salary: ");
                    int salaryChange = Integer.parseInt(scanner.nextLine());
                    staffManagement.updateEmployeeSalary(idChange, salaryChange);
                    staffManagement.displayEmployees();
                    staffManagement.displayTrainees();
                case 4:
                    double averageMaleEmployeeSalary = staffManagement.calculateAverageMaleEmployeeSalary();
                    double averageFemaleEmployeeSalary = staffManagement.calculateAverageFemaleEmployeeSalary();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }






}

