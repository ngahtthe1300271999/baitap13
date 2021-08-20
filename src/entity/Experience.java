package entity;

import java.util.Date;
import java.util.List;

public class Experience extends Employee{
	private int expInYear;
	private String proSkill;

	public Experience(String id, String fullName, Date birthDay, String phone, String email, int employeeType,
			List<Certificate> listCertificate, int expInYear, String proSkill) {
		super(id, fullName, birthDay, phone, email, employeeType, listCertificate);
		this.expInYear = expInYear;
		this.proSkill = proSkill;
	}

	public Experience() {
		
	}

	public int getExpInYear() {
		return expInYear;
	}



	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}



	public String getProSkill() {
		return proSkill;
	}



	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}



	@Override
	public void showInfo() {
		System.out.println("Experience [expInYear=" + expInYear + ", proSkill=" + proSkill + ", getId()=" + getId()
		+ ", getFullName()=" + getFullName() + ", getBirthDay()=" + getBirthDay() + ", getPhone()=" + getPhone()
		+ ", getEmail()=" + getEmail() + ", getEmployeeType()=" + getEmployeeType() + ", getEmployeeCount()="
		+ getEmployeeCount()+ "]");
		
	}

}
