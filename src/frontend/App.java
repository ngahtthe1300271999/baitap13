package frontend;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import controller.EmployeeController;
import entity.Certificate;
import entity.Employee;
import entity.Experience;
import entity.Fresher;
import entity.Intern;
import exception.BirthDayException;
import exception.EmailException;
import exception.PhoneException;
import service.validateEmployee;

public class App {
	static validateEmployee validate = new validateEmployee();
	static EmployeeController controller = new EmployeeController();

	public static void main(String[] args) throws Exception, Exception, Throwable {

		System.out.println("==================Employee Management==================");
		menu();
		while (true) {
			System.out.println("Moi ban chon: ");
			int choose = validate.validateInt();
			switch (choose) {
			case 1:
				System.out.println("Them nhan vien");
				Employee em = App.menu1();
				if (controller.addEmployee(em)) {
					System.out.println("Them thong tin nhan vien thanh cong");
				} else {
					System.out.println("Them thong tin nhan vien khong thanh cong!!");
				}
				break;
			case 2:
				System.out.println("Sua nhan vien");
				Employee emp = App.menu2();
				if (emp != null) {
					if (controller.updateEmployee(emp)) {
						System.out.println("Sua thong tin nhan vien thanh cong");
					} else {
						System.out.println("Sua thong tin nhan vien khong thanh cong!!");
					}
				} else {
					System.out.println("Khong tim thay Id cua nhan vien!!");
				}
				break;
			case 3:
				System.out.println("Xoa nhan vien");
				System.out.println("Id: ");
				String id = validate.validateString();
				int type = controller.findEmployee(id);
				if (type == 0) {
					System.out.println("Khong tim thay Id cua nhan vien!!");
				} else {
					if(controller.deleteEmployee(id)) {
						System.out.println("Xoa nhan vien thanh cong");
					}else {
						System.out.println("Xoa nhan vien khong thanh cong!!");
					}
				}
				break;
			case 4:
				System.out.println("Tim nhan vien Intern");
				controller.showIntern();
				break;
			case 5:
				System.out.println("Tim nhan vien Fresher");
				controller.showFresher();
				break;
			case 6:
				System.out.println("Tim nhan vien Experience");
				controller.showExperience();
				break;
			case 0:
				System.out.println("Thoat chuong trinh!");
				return;
			default:
				System.out.println("Ban da nhap sai, moi nhap lai!");
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("1. Them nhan vien");
		System.out.println("2. Sua nhan vien");
		System.out.println("3. Xoa nhan vien");
		System.out.println("4. Tim nhan vien Intern");
		System.out.println("5. Tim nhan vien Fresher");
		System.out.println("6. Tim nhan vien Experience");
		System.out.println("0. Thoat chuong trinh!");
	}

	private static List<Certificate> enterCertificate() throws BirthDayException {
		List<Certificate> listCertificate = new ArrayList<>();
		System.out.println("So luong certificate: ");
		int number = validate.validateInt();
		for (int i = 0; i < number; i++) {
			System.out.println("Certificate Id: ");
			String certificateId = validate.validateString();
			System.out.println("Certificate Name: ");
			String certificateName = validate.validateString();
			System.out.println("Certificate Rank: ");
			String certificateRank = validate.validateString();
			System.out.println("Certificate Date: ");
			Date certificateDate = validate.validateBirthDay();

			Certificate ce = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
			listCertificate.add(ce);
		}

		return listCertificate;
	}

	private static Employee menu1() throws BirthDayException, PhoneException, EmailException {
		while (true) {
			System.out.println("Id: ");
			String id = validate.validateString();
			System.out.println("Fullname: ");
			String fullName = validate.validateString();
			System.out.println("BirthDay: ");
			Date birthDay = validate.validateBirthDay();
			System.out.println("Phone: ");
			String phone = validate.validatePhone();
			System.out.println("Email: ");
			String email = validate.validateEmail();
			List<Certificate> listCertificate = enterCertificate();

			System.out.println("Moi ban chon(1: Experience, 2: Fresher , 3: Intern)");
			int choose = validate.validateInt();
			switch (choose) {
			case 1:
				System.out.println("So nam kinh nghiem: ");
				int expInYear = validate.validateInt();
				System.out.println("Ky nang chuyen mon: ");
				String proSkill = validate.validateString();

				Employee exp = new Experience(id, fullName, birthDay, phone, email, 0, listCertificate, expInYear,
						proSkill);
				return exp;
			case 2:
				System.out.println("Thoi gian tot nghiep: ");
				Date graduationDate = validate.validateBirthDay();
				System.out.println("Xep loai tot nghiep: ");
				String graduationRank = validate.validateString();
				System.out.println("Truong tot nghiep: ");
				String education = validate.validateString();

				Employee fresher = new Fresher(id, fullName, birthDay, phone, email, 1, listCertificate, graduationDate,
						graduationRank, education);
				return fresher;
			case 3:
				System.out.println("Chuyen nganh dang hoc: ");
				String major = validate.validateString();
				System.out.println("Hoc ki dang hoc: ");
				int semester = validate.validateInt();
				System.out.println("Ten truong dang hoc: ");
				String universityName = validate.validateString();

				Employee intern = new Intern(id, fullName, birthDay, phone, email, 2, listCertificate, major, semester,
						universityName);
				return intern;
			default:
				System.out.println("Ban da nhap sai, moi nhap lai!");
				break;

			}
		}
	}

	public static Employee menu2() throws BirthDayException, PhoneException, EmailException {
		System.out.println("Id: ");
		String id = validate.validateString();
		int type = controller.findEmployee(id);
		if (type == 0) {
			return null;
		} else {
			System.out.println("Fullname: ");
			String fullName = validate.validateString();
			System.out.println("BirthDay: ");
			Date birthDay = validate.validateBirthDay();
			System.out.println("Phone: ");
			String phone = validate.validatePhone();
			System.out.println("Email: ");
			String email = validate.validateEmail();
			List<Certificate> listCertificate = enterCertificate();
			if (type == 1) {
				System.out.println("So nam kinh nghiem: ");
				int expInYear = validate.validateInt();
				System.out.println("Ky nang chuyen mon: ");
				String proSkill = validate.validateString();

				Employee exp = new Experience(id, fullName, birthDay, phone, email, 0, listCertificate, expInYear,
						proSkill);
				return exp;
			} else if (type == 2) {
				System.out.println("Thoi gian tot nghiep: ");
				Date graduationDate = validate.validateBirthDay();
				System.out.println("Xep loai tot nghiep: ");
				String graduationRank = validate.validateString();
				System.out.println("Truong tot nghiep: ");
				String education = validate.validateString();

				Employee fresher = new Fresher(id, fullName, birthDay, phone, email, 1, listCertificate, graduationDate,
						graduationRank, education);
				return fresher;
			} else if (type == 3) {
				System.out.println("Chuyen nganh dang hoc: ");
				String major = validate.validateString();
				System.out.println("Hoc ki dang hoc: ");
				int semester = validate.validateInt();
				System.out.println("Ten truong dang hoc: ");
				String universityName = validate.validateString();

				Employee intern = new Intern(id, fullName, birthDay, phone, email, 2, listCertificate, major, semester,
						universityName);
				return intern;
			}
		}
		return null;
	}
	
}
