package c.calc;

public interface BasicCalculator {

	/** Adds the specified value to this calculator */
	void add(double val);

	/** Subtracts the specified value from this calculator */
	void sub(double val);

	/** Multiply this calculator result by the specified value */
	void mul(double val);

	/** Divide this calculator result by the specified value */
	void div(double val);

	/** Set this calculator result to 0 */
	void reset();

	/** returns the result of this calculator */
	double getResult();

}
