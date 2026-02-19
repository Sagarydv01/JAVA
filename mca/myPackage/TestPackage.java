// package myPackage;
import myPackage.Hello;
import myPackage.Sum;


public class TestPackage {
    public static void main(String[] args) {
        Hello obj = new Hello();
        Sum sm1 = new Sum();

        obj.display("sagar");
        sm1.sum(111, 322);
    }
}
