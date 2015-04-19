package demo.domain;





public class User {
	
	private int idx;
	
	private String name;
	
	private String phone;
	
	private int age;

	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [idx=" + idx + ", name=" + name + ", phone=" + phone
				+ ", age=" + age + "]";
	}

	public User(int idx, String name, String phone, int age) {
		this.idx = idx;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public User() {
	}
	

}
