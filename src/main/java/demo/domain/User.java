package demo.domain;



import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table( name = "user" )
public class User {
	
	
	private String name;
	
	private String phonenum;
	
	private int age;
	
	private String reg_date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public User(String name, String phonenum, int age, String reg_date) {
		super();
		this.name = name;
		this.phonenum = phonenum;
		this.age = age;
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phonenum=" + phonenum + ", age=" + age
				+ ", reg_date=" + reg_date + "]";
	}

	public User() {
	}

	
	

}
