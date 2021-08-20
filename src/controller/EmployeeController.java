package controller;

import entity.Employee;
import service.EmployeesManagement;
import service.IEmployeesManagement;

public class EmployeeController {
	IEmployeesManagement service = new EmployeesManagement();
	
	public boolean addEmployee(Employee employee) {
		return service.addEmployee(employee);
	}
	
	public boolean updateEmployee(Employee employee) {
		return service.updateEmployee(employee);
	}
	
	public boolean deleteEmployee(String id) {
		return service.deleteEmployee(id);
	}
	
	public void showIntern() {
		service.showIntern();
	}
	
	public void showExperience() {
		service.showExperience();
	}
	
	public void showFresher() {
		service.showFresher();
	}
	
	public int findEmployee(String id) {
		return service.fintEmployee(id);
	}
}
