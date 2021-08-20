package entity;

import java.util.Date;
import java.util.List;

public class Fresher extends Employee{
	private Date graduationDate;
	private String graduationRank;
	private String education;



	public Fresher(String id, String fullName, Date birthDay, String phone, String email, int employeeType,
			List<Certificate> listCertificate, Date graduationDate, String graduationRank, String education) {
		super(id, fullName, birthDay, phone, email, employeeType, listCertificate);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public Fresher() {
		
	}

	public Date getGraduationDate() {
		return graduationDate;
	}



	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}



	public String getGraduationRank() {
		return graduationRank;
	}



	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}



	public String getEducation() {
		return education;
	}



	public void setEducation(String education) {
		this.education = education;
	}


	@Override
	public void showInfo() {
		System.out.println("Fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education="
				+ education + ", getId()=" + getId() + ", getFullName()=" + getFullName() + ", getBirthDay()="
				+ getBirthDay() + ", getPhone()=" + getPhone() + ", getEmail()=" + getEmail() + ", getEmployeeType()="
				+ getEmployeeType() + ", getEmployeeCount()=" + getEmployeeCount() + "]");
		
	}

}
