/* 16. Create a class employee which have name, age and address of employee, include methods getdata() and 
showdata(), getdata() takes the input from the user, showdata() display the data in following format: 
Name:
Age:
Address: */

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    String address;

    public void getData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter address: ");
        address = scanner.nextLine();

        scanner.close();
    }

    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getData();
        System.out.println("\nEmployee Details:");
        employee.showData();
    }
}
