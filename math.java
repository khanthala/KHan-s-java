package methodEx;

public class Math_ {

	public static void main(String[] args) {
		MathABS();
		MathFloor();
		MathPOWER();
		MathSQRT();

	}
	public static void MathABS() {
		float a = (float) -5.7;
		System.out.println("Math.abs = "+Math.abs(a));
	}
	public static void MathFloor() {
		float b = (float) 2.7;
		System.out.println("Math.floor = "+Math.floor(b));
	}
	public static void MathPOWER() {
		int c = 3;
		System.out.println("Math.Power = "+ Math.pow(c, 5));
	}
	public static void MathSQRT() {
		int d = 7;
		System.out.println("Math.sqrt = "+ Math.sqrt(d));
	}
	

}