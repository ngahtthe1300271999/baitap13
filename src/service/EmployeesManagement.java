package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import repository.EmployeeRepository;

public class EmployeesManagement implements IEmployeesManagement{
	EmployeeRepository repository = new EmployeeRepository();
	int count = 0;

	@Override
	public boolean addEmployee(Employee employee) {
		if(employee instanceof Experience) {
			count++;
			employee.setEmployeeCount(count);
			repository.getMapExperience().put(employee.getId(), (Experience) employee);
			return true;
		}
		else if(employee instanceof Fresher) {
			count++;
			employee.setEmployeeCount(count);
			repository.getMapFresher().put(employee.getId(), (Fresher) employee);
			return true;
		}
		else if(employee instanceof Intern) {
			count++;
			employee.setEmployeeCount(count);
			repository.getMapIntern().put(employee.getId(), (Intern) employee);
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public boolean updateEmployee(Employee employeeUpdate) {
		if(repository.getMapExperience().containsKey(employeeUpdate.getId())) {
			Experience newExperience = (Experience) employeeUpdate;
			Experience oldExperience = repository.getMapExperience().get(newExperience.getId());
			//repository.getMapExperience().replace(employeeUpdate.getId(), (Experience) employeeUpdate);
			repository.getMapExperience().get(newExperience.getId()).setFullName(newExperience.getFullName() != null ? 
					newExperience.getFullName() : oldExperience.getFullName());
			repository.getMapExperience().get(newExperience.getId()).setBirthDay(newExperience.getBirthDay() != null ?
					newExperience.getBirthDay() : oldExperience.getBirthDay());
			repository.getMapExperience().get(newExperience.getId()).setPhone(newExperience.getPhone() != null ?
					newExperience.getPhone() : oldExperience.getPhone());
			repository.getMapExperience().get(newExperience.getId()).setEmail(newExperience.getEmail() != null ?
					newExperience.getEmail() : oldExperience.getEmail());
			repository.getMapExperience().get(newExperience.getId()).setListCertificate(newExperience.getListCertificate().size() != 0 ?
					newExperience.getListCertificate() : oldExperience.getListCertificate());
			repository.getMapExperience().get(newExperience.getId()).setProSkill(newExperience.getProSkill() != null ? 
					newExperience.getProSkill() : oldExperience.getProSkill());
			repository.getMapExperience().get(newExperience.getId()).setExpInYear(newExperience.getExpInYear() != 0 ?
					newExperience.getExpInYear() : oldExperience.getExpInYear());
			return true;
		}
		else if(repository.getMapFresher().containsKey(employeeUpdate.getId())) {
			Fresher newFresher = (Fresher) employeeUpdate;
			Fresher oldFresher = repository.getMapFresher().get(newFresher.getId());
			repository.getMapFresher().get(newFresher.getId()).setFullName(newFresher.getFullName() != null ? 
					newFresher.getFullName() : oldFresher.getFullName());
			repository.getMapFresher().get(newFresher.getId()).setBirthDay(newFresher.getBirthDay() != null ?
					newFresher.getBirthDay() : oldFresher.getBirthDay());
			repository.getMapFresher().get(newFresher.getId()).setPhone(newFresher.getPhone() != null ?
					newFresher.getPhone() : oldFresher.getPhone());
			repository.getMapFresher().get(newFresher.getId()).setEmail(newFresher.getEmail() != null ?
					newFresher.getEmail() : oldFresher.getEmail());
			repository.getMapFresher().get(newFresher.getId()).setListCertificate(newFresher.getListCertificate().size() != 0 ?
					newFresher.getListCertificate() : oldFresher.getListCertificate());
			repository.getMapFresher().get(newFresher.getId()).setEducation(newFresher.getEducation() != null ?
					newFresher.getEducation() : oldFresher.getEducation());
			repository.getMapFresher().get(newFresher.getId()).setGraduationDate(newFresher.getGraduationDate() != null ?
					newFresher.getGraduationDate() : oldFresher.getGraduationDate());
			repository.getMapFresher().get(newFresher.getId()).setGraduationRank(newFresher.getGraduationRank() != null ?
					newFresher.getGraduationRank() : oldFresher.getGraduationRank());
			return true;
		}
		else if(repository.getMapIntern().containsKey(employeeUpdate.getId())) {
			Intern newIntern = (Intern) employeeUpdate;
			Intern oldIntern = repository.getMapIntern().get(newIntern.getId());
			//repository.getMapExperience().replace(employeeUpdate.getId(), (Experience) employeeUpdate);
			repository.getMapIntern().get(newIntern.getId()).setFullName(newIntern.getFullName() != null ? 
					newIntern.getFullName() : oldIntern.getFullName());
			repository.getMapIntern().get(newIntern.getId()).setBirthDay(newIntern.getBirthDay() != null ?
					newIntern.getBirthDay() : oldIntern.getBirthDay());
			repository.getMapIntern().get(newIntern.getId()).setPhone(newIntern.getPhone() != null ?
					newIntern.getPhone() : oldIntern.getPhone());
			repository.getMapIntern().get(newIntern.getId()).setEmail(newIntern.getEmail() != null ?
					newIntern.getEmail() : oldIntern.getEmail());
			repository.getMapIntern().get(newIntern.getId()).setListCertificate(newIntern.getListCertificate().size() != 0 ?
					newIntern.getListCertificate() : oldIntern.getListCertificate());
			repository.getMapIntern().get(newIntern.getId()).setMajors(newIntern.getMajors() != null ?
					newIntern.getMajors() : oldIntern.getMajors());
			repository.getMapIntern().get(newIntern.getId()).setSemester(newIntern.getSemester() != 0 ?
					newIntern.getSemester() : oldIntern.getSemester());
			repository.getMapIntern().get(newIntern.getId()).setUniversityName(newIntern.getUniversityName() != null ?
					newIntern.getUniversityName() : oldIntern.getUniversityName());
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean deleteEmployee(String id) {
		if(repository.getMapExperience().containsKey(id)){
			repository.getMapExperience().remove(id);
			return true;
		}
		else if(repository.getMapFresher().containsKey(id)){
			repository.getMapFresher().remove(id);
			return true;
		}
		else if(repository.getMapIntern().containsKey(id)){
			repository.getMapIntern().remove(id);
			return true;
		}
		else {
			return false;
		}
			
	}


	@Override
	public void showExperience() {
		for (Map.Entry<String, Experience> entry : repository.getMapExperience().entrySet()) {
            entry.getValue().showInfo();
        }	
	}


	@Override
	public void showIntern() {
		for (Map.Entry<String, Intern> entry : repository.getMapIntern().entrySet()) {
            entry.getValue().showInfo();
        }	
	}


	@Override
	public void showFresher() {
		for (Map.Entry<String, Fresher> entry : repository.getMapFresher().entrySet()) {
            entry.getValue().showInfo();
        }	
	}


	@Override
	public int fintEmployee(String id) {
		if(repository.getMapExperience().containsKey(id)) {			
			return 1;
		}
		else if(repository.getMapFresher().containsKey(id)) {
			return 2;
		}
		else if(repository.getMapIntern().containsKey(id)) {
			return 3;
		}else {
			return 0;
		}
		
	}

}
