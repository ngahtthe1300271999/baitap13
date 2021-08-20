package entity;

import java.util.Date;
import java.util.List;

public abstract class Employee {
	private String id;
	private String fullName;
	private Date birthDay;
	private String phone;
	private String email;
	private int employeeType;
	private int employeeCount;
	List<Certificate> listCertificate = null;// Has-A relationship
	
	public Employee(String id, String fullName, Date birthDay, String phone, String email, int employeeType, List<Certificate> listCertificate) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.phone = phone;
		this.email = email;
		this.employeeType = employeeType;
		this.employeeCount = this.employeeCount++;
		this.listCertificate = listCertificate;
	}
	
	public Employee() {
		super();
		this.employeeCount = this.employeeCount++;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(int employeeType) {
		this.employeeType = employeeType;
	}
	public int getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	public List<Certificate> getListCertificate() {
		return listCertificate;
	}

	public void setListCertificate(List<Certificate> listCertificate) {
		this.listCertificate = listCertificate;
	}

	public abstract void showInfo();
}
