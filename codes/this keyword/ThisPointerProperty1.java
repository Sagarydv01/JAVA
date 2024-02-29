/*			this pointer Property - 1
this keyword refers to the current object inside method or constructor.
*/

class ThisPointerProperty1 {
    void show() {
        System.out.println(this);
    }
	public static void main(String[] args) {
		ThisPointerProperty1 ref1 = new ThisPointerProperty1();
        System.out.println(ref1);
        ref1.show();
	}
}