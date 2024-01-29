package controller;
import model.Student;

import java.util.Scanner;

public class StudenManager {
    static Student[] students = new Student[100];
    public static void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
    public static void display() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }
    public static void edit() {
        for (Student student : students) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id: ");
            String id = scanner.nextLine();
            if (student.getId().equals(id)) {
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter age: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter email: ");
                String email = scanner.nextLine();
                student.setName(name);
                student.setAge(age);
                student.setEmail(email);
                break;
            }
        }
    }
    public static void delete() {
        for (Student student : students) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id: ");
            String id = scanner.nextLine();
            if (student.getId().equals(id)) {
                break;
            }
        }
    }
    public static void searchByName() {
        for (Student student : students) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }
    public static void seachById(){
        for (Student student : students) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter id: ");
            String id2 = scanner.nextLine();
            if (student.getId().equals(id2)) {
                System.out.println(student);
            }
        }
    }
}
