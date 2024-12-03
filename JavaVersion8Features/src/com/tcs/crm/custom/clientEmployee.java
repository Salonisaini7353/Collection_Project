package com.tcs.crm.custom;

import java.util.ArrayList;

public class clientEmployee {
	public static void main(String[] args) {

		Employee emp1 = new Employee("Dev", 10000);
		Employee emp2 = new Employee("Veer", 15000);
		Employee emp3 = new Employee("Rohan", 12000);
		Employee emp4 = new Employee("MOhan", 20000);
		Employee emp5 = new Employee("sohan", 30000);

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		empList.stream()
		.filter(e->e.getEmpsalary() > 15000)
		.forEach(System.out ::println);






	}

}
