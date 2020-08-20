package c.calc.impl;

public class Test {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		System.out.println("result = " + calc.getResult());
		calc.add(5);
		System.out.println("result = " + calc.getResult());
		calc.add(3);
		System.out.println("result = " + calc.getResult());
		calc.sub(2);
		System.out.println("result = " + calc.getResult());
		calc.div(3);
		System.out.println("result = " + calc.getResult());
		calc.mul(10);
		System.out.println("result = " + calc.getResult());

		calc.power(3);
		System.out.println("result = " + calc.getResult());

		calc.reset();
		System.out.println("result = " + calc.getResult());
	}
}
