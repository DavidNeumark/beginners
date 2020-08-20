package c.calc.impl;

import c.calc.BasicCalculator;

public class Calculator implements BasicCalculator {

	private double result;

	@Override
	public void add(double val) {
		result += val;

	}

	@Override
	public void sub(double val) {
		result -= val;
	}

	@Override
	public void mul(double val) {
		result *= val;
	}

	@Override
	public void div(double val) {
		result /= val;
	}

	@Override
	public void reset() {
		result = 0;
	}

	@Override
	public double getResult() {
		return result;
	}

	// extra method - not in the interface
	public void power(double pow) {
		result = Math.pow(result, pow);
	}

}
