package com.cg.demo;

public class Main {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		System.out.println(service.getEmployee(112233,"Kavita"));
		System.out.println(service.getEmployees(80000.00));
		System.out.println(service.getMaxSalary());
		System.out.println(service.getSumOfSalary());
		System.out.println(service.getNames("Pune"));
		System.out.println(service.getDetails());
		System.out.println(service.getManagers());
		System.out.println(service.getSumOfManagerSalaries());
		System.out.println(service.getIds());

		
		//call the functions
	}

}
