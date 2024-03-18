class MyException extends Exception {
    String a;
    MyException(String b) {
        a = b;
    }
    public String show() {
        return "MyException: " + a;
    }
}
class ThrowDemo1 {
    public static void main(String[] args) {
        try {
            throw new MyException("Sagar!");
        } catch (MyException e) {
            System.out.println(e.show());
        }
    }
}
