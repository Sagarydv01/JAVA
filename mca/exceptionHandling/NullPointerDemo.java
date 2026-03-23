public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.charAt(0));
        } catch (NullPointerException e){
            System.out.println("NullPointer Demo!");
            System.out.println(e.getMessage());
        }
    }
}
