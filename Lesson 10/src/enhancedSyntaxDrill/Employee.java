package enhancedSyntaxDrill;

public class Employee {

	public enum Department {
		HR, SALES, LEGAL, DEV;
	}

	private String first;
	private String last;
	private double salary;
	private Department department;

	public Employee() {
	}

	public Employee(String first, String last, double salary, Department department) {
		super();
		this.first = first;
		this.last = last;
		this.salary = salary;
		this.department = department;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [first=" + first + ", last=" + last + ", salary=" + salary + ", department=" + department
				+ "]";
	}

}
