

interface InnerIntefaceDemo {
    void display();
    void greet();
}

interface InnerIntefaceDemo_1 {
    void bye();
    
}

class InnerIntefaceDemo_2 implements InnerIntefaceDemo, InnerIntefaceDemo_1 {
    public void display() {
        System.out.println("Method from Interface-1");
    }
    public void greet() {
        System.out.println("Hello");
    }
    public void bye() {
        System.out.println("bye");
    }  
}

public class IntefaceDemo {
    public static void main(String[] args) {
        InnerIntefaceDemo_2 obj = new InnerIntefaceDemo_2();
        obj.display();
        obj.greet();
        obj.bye();
    }
}
