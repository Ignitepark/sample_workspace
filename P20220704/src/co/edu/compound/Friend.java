package co.edu.compound;

/*
 * 이름, 연락처, email, 생일, 키, 몸무게,
 */
public class Friend {

	// 필드. 명명규칙(소문자, 합성어의 경우 후발단어의 첫 글자는 대문자, 영문)
	// 접근제한자 private -> Friend 클래스 외부에서의 접근이 불가능해짐.(필드에 의도치 않은 잘못된 값이 들어올 수 있기 때문)
	private String name;
	private String tel;
	private String email;
	private String birth;
	private double height;
	private double weight;

	// 생성자 : 기본 생성자를 생성.
	public Friend() {

	}

	// 메소드.
	// 이름, 연락처를 보여주는 showInfo

	public void showInfo() {
		if (height < 0) {
			System.out.println("키가 잘못 입력되었습니다.");
		}
		if (weight < 0) {
			System.out.println("몸무게가 잘못 입력되었습니다.");
		} else {
			System.out.println("이름 : " + name + "\n전화번호 : " + tel + "\nE-mail : " + email + "\n생일 : " + birth + "\n키 : "
					+ height + "\n몸무게 : " + weight);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
