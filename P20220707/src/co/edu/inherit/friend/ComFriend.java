package co.edu.inherit.friend;

public class ComFriend extends Friend {
	private String company;
	private String department;

	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [이름 : " + getName() + ", 연락처 : " + getPhone() + ", 회사 : " + company + ", 부서 : " + department
				+ "]";
	}

	public void showInfo() {
		// 친구이름, 연락처, 회사이름, 부서
		super.showInfo();
		System.out.printf("회사이름 : %8s, 부서 : %8s", company, department);
	}

}
