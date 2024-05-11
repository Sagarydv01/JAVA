// 8. Write a program to demonstrate the concept of aggregation.
class Address {
    String street;
    String city;
    String state;
    String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getAddressDetails() {
        return street + ", " + city + ", " + state + " - " + zipCode;
    }
}

class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Address: " + address.getAddressDetails());
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Address address = new Address("Knowledge Park-3", "Greater Noida", "Uttar Pradesh", "201310");
        Employee employee = new Employee(24, "Sagar yadav", address);

        employee.displayEmployeeDetails();
    }
}
