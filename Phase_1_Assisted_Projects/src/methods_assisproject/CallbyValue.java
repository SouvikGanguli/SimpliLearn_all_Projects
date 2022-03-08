package methods_assisproject;

public class CallbyValue {
	
	int val = 180;
	
	int operation(int val) {
		
		val = val*10/100;
		return val;
	}

	public static void main(String[] args) {
		CallbyValue obj = new CallbyValue();
		System.out.println("Before the operation "+ obj.val);
		
		System.out.println("After the operation "+ obj.operation(100));

	}

}
