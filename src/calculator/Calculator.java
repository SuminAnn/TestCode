package calculator;

public class Calculator {
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int minus(int num1, int num2) {
		int[] num = compareSize(num1, num2);
		return num[0] - num[1];
	}
	
	public int[] compareSize(int num1, int num2) {
		int[] number1 = {num1, num2};
		if(num1 > num2) return number1;
		int[] number2 = {num2, num1};
		return number2;
		
	}
}
