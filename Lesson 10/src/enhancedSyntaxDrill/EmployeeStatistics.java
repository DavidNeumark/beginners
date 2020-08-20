package enhancedSyntaxDrill;

import java.util.List;

import enhancedSyntaxDrill.Employee.Department;

public class EmployeeStatistics {

	public static double avgSal(List<Employee> emps) {
		int numOgEmps = 0;
		double sum = 0;
		for (Employee emp : emps) {
			if (emp != null) {
				numOgEmps++;
				sum += emp.getSalary();
			}
		}
		if (numOgEmps > 0) {
			return sum / numOgEmps;
		} else {
			throw new RuntimeException("Average could not be calculated. No employees");
		}
	}

	public int numOfEmps(List<Employee> emps) {
		return emps.size();
	}

	public int numOfEmps(List<Employee> emps, Department department) {
		int numOfEmps = 0;
		for (int i = 0; i < emps.size(); i++) {
			Employee curr = emps.get(i);
			if (curr != null && curr.getDepartment().equals(department)) {
				numOfEmps++;
			}
		}
		return numOfEmps;
	}

}
