// Illustrating garbage collection by assigning a reference to another

class GarbageCollectionExample {
    public void finalize() {
        System.out.println("Destroyed!");
    }
    GarbageCollectionExample() {
        System.out.println("Object Created!");
    }
    void display (){
        System.out.println("Sagar Yadav");
    }
}

class GarbageCollectionExampleDemo2 {
    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        obj1 = null;

        // obj1.display(); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "GarbageCollectionExample.display()" because "<local1>" is null at GarbageCollectionExampleDemo2.main

        GarbageCollectionExample obj2 = new GarbageCollectionExample();
        GarbageCollectionExample obj3 = new GarbageCollectionExample();

        // obj2 = null;
        obj2 = obj3;

        obj2.display();
        obj3.display();

        System.gc();
    }
}
