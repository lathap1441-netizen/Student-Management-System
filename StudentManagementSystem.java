package lab2;

import java.util.Scanner;


class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();

                    students[count] = new Student(id, name, age);
                    count++;
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nStudent Details:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + students[i].id);
                            System.out.println("Name: " + students[i].name);
                            System.out.println("Age: " + students[i].age);
                            System.out.println("-------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (students[i].id == searchId) {
                            System.out.println("Student Found:");
                            System.out.println("ID: " + students[i].id);
                            System.out.println("Name: " + students[i].name);
                            System.out.println("Age: " + students[i].age);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}