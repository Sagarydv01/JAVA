// package Abstract_Class.Interface;
interface Client {
    int num = 10;
    void input();
    void output();
}

class Developer implements Client {
    public void input() {
        // int num = 20; 
        System.out.println(num);
    }
    public void output() {
        System.out.println("Radhe Radhey Sagar!");
    }
    void display() {
        System.out.println("Sagar Yadav");
    }
}
public class InterfaceDemo1 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.input();
        dev.output();
        dev.display();
    }
}
