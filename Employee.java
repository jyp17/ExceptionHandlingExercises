
public class Employee {
	private String name;
	private String phone;
	private int age;
	
	public Employee(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		
		try {
			if (age < 0) {
				throw new NegativeAgeException();
			}
			else {
				this.age = age;
			}
		} catch(NegativeAgeException neg) {
			System.out.println("Can't input a negative number for age.");
			age = 0;
		}
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
		try {
			if (age < 0) {
				throw new NegativeAgeException();
			}
			else {
				this.age = age;
			}
		} catch(NegativeAgeException neg) {
			System.out.println("Can't input a negative number for age.");
		}
	}

}
