// 5.   Write a program to demonstrate multi-level and hierarchical inheritance.

class College {
    String collageName = "Trinity Institute of Innovations in Professional Studies";
    String address = "Knowledge Park - 3, Greater Noida";

    void collegeDetails() {
        System.out.println("Collage name: " + collageName);
        System.out.println("Address: " + address);
    }
}

class Department extends College {
    String department = "Bachelor of Computer Application";
    int noOfDepartment = 5;

    void departmentDetails() {
        System.out.println("Department name: " + department);
        System.out.println("No. of Departments: " + noOfDepartment);
    }
}

class Faculty extends College {
    int noOfFacultyMembers = 20;

    void facultyDetails(){
        System.out.println("Faculty: " + noOfFacultyMembers);
    }
}

class Students extends Department {
    int noOfStudents = 54;
    int semester = 4;

    void studentDetails() {
        System.out.println("No. of Students: " + noOfStudents);
        System.out.println("Semester: " + semester);
    }
}

class MultiHierarchical {
    public static void main(String[] args) {
        // Using Multi-level Inheritance
        Students student = new Students();

        System.out.println("\n\t========= College Details =========");
        student.collegeDetails();

        System.out.println("\n\t========= Department Details =========");
        student.departmentDetails();

        System.out.println("\n\t========= Student Details =========");
        student.studentDetails();

        // Using Hierarchical Inheritance
        System.out.println("\n\t========= Faculty Details =========");
        Faculty faculty = new Faculty();
        Department department = new Department();
        System.out.print("Faculty available in " + faculty.collageName + " whose address is " + department.address + "is: " + faculty.noOfFacultyMembers);

        System.out.println("\n\n-------------------------------------------------------------------------");
        System.out.println("| Sagar Yadav, Enrollment No.: 02027902022, 4th Semester (2022-25), BCA |");
        System.out.println("-------------------------------------------------------------------------");
    }
} // Sagar Yadav, Enrollment No.: 02027902022, 4th Semseter, BCA (2022-25)