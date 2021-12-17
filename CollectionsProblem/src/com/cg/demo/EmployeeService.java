package com.cg.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeService {

	List<Employee> list = EmployeeRepository.getEmployees();

	public Employee getEmployee(int id, String name) {
		//display the Employee details based on id or name
		
		Employee emp =new Employee();
		for (Employee e: list) {
			if(e.getId() == id || e.getName() == name) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	
	public List<Employee> getEmployees(Double salary) {
		// display the names of employees who are getting the salary greater than the
		// salary given
		
		List<Employee> empName = new ArrayList<>();
		for(Employee e : list) {
			if(e.getSalary()> salary) {
				empName.add(e);
			}
		}

		return empName;
	}

	public Double getMaxSalary() {
		// display the max salary
		
        Double maxSalary =0.0;
        for(Employee e:list) {
            if(e.getSalary()>maxSalary)
            maxSalary = e.getSalary();
        }
		return maxSalary;
	}

	public Double getSumOfSalary() {
		// display the sum of salaries of all the employees

        Double salarySum = 0.0;
        for (Employee e : list) {
            salarySum += e.getSalary();
        }
        return salarySum;
	}

	public List<String> getNames(String city) {
		// display the names of all employees who are working in "pune"
		
		 List<String> cities = new ArrayList<>();
	        for (Employee cty : list) {
	            if (cty.getLocation().equals(city))
	                cities.add(cty.toString());
	        }
	        return cities;
		
	}

	public List<Employee> getDetails() {
		// display all employees based on salary ascending

		Collections.sort(list, new Comparator<Employee>() {
	            @Override
	            public int compare(Employee o1, Employee o2) {
	                if (o1.getSalary()>o2.getSalary())
	                    return 1 ;
	                else  if (o1.getSalary() < o2.getSalary())
	                        return -1;
	                else return 0;
	            }
	        });
	        return list;
	}

	public List<Employee> getManagers() {
		// display all employees who are working as managers
		
		List<Employee> managerDetails = new ArrayList<>();
        for (Employee e : list) {
            if (e.getDesignation().equals("Manager")) {
                managerDetails.add(e);
            }
        }
        return managerDetails;
	}

	public Double getSumOfManagerSalaries() {
		// display the sum of salaries of employees who are working as managers
		
		Double sumOfSalary = 0.0;
        for (Employee e : list) {
            if (e.getDesignation().equals("Manager"))

                sumOfSalary += e.getSalary();

        }
        return sumOfSalary;
	}

	public List<String> getIds() {
		// display the ids of all employees
		
		List<String> getEmpID = new ArrayList<>();
        for (Employee e : list) {
            getEmpID.add(e.getId().toString());
        }
        return getEmpID;
		
	}
}
