
// Jan 29, 2026
class Static {
    int id;
    static int sal;

    static void m1() {
        System.out.println("From m1()");
    }

    void m2() {
        System.out.println("from m2 (without static)");
    }

    void display() {
        System.out.println("Id = " + id + " Sal = " + sal);
    }

    void setter(int i, int s) {
        id = i;
        sal = s;
    }

    public static void main(String[] args) {
        m1();
        //m2(); // error: non-static method m2() cannot be referenced from a static
        // context

        Static st = new Static();
        st.m2();

        sal = 10000;
        //id = 20; // error: non-static variable id cannot be referenced from a static
        // context

        st.display();
        st.setter(11, 222000);
        st.display();
    }
}
