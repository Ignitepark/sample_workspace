package co.edu.inherit.friend;

/*
 * 학교 친구
 */
public class UnivFriend extends Friend {
	private String univ;
	private String major;

	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [이름 : " + getName() + ", 연락처 : " + getPhone() + ", 학교 : " + univ + ", 전공 : " + major + "]";
	}

	public void showInfo() {
		// 친구이름, 연락처, 학교이름, 전공과목
		super.showInfo();
		System.out.printf("학교이름 : %8s, 전공 : %8s", univ, major);
	}

}
