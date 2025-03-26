package question_no_3;

public class Main {

	public static void main(String[] args) {
		Math_Constant name = new Math_Constant();
		System.out.println("constant "+name.E);
	}

}
final class Math_Constant{
	final double E = 2.718;
}
//class Advance_Math extends Math_Constant{
//	
//}
//Can`t acess the math_constant class because it can`t be inherit