class ThisPointerProperty2 {
    public ThisPointerProperty2() {
        System.out.println("ABC");
    }

    public ThisPointerProperty2(int num) {
        this();
        System.out.println(num);
        // this(); // error: call to this must be first statement in constructor
    }

    public static void main(String[] args) {
        ThisPointerProperty2 ref1 = new ThisPointerProperty2(10);
    }
}
 /* OUTPUT
 ABC
 10
 */