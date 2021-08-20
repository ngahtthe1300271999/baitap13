package repository;

import java.util.HashMap;
import java.util.Map;

import entity.Experience;
import entity.Fresher;
import entity.Intern;

public class EmployeeRepository {
	private Map<String, Experience> mapExperience;
	private Map<String, Fresher> mapFresher;
	private Map<String, Intern> mapIntern;
	
	public EmployeeRepository() {
		mapExperience = new HashMap<>();
		mapFresher = new HashMap<>();
		mapIntern = new HashMap<>();
	}

	public Map<String, Experience> getMapExperience() {
		return mapExperience;
	}

	public void setMapExperience(Map<String, Experience> mapExperience) {
		this.mapExperience = mapExperience;
	}

	public Map<String, Fresher> getMapFresher() {
		return mapFresher;
	}

	public void setMapFresher(Map<String, Fresher> mapFresher) {
		this.mapFresher = mapFresher;
	}

	public Map<String, Intern> getMapIntern() {
		return mapIntern;
	}

	public void setMapIntern(Map<String, Intern> mapIntern) {
		this.mapIntern = mapIntern;
	}
	

}
