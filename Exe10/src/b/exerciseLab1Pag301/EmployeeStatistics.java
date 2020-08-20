package b.exerciseLab1Pag301;

import java.util.List;

import javax.management.RuntimeErrorException;

public class EmployeeStatistics {

	public static double avgSal(List<Employee> emps) {
		int numOfEmps = 0;
		double sum = 0;
		for (Employee emp : emps) {
			if (emp != null) {
				numOfEmps++;
				sum += emp.getSalary();
			}
		}
		if (numOfEmps > 0) {
			return sum / numOfEmps;

		} else {
			throw new RuntimeErrorException(null, "no employees");
		}
	}

	public static double numOfEmployees(List<Employee> numOf) {
		int emps = 0;
		for (Employee emp : numOf) {
			if (emp != null) {
				emps++;

			}

		}
		return emps;

	}

	public static double numEmpDep(List<Employee> numOf) {

		return 0;
	}

}