public class ThrowsDemo3 {
	
	public static int calculate(int num1, int num2) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		
		int result = num1/num2;
		int [] arr = new int[] {1,2,3,4};
		
		int arrVal = arr[result];
		return arrVal;
	}
	
	public static void main(String[] args) {
		
        int val = calculate(12, 3);
        System.out.println("Value is = " + val);
		
	}		
}