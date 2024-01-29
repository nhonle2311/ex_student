package View;

import controller.StudenManager;
import model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
            System.out.println("1. Add student ");
            System.out.println("2. Display student records");
            System.out.println("3. Edit student by id");
            System.out.println("4. Delete student by id");
            System.out.println("5. search student by name");
            System.out.println("6. search student by id");
            System.out.println("7. Exit");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter id: ");
                    String id = new Scanner(System.in).nextLine();
                    System.out.println("Enter name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println("Enter age: ");
                    int age = Integer.parseInt(new Scanner(System.in).nextLine());
                    System.out.println("Enter email: ");
                    String email = new Scanner(System.in).nextLine();
                    Student student = new Student(id, name, age, email);
                    StudenManager.add(student);
                    break;
                case 2:
                    StudenManager.display();
                    break;
                case 3:
                    StudenManager.edit();
                    break;
                case 4:
                    StudenManager.delete();
                    break;
                case 5:
                    StudenManager.searchByName();
                    break;
                case 6:
                    StudenManager.seachById();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }

}