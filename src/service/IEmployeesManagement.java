package service;

import entity.Employee;

public interface IEmployeesManagement {
	public boolean addEmployee(Employee employee);
	public boolean updateEmployee(Employee employeeUpdate);
	public boolean deleteEmployee(String id);
	public int fintEmployee(String id);
	public void showExperience();
	public void showIntern();
	public void showFresher();
}
