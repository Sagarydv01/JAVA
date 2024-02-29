// Illustrating garbage collection by using anonymous object or new kwyword

class GarbageCollectionExample {
    public void finalize() {
        System.out.println("Object Destroyed!");
    }
    
    GarbageCollectionExample() {
        System.out.println("Object Created!");
    }

    void display() {
        System.out.println("Radhe Radhe");
    }

}


class GarbageCollectionExampleDemo3 {
    public static void main(String[] args) {
        GarbageCollectionExample obj = new GarbageCollectionExample();

        new GarbageCollectionExample();

        obj.display();

        System.gc();
    }    
}
