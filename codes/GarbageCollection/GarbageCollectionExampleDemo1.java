// Illustrating garbage collection using nulling the reference

class GarbageCollectionExample {
    public void finalize() {
        System.out.println("Object Destroyed!");
    }

    GarbageCollectionExample() {
        System.out.println("Object Created!");
    }

    void print() {
        System.out.println("Radhe Radhe");
    }
}

class GarbageCollectionExampleDemo1 {
    public static void main(String[] args) {
        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();
        
        obj1 = null;

        obj2.print();
        
        // Nulling the reference
        obj2 = null;
        
        // Requesting garbage collection
        System.gc();
    }
}
/*
warning: [removal] finalize() in Object has been deprecated and marked for removal
    public void finalize() {
                ^
1 warning
Object Created!
Object Created!
Radhe Radhe
Object Destroyed!
Object Destroyed!
*/