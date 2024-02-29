// 3. Write a program to demonstrate the use of static variable, static method and static block.

class StaticDemonstration {
    static int num = 20;

    static {
        System.out.println("Static Block!");
        System.out.println("Sagar Yadav, Enrollment No.: 02027902022, 4rth Semester, 2022-25, BCA");
    }

    static void display() {
        System.out.println("Value of num: " + num);
    }

    public static void main(String[] args) {
        display();

        num = 30;

        System.out.println("num after modification: " + num);
    }
}
// Sagar Yadav, 4rth Semester (2022-25), BCA