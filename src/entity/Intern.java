package entity;

import java.util.Date;
import java.util.List;

public class Intern extends Employee{
	private String majors;
	private int semester;
	private String universityName;
	

	public Intern(String id, String fullName, Date birthDay, String phone, String email, int employeeType,
			List<Certificate> listCertificate, String majors, int semester, String universityName) {
		super(id, fullName, birthDay, phone, email, employeeType, listCertificate);
		this.majors = majors;
		this.semester = semester;
		this.universityName = universityName;
	}

	public Intern() {
		
	}

	public String getMajors() {
		return majors;
	}



	public void setMajors(String majors) {
		this.majors = majors;
	}



	public int getSemester() {
		return semester;
	}



	public void setSemester(int semester) {
		this.semester = semester;
	}



	public String getUniversityName() {
		return universityName;
	}



	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}


	@Override
	public void showInfo() {
		System.out.println("Intern [majors=" + majors + ", semester=" + semester + ", universityName=" + universityName
				+ ", getId()=" + getId() + ", getFullName()=" + getFullName() + ", getBirthDay()=" + getBirthDay()
				+ ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getEmployeeType()="
				+ getEmployeeType() + ", getEmployeeCount()=" + getEmployeeCount() + "]");
		
	}

}
